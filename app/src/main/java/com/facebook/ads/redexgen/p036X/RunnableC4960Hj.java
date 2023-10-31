package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Hj */
/* loaded from: assets/audience_network.dex */
public class RunnableC4960Hj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C5780V8 A03;

    public RunnableC4960Hj(C5780V8 c5780v8, int i, long j, long j2) {
        this.A03 = c5780v8;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4949HY interfaceC4949HY;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC4949HY = this.A03.A07;
            interfaceC4949HY.AAB(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
