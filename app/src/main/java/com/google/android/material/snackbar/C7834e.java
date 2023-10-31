package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.interpolator.view.animation.C1437b;

/* renamed from: com.google.android.material.snackbar.e */
/* loaded from: classes3.dex */
public final class C7834e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15379a;

    public C7834e(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f15379a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1437b c1437b = BaseTransientBottomBar.f15327u;
        this.f15379a.f15341i.setTranslationY(intValue);
    }
}
