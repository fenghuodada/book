package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;

/* renamed from: com.google.android.material.bottomsheet.a */
/* loaded from: classes3.dex */
public final class C7607a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f14514a;

    public C7607a(BottomSheetBehavior bottomSheetBehavior) {
        this.f14514a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MaterialShapeDrawable materialShapeDrawable = this.f14514a.f14482i;
        if (materialShapeDrawable != null) {
            MaterialShapeDrawable.C7791b c7791b = materialShapeDrawable.f15183a;
            if (c7791b.f15215j != floatValue) {
                c7791b.f15215j = floatValue;
                materialShapeDrawable.f15187e = true;
                materialShapeDrawable.invalidateSelf();
            }
        }
    }
}
