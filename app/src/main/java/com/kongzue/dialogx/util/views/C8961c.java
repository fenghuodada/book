package com.kongzue.dialogx.util.views;

import android.animation.ValueAnimator;

/* renamed from: com.kongzue.dialogx.util.views.c */
/* loaded from: classes3.dex */
public final class C8961c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C8955b f17130a;

    public C8961c(C8955b c8955b) {
        this.f17130a = c8955b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C8955b c8955b = this.f17130a;
        c8955b.f17104f = floatValue;
        c8955b.invalidate();
    }
}
