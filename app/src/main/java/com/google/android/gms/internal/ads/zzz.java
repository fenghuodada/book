package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzz {
    public final int zzc = 0;
    @IntRange(from = 0)
    public final int zzd;
    @IntRange(from = 0)
    public final int zze;
    @Nullable
    public final String zzf;
    public static final zzz zza = new zzx(0).zze();
    private static final String zzg = Integer.toString(0, 36);
    private static final String zzh = Integer.toString(1, 36);
    private static final String zzi = Integer.toString(2, 36);
    private static final String zzj = Integer.toString(3, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzw
    };

    public /* synthetic */ zzz(zzx zzxVar, zzy zzyVar) {
        int i;
        int i2;
        i = zzxVar.zza;
        this.zzd = i;
        i2 = zzxVar.zzb;
        this.zze = i2;
        this.zzf = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzz) {
            zzz zzzVar = (zzz) obj;
            int i = zzzVar.zzc;
            return this.zzd == zzzVar.zzd && this.zze == zzzVar.zze && zzfn.zzB(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzd + 16337) * 31) + this.zze) * 31;
    }
}
