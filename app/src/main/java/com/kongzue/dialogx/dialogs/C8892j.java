package com.kongzue.dialogx.dialogs;

import android.animation.ValueAnimator;

/* renamed from: com.kongzue.dialogx.dialogs.j */
/* loaded from: classes3.dex */
public final class C8892j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C8894l f16949a;

    public C8892j(C8894l c8894l) {
        this.f16949a = c8894l;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16949a.f16951a.f16933b.m2839e(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
