package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.g */
/* loaded from: classes3.dex */
public final class C7870g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C7871h f15501a;

    public C7870g(C7871h c7871h) {
        this.f15501a = c7871h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15501a.f15566b.m4366g(false);
    }
}
