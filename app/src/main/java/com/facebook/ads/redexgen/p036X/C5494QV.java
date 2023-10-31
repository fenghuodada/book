package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.QV */
/* loaded from: assets/audience_network.dex */
public class C5494QV implements Animator.AnimatorListener {
    public final /* synthetic */ C5019Ig A00;

    public C5494QV(C5019Ig c5019Ig) {
        this.A00 = c5019Ig;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A00.A08(false);
        valueAnimator = this.A00.A01;
        if (valueAnimator != null) {
            valueAnimator2 = this.A00.A01;
            valueAnimator2.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A00.A02 = EnumC5491QS.A05;
        view = this.A00.A05;
        C5245MS.A0H(view);
        valueAnimator = this.A00.A01;
        if (valueAnimator != null) {
            valueAnimator2 = this.A00.A01;
            valueAnimator2.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
