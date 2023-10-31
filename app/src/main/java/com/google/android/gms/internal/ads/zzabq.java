package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzabq {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzabq(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabq.class == obj.getClass()) {
            zzabq zzabqVar = (zzabq) obj;
            if (this.zza == zzabqVar.zza && this.zzc == zzabqVar.zzc && this.zzd == zzabqVar.zzd && Arrays.equals(this.zzb, zzabqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + (this.zza * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
