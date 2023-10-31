package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.circularreveal.a */
/* loaded from: classes3.dex */
public final class C7652a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7656d f14773a;

    public C7652a(InterfaceC7656d interfaceC7656d) {
        this.f14773a = interfaceC7656d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f14773a.mo4622b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f14773a.mo4623a();
    }
}
