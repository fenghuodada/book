package com.facebook.ads.redexgen.p036X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.T0 */
/* loaded from: assets/audience_network.dex */
public class C5649T0 extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5366OQ A00;

    public C5649T0(C5366OQ c5366oq) {
        this.A00 = c5366oq;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            C5366OQ c5366oq = this.A00;
            i = c5366oq.A07;
            c5366oq.postDelayed(this, i);
            return;
        }
        this.A00.setPressed(true);
        C5366OQ c5366oq2 = this.A00;
        runnable = c5366oq2.A09;
        c5366oq2.postOnAnimationDelayed(runnable, 250L);
    }
}
