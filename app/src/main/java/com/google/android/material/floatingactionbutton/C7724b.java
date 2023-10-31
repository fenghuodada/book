package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C7726d;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes3.dex */
public final class C7724b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f14947a;

    /* renamed from: b */
    public final /* synthetic */ boolean f14948b;

    /* renamed from: c */
    public final /* synthetic */ C7726d.InterfaceC7733g f14949c;

    /* renamed from: d */
    public final /* synthetic */ C7726d f14950d;

    public C7724b(C7726d c7726d, boolean z, C7723a c7723a) {
        this.f14950d = c7726d;
        this.f14948b = z;
        this.f14949c = c7723a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f14947a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        C7726d c7726d = this.f14950d;
        c7726d.f14977m = 0;
        c7726d.f14971g = null;
        if (!this.f14947a) {
            boolean z = this.f14948b;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            c7726d.f14981q.m4503b(i, z);
            C7726d.InterfaceC7733g interfaceC7733g = this.f14949c;
            if (interfaceC7733g != null) {
                C7723a c7723a = (C7723a) interfaceC7733g;
                c7723a.f14945a.mo4554a(c7723a.f14946b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C7726d c7726d = this.f14950d;
        c7726d.f14981q.m4503b(0, this.f14948b);
        c7726d.f14977m = 1;
        c7726d.f14971g = animator;
        this.f14947a = false;
    }
}
