package com.facebook.ads.redexgen.p036X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.SL */
/* loaded from: assets/audience_network.dex */
public class C5608SL extends AbstractRunnableC5165L8 {
    public final /* synthetic */ InterfaceC5427PQ A00;
    public final /* synthetic */ C5428PR A01;

    public C5608SL(C5428PR c5428pr, InterfaceC5427PQ interfaceC5427PQ) {
        this.A01 = c5428pr;
        this.A00 = interfaceC5427PQ;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C5609SM(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
