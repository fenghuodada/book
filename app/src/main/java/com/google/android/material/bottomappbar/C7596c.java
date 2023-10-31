package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.bottomappbar.c */
/* loaded from: classes3.dex */
public final class C7596c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f14433a;

    public C7596c(BottomAppBar bottomAppBar) {
        this.f14433a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f14433a;
        bottomAppBar.getClass();
        bottomAppBar.f14408W = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f14433a.getClass();
    }
}
