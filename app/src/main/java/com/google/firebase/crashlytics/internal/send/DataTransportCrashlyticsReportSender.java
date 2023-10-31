package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.NonNull;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.InterfaceC6465e;
import com.google.android.datatransport.cct.C6431a;
import com.google.android.datatransport.runtime.C6524o;
import com.google.android.datatransport.runtime.C6527r;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private final ReportQueue reportQueue;
    private final InterfaceC6465e<CrashlyticsReport, byte[]> transportTransform;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final InterfaceC6465e<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new C2745h();

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, InterfaceC6465e<CrashlyticsReport, byte[]> interfaceC6465e) {
        this.reportQueue = reportQueue;
        this.transportTransform = interfaceC6465e;
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        C6527r.m6270b(context);
        C6524o m6269c = C6527r.m6271a().m6269c(new C6431a(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
        C6429b c6429b = new C6429b("json");
        InterfaceC6465e<CrashlyticsReport, byte[]> interfaceC6465e = DEFAULT_TRANSFORM;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(m6269c.mo6273a(CRASHLYTICS_TRANSPORT_NAME, c6429b, interfaceC6465e), settingsProvider.getSettingsSync(), onDemandCounter), interfaceC6465e);
    }

    public static /* synthetic */ byte[] lambda$static$0(CrashlyticsReport crashlyticsReport) {
        return TRANSFORM.reportToJson(crashlyticsReport).getBytes(Charset.forName("UTF-8"));
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @NonNull
    public Task<CrashlyticsReportWithSessionId> enqueueReport(@NonNull CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z).getTask();
    }
}
