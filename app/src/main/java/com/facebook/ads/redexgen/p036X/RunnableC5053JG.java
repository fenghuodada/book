package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.JG */
/* loaded from: assets/audience_network.dex */
public class RunnableC5053JG implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C5059JM A02;
    public final /* synthetic */ String A03;

    public RunnableC5053JG(C5059JM c5059jm, String str, long j, long j2) {
        this.A02 = c5059jm;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5060JN interfaceC5060JN;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5060JN = this.A02.A01;
            interfaceC5060JN.ACg(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
