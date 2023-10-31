package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.HK */
/* loaded from: assets/audience_network.dex */
public final class C4936HK implements InterfaceC5563Rc {
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5563Rc
    public final long A4f() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5563Rc
    public final void AEu(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
