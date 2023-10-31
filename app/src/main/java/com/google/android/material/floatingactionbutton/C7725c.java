package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C7726d;

/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes3.dex */
public final class C7725c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f14951a;

    /* renamed from: b */
    public final /* synthetic */ C7726d.InterfaceC7733g f14952b;

    /* renamed from: c */
    public final /* synthetic */ C7726d f14953c;

    public C7725c(C7726d c7726d, boolean z, C7723a c7723a) {
        this.f14953c = c7726d;
        this.f14951a = z;
        this.f14952b = c7723a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C7726d c7726d = this.f14953c;
        c7726d.f14977m = 0;
        c7726d.f14971g = null;
        C7726d.InterfaceC7733g interfaceC7733g = this.f14952b;
        if (interfaceC7733g != null) {
            ((C7723a) interfaceC7733g).f14945a.mo4553b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C7726d c7726d = this.f14953c;
        c7726d.f14981q.m4503b(0, this.f14951a);
        c7726d.f14977m = 2;
        c7726d.f14971g = animator;
    }
}
