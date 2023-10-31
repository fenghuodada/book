package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.g3 */
/* loaded from: classes.dex */
public final class RunnableC2119g3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2100e2 f5135a;

    /* renamed from: b */
    public final /* synthetic */ C2058b3 f5136b;

    public RunnableC2119g3(C2058b3 c2058b3, C2100e2 c2100e2) {
        this.f5136b = c2058b3;
        this.f5135a = c2100e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5136b.f4998p.onReward(new C2326v(this.f5135a));
    }
}
