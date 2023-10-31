package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeey extends zzefa {
    private final zzcgw zza;
    private final zzdfh zzb;
    private final zzcuq zzc;
    private final zzdav zzd;
    private final zzefk zze;
    private final zzeca zzf;

    public zzeey(zzcgw zzcgwVar, zzdfh zzdfhVar, zzcuq zzcuqVar, zzdav zzdavVar, zzefk zzefkVar, zzeca zzecaVar) {
        this.zza = zzcgwVar;
        this.zzb = zzdfhVar;
        this.zzc = zzcuqVar;
        this.zzd = zzdavVar;
        this.zze = zzefkVar;
        this.zzf = zzecaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final zzfwb zzc(zzfaa zzfaaVar, Bundle bundle, zzezf zzezfVar, zzezr zzezrVar) {
        zzcuq zzcuqVar = this.zzc;
        zzcuqVar.zzi(zzfaaVar);
        zzcuqVar.zzf(bundle);
        zzcuqVar.zzg(new zzcuk(zzezrVar, zzezfVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdj)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzdfl zzg = this.zza.zzg();
        zzg.zzf(this.zzc.zzj());
        zzg.zze(this.zzd);
        zzg.zzd(this.zzb);
        zzg.zzc(new zzcpa(null));
        zzcsm zza = zzg.zzg().zza();
        return zza.zzi(zza.zzj());
    }
}
