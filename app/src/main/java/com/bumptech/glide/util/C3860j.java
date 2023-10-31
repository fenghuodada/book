package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.bumptech.glide.util.j */
/* loaded from: classes.dex */
public final class C3860j {
    /* renamed from: a */
    public static void m6405a(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    /* renamed from: b */
    public static void m6404b(@Nullable Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }
}
