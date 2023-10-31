package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.FS */
/* loaded from: assets/audience_network.dex */
public class RunnableC4823FS implements Runnable {
    public final /* synthetic */ C4644CE A00;

    public RunnableC4823FS(C4644CE c4644ce) {
        this.A00 = c4644ce;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
