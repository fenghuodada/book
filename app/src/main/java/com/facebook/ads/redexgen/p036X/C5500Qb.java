package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qb */
/* loaded from: assets/audience_network.dex */
public class C5500Qb implements Animator.AnimatorListener {
    public final /* synthetic */ C5006IT A00;

    public C5500Qb(C5006IT c5006it) {
        this.A00 = c5006it;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = EnumC5491QS.A05;
        view = this.A00.A05;
        C5245MS.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
