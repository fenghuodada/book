package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.b6 */
/* loaded from: classes.dex */
public final class C2064b6 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2132h6 f5015a;

    public C2064b6(C2132h6 c2132h6) {
        this.f5015a = c2132h6;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2132h6 c2132h6 = this.f5015a;
        if (c2132h6.m9619c(c2100e2)) {
            String m9436w = c2100e2.f5098b.m9436w("background_color");
            c2132h6.f5184k = m9436w;
            c2132h6.setBackgroundColor(C2232o6.m9540w(m9436w));
        }
    }
}
