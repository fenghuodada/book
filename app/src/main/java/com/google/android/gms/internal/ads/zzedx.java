package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class zzedx implements zzdey {
    private final Context zza;
    private final zzbzz zzb;
    private final zzfwb zzc;
    private final zzezf zzd;
    private final zzcfb zze;
    private final zzfaa zzf;
    private final zzbik zzg;
    private final boolean zzh;

    public zzedx(Context context, zzbzz zzbzzVar, zzfwb zzfwbVar, zzezf zzezfVar, zzcfb zzcfbVar, zzfaa zzfaaVar, boolean z, zzbik zzbikVar) {
        this.zza = context;
        this.zzb = zzbzzVar;
        this.zzc = zzfwbVar;
        this.zzd = zzezfVar;
        this.zze = zzcfbVar;
        this.zzf = zzfaaVar;
        this.zzg = zzbikVar;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zza(boolean z, Context context, zzcvv zzcvvVar) {
        zzddq zzddqVar = (zzddq) zzfvr.zzp(this.zzc);
        this.zze.zzan(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, zzE, z2 ? this.zzg.zzd() : false, z2 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzcvvVar != null) {
            zzcvvVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzden zzh = zzddqVar.zzh();
        zzcfb zzcfbVar = this.zze;
        zzezf zzezfVar = this.zzd;
        int i = zzezfVar.zzR;
        zzbzz zzbzzVar = this.zzb;
        String str = zzezfVar.zzC;
        zzezk zzezkVar = zzezfVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcfbVar, i, zzbzzVar, str, zzjVar, zzezkVar.zzb, zzezkVar.zza, this.zzf.zzf, zzcvvVar), true);
    }
}
