package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.transition.i */
/* loaded from: classes.dex */
public final class C1756i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ Transition f4260a;

    public C1756i(Transition transition) {
        this.f4260a = transition;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4260a.m10005n();
        animator.removeListener(this);
    }
}
