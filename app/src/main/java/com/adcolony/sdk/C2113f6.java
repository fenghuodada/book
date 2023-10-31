package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.f6 */
/* loaded from: classes.dex */
public final class C2113f6 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2132h6 f5118a;

    public C2113f6(C2132h6 c2132h6) {
        this.f5118a = c2132h6;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2132h6 c2132h6 = this.f5118a;
        if (c2132h6.m9619c(c2100e2)) {
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, "text", c2132h6.getText().toString());
            c2100e2.m9641a(c2367y1).m9640b();
        }
    }
}
