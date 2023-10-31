package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;

/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes3.dex */
public final class C7833d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15378a;

    public C7833d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15378a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15378a.m4423d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f15378a;
        InterfaceC7843n interfaceC7843n = baseTransientBottomBar.f15342j;
        int i = baseTransientBottomBar.f15335c;
        int i2 = baseTransientBottomBar.f15333a;
        int i3 = i - i2;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC7843n;
        snackbarContentLayout.f15371a.setAlpha(0.0f);
        long j = i2;
        ViewPropertyAnimator duration = snackbarContentLayout.f15371a.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f15373c;
        long j2 = i3;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (snackbarContentLayout.f15372b.getVisibility() == 0) {
            snackbarContentLayout.f15372b.setAlpha(0.0f);
            snackbarContentLayout.f15372b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
