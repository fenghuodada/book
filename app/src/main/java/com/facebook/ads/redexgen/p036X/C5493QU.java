package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.QU */
/* loaded from: assets/audience_network.dex */
public class C5493QU implements Animator.AnimatorListener {
    public final /* synthetic */ C5019Ig A00;

    public C5493QU(C5019Ig c5019Ig) {
        this.A00 = c5019Ig;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = EnumC5491QS.A03;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
