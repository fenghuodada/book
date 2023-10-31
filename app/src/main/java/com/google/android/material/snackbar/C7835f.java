package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;

/* renamed from: com.google.android.material.snackbar.f */
/* loaded from: classes3.dex */
public final class C7835f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15380a;

    public C7835f(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f15380a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15380a.m4424c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f15380a;
        InterfaceC7843n interfaceC7843n = baseTransientBottomBar.f15342j;
        int i = baseTransientBottomBar.f15334b;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC7843n;
        snackbarContentLayout.f15371a.setAlpha(1.0f);
        long j = i;
        ViewPropertyAnimator duration = snackbarContentLayout.f15371a.animate().alpha(0.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f15373c;
        long j2 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (snackbarContentLayout.f15372b.getVisibility() == 0) {
            snackbarContentLayout.f15372b.setAlpha(1.0f);
            snackbarContentLayout.f15372b.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
