package androidx.core.content.res;

import android.content.ContentValues;

/* renamed from: androidx.core.content.res.b */
/* loaded from: classes.dex */
public final class C0672b {

    /* renamed from: a */
    public static final float[][] f2346a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f2347b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f2348c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f2349d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: a */
    public static boolean m11997a(ContentValues contentValues, String str) {
        Object obj = contentValues.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException unused) {
            return obj instanceof CharSequence ? Boolean.valueOf(obj.toString()).booleanValue() || "1".equals(obj) : (obj instanceof Number) && ((Number) obj).intValue() != 0;
        }
    }

    /* renamed from: b */
    public static float m11996b(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: c */
    public static float m11995c() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
