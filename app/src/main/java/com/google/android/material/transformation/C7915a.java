package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.transformation.a */
/* loaded from: classes3.dex */
public final class C7915a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ExpandableTransformationBehavior f15681a;

    public C7915a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f15681a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f15681a.f15664b = null;
    }
}
