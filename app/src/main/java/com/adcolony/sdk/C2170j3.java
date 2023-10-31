package com.adcolony.sdk;

import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.adcolony.sdk.j3 */
/* loaded from: classes.dex */
public final class C2170j3 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5298a;

    public C2170j3(C2058b3 c2058b3) {
        this.f5298a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2058b3 c2058b3 = this.f5298a;
        c2058b3.getClass();
        int m9441r = c2100e2.f5098b.m9441r(FacebookAdapter.KEY_ID);
        c2058b3.f5004v.remove(Integer.valueOf(m9441r));
        c2058b3.f4983a.m9631c(m9441r);
    }
}
