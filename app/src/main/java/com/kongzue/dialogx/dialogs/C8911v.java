package com.kongzue.dialogx.dialogs;

import android.animation.ValueAnimator;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* renamed from: com.kongzue.dialogx.dialogs.v */
/* loaded from: classes3.dex */
public final class C8911v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C8912w f16991a;

    public C8911v(C8912w c8912w) {
        this.f16991a = c8912w;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f16991a.f16992a.f16971b;
        if (dialogXBaseRelativeLayout != null) {
            dialogXBaseRelativeLayout.m2839e(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
