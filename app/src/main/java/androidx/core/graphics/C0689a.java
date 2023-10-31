package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

/* renamed from: androidx.core.graphics.a */
/* loaded from: classes.dex */
public final class C0689a {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f2382a = new ThreadLocal<>();

    @ColorInt
    /* renamed from: a */
    public static int m11972a(@FloatRange(from = 0.0d, m13045to = 95.047d) double d, @FloatRange(from = 0.0d, m13045to = 100.0d) double d2, @FloatRange(from = 0.0d, m13045to = 108.883d) double d3) {
        double d4;
        double d5;
        double d6;
        int min;
        int min2;
        double d7 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d8 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d9 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        int round = (int) Math.round(d4 * 255.0d);
        int i = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d5 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d6 * 255.0d);
        if (round3 >= 0) {
            i = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i);
    }

    /* renamed from: b */
    public static int m11971b(@ColorInt int i, @ColorInt int i2) {
        int i3;
        int i4;
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i5 = 255 - alpha2;
        int i6 = 255 - (((255 - alpha) * i5) / 255);
        int red = Color.red(i);
        int red2 = Color.red(i2);
        int i7 = 0;
        if (i6 == 0) {
            i3 = 0;
        } else {
            i3 = (((red2 * alpha) * i5) + ((red * 255) * alpha2)) / (i6 * 255);
        }
        int green = Color.green(i);
        int green2 = Color.green(i2);
        if (i6 == 0) {
            i4 = 0;
        } else {
            i4 = (((green2 * alpha) * i5) + ((green * 255) * alpha2)) / (i6 * 255);
        }
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i6 != 0) {
            i7 = (((blue2 * alpha) * i5) + ((blue * 255) * alpha2)) / (i6 * 255);
        }
        return Color.argb(i6, i3, i4, i7);
    }

    @ColorInt
    /* renamed from: c */
    public static int m11970c(@ColorInt int i, @IntRange(from = 0, m13044to = 255) int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
