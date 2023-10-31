package com.qmuiteam.qmui.widget;

import android.animation.ValueAnimator;

/* renamed from: com.qmuiteam.qmui.widget.b */
/* loaded from: classes3.dex */
public final class C9159b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C9160c f17644a;

    public C9159b(C9160c c9160c) {
        this.f17644a = c9160c;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f17644a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
