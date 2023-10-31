package com.adcolony.sdk;

import java.util.concurrent.ScheduledFuture;

/* renamed from: com.adcolony.sdk.i2 */
/* loaded from: classes.dex */
public final class RunnableC2136i2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2117g2 f5218a;

    public RunnableC2136i2(C2117g2 c2117g2) {
        this.f5218a = c2117g2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture<?> scheduledFuture;
        C2201m0.m9585g();
        C2117g2 c2117g2 = this.f5218a;
        if (!c2117g2.m9628f() && (scheduledFuture = c2117g2.f5132i) != null) {
            if (!scheduledFuture.isCancelled()) {
                c2117g2.f5132i.cancel(false);
            }
            c2117g2.f5132i = null;
        }
    }
}
