package com.google.android.gms.internal.ads;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzcz {
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzam[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcy
    };

    public zzcz(String str, zzam... zzamVarArr) {
        this.zzc = str;
        this.zzg = zzamVarArr;
        int zzb = zzcd.zzb(zzamVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzcd.zzb(zzamVarArr[0].zzl) : zzb;
        zzd(zzamVarArr[0].zzd);
        int i = zzamVarArr[0].zzf;
    }

    private static String zzd(@Nullable String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcz.class == obj.getClass()) {
            zzcz zzczVar = (zzcz) obj;
            if (this.zzc.equals(zzczVar.zzc) && Arrays.equals(this.zzg, zzczVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzg) + ((this.zzc.hashCode() + 527) * 31);
            this.zzh = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzam zzamVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzamVar == this.zzg[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzam zzb(int i) {
        return this.zzg[i];
    }

    @CheckResult
    public final zzcz zzc(String str) {
        return new zzcz(str, this.zzg);
    }
}
