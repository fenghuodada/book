package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qh */
/* loaded from: assets/audience_network.dex */
public class RunnableC5506Qh implements Runnable {
    public final /* synthetic */ C5509Qk A00;

    public RunnableC5506Qh(C5509Qk c5509Qk) {
        this.A00 = c5509Qk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            handler = this.A00.A04;
            handler.removeCallbacks(this);
            handler2 = this.A00.A04;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
