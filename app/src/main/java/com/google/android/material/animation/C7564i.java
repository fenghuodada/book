package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;

/* renamed from: com.google.android.material.animation.i */
/* loaded from: classes3.dex */
public final class C7564i {

    /* renamed from: a */
    public final long f14296a;

    /* renamed from: b */
    public final long f14297b;
    @Nullable

    /* renamed from: c */
    public final TimeInterpolator f14298c;

    /* renamed from: d */
    public int f14299d;

    /* renamed from: e */
    public int f14300e;

    public C7564i(long j) {
        this.f14296a = 0L;
        this.f14297b = 300L;
        this.f14298c = null;
        this.f14299d = 0;
        this.f14300e = 1;
        this.f14296a = j;
        this.f14297b = 150L;
    }

    public C7564i(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.f14296a = 0L;
        this.f14297b = 300L;
        this.f14298c = null;
        this.f14299d = 0;
        this.f14300e = 1;
        this.f14296a = j;
        this.f14297b = j2;
        this.f14298c = timeInterpolator;
    }

    /* renamed from: a */
    public final void m4804a(@NonNull Animator animator) {
        animator.setStartDelay(this.f14296a);
        animator.setDuration(this.f14297b);
        animator.setInterpolator(m4803b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f14299d);
            valueAnimator.setRepeatMode(this.f14300e);
        }
    }

    @Nullable
    /* renamed from: b */
    public final TimeInterpolator m4803b() {
        TimeInterpolator timeInterpolator = this.f14298c;
        return timeInterpolator != null ? timeInterpolator : C7556a.f14283b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7564i)) {
            return false;
        }
        C7564i c7564i = (C7564i) obj;
        if (this.f14296a != c7564i.f14296a || this.f14297b != c7564i.f14297b || this.f14299d != c7564i.f14299d || this.f14300e != c7564i.f14300e) {
            return false;
        }
        return m4803b().getClass().equals(c7564i.m4803b().getClass());
    }

    public final int hashCode() {
        long j = this.f14296a;
        long j2 = this.f14297b;
        return ((((m4803b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f14299d) * 31) + this.f14300e;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C7564i.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f14296a);
        sb.append(" duration: ");
        sb.append(this.f14297b);
        sb.append(" interpolator: ");
        sb.append(m4803b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f14299d);
        sb.append(" repeatMode: ");
        return C0539e.m12264b(sb, this.f14300e, "}\n");
    }
}
