package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Eu */
/* loaded from: assets/audience_network.dex */
public class RunnableC4789Eu implements Runnable {
    public final /* synthetic */ RunnableC4792Ex A00;

    public RunnableC4789Eu(RunnableC4792Ex runnableC4792Ex) {
        this.A00 = runnableC4792Ex;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
