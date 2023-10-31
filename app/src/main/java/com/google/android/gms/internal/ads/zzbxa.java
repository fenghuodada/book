package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzbxa {
    private final Clock zza;
    private final zzbwy zzb;

    public zzbxa(Clock clock, zzbwy zzbwyVar) {
        this.zza = clock;
        this.zzb = zzbwyVar;
    }

    public static zzbxa zza(Context context) {
        return zzbxz.zzd(context).zzb();
    }

    public final void zzb(int i, long j) {
        this.zzb.zzb(i, j);
    }

    public final void zzc() {
        this.zzb.zza();
    }

    public final void zzd(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }

    public final void zze() {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }
}
