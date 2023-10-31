package com.google.android.gms.internal.ads;

import android.os.Bundle;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzefh extends zzefa {
    private final zzcgw zza;
    private final zzcuq zzb;
    private final zzdav zzc;
    private final zzefk zzd;
    @Nullable
    private final zzezs zze;
    private final zzeca zzf;

    public zzefh(zzcgw zzcgwVar, zzcuq zzcuqVar, zzdav zzdavVar, @Nullable zzezs zzezsVar, zzefk zzefkVar, zzeca zzecaVar) {
        this.zza = zzcgwVar;
        this.zzb = zzcuqVar;
        this.zzc = zzdavVar;
        this.zze = zzezsVar;
        this.zzd = zzefkVar;
        this.zzf = zzecaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final zzfwb zzc(zzfaa zzfaaVar, Bundle bundle, zzezf zzezfVar, zzezr zzezrVar) {
        zzezs zzezsVar;
        zzcuq zzcuqVar = this.zzb;
        zzcuqVar.zzi(zzfaaVar);
        zzcuqVar.zzf(bundle);
        zzcuqVar.zzg(new zzcuk(zzezrVar, zzezfVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdi)).booleanValue() && (zzezsVar = this.zze) != null) {
            this.zzb.zzh(zzezsVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdj)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzdms zzh = this.zza.zzh();
        zzh.zzd(this.zzb.zzj());
        zzh.zzc(this.zzc);
        zzcsm zzb = zzh.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
