package com.adcolony.sdk;

import androidx.constraintlayout.core.C0499a;
import androidx.datastore.preferences.protobuf.C1169e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.h2 */
/* loaded from: classes.dex */
public final class RunnableC2127h2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2117g2 f5165a;

    public RunnableC2127h2(C2117g2 c2117g2) {
        this.f5165a = c2117g2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                C2367y1 poll = this.f5165a.f5128e.poll(60L, TimeUnit.SECONDS);
                if (poll != null) {
                    C2117g2.m9632b(this.f5165a, poll);
                } else {
                    synchronized (this.f5165a.f5128e) {
                        if (this.f5165a.f5128e.peek() == null) {
                            this.f5165a.f5129f = false;
                            return;
                        }
                    }
                }
            } catch (InterruptedException e) {
                StringBuilder m12383b = C0499a.m12383b("Native messages thread was interrupted: ");
                m12383b.append(e.toString());
                C1169e.m11129c(m12383b.toString(), 0, 0, true);
            }
        }
    }
}
