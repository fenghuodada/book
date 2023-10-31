package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class zzeci implements zzdey {
    private final zzbzz zza;
    private final zzfwb zzb;
    private final zzezf zzc;
    private final zzcfb zzd;
    private final zzfaa zze;
    private final zzbik zzf;
    private final boolean zzg;

    public zzeci(zzbzz zzbzzVar, zzfwb zzfwbVar, zzezf zzezfVar, zzcfb zzcfbVar, zzfaa zzfaaVar, boolean z, zzbik zzbikVar) {
        this.zza = zzbzzVar;
        this.zzb = zzfwbVar;
        this.zzc = zzezfVar;
        this.zzd = zzcfbVar;
        this.zze = zzfaaVar;
        this.zzg = z;
        this.zzf = zzbikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zza(boolean z, Context context, zzcvv zzcvvVar) {
        zzcoo zzcooVar = (zzcoo) zzfvr.zzp(this.zzb);
        this.zzd.zzan(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzcvvVar != null) {
            zzcvvVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzden zzg = zzcooVar.zzg();
        zzcfb zzcfbVar = this.zzd;
        int i = this.zzc.zzR;
        if (i == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i2 = zzwVar.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                }
            }
            zzbzt.zze("Error setting app open orientation; no targeting orientation available.");
            i = this.zzc.zzR;
        }
        int i3 = i;
        zzbzz zzbzzVar = this.zza;
        zzezf zzezfVar = this.zzc;
        String str = zzezfVar.zzC;
        zzezk zzezkVar = zzezfVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcfbVar, i3, zzbzzVar, str, zzjVar, zzezkVar.zzb, zzezkVar.zza, this.zze.zzf, zzcvvVar), true);
    }
}
