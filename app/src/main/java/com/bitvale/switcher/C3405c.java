package com.bitvale.switcher;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.bitvale.switcher.c */
/* loaded from: classes.dex */
public final class C3405c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ SwitcherC f9028a;

    public C3405c(SwitcherC switcherC) {
        this.f9028a = switcherC;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        C10843j.m431e(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this.f9028a.setIconProgress(((Float) animatedValue).floatValue());
    }
}
