package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.b */
/* loaded from: classes3.dex */
public final class C7773b {
    @Nullable
    /* renamed from: a */
    public static TypedValue m4498a(@NonNull Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m4497b(@NonNull Context context, @AttrRes int i, boolean z) {
        TypedValue m4498a = m4498a(context, i);
        return (m4498a == null || m4498a.type != 18) ? z : m4498a.data != 0;
    }

    @NonNull
    /* renamed from: c */
    public static TypedValue m4496c(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        TypedValue m4498a = m4498a(context, i);
        if (m4498a != null) {
            return m4498a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
