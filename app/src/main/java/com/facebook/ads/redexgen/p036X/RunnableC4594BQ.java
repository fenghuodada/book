package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.BQ */
/* loaded from: assets/audience_network.dex */
public class RunnableC4594BQ implements Runnable {
    public final /* synthetic */ C4596BS A00;
    public final /* synthetic */ C4626Bw A01;

    public RunnableC4594BQ(C4596BS c4596bs, C4626Bw c4626Bw) {
        this.A00 = c4596bs;
        this.A01 = c4626Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4597BT interfaceC4597BT;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            interfaceC4597BT = this.A00.A01;
            interfaceC4597BT.AA5(this.A01);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
