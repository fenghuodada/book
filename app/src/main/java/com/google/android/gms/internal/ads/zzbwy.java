package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbwy {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzbxy zzc;

    public zzbwy(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxy zzbxyVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzbxyVar;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzar)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaq)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzar)).booleanValue()) {
            this.zzb.zzK(i);
        } else {
            this.zzb.zzK(-1);
        }
        this.zzb.zzL(j);
        zza();
    }
}
