package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.animation.b */
/* loaded from: classes3.dex */
public final class C7557b {
    /* renamed from: a */
    public static void m4808a(@NonNull AnimatorSet animatorSet, @NonNull ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }
}
