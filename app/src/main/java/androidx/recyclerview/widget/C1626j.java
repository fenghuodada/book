package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1627k;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public final class C1626j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1627k.C1628a f3906a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3907b;

    /* renamed from: c */
    public final /* synthetic */ View f3908c;

    /* renamed from: d */
    public final /* synthetic */ C1627k f3909d;

    public C1626j(C1627k c1627k, C1627k.C1628a c1628a, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3909d = c1627k;
        this.f3906a = c1628a;
        this.f3907b = viewPropertyAnimator;
        this.f3908c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3907b.setListener(null);
        View view = this.f3908c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1627k.C1628a c1628a = this.f3906a;
        RecyclerView.AbstractC1597y abstractC1597y = c1628a.f3923b;
        C1627k c1627k = this.f3909d;
        c1627k.m10349c(abstractC1597y);
        c1627k.f3921r.remove(c1628a.f3923b);
        c1627k.m10141i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC1597y abstractC1597y = this.f3906a.f3923b;
        this.f3909d.getClass();
    }
}
