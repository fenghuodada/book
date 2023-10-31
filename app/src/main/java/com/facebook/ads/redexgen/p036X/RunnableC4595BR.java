package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.BR */
/* loaded from: assets/audience_network.dex */
public class RunnableC4595BR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4596BS A01;

    public RunnableC4595BR(C4596BS c4596bs, int i) {
        this.A01 = c4596bs;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4597BT interfaceC4597BT;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC4597BT = this.A01.A01;
            interfaceC4597BT.AA8(this.A00);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
