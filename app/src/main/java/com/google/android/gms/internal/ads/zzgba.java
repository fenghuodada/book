package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgba extends zzfyi {
    private final int zza;
    private final zzgay zzb;

    public /* synthetic */ zzgba(int i, zzgay zzgayVar, zzgaz zzgazVar) {
        this.zza = i;
        this.zzb = zzgayVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgba) {
            zzgba zzgbaVar = (zzgba) obj;
            return zzgbaVar.zza == this.zza && zzgbaVar.zzb == this.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgba.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        int i = this.zza;
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + i + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgay zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzgay.zzc;
    }
}
