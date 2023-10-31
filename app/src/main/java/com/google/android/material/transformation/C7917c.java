package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.InterfaceC7656d;

/* renamed from: com.google.android.material.transformation.c */
/* loaded from: classes3.dex */
public final class C7917c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7656d f15683a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f15684b;

    public C7917c(InterfaceC7656d interfaceC7656d, Drawable drawable) {
        this.f15683a = interfaceC7656d;
        this.f15684b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15683a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f15683a.setCircularRevealOverlayDrawable(this.f15684b);
    }
}
