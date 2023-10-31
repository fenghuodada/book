package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.c5 */
/* loaded from: classes.dex */
public final class C2072c5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2231o5 f5041a;

    public C2072c5(C2231o5 c2231o5) {
        this.f5041a = c2231o5;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        int i;
        C2231o5 c2231o5 = this.f5041a;
        if (c2231o5.m9564b(c2100e2)) {
            if (c2100e2.f5098b.m9444o("visible")) {
                i = 0;
            } else {
                i = 4;
            }
            c2231o5.setVisibility(i);
        }
    }
}
