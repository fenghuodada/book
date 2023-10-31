package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes3.dex */
public final class Preconditions {
    public static void checkArgument(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void checkState(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
