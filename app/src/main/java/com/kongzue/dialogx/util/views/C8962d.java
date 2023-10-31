package com.kongzue.dialogx.util.views;

import android.animation.ValueAnimator;

/* renamed from: com.kongzue.dialogx.util.views.d */
/* loaded from: classes3.dex */
public final class C8962d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C8955b f17131a;

    public C8962d(C8955b c8955b) {
        this.f17131a = c8955b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f17131a.f17105g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
