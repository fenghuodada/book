package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.C7402d0;

/* renamed from: com.google.android.exoplayer2.video.spherical.c */
/* loaded from: classes.dex */
public final class C7477c {

    /* renamed from: a */
    public final float[] f14136a = new float[16];

    /* renamed from: b */
    public final float[] f14137b = new float[16];

    /* renamed from: c */
    public final C7402d0<float[]> f14138c = new C7402d0<>();

    /* renamed from: d */
    public boolean f14139d;

    /* renamed from: a */
    public static void m4915a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }
}
