package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* renamed from: com.google.android.material.shape.e */
/* loaded from: classes3.dex */
public final class C7796e extends C7795d {

    /* renamed from: a */
    public final float f15230a = -1.0f;

    @Override // com.google.android.material.shape.C7795d
    /* renamed from: a */
    public final void mo4459a(float f, float f2, @NonNull C7806m c7806m) {
        c7806m.m4446e(f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        c7806m.m4447d((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(0.0f)) * d * d2));
    }
}
