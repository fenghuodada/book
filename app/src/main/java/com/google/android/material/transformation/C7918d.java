package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.InterfaceC7656d;

/* renamed from: com.google.android.material.transformation.d */
/* loaded from: classes3.dex */
public final class C7918d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7656d f15685a;

    public C7918d(InterfaceC7656d interfaceC7656d) {
        this.f15685a = interfaceC7656d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC7656d interfaceC7656d = this.f15685a;
        InterfaceC7656d.C7660d revealInfo = interfaceC7656d.getRevealInfo();
        revealInfo.f14780c = Float.MAX_VALUE;
        interfaceC7656d.setRevealInfo(revealInfo);
    }
}
