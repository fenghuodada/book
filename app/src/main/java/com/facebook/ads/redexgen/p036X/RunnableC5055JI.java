package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.JI */
/* loaded from: assets/audience_network.dex */
public class RunnableC5055JI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C5059JM A02;

    public RunnableC5055JI(C5059JM c5059jm, int i, long j) {
        this.A02 = c5059jm;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5060JN interfaceC5060JN;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5060JN = this.A02.A01;
            interfaceC5060JN.AAe(this.A00, this.A01);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
