package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.y5 */
/* loaded from: classes.dex */
public final class C2373y5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2132h6 f5698a;

    public C2373y5(C2132h6 c2132h6) {
        this.f5698a = c2132h6;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        int i;
        C2132h6 c2132h6 = this.f5698a;
        if (c2132h6.m9619c(c2100e2)) {
            if (c2100e2.f5098b.m9444o("visible")) {
                i = 0;
            } else {
                i = 4;
            }
            c2132h6.setVisibility(i);
        }
    }
}
