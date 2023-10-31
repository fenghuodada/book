package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgmu {
    private final byte[] zza;

    private zzgmu(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzgmu zzb(byte[] bArr) {
        if (bArr != null) {
            return new zzgmu(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmu) {
            return Arrays.equals(((zzgmu) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return C0663f.m12005a("Bytes(", zzgmj.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }
}
