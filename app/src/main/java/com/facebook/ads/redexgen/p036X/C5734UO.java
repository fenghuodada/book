package com.facebook.ads.redexgen.p036X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.UO */
/* loaded from: assets/audience_network.dex */
public class C5734UO implements InterfaceC5097Jy {
    public WeakReference<C5721UB> A00;

    public C5734UO(C5721UB c5721ub) {
        this.A00 = new WeakReference<>(c5721ub);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5097Jy
    public final void ABk(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z, false);
        }
    }
}
