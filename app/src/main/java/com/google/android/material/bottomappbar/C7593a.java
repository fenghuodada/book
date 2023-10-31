package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes3.dex */
public final class C7593a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f14429a;

    public C7593a(BottomAppBar bottomAppBar) {
        this.f14429a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f14429a;
        bottomAppBar.getClass();
        bottomAppBar.f14407V = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f14429a.getClass();
    }
}
