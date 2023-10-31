package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzdh {
    public final int zzb;
    private final zzcz zzg;
    private final int[] zzh;
    private final boolean[] zzi;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(3, 36);
    private static final String zzf = Integer.toString(4, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdg
    };

    public zzdh(zzcz zzczVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzczVar.zzb;
        this.zzb = 1;
        this.zzg = zzczVar;
        this.zzh = (int[]) iArr.clone();
        this.zzi = (boolean[]) zArr.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdh.class == obj.getClass()) {
            zzdh zzdhVar = (zzdh) obj;
            if (this.zzg.equals(zzdhVar.zzg) && Arrays.equals(this.zzh, zzdhVar.zzh) && Arrays.equals(this.zzi, zzdhVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzg.hashCode() * 961) + Arrays.hashCode(this.zzh)) * 31) + Arrays.hashCode(this.zzi);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzam zzb(int i) {
        return this.zzg.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.zzi) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zzi[i];
    }
}
