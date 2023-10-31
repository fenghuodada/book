package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.BN */
/* loaded from: assets/audience_network.dex */
public class RunnableC4591BN implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C4596BS A02;
    public final /* synthetic */ String A03;

    public RunnableC4591BN(C4596BS c4596bs, String str, long j, long j2) {
        this.A02 = c4596bs;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4597BT interfaceC4597BT;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC4597BT = this.A02.A01;
            interfaceC4597BT.AA4(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
