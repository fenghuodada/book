package com.qmuiteam.qmui.util;

import androidx.annotation.Nullable;

/* renamed from: com.qmuiteam.qmui.util.d */
/* loaded from: classes3.dex */
public final class C9143d {
    /* renamed from: a */
    public static float m2644a(float f) {
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = 1.0f;
            if (f <= 1.0f) {
                return f;
            }
        }
        return f2;
    }

    /* renamed from: b */
    public static int m2643b(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: c */
    public static boolean m2642c(@Nullable CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
