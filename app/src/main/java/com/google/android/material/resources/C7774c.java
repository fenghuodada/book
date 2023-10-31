package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.widget.C0430x1;
import androidx.core.content.ContextCompat;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.c */
/* loaded from: classes3.dex */
public final class C7774c {
    @Nullable
    /* renamed from: a */
    public static ColorStateList m4495a(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        ColorStateList m12039b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (m12039b = ContextCompat.m12039b(context, resourceId)) != null) {
            return m12039b;
        }
        return typedArray.getColorStateList(i);
    }

    @Nullable
    /* renamed from: b */
    public static ColorStateList m4494b(@NonNull Context context, @NonNull C0430x1 c0430x1, @StyleableRes int i) {
        int m12469i;
        ColorStateList m12039b;
        if (c0430x1.m12466l(i) && (m12469i = c0430x1.m12469i(i, 0)) != 0 && (m12039b = ContextCompat.m12039b(context, m12469i)) != null) {
            return m12039b;
        }
        return c0430x1.m12476b(i);
    }

    @Nullable
    /* renamed from: c */
    public static Drawable m4493c(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        Drawable m12920a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m12920a = C0158a.m12920a(context, resourceId)) == null) ? typedArray.getDrawable(i) : m12920a;
    }

    /* renamed from: d */
    public static boolean m4492d(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
