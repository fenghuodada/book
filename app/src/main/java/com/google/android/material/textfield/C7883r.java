package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.r */
/* loaded from: classes3.dex */
public final class C7883r extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C7884s f15521a;

    public C7883r(C7884s c7884s) {
        this.f15521a = c7884s;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C7884s c7884s = this.f15521a;
        c7884s.m4342q();
        c7884s.f15535r.start();
    }
}
