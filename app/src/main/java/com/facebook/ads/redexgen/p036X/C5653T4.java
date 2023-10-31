package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.T4 */
/* loaded from: assets/audience_network.dex */
public class C5653T4 extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5354OE A00;

    public C5653T4(C5354OE c5354oe) {
        this.A00 = c5354oe;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (z) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
