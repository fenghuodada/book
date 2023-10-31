package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.r */
/* loaded from: classes.dex */
public final class RunnableC2271r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2249q f5529a;

    public RunnableC2271r(C2249q c2249q) {
        this.f5529a = c2249q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2249q c2249q;
        AbstractC2317u abstractC2317u;
        if (!(C2201m0.f5363a instanceof AdColonyInterstitialActivity) && (abstractC2317u = (c2249q = this.f5529a).f5476a) != null) {
            abstractC2317u.onOpened(c2249q);
        }
    }
}
