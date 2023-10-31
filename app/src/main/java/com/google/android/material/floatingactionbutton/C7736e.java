package com.google.android.material.floatingactionbutton;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: com.google.android.material.floatingactionbutton.e */
/* loaded from: classes3.dex */
public final class C7736e implements TypeEvaluator<Float> {

    /* renamed from: a */
    public final FloatEvaluator f15003a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f3) {
        float floatValue = this.f15003a.evaluate(f, (Number) f2, (Number) f3).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
