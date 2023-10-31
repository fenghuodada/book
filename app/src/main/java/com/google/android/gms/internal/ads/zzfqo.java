package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;

/* loaded from: classes.dex */
final class zzfqo {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException(C0663f.m12005a("null value in entry: ", obj.toString(), "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
