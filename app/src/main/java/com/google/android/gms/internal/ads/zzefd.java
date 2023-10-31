package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzefd extends zzefa {
    private final zzcgw zza;
    private final zzcuq zzb;
    private final zzeho zzc;
    private final zzdav zzd;
    private final zzdfh zze;
    private final zzcxx zzf;
    private final ViewGroup zzg;
    private final zzdae zzh;
    private final zzefk zzi;
    private final zzeca zzj;

    public zzefd(zzcgw zzcgwVar, zzcuq zzcuqVar, zzeho zzehoVar, zzdav zzdavVar, zzdfh zzdfhVar, zzcxx zzcxxVar, @Nullable ViewGroup viewGroup, @Nullable zzdae zzdaeVar, zzefk zzefkVar, zzeca zzecaVar) {
        this.zza = zzcgwVar;
        this.zzb = zzcuqVar;
        this.zzc = zzehoVar;
        this.zzd = zzdavVar;
        this.zze = zzdfhVar;
        this.zzf = zzcxxVar;
        this.zzg = viewGroup;
        this.zzh = zzdaeVar;
        this.zzi = zzefkVar;
        this.zzj = zzecaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final zzfwb zzc(zzfaa zzfaaVar, Bundle bundle, zzezf zzezfVar, zzezr zzezrVar) {
        zzcuq zzcuqVar = this.zzb;
        zzcuqVar.zzi(zzfaaVar);
        zzcuqVar.zzf(bundle);
        zzcuqVar.zzg(new zzcuk(zzezrVar, zzezfVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdj)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzcpz zzd = this.zza.zzd();
        zzd.zzi(this.zzb.zzj());
        zzd.zzf(this.zzd);
        zzd.zze(this.zzc);
        zzd.zzd(this.zze);
        zzd.zzg(new zzcqx(this.zzf, this.zzh));
        zzd.zzc(new zzcpa(this.zzg));
        zzcsm zzd2 = zzd.zzk().zzd();
        return zzd2.zzi(zzd2.zzj());
    }
}
