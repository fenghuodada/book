package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.datatransport.C6428a;
import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.InterfaceC6466f;
import com.google.android.datatransport.InterfaceC6468h;
import com.google.android.datatransport.runtime.C6525p;
import com.google.android.datatransport.runtime.C6527r;
import com.google.android.datatransport.runtime.logging.C6520a;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ReportQueue {
    private static final int MAX_DELAY_MS = 3600000;
    private static final int MS_PER_MINUTE = 60000;
    private static final int MS_PER_SECOND = 1000;
    private static final int STARTUP_DURATION_MS = 2000;
    private final double base;
    private long lastUpdatedMs;
    private final OnDemandCounter onDemandCounter;
    private final BlockingQueue<Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final InterfaceC6466f<CrashlyticsReport> transport;

    /* loaded from: classes3.dex */
    public final class ReportRunnable implements Runnable {
        private final CrashlyticsReportWithSessionId reportWithSessionId;
        private final TaskCompletionSource<CrashlyticsReportWithSessionId> tcs;

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.reportWithSessionId = crashlyticsReportWithSessionId;
            this.tcs = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReportQueue.this.sendReport(this.reportWithSessionId, this.tcs);
            ReportQueue.this.onDemandCounter.resetDroppedOnDemandExceptions();
            double calcDelay = ReportQueue.this.calcDelay();
            Logger logger = Logger.getLogger();
            logger.m3348d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(calcDelay / 1000.0d)) + " s for report: " + this.reportWithSessionId.getSessionId());
            ReportQueue.sleep(calcDelay);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ReportQueue(double d, double d2, long j, InterfaceC6466f<CrashlyticsReport> interfaceC6466f, OnDemandCounter onDemandCounter) {
        this.ratePerMinute = d;
        this.base = d2;
        this.stepDurationMs = j;
        this.transport = interfaceC6466f;
        this.onDemandCounter = onDemandCounter;
        this.startTimeMs = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.queueCapacity = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.queue = arrayBlockingQueue;
        this.singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0L;
    }

    public ReportQueue(InterfaceC6466f<CrashlyticsReport> interfaceC6466f, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, settings.onDemandBackoffStepDurationSeconds * 1000, interfaceC6466f, onDemandCounter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double calcDelay() {
        return Math.min(3600000.0d, Math.pow(this.base, calcStep()) * (60000.0d / this.ratePerMinute));
    }

    private int calcStep() {
        if (this.lastUpdatedMs == 0) {
            this.lastUpdatedMs = now();
        }
        int now = (int) ((now() - this.lastUpdatedMs) / this.stepDurationMs);
        int min = isQueueFull() ? Math.min(100, this.step + now) : Math.max(0, this.step - now);
        if (this.step != min) {
            this.step = min;
            this.lastUpdatedMs = now();
        }
        return min;
    }

    private boolean isQueueAvailable() {
        return this.queue.size() < this.queueCapacity;
    }

    private boolean isQueueFull() {
        return this.queue.size() == this.queueCapacity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$flushScheduledReportsIfAble$0(CountDownLatch countDownLatch) {
        try {
            InterfaceC6466f<CrashlyticsReport> interfaceC6466f = this.transport;
            EnumC6464d enumC6464d = EnumC6464d.HIGHEST;
            if (interfaceC6466f instanceof C6525p) {
                C6527r.m6271a().f10290d.m6260a(((C6525p) interfaceC6466f).f10281a.m6274e(enumC6464d), 1);
            } else {
                String m6284c = C6520a.m6284c("ForcedSender");
                if (Log.isLoggable(m6284c, 5)) {
                    Log.w(m6284c, String.format("Expected instance of `TransportImpl`, got `%s`.", interfaceC6466f));
                }
            }
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendReport$1(TaskCompletionSource taskCompletionSource, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    private long now() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReport(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        final boolean z;
        Logger logger = Logger.getLogger();
        logger.m3348d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        if (SystemClock.elapsedRealtime() - this.startTimeMs < 2000) {
            z = true;
        } else {
            z = false;
        }
        ((C6525p) this.transport).m6272a(new C6428a(crashlyticsReportWithSessionId.getReport(), EnumC6464d.HIGHEST), new InterfaceC6468h() { // from class: com.google.firebase.crashlytics.internal.send.a
            @Override // com.google.android.datatransport.InterfaceC6468h
            /* renamed from: a */
            public final void mo3314a(Exception exc) {
                ReportQueue.this.lambda$sendReport$1(taskCompletionSource, z, crashlyticsReportWithSessionId, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    public TaskCompletionSource<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.queue) {
            TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource = new TaskCompletionSource<>();
            if (!z) {
                sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
                return taskCompletionSource;
            }
            this.onDemandCounter.incrementRecordedOnDemandExceptions();
            if (!isQueueAvailable()) {
                calcStep();
                Logger logger = Logger.getLogger();
                logger.m3348d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                this.onDemandCounter.incrementDroppedOnDemandExceptions();
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            }
            Logger logger2 = Logger.getLogger();
            logger2.m3348d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
            Logger logger3 = Logger.getLogger();
            logger3.m3348d("Queue size: " + this.queue.size());
            this.singleThreadExecutor.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
            Logger logger4 = Logger.getLogger();
            logger4.m3348d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
            taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
            return taskCompletionSource;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void flushScheduledReportsIfAble() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.b
            @Override // java.lang.Runnable
            public final void run() {
                ReportQueue.this.lambda$flushScheduledReportsIfAble$0(countDownLatch);
            }
        }).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }
}
