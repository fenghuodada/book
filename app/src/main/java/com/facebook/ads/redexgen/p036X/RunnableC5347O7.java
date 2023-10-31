package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.O7 */
/* loaded from: assets/audience_network.dex */
public class RunnableC5347O7 implements Runnable {
    public final /* synthetic */ C5348O8 A00;
    public final /* synthetic */ InterfaceC5349O9 A01;

    public RunnableC5347O7(C5348O8 c5348o8, InterfaceC5349O9 interfaceC5349O9) {
        this.A00 = c5348o8;
        this.A01 = interfaceC5349O9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A01.AA3();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
