package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.interpolator.view.animation.C1437b;

/* renamed from: com.google.android.material.snackbar.g */
/* loaded from: classes3.dex */
public final class C7836g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15381a;

    public C7836g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15381a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1437b c1437b = BaseTransientBottomBar.f15327u;
        this.f15381a.f15341i.setTranslationY(intValue);
    }
}
