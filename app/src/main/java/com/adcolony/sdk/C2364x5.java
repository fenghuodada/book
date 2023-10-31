package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.x5 */
/* loaded from: classes.dex */
public final class C2364x5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2132h6 f5681a;

    public C2364x5(C2132h6 c2132h6) {
        this.f5681a = c2132h6;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2132h6 c2132h6 = this.f5681a;
        if (c2132h6.m9619c(c2100e2)) {
            C2367y1 c2367y1 = c2100e2.f5098b;
            c2132h6.f5182i = c2367y1.m9441r("x");
            c2132h6.f5183j = c2367y1.m9441r("y");
            c2132h6.setGravity(C2132h6.m9621a(c2132h6.f5182i, true) | C2132h6.m9621a(c2132h6.f5183j, false));
        }
    }
}
