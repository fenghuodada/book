package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: classes3.dex */
public final class C7831b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15376a;

    public C7831b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15376a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        this.f15376a.f15341i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
