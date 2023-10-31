package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.j5 */
/* loaded from: classes.dex */
public final class C2174j5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2231o5 f5302a;

    public C2174j5(C2231o5 c2231o5) {
        this.f5302a = c2231o5;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2231o5 c2231o5 = this.f5302a;
        if (c2231o5.m9564b(c2100e2)) {
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, "text", c2231o5.getText().toString());
            c2100e2.m9641a(c2367y1).m9640b();
        }
    }
}
