package com.google.android.gms.internal.common;

import androidx.appcompat.view.menu.C0235r;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
public final class zzah {
    @CanIgnoreReturnValue
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(C0235r.m12816a("at index ", i2));
            }
        }
        return objArr;
    }
}
