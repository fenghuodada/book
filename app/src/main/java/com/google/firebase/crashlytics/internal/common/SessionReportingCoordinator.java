package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class SessionReportingCoordinator implements CrashlyticsLifecycleEvents {
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int EVENT_THREAD_IMPORTANCE = 4;
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    private static final int MAX_CHAINED_EXCEPTION_DEPTH = 8;
    private final CrashlyticsReportDataCapture dataCapture;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final UserMetadata reportMetadata;
    private final CrashlyticsReportPersistence reportPersistence;
    private final DataTransportCrashlyticsReportSender reportsSender;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager) {
        this.dataCapture = crashlyticsReportDataCapture;
        this.reportPersistence = crashlyticsReportPersistence;
        this.reportsSender = dataTransportCrashlyticsReportSender;
        this.logFileManager = logFileManager;
        this.reportMetadata = userMetadata;
        this.idManager = idManager;
    }

    private CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(CrashlyticsReport.Session.Event event) {
        return addLogsAndCustomKeysToEvent(event, this.logFileManager, this.reportMetadata);
    }

    private CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().m3342v("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes = getSortedCustomAttributes(userMetadata.getCustomKeys());
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes2 = getSortedCustomAttributes(userMetadata.getInternalKeys());
        if (!sortedCustomAttributes.isEmpty() || !sortedCustomAttributes2.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(ImmutableList.from(sortedCustomAttributes)).setInternalKeys(ImmutableList.from(sortedCustomAttributes2)).build());
        }
        return builder.build();
    }

    @RequiresApi(api = 30)
    private static CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = convertInputStreamToString(traceInputStream);
            }
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e);
            logger.m3340w(sb.toString());
        }
        CrashlyticsReport.ApplicationExitInfo.Builder builder = CrashlyticsReport.ApplicationExitInfo.builder();
        importance = applicationExitInfo.getImportance();
        CrashlyticsReport.ApplicationExitInfo.Builder importance2 = builder.setImportance(importance);
        processName = applicationExitInfo.getProcessName();
        CrashlyticsReport.ApplicationExitInfo.Builder processName2 = importance2.setProcessName(processName);
        reason = applicationExitInfo.getReason();
        CrashlyticsReport.ApplicationExitInfo.Builder reasonCode = processName2.setReasonCode(reason);
        timestamp = applicationExitInfo.getTimestamp();
        CrashlyticsReport.ApplicationExitInfo.Builder timestamp2 = reasonCode.setTimestamp(timestamp);
        pid = applicationExitInfo.getPid();
        CrashlyticsReport.ApplicationExitInfo.Builder pid2 = timestamp2.setPid(pid);
        pss = applicationExitInfo.getPss();
        CrashlyticsReport.ApplicationExitInfo.Builder pss2 = pid2.setPss(pss);
        rss = applicationExitInfo.getRss();
        return pss2.setRss(rss).setTraceFile(str).build();
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.create(context, settingsProvider, onDemandCounter), logFileManager, userMetadata, idManager);
    }

    private CrashlyticsReportWithSessionId ensureHasFid(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.getReport().getFirebaseInstallationId() == null) {
            return CrashlyticsReportWithSessionId.create(crashlyticsReportWithSessionId.getReport().withFirebaseInstallationId(this.idManager.fetchTrueFid()), crashlyticsReportWithSessionId.getSessionId(), crashlyticsReportWithSessionId.getReportFile());
        }
        return crashlyticsReportWithSessionId;
    }

    @Nullable
    @RequiresApi(api = 30)
    private ApplicationExitInfo findRelevantApplicationExitInfo(String str, List<ApplicationExitInfo> list) {
        long timestamp;
        int reason;
        long startTimestampMillis = this.reportPersistence.getStartTimestampMillis(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            timestamp = applicationExitInfo.getTimestamp();
            if (timestamp < startTimestampMillis) {
                return null;
            }
            reason = applicationExitInfo.getReason();
            if (reason == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    @NonNull
    private static List<CrashlyticsReport.CustomAttribute> getSortedCustomAttributes(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$getSortedCustomAttributes$0;
                lambda$getSortedCustomAttributes$0 = SessionReportingCoordinator.lambda$getSortedCustomAttributes$0((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
                return lambda$getSortedCustomAttributes$0;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSortedCustomAttributes$0(CrashlyticsReport.CustomAttribute customAttribute, CrashlyticsReport.CustomAttribute customAttribute2) {
        return customAttribute.getKey().compareTo(customAttribute2.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onReportSendComplete(@NonNull Task<CrashlyticsReportWithSessionId> task) {
        if (!task.isSuccessful()) {
            Logger.getLogger().m3339w("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        CrashlyticsReportWithSessionId result = task.getResult();
        Logger logger = Logger.getLogger();
        logger.m3348d("Crashlytics report successfully enqueued to DataTransport: " + result.getSessionId());
        File reportFile = result.getReportFile();
        if (reportFile.delete()) {
            Logger logger2 = Logger.getLogger();
            logger2.m3348d("Deleted report file: " + reportFile.getPath());
            return true;
        }
        Logger logger3 = Logger.getLogger();
        logger3.m3340w("Crashlytics could not delete report file: " + reportFile.getPath());
        return true;
    }

    private void persistEvent(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j, boolean z) {
        this.reportPersistence.persistEvent(addLogsAndCustomKeysToEvent(this.dataCapture.captureEventData(th, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    public void finalizeSessionWithNativeEvent(@NonNull String str, @NonNull List<NativeSessionFile> list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.getLogger().m3348d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (NativeSessionFile nativeSessionFile : list) {
            CrashlyticsReport.FilesPayload.File asFilePayload = nativeSessionFile.asFilePayload();
            if (asFilePayload != null) {
                arrayList.add(asFilePayload);
            }
        }
        this.reportPersistence.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(ImmutableList.from(arrayList)).build(), applicationExitInfo);
    }

    public void finalizeSessions(long j, @Nullable String str) {
        this.reportPersistence.finalizeReports(str, j);
    }

    public boolean hasReportsToSend() {
        return this.reportPersistence.hasFinalizedReports();
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.reportPersistence.getOpenSessionIds();
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void onBeginSession(@NonNull String str, long j) {
        this.reportPersistence.persistReport(this.dataCapture.captureReportData(str, j));
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void onCustomKey(String str, String str2) {
        this.reportMetadata.setCustomKey(str, str2);
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void onLog(long j, String str) {
        this.logFileManager.writeToLog(j, str);
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void onUserId(String str) {
        this.reportMetadata.setUserId(str);
    }

    public void persistFatalEvent(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        Logger logger = Logger.getLogger();
        logger.m3342v("Persisting fatal event for session " + str);
        persistEvent(th, thread, str, "crash", j, true);
    }

    public void persistNonFatalEvent(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        Logger logger = Logger.getLogger();
        logger.m3342v("Persisting non-fatal event for session " + str);
        persistEvent(th, thread, str, EVENT_TYPE_LOGGED, j, false);
    }

    @RequiresApi(api = 30)
    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo findRelevantApplicationExitInfo = findRelevantApplicationExitInfo(str, list);
        if (findRelevantApplicationExitInfo == null) {
            Logger logger = Logger.getLogger();
            logger.m3342v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event captureAnrEventData = this.dataCapture.captureAnrEventData(convertApplicationExitInfo(findRelevantApplicationExitInfo));
        Logger logger2 = Logger.getLogger();
        logger2.m3348d("Persisting anr for session " + str);
        this.reportPersistence.persistEvent(addLogsAndCustomKeysToEvent(captureAnrEventData, logFileManager, userMetadata), str, true);
    }

    public void removeAllReports() {
        this.reportPersistence.deleteAllReports();
    }

    public Task<Void> sendReports(@NonNull Executor executor) {
        return sendReports(executor, null);
    }

    public Task<Void> sendReports(@NonNull Executor executor, @Nullable String str) {
        List<CrashlyticsReportWithSessionId> loadFinalizedReports = this.reportPersistence.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : loadFinalizedReports) {
            if (str == null || str.equals(crashlyticsReportWithSessionId.getSessionId())) {
                arrayList.add(this.reportsSender.enqueueReport(ensureHasFid(crashlyticsReportWithSessionId), str != null).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.d
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        boolean onReportSendComplete;
                        onReportSendComplete = SessionReportingCoordinator.this.onReportSendComplete(task);
                        return Boolean.valueOf(onReportSendComplete);
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
