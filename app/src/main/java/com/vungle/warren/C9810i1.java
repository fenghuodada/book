package com.vungle.warren;

import com.vungle.warren.C10114v0;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.InterfaceC9923d;
import com.vungle.warren.utility.C10103s;
import com.vungle.warren.utility.C10111y;
import com.vungle.warren.utility.InterfaceC10086h;

/* renamed from: com.vungle.warren.i1 */
/* loaded from: classes3.dex */
public final class C9810i1 extends C10114v0.AbstractC10117c {

    /* renamed from: a */
    public final /* synthetic */ C10114v0 f19555a;

    public C9810i1(C10114v0 c10114v0) {
        this.f19555a = c10114v0;
    }

    @Override // com.vungle.warren.C10114v0.AbstractC10117c
    /* renamed from: a */
    public final Object mo1226a() {
        C10114v0 c10114v0 = this.f19555a;
        InterfaceC10086h interfaceC10086h = (InterfaceC10086h) c10114v0.m1233b(InterfaceC10086h.class);
        C10111y mo1242h = interfaceC10086h.mo1242h();
        C10103s.C10104a mo1248b = interfaceC10086h.mo1248b();
        return new C9928h(c10114v0.f20360a, (InterfaceC9923d) c10114v0.m1233b(InterfaceC9923d.class), mo1242h, mo1248b);
    }
}
