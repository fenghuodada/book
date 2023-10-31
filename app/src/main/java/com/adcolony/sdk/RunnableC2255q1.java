package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.q1 */
/* loaded from: classes.dex */
public final class RunnableC2255q1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2317u f5498a;

    /* renamed from: b */
    public final /* synthetic */ C2249q f5499b;

    public RunnableC2255q1(AbstractC2317u abstractC2317u, C2249q c2249q) {
        this.f5498a = abstractC2317u;
        this.f5499b = c2249q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2201m0.m9588d().f4959A = false;
        this.f5498a.onClosed(this.f5499b);
    }
}
