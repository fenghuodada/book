package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzd {
    private final zzc[] zzk;
    public static final zzd zza = new zzd(null, new zzc[0], 0, -9223372036854775807L, 0);
    private static final zzc zzf = new zzc(0).zzb(0);
    private static final String zzg = Integer.toString(1, 36);
    private static final String zzh = Integer.toString(2, 36);
    private static final String zzi = Integer.toString(3, 36);
    private static final String zzj = Integer.toString(4, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zza
    };
    public final long zzd = 0;
    public final int zzc = 0;
    public final int zze = 0;

    private zzd(@Nullable Object obj, zzc[] zzcVarArr, long j, long j2, int i) {
        this.zzk = zzcVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            zzd zzdVar = (zzd) obj;
            if (zzfn.zzB(null, null) && Arrays.equals(this.zzk, zzdVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.zzk);
    }

    public final String toString() {
        return C0552c.m12192b("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zzc zza(@IntRange(from = 0) int i) {
        return i < 0 ? zzf : this.zzk[i];
    }

    public final boolean zzb(int i) {
        zza(-1);
        zzn zznVar = zzc.zza;
        return false;
    }
}
