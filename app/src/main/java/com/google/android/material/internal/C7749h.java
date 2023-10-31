package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes3.dex */
public final class C7749h {

    /* renamed from: a */
    public final ArrayList<C7751b> f15097a = new ArrayList<>();
    @Nullable

    /* renamed from: b */
    public ValueAnimator f15098b = null;

    /* renamed from: c */
    public final C7750a f15099c = new C7750a();

    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: classes3.dex */
    public class C7750a extends AnimatorListenerAdapter {
        public C7750a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C7749h c7749h = C7749h.this;
            if (c7749h.f15098b == animator) {
                c7749h.f15098b = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.h$b */
    /* loaded from: classes3.dex */
    public static class C7751b {
        public C7751b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: a */
    public final void m4514a(int[] iArr, ValueAnimator valueAnimator) {
        C7751b c7751b = new C7751b(iArr, valueAnimator);
        valueAnimator.addListener(this.f15099c);
        this.f15097a.add(c7751b);
    }
}
