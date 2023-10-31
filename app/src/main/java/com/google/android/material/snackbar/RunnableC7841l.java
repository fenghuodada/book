package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: com.google.android.material.snackbar.l */
/* loaded from: classes3.dex */
public final class RunnableC7841l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15386a;

    public RunnableC7841l(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15386a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f15386a;
        BaseTransientBottomBar.C7828e c7828e = baseTransientBottomBar.f15341i;
        if (c7828e == null) {
            return;
        }
        ViewParent parent = c7828e.getParent();
        BaseTransientBottomBar.C7828e c7828e2 = baseTransientBottomBar.f15341i;
        if (parent != null) {
            c7828e2.setVisibility(0);
        }
        if (c7828e2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(baseTransientBottomBar.f15336d);
            ofFloat.addUpdateListener(new C7831b(baseTransientBottomBar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(baseTransientBottomBar.f15338f);
            ofFloat2.addUpdateListener(new C7832c(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f15333a);
            animatorSet.addListener(new C7842m(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = c7828e2.getHeight();
        ViewGroup.LayoutParams layoutParams = c7828e2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        c7828e2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f15337e);
        valueAnimator.setDuration(baseTransientBottomBar.f15335c);
        valueAnimator.addListener(new C7833d(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new C7834e(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
