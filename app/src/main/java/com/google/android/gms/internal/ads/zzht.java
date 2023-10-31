package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzht {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzht(String str, zzam zzamVar, zzam zzamVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzdy.zzd(z);
        zzdy.zzc(str);
        this.zza = str;
        zzamVar.getClass();
        this.zzb = zzamVar;
        zzamVar2.getClass();
        this.zzc = zzamVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzht.class == obj.getClass()) {
            zzht zzhtVar = (zzht) obj;
            if (this.zzd == zzhtVar.zzd && this.zze == zzhtVar.zze && this.zza.equals(zzhtVar.zza) && this.zzb.equals(zzhtVar.zzb) && this.zzc.equals(zzhtVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
