package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.ripple.a */
/* loaded from: classes3.dex */
public final class C7781a {

    /* renamed from: a */
    public static final int[] f15157a = {16842910, 16842919};
    @VisibleForTesting

    /* renamed from: b */
    public static final String f15158b = C7781a.class.getSimpleName();

    @NonNull
    /* renamed from: a */
    public static ColorStateList m4480a(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f15157a, 0)) != 0) {
                Log.w(f15158b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: b */
    public static boolean m4479b(@NonNull int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
