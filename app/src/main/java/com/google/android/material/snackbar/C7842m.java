package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.snackbar.m */
/* loaded from: classes3.dex */
public final class C7842m extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15387a;

    public C7842m(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15387a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15387a.m4423d();
    }
}
