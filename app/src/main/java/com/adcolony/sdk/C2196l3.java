package com.adcolony.sdk;

import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;

/* renamed from: com.adcolony.sdk.l3 */
/* loaded from: classes.dex */
public final class C2196l3 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5356a;

    public C2196l3(C2058b3 c2058b3) {
        this.f5356a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2200m c2200m = this.f5356a.f5000r;
        C2367y1 c2367y1 = c2200m.f5362b;
        C2080d1.m9660h(c2367y1, AdColonyAdapterUtils.KEY_APP_ID, c2200m.f5361a);
        C2367y1 c2367y12 = new C2367y1();
        C2080d1.m9661g(c2367y12, "options", c2367y1);
        c2100e2.m9641a(c2367y12).m9640b();
    }
}
