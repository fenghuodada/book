package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.dV */
/* loaded from: assets/audience_network.dex */
public class C6293dV implements InterfaceC40141l {
    public final /* synthetic */ C4839Fi A00;

    public C6293dV(C4839Fi c4839Fi) {
        this.A00 = c4839Fi;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40141l
    public final void ABm(AdError adError) {
        InterfaceC397114 interfaceC397114;
        interfaceC397114 = this.A00.A01;
        interfaceC397114.ACF(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40141l
    public final void ABn() {
        AtomicBoolean atomicBoolean;
        InterfaceC397114 interfaceC397114;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        interfaceC397114 = this.A00.A01;
        interfaceC397114.ACC(this.A00);
    }
}
