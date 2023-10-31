package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.QI */
/* loaded from: assets/audience_network.dex */
public class C5481QI extends AnimatorListenerAdapter {
    public final /* synthetic */ C5126KT A00;

    public C5481QI(C5126KT c5126kt) {
        this.A00 = c5126kt;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
