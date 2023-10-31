package com.kongzue.dialogx.dialogs;

import android.animation.ValueAnimator;

/* renamed from: com.kongzue.dialogx.dialogs.u */
/* loaded from: classes3.dex */
public final class C8910u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C8912w f16990a;

    public C8910u(C8912w c8912w) {
        this.f16990a = c8912w;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16990a.f16992a.f16971b.m2839e(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
