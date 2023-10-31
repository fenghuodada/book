package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzlh {
    public static final zzlh zza;
    public static final zzlh zzb;
    public static final zzlh zzc;
    public static final zzlh zzd;
    public static final zzlh zze;
    public final long zzf;
    public final long zzg;

    static {
        zzlh zzlhVar = new zzlh(0L, 0L);
        zza = zzlhVar;
        zzb = new zzlh(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzlh(Long.MAX_VALUE, 0L);
        zzd = new zzlh(0L, Long.MAX_VALUE);
        zze = zzlhVar;
    }

    public zzlh(long j, long j2) {
        zzdy.zzd(j >= 0);
        zzdy.zzd(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlh.class == obj.getClass()) {
            zzlh zzlhVar = (zzlh) obj;
            if (this.zzf == zzlhVar.zzf && this.zzg == zzlhVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
