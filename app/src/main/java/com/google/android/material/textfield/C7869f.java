package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes3.dex */
public final class C7869f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C7871h f15500a;

    public C7869f(C7871h c7871h) {
        this.f15500a = c7871h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f15500a.f15566b.m4366g(true);
    }
}
