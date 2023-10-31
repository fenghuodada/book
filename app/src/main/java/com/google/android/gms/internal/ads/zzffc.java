package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzffc implements zzdcf, zzcvy, zzdcj {
    private final zzffq zza;
    private final zzfff zzb;

    public zzffc(Context context, zzffq zzffqVar) {
        this.zza = zzffqVar;
        this.zzb = zzffe.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzb() {
        if (((Boolean) zzbcw.zzd.zze()).booleanValue()) {
            zzffq zzffqVar = this.zza;
            zzfff zzfffVar = this.zzb;
            zzfffVar.zzf(true);
            zzffqVar.zza(zzfffVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzg() {
        if (((Boolean) zzbcw.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbcw.zzd.zze()).booleanValue()) {
            zzffq zzffqVar = this.zza;
            zzfff zzfffVar = this.zzb;
            zzfffVar.zzc(zzeVar.zza().toString());
            zzfffVar.zzf(false);
            zzffqVar.zza(zzfffVar);
        }
    }
}
