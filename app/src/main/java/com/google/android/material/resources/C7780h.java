package com.google.android.material.resources;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.C0728a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.h */
/* loaded from: classes3.dex */
public final class C7780h {
    @Nullable
    /* renamed from: a */
    public static Typeface m4481a(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 == 0 || typeface == null) {
                    return null;
                }
                weight = typeface.getWeight();
                i3 = configuration.fontWeightAdjustment;
                create = Typeface.create(typeface, C0728a.m11870a(i3 + weight, 1, 1000), typeface.isItalic());
                return create;
            }
            return null;
        }
        return null;
    }
}
