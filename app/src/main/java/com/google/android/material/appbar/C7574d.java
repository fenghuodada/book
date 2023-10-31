package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes3.dex */
public final class C7574d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f14347a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f14348b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f14349c;

    public C7574d(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f14349c = baseBehavior;
        this.f14347a = coordinatorLayout;
        this.f14348b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f14349c.m4783B(this.f14347a, this.f14348b, intValue);
    }
}
