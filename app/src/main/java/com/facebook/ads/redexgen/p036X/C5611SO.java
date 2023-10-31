package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.SO */
/* loaded from: assets/audience_network.dex */
public class C5611SO implements InterfaceC5355OF {
    public final /* synthetic */ C44599D A00;

    public C5611SO(C44599D c44599d) {
        this.A00 = c44599d;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5355OF
    public final void AAx(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z);
        this.A00.A05();
    }
}
