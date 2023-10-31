package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7556a;
import com.google.android.material.motion.C7769a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0588c<V> {
    @NonNull

    /* renamed from: a */
    public final LinkedHashSet<InterfaceC7584b> f14379a;

    /* renamed from: b */
    public int f14380b;

    /* renamed from: c */
    public int f14381c;

    /* renamed from: d */
    public TimeInterpolator f14382d;

    /* renamed from: e */
    public TimeInterpolator f14383e;

    /* renamed from: f */
    public int f14384f;
    @ScrollState

    /* renamed from: g */
    public int f14385g;

    /* renamed from: h */
    public int f14386h;
    @Nullable

    /* renamed from: i */
    public ViewPropertyAnimator f14387i;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface ScrollState {
    }

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes3.dex */
    public class C7583a extends AnimatorListenerAdapter {
        public C7583a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f14387i = null;
        }
    }

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7584b {
        /* renamed from: a */
        void m4769a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f14379a = new LinkedHashSet<>();
        this.f14384f = 0;
        this.f14385g = 2;
        this.f14386h = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14379a = new LinkedHashSet<>();
        this.f14384f = 0;
        this.f14385g = 2;
        this.f14386h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: h */
    public boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        this.f14384f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.f14380b = C7769a.m4500c(v.getContext(), R.attr.motionDurationLong2, 225);
        this.f14381c = C7769a.m4500c(v.getContext(), R.attr.motionDurationMedium4, 175);
        this.f14382d = C7769a.m4499d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, C7556a.f14285d);
        this.f14383e = C7769a.m4499d(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, C7556a.f14284c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: m */
    public final void mo4745m(CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        LinkedHashSet<InterfaceC7584b> linkedHashSet = this.f14379a;
        if (i2 > 0) {
            if (this.f14385g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f14387i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f14385g = 1;
            Iterator<InterfaceC7584b> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().m4769a();
            }
            m4770t(v, this.f14384f + this.f14386h, this.f14381c, this.f14383e);
        } else if (i2 < 0) {
            if (this.f14385g == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f14387i;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.f14385g = 2;
            Iterator<InterfaceC7584b> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                it2.next().m4769a();
            }
            m4770t(v, 0, this.f14380b, this.f14382d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
    /* renamed from: q */
    public boolean mo2598q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: t */
    public final void m4770t(@NonNull V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f14387i = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C7583a());
    }
}
