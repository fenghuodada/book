package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: com.google.android.material.bottomappbar.d */
/* loaded from: classes3.dex */
public final class C7597d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f14434a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f14435b;

    /* renamed from: c */
    public final /* synthetic */ int f14436c;

    /* renamed from: d */
    public final /* synthetic */ boolean f14437d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f14438e;

    public C7597d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f14438e = bottomAppBar;
        this.f14435b = actionMenuView;
        this.f14436c = i;
        this.f14437d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f14434a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        if (!this.f14434a) {
            BottomAppBar bottomAppBar = this.f14438e;
            int i = bottomAppBar.f14415j0;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            if (i != 0) {
                bottomAppBar.f14415j0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.mo4478k(i);
            }
            bottomAppBar.m4766B(this.f14435b, this.f14436c, this.f14437d, z);
        }
    }
}
