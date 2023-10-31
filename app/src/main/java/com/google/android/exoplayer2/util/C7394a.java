package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.google.android.exoplayer2.util.a */
/* loaded from: classes.dex */
public final class C7394a {
    @Pure
    /* renamed from: a */
    public static void m5134a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: b */
    public static void m5133b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    /* renamed from: c */
    public static void m5132c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    /* renamed from: d */
    public static void m5131d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: e */
    public static void m5130e(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: f */
    public static void m5129f(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }
}
