package com.facebook.ads.redexgen.p036X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qc */
/* loaded from: assets/audience_network.dex */
public class C5501Qc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C5006IT A01;

    public C5501Qc(C5006IT c5006it, View view) {
        this.A01 = c5006it;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
