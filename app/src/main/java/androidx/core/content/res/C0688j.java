package androidx.core.content.res;

/* renamed from: androidx.core.content.res.j */
/* loaded from: classes.dex */
public final class C0688j {

    /* renamed from: k */
    public static final C0688j f2371k;

    /* renamed from: a */
    public final float f2372a;

    /* renamed from: b */
    public final float f2373b;

    /* renamed from: c */
    public final float f2374c;

    /* renamed from: d */
    public final float f2375d;

    /* renamed from: e */
    public final float f2376e;

    /* renamed from: f */
    public final float f2377f;

    /* renamed from: g */
    public final float[] f2378g;

    /* renamed from: h */
    public final float f2379h;

    /* renamed from: i */
    public final float f2380i;

    /* renamed from: j */
    public final float f2381j;

    static {
        float f;
        float f2;
        float[] fArr = C0672b.f2348c;
        float m11995c = (float) ((C0672b.m11995c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C0672b.f2346a;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1] * f4;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5 + (fArr3[0] * f3);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f3 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f2 = 0.59f;
        } else {
            f = 0.12999998f;
            f2 = 0.525f;
        }
        float f10 = f + f2;
        float exp = (1.0f - (((float) Math.exp(((-m11995c) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f11 = 1.0f / ((5.0f * m11995c) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(m11995c * 5.0d))) + (f12 * m11995c);
        float m11995c2 = C0672b.m11995c() / fArr[1];
        double d2 = m11995c2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), pow2};
        float f14 = fArr7[0];
        float f15 = fArr7[1];
        f2371k = new C0688j(m11995c2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f14 * 400.0f) / (f14 + 27.13f)) * 2.0f) + ((f15 * 400.0f) / (f15 + 27.13f))) * pow, pow, pow, f10, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C0688j(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f2377f = f;
        this.f2372a = f2;
        this.f2373b = f3;
        this.f2374c = f4;
        this.f2375d = f5;
        this.f2376e = f6;
        this.f2378g = fArr;
        this.f2379h = f7;
        this.f2380i = f8;
        this.f2381j = f9;
    }
}
