package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.C0171d;

/* renamed from: com.google.android.material.animation.c */
/* loaded from: classes3.dex */
public final class C7558c implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final C7558c f14287a = new C7558c();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public final Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float m12907a = C0171d.m12907a(((intValue2 >> 24) & 255) / 255.0f, f2, f, f2);
        float m12907a2 = C0171d.m12907a(pow4, pow, f, pow);
        float m12907a3 = C0171d.m12907a((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f, pow2);
        float m12907a4 = C0171d.m12907a((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow(m12907a2, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(m12907a4, 0.45454545454545453d)) * 255.0f) | round | (Math.round(m12907a * 255.0f) << 24) | (Math.round(((float) Math.pow(m12907a3, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
