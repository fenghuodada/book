package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Hu */
/* loaded from: assets/audience_network.dex */
public final class RunnableC4971Hu implements Runnable {
    public final InterfaceC4970Ht A00;

    public RunnableC4971Hu(InterfaceC4970Ht interfaceC4970Ht) {
        this.A00 = interfaceC4970Ht;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.ABM();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
