package com.vungle.warren;

import com.vungle.warren.C10114v0;
import com.vungle.warren.analytics.C9753c;
import com.vungle.warren.log.C9835f;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.InterfaceC9923d;
import com.vungle.warren.tasks.C9988j;

/* renamed from: com.vungle.warren.d1 */
/* loaded from: classes3.dex */
public final class C9766d1 extends C10114v0.AbstractC10117c {

    /* renamed from: a */
    public final /* synthetic */ C10114v0 f19441a;

    public C9766d1(C10114v0 c10114v0) {
        this.f19441a = c10114v0;
    }

    @Override // com.vungle.warren.C10114v0.AbstractC10117c
    /* renamed from: a */
    public final Object mo1226a() {
        C10114v0 c10114v0 = this.f19441a;
        return new C9988j((C9928h) c10114v0.m1233b(C9928h.class), (InterfaceC9923d) c10114v0.m1233b(InterfaceC9923d.class), (VungleApiClient) c10114v0.m1233b(VungleApiClient.class), new C9753c((VungleApiClient) c10114v0.m1233b(VungleApiClient.class), (C9928h) c10114v0.m1233b(C9928h.class)), (AdLoader) c10114v0.m1233b(AdLoader.class), (C9835f) c10114v0.m1233b(C9835f.class));
    }
}
