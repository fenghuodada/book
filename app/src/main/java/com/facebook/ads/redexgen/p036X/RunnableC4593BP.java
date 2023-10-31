package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.BP */
/* loaded from: assets/audience_network.dex */
public class RunnableC4593BP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C4596BS A03;

    public RunnableC4593BP(C4596BS c4596bs, int i, long j, long j2) {
        this.A03 = c4596bs;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4597BT interfaceC4597BT;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC4597BT = this.A03.A01;
            interfaceC4597BT.AA9(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
