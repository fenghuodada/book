package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcru {
    private final zzezr zza;
    private final zzezf zzb;
    private final String zzc;

    public zzcru(zzezr zzezrVar, zzezf zzezfVar, @Nullable String str) {
        this.zza = zzezrVar;
        this.zzb = zzezfVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzezf zza() {
        return this.zzb;
    }

    public final zzezi zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzezr zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}
