package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.C0689a;
import com.google.android.material.resources.C7773b;

/* renamed from: com.google.android.material.color.a */
/* loaded from: classes3.dex */
public final class C7661a {
    @ColorInt
    /* renamed from: a */
    public static int m4621a(@AttrRes int i, @NonNull View view) {
        Context context = view.getContext();
        TypedValue m4496c = C7773b.m4496c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = m4496c.resourceId;
        if (i2 != 0) {
            Object obj = ContextCompat.f2323a;
            return ContextCompat.C0652d.m12030a(context, i2);
        }
        return m4496c.data;
    }

    @ColorInt
    /* renamed from: b */
    public static int m4620b(@NonNull Context context, @AttrRes int i, @ColorInt int i2) {
        TypedValue m4498a = C7773b.m4498a(context, i);
        if (m4498a != null) {
            int i3 = m4498a.resourceId;
            if (i3 != 0) {
                Object obj = ContextCompat.f2323a;
                return ContextCompat.C0652d.m12030a(context, i3);
            }
            return m4498a.data;
        }
        return i2;
    }

    /* renamed from: c */
    public static boolean m4619c(@ColorInt int i) {
        boolean z;
        double pow;
        double pow2;
        double pow3;
        if (i != 0) {
            ThreadLocal<double[]> threadLocal = C0689a.f2382a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d = red / 255.0d;
                if (d < 0.04045d) {
                    pow = d / 12.92d;
                } else {
                    pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
                }
                double d2 = green / 255.0d;
                if (d2 < 0.04045d) {
                    pow2 = d2 / 12.92d;
                } else {
                    pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = blue / 255.0d;
                if (d3 < 0.04045d) {
                    pow3 = d3 / 12.92d;
                } else {
                    pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                z = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d4;
                double d5 = pow3 * 0.9505d;
                dArr[2] = (d5 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d4 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z = false;
        }
        return z;
    }

    @ColorInt
    /* renamed from: d */
    public static int m4618d(@ColorInt int i, @FloatRange(from = 0.0d, m13045to = 1.0d) float f, @ColorInt int i2) {
        return C0689a.m11971b(C0689a.m11970c(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
