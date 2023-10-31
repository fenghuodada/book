package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public final class C1624h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1597y f3896a;

    /* renamed from: b */
    public final /* synthetic */ int f3897b;

    /* renamed from: c */
    public final /* synthetic */ View f3898c;

    /* renamed from: d */
    public final /* synthetic */ int f3899d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3900e;

    /* renamed from: f */
    public final /* synthetic */ C1627k f3901f;

    public C1624h(C1627k c1627k, RecyclerView.AbstractC1597y abstractC1597y, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3901f = c1627k;
        this.f3896a = abstractC1597y;
        this.f3897b = i;
        this.f3898c = view;
        this.f3899d = i2;
        this.f3900e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3897b;
        View view = this.f3898c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3899d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3900e.setListener(null);
        C1627k c1627k = this.f3901f;
        RecyclerView.AbstractC1597y abstractC1597y = this.f3896a;
        c1627k.m10349c(abstractC1597y);
        c1627k.f3919p.remove(abstractC1597y);
        c1627k.m10141i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3901f.getClass();
    }
}
