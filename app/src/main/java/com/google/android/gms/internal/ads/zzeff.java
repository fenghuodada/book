package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeff extends zzefa {
    private final zzcgw zza;
    private final zzcuq zzb;
    private final zzeho zzc;
    private final zzdav zzd;
    private final zzefk zze;
    private final zzeca zzf;

    public zzeff(zzcgw zzcgwVar, zzcuq zzcuqVar, zzeho zzehoVar, zzdav zzdavVar, zzefk zzefkVar, zzeca zzecaVar) {
        this.zza = zzcgwVar;
        this.zzb = zzcuqVar;
        this.zzc = zzehoVar;
        this.zzd = zzdavVar;
        this.zze = zzefkVar;
        this.zzf = zzecaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final zzfwb zzc(zzfaa zzfaaVar, Bundle bundle, zzezf zzezfVar, zzezr zzezrVar) {
        zzcuq zzcuqVar = this.zzb;
        zzcuqVar.zzi(zzfaaVar);
        zzcuqVar.zzf(bundle);
        zzcuqVar.zzg(new zzcuk(zzezrVar, zzezfVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdj)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzdep zzf = this.zza.zzf();
        zzf.zze(this.zzb.zzj());
        zzf.zzd(this.zzd);
        zzf.zzc(this.zzc);
        zzcsm zza = zzf.zzf().zza();
        return zza.zzi(zza.zzj());
    }
}
