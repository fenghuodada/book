package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C0482i;
import java.util.ArrayList;

/* renamed from: com.google.android.material.animation.h */
/* loaded from: classes3.dex */
public final class C7563h {

    /* renamed from: a */
    public final C0482i<String, C7564i> f14294a = new C0482i<>();

    /* renamed from: b */
    public final C0482i<String, PropertyValuesHolder[]> f14295b = new C0482i<>();

    @Nullable
    /* renamed from: a */
    public static C7563h m4807a(@NonNull Context context, @AnimatorRes int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m4806b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return m4806b(arrayList);
            }
            return null;
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    public static C7563h m4806b(@NonNull ArrayList arrayList) {
        C7563h c7563h = new C7563h();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                c7563h.f14295b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = C7556a.f14284c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = C7556a.f14285d;
                    }
                } else {
                    interpolator = C7556a.f14283b;
                }
                C7564i c7564i = new C7564i(startDelay, duration, interpolator);
                c7564i.f14299d = objectAnimator.getRepeatCount();
                c7564i.f14300e = objectAnimator.getRepeatMode();
                c7563h.f14294a.put(propertyName, c7564i);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return c7563h;
    }

    /* renamed from: c */
    public final C7564i m4805c(String str) {
        boolean z;
        C0482i<String, C7564i> c0482i = this.f14294a;
        if (c0482i.getOrDefault(str, null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c0482i.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7563h) {
            return this.f14294a.equals(((C7563h) obj).f14294a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14294a.hashCode();
    }

    @NonNull
    public final String toString() {
        return "\n" + C7563h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f14294a + "}\n";
    }
}
