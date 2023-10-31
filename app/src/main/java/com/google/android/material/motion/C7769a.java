package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0694d;
import androidx.core.view.animation.C0892a;
import com.google.android.material.resources.C7773b;

/* renamed from: com.google.android.material.motion.a */
/* loaded from: classes3.dex */
public final class C7769a {
    /* renamed from: a */
    public static float m4502a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    /* renamed from: b */
    public static boolean m4501b(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: c */
    public static int m4500c(@NonNull Context context, @AttrRes int i, int i2) {
        TypedValue m4498a = C7773b.m4498a(context, i);
        return (m4498a == null || m4498a.type != 16) ? i2 : m4498a.data;
    }

    @NonNull
    /* renamed from: d */
    public static TimeInterpolator m4499d(@NonNull Context context, @AttrRes int i, @NonNull Interpolator interpolator) {
        boolean z;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!m4501b(valueOf, "cubic-bezier") && !m4501b(valueOf, "path")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (m4501b(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        return C0892a.m11537b(m4502a(split, 0), m4502a(split, 1), m4502a(split, 2), m4502a(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                } else if (m4501b(valueOf, "path")) {
                    return C0892a.m11536c(C0694d.m11960d(valueOf.substring(5, valueOf.length() - 1)));
                } else {
                    throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
                }
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
