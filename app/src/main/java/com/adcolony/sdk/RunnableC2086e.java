package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.e */
/* loaded from: classes.dex */
public final class RunnableC2086e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2200m f5074a;

    public RunnableC2086e(C2200m c2200m) {
        this.f5074a = c2200m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2058b3 m9588d = C2201m0.m9588d();
        m9588d.f4962D.m9428a(15000L);
        boolean z = m9588d.f4962D.f5701a;
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9661g(c2367y1, "options", this.f5074a.f5362b);
        new C2100e2(1, c2367y1, "Options.set_options").m9640b();
    }
}
