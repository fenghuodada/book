package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.material.snackbar.c */
/* loaded from: classes3.dex */
public final class C7832c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15377a;

    public C7832c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15377a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f15377a;
        baseTransientBottomBar.f15341i.setScaleX(floatValue);
        baseTransientBottomBar.f15341i.setScaleY(floatValue);
    }
}
