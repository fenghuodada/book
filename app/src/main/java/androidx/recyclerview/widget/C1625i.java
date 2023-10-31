package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1627k;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public final class C1625i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1627k.C1628a f3902a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3903b;

    /* renamed from: c */
    public final /* synthetic */ View f3904c;

    /* renamed from: d */
    public final /* synthetic */ C1627k f3905d;

    public C1625i(C1627k c1627k, C1627k.C1628a c1628a, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3905d = c1627k;
        this.f3902a = c1628a;
        this.f3903b = viewPropertyAnimator;
        this.f3904c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3903b.setListener(null);
        View view = this.f3904c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1627k.C1628a c1628a = this.f3902a;
        RecyclerView.AbstractC1597y abstractC1597y = c1628a.f3922a;
        C1627k c1627k = this.f3905d;
        c1627k.m10349c(abstractC1597y);
        c1627k.f3921r.remove(c1628a.f3922a);
        c1627k.m10141i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC1597y abstractC1597y = this.f3902a.f3922a;
        this.f3905d.getClass();
    }
}
