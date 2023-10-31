package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzefb extends zzefa {
    private final zzcgw zza;
    private final zzcuq zzb;
    private final zzdav zzc;
    private final zzefk zzd;
    private final zzeca zze;

    public zzefb(zzcgw zzcgwVar, zzcuq zzcuqVar, zzdav zzdavVar, zzefk zzefkVar, zzeca zzecaVar) {
        this.zza = zzcgwVar;
        this.zzb = zzcuqVar;
        this.zzc = zzdavVar;
        this.zzd = zzefkVar;
        this.zze = zzecaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final zzfwb zzc(zzfaa zzfaaVar, Bundle bundle, zzezf zzezfVar, zzezr zzezrVar) {
        zzcuq zzcuqVar = this.zzb;
        zzcuqVar.zzi(zzfaaVar);
        zzcuqVar.zzf(bundle);
        zzcuqVar.zzg(new zzcuk(zzezrVar, zzezfVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdj)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcoq zzc = this.zza.zzc();
        zzc.zzd(this.zzb.zzj());
        zzc.zzc(this.zzc);
        zzcsm zzb = zzc.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
