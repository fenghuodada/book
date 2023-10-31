package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public final class C1622f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC1597y f3888a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3889b;

    /* renamed from: c */
    public final /* synthetic */ View f3890c;

    /* renamed from: d */
    public final /* synthetic */ C1627k f3891d;

    public C1622f(View view, ViewPropertyAnimator viewPropertyAnimator, C1627k c1627k, RecyclerView.AbstractC1597y abstractC1597y) {
        this.f3891d = c1627k;
        this.f3888a = abstractC1597y;
        this.f3889b = viewPropertyAnimator;
        this.f3890c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3889b.setListener(null);
        this.f3890c.setAlpha(1.0f);
        C1627k c1627k = this.f3891d;
        RecyclerView.AbstractC1597y abstractC1597y = this.f3888a;
        c1627k.m10349c(abstractC1597y);
        c1627k.f3920q.remove(abstractC1597y);
        c1627k.m10141i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3891d.getClass();
    }
}
