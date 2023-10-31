package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.JL */
/* loaded from: assets/audience_network.dex */
public class RunnableC5058JL implements Runnable {
    public final /* synthetic */ C4626Bw A00;
    public final /* synthetic */ C5059JM A01;

    public RunnableC5058JL(C5059JM c5059jm, C4626Bw c4626Bw) {
        this.A01 = c5059jm;
        this.A00 = c4626Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5060JN interfaceC5060JN;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            interfaceC5060JN = this.A01.A01;
            interfaceC5060JN.ACh(this.A00);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
