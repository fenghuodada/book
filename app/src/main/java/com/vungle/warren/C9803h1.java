package com.vungle.warren;

import com.vungle.warren.C10114v0;
import com.vungle.warren.omsdk.C9907b;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.platform.InterfaceC10100c;

/* renamed from: com.vungle.warren.h1 */
/* loaded from: classes3.dex */
public final class C9803h1 extends C10114v0.AbstractC10117c {

    /* renamed from: a */
    public final /* synthetic */ C10114v0 f19539a;

    public C9803h1(C10114v0 c10114v0) {
        this.f19539a = c10114v0;
    }

    @Override // com.vungle.warren.C10114v0.AbstractC10117c
    /* renamed from: a */
    public final Object mo1226a() {
        C10114v0 c10114v0 = this.f19539a;
        return new VungleApiClient(c10114v0.f20360a, (C9914a) c10114v0.m1233b(C9914a.class), (C9928h) c10114v0.m1233b(C9928h.class), (C9907b) c10114v0.m1233b(C9907b.class), (InterfaceC10100c) c10114v0.m1233b(InterfaceC10100c.class));
    }
}
