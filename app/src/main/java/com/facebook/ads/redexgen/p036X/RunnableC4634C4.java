package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.C4 */
/* loaded from: assets/audience_network.dex */
public class RunnableC4634C4 implements Runnable {
    public final /* synthetic */ C4639C9 A00;
    public final /* synthetic */ InterfaceC4640CA A01;

    public RunnableC4634C4(C4639C9 c4639c9, InterfaceC4640CA interfaceC4640CA) {
        this.A00 = c4639c9;
        this.A01 = interfaceC4640CA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A01.AAa();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
