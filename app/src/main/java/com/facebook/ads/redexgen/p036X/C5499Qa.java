package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.Qa */
/* loaded from: assets/audience_network.dex */
public class C5499Qa implements Animator.AnimatorListener {
    public final /* synthetic */ C5006IT A00;

    public C5499Qa(C5006IT c5006it) {
        this.A00 = c5006it;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00 = null;
        this.A00.A01 = EnumC5491QS.A03;
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
