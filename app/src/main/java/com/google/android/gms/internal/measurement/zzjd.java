package com.google.android.gms.internal.measurement;

import androidx.appcompat.view.menu.C0235r;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzjd {
    public static Object zza(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(C0235r.m12816a("at index ", i));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}
