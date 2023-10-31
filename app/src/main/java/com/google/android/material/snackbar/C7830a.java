package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes3.dex */
public final class C7830a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15375a;

    public C7830a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f15375a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15375a.m4424c();
    }
}
