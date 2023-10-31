package com.bitvale.switcher;

import android.animation.Animator;
import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.bitvale.switcher.e */
/* loaded from: classes.dex */
public final class C3407e implements Animator.AnimatorListener {

    /* renamed from: a */
    public final /* synthetic */ SwitcherC f9030a;

    public C3407e(SwitcherC switcherC) {
        this.f9030a = switcherC;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@NotNull Animator animator) {
        C10843j.m429g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animator) {
        C10843j.m429g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@NotNull Animator animator) {
        C10843j.m429g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animator) {
        C10843j.m429g(animator, "animator");
        SwitcherC switcherC = this.f9030a;
        InterfaceC10820l<Boolean, C10868p> listener = switcherC.getListener();
        if (listener != null) {
            listener.invoke(Boolean.valueOf(switcherC.f9009f));
        }
    }
}
