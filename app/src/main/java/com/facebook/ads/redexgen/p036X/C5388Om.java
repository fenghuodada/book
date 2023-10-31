package com.facebook.ads.redexgen.p036X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Om */
/* loaded from: assets/audience_network.dex */
public class C5388Om implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5635Sm A00;

    public C5388Om(C5635Sm c5635Sm) {
        this.A00 = c5635Sm;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        view = this.A00.A06;
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view2 = this.A00.A06;
        view2.requestLayout();
    }
}
