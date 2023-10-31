package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.b5 */
/* loaded from: classes.dex */
public final class C2063b5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2231o5 f5014a;

    public C2063b5(C2231o5 c2231o5) {
        this.f5014a = c2231o5;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2231o5 c2231o5 = this.f5014a;
        if (c2231o5.m9564b(c2100e2)) {
            C2367y1 c2367y1 = c2100e2.f5098b;
            c2231o5.f5438i = c2367y1.m9441r("x");
            c2231o5.f5439j = c2367y1.m9441r("y");
            c2231o5.setGravity(C2231o5.m9565a(c2231o5.f5438i, true) | C2231o5.m9565a(c2231o5.f5439j, false));
        }
    }
}
