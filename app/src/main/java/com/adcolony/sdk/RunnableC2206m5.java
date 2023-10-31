package com.adcolony.sdk;

import java.util.concurrent.ScheduledFuture;

/* renamed from: com.adcolony.sdk.m5 */
/* loaded from: classes.dex */
public final class RunnableC2206m5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2215n5 f5374a;

    public RunnableC2206m5(C2215n5 c2215n5) {
        this.f5374a = c2215n5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2215n5 c2215n5 = this.f5374a;
        if (c2215n5.f5394d.f5729j) {
            C2117g2 m9688o = C2201m0.m9588d().m9688o();
            ScheduledFuture<?> scheduledFuture = m9688o.f5132i;
            if (scheduledFuture != null) {
                if (!scheduledFuture.isCancelled()) {
                    m9688o.f5132i.cancel(false);
                }
                m9688o.f5132i = null;
            }
            c2215n5.f5393c = null;
        }
    }
}
