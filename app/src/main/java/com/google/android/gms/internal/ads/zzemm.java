package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
final class zzemm {
    public final zzfwb zza;
    private final long zzb;
    private final Clock zzc;

    public zzemm(zzfwb zzfwbVar, long j, Clock clock) {
        this.zza = zzfwbVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
