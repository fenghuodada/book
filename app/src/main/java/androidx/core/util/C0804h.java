package androidx.core.util;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.util.h */
/* loaded from: classes.dex */
public final class C0804h {
    /* renamed from: a */
    public static void m11793a(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @IntRange(from = 0)
    /* renamed from: b */
    public static void m11792b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    @NonNull
    /* renamed from: c */
    public static void m11791c(@Nullable Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
