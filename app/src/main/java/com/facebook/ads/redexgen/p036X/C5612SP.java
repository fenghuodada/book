package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.SP */
/* loaded from: assets/audience_network.dex */
public class C5612SP implements InterfaceC421957 {
    public final /* synthetic */ C44599D A00;

    public C5612SP(C44599D c44599d) {
        this.A00 = c44599d;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC421957
    public final boolean A8M() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
