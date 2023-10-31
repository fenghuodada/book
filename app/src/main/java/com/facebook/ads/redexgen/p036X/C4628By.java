package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.By */
/* loaded from: assets/audience_network.dex */
public class C4628By extends Thread {
    public final /* synthetic */ AbstractC5893X0 A00;

    public C4628By(AbstractC5893X0 abstractC5893X0) {
        this.A00 = abstractC5893X0;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
