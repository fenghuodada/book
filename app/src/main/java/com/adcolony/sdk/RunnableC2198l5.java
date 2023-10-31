package com.adcolony.sdk;

import android.os.SystemClock;
import androidx.datastore.preferences.protobuf.C1169e;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.l5 */
/* loaded from: classes.dex */
public final class RunnableC2198l5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2215n5 f5360a;

    public RunnableC2198l5(C2215n5 c2215n5) {
        this.f5360a = c2215n5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2215n5 c2215n5 = this.f5360a;
        c2215n5.f5392b = null;
        C2201m0.m9588d().m9689n().m9706d("AdColony session ending, releasing Context.", 0, 2, false);
        C2201m0.m9588d().f4960B = true;
        C2201m0.f5363a = null;
        C2383z4 c2383z4 = c2215n5.f5394d;
        c2383z4.f5728i = true;
        c2383z4.f5729j = true;
        C2323u4 c2323u4 = C2201m0.m9588d().m9689n().f4926e;
        c2383z4.f5725f = false;
        c2383z4.f5723d = false;
        if (c2323u4 != null) {
            synchronized (c2323u4) {
                c2323u4.f5629b.shutdown();
                try {
                    ScheduledExecutorService scheduledExecutorService = c2323u4.f5629b;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (!scheduledExecutorService.awaitTermination(1L, timeUnit)) {
                        c2323u4.f5629b.shutdownNow();
                        if (!c2323u4.f5629b.awaitTermination(1L, timeUnit)) {
                            System.err.println(C2323u4.class.getSimpleName().concat(": ScheduledExecutorService did not terminate"));
                        }
                    }
                } catch (InterruptedException unused) {
                    c2323u4.f5629b.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9663e(c2367y1, "session_length", (SystemClock.uptimeMillis() - c2383z4.f5722c) / 1000.0d);
        new C2100e2(1, c2367y1, "SessionInfo.on_stop").m9640b();
        C2201m0.m9585g();
        C2074d.f5043a.shutdown();
        if (C2201m0.m9588d().m9688o().m9628f()) {
            ScheduledFuture<?> scheduledFuture = c2215n5.f5393c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                c2215n5.f5393c.cancel(false);
            }
            try {
                c2215n5.f5393c = c2215n5.f5391a.schedule(new RunnableC2206m5(c2215n5), 10L, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e) {
                C1169e.m11129c("RejectedExecutionException when scheduling message pumping stop " + e.toString(), 0, 0, true);
            }
        }
    }
}
