package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;

/* renamed from: com.adcolony.sdk.n1 */
/* loaded from: classes.dex */
public final class RunnableC2211n1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2187l f5386a;

    public RunnableC2211n1(AbstractC2187l abstractC2187l) {
        this.f5386a = abstractC2187l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2187l abstractC2187l = this.f5386a;
        abstractC2187l.onRequestNotFilled(C2074d.m9676a(abstractC2187l.m9596c()));
        if (!C2201m0.m9587e()) {
            C1169e.m11129c("RequestNotFilled called for AdView due to a missing context. ", 0, 0, true);
        }
    }
}
