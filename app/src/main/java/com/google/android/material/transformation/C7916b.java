package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.transformation.b */
/* loaded from: classes3.dex */
public final class C7916b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f15682a;

    public C7916b(View view) {
        this.f15682a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15682a.invalidate();
    }
}
