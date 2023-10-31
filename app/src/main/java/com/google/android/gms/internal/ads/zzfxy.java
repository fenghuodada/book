package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzfxy implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfxy zzfxyVar = (zzfxy) obj;
        int length = this.zza.length;
        int length2 = zzfxyVar.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = zzfxyVar.zza[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxy) {
            return Arrays.equals(this.zza, ((zzfxy) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgmj.zza(this.zza);
    }
}
