package com.vungle.warren;

import com.vungle.warren.C10114v0;
import com.vungle.warren.log.C9835f;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.persistence.C9924e;
import com.vungle.warren.utility.InterfaceC10086h;

/* renamed from: com.vungle.warren.j1 */
/* loaded from: classes3.dex */
public final class C9820j1 extends C10114v0.AbstractC10117c {

    /* renamed from: a */
    public final /* synthetic */ C10114v0 f19609a;

    public C9820j1(C10114v0 c10114v0) {
        this.f19609a = c10114v0;
    }

    @Override // com.vungle.warren.C10114v0.AbstractC10117c
    /* renamed from: a */
    public final Object mo1226a() {
        C10114v0 c10114v0 = this.f19609a;
        return new C9835f(c10114v0.f20360a, (C9914a) c10114v0.m1233b(C9914a.class), (VungleApiClient) c10114v0.m1233b(VungleApiClient.class), ((InterfaceC10086h) c10114v0.m1233b(InterfaceC10086h.class)).mo1246d(), (C9924e) c10114v0.m1233b(C9924e.class));
    }
}
