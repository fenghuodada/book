package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.QZ */
/* loaded from: assets/audience_network.dex */
public class C5498QZ implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5008IV A02;

    public C5498QZ(C5008IV c5008iv, int i, int i2) {
        this.A02 = c5008iv;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        EnumC5491QS enumC5491QS;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        C5008IV c5008iv = this.A02;
        int i2 = this.A01;
        i = c5008iv.A04;
        if (i2 == i) {
            enumC5491QS = EnumC5491QS.A03;
        } else {
            enumC5491QS = EnumC5491QS.A05;
        }
        c5008iv.A01 = enumC5491QS;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
