package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.collection.C0470b;

/* renamed from: androidx.transition.h */
/* loaded from: classes.dex */
public final class C1754h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0470b f4258a;

    /* renamed from: b */
    public final /* synthetic */ Transition f4259b;

    public C1754h(Transition transition, C0470b c0470b) {
        this.f4259b = transition;
        this.f4258a = c0470b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4258a.remove(animator);
        this.f4259b.f4194m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4259b.f4194m.add(animator);
    }
}
