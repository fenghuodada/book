package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: androidx.core.view.f2 */
/* loaded from: classes.dex */
public final class C0917f2 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0928h2 f2632a;

    /* renamed from: b */
    public final /* synthetic */ View f2633b;

    public C0917f2(InterfaceC0928h2 interfaceC0928h2, View view) {
        this.f2632a = interfaceC0928h2;
        this.f2633b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2632a.mo11452a(this.f2633b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2632a.mo11463c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2632a.mo11451b();
    }
}
