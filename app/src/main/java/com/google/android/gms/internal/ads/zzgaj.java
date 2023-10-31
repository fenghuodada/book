package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgaj extends zzfyi {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgah zzd;

    public /* synthetic */ zzgaj(int i, int i2, int i3, zzgah zzgahVar, zzgai zzgaiVar) {
        this.zza = i;
        this.zzd = zzgahVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgaj) {
            zzgaj zzgajVar = (zzgaj) obj;
            return zzgajVar.zza == this.zza && zzgajVar.zzd == this.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgaj.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i = this.zza;
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + i + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgah zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzgah.zzc;
    }
}
