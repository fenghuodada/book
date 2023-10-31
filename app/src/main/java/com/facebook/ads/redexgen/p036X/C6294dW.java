package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.dW */
/* loaded from: assets/audience_network.dex */
public class C6294dW implements InterfaceC42535f {
    public final /* synthetic */ C4839Fi A00;

    public C6294dW(C4839Fi c4839Fi) {
        this.A00 = c4839Fi;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42535f
    public final void AA1() {
        AtomicBoolean atomicBoolean;
        InterfaceC397114 interfaceC397114;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        interfaceC397114 = this.A00.A01;
        interfaceC397114.ACC(this.A00);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42535f
    public final void AA2() {
        InterfaceC397114 interfaceC397114;
        interfaceC397114 = this.A00.A01;
        interfaceC397114.ACF(this.A00, AdError.CACHE_ERROR);
    }
}
