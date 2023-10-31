package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;
import com.google.android.material.circularreveal.InterfaceC7656d;

/* renamed from: com.google.android.material.circularreveal.b */
/* loaded from: classes3.dex */
public final class C7653b {
    @NonNull
    /* renamed from: a */
    public static AnimatorSet m4624a(@NonNull InterfaceC7656d interfaceC7656d, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC7656d, InterfaceC7656d.C7658b.f14776a, InterfaceC7656d.C7657a.f14774b, new InterfaceC7656d.C7660d(f, f2, f3));
        InterfaceC7656d.C7660d revealInfo = interfaceC7656d.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC7656d, (int) f, (int) f2, revealInfo.f14780c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
