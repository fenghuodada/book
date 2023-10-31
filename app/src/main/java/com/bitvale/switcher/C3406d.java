package com.bitvale.switcher;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.bitvale.switcher.d */
/* loaded from: classes.dex */
public final class C3406d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ SwitcherC f9029a;

    public C3406d(SwitcherC switcherC) {
        this.f9029a = switcherC;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        C10843j.m431e(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        this.f9029a.setCurrentColor(((Integer) animatedValue).intValue());
    }
}
