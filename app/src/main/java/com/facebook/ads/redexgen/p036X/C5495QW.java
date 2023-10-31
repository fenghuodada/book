package com.facebook.ads.redexgen.p036X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.QW */
/* loaded from: assets/audience_network.dex */
public class C5495QW implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C5019Ig A01;

    public C5495QW(C5019Ig c5019Ig, View view) {
        this.A01 = c5019Ig;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = intValue;
        this.A00.setLayoutParams(layoutParams);
    }
}
