package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.f5 */
/* loaded from: classes.dex */
public final class C2112f5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2231o5 f5117a;

    public C2112f5(C2231o5 c2231o5) {
        this.f5117a = c2231o5;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2231o5 c2231o5 = this.f5117a;
        if (c2231o5.m9564b(c2100e2)) {
            String m9436w = c2100e2.f5098b.m9436w("background_color");
            c2231o5.f5441l = m9436w;
            c2231o5.setBackgroundColor(C2232o6.m9540w(m9436w));
        }
    }
}
