package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public final class C1623g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1597y f3892a;

    /* renamed from: b */
    public final /* synthetic */ View f3893b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3894c;

    /* renamed from: d */
    public final /* synthetic */ C1627k f3895d;

    public C1623g(View view, ViewPropertyAnimator viewPropertyAnimator, C1627k c1627k, RecyclerView.AbstractC1597y abstractC1597y) {
        this.f3895d = c1627k;
        this.f3892a = abstractC1597y;
        this.f3893b = view;
        this.f3894c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3893b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3894c.setListener(null);
        C1627k c1627k = this.f3895d;
        RecyclerView.AbstractC1597y abstractC1597y = this.f3892a;
        c1627k.m10349c(abstractC1597y);
        c1627k.f3918o.remove(abstractC1597y);
        c1627k.m10141i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3895d.getClass();
    }
}
