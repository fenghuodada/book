package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzedy implements zzebv {
    private final Context zza;
    private final zzdnk zzb;
    private final zzdeq zzc;
    private final zzfaa zzd;
    private final Executor zze;
    private final zzbzz zzf;
    private final zzbik zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziq)).booleanValue();

    public zzedy(Context context, zzbzz zzbzzVar, zzfaa zzfaaVar, Executor executor, zzdeq zzdeqVar, zzdnk zzdnkVar, zzbik zzbikVar) {
        this.zza = context;
        this.zzd = zzfaaVar;
        this.zzc = zzdeqVar;
        this.zze = executor;
        this.zzf = zzbzzVar;
        this.zzb = zzdnkVar;
        this.zzg = zzbikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(final zzezr zzezrVar, final zzezf zzezfVar) {
        final zzdno zzdnoVar = new zzdno();
        zzfwb zzm = zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzedt
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzedy.this.zzc(zzezfVar, zzezrVar, zzdnoVar, obj);
            }
        }, this.zze);
        zzm.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedu
            @Override // java.lang.Runnable
            public final void run() {
                zzdno.this.zzb();
            }
        }, this.zze);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        zzezk zzezkVar = zzezfVar.zzt;
        return (zzezkVar == null || zzezkVar.zza == null) ? false : true;
    }

    public final /* synthetic */ zzfwb zzc(final zzezf zzezfVar, zzezr zzezrVar, zzdno zzdnoVar, Object obj) throws Exception {
        final zzcfb zza = this.zzb.zza(this.zzd.zze, zzezfVar, zzezrVar.zzb.zzb);
        zza.zzZ(zzezfVar.zzX);
        zzdnoVar.zza(this.zza, (View) zza);
        zzcal zzcalVar = new zzcal();
        final zzddq zze = this.zzc.zze(new zzcru(zzezrVar, zzezfVar, null), new zzddt(new zzedx(this.zza, this.zzf, zzcalVar, zzezfVar, zza, this.zzd, this.zzh, this.zzg), zza));
        zzcalVar.zzd(zze);
        zze.zzc().zzm(new zzcwc() { // from class: com.google.android.gms.internal.ads.zzedv
            @Override // com.google.android.gms.internal.ads.zzcwc
            public final void zzl() {
                zzcfb zzcfbVar = zzcfb.this;
                if (zzcfbVar.zzN() != null) {
                    zzcfbVar.zzN().zzq();
                }
            }
        }, zzcag.zzf);
        zze.zzk().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzk();
        zzezk zzezkVar = zzezfVar.zzt;
        return zzfvr.zzl(zzdnj.zzj(zza, zzezkVar.zzb, zzezkVar.zza), new zzfon() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj2) {
                zzcfb zzcfbVar = zza;
                zzezf zzezfVar2 = zzezfVar;
                zzddq zzddqVar = zze;
                if (zzezfVar2.zzN) {
                    zzcfbVar.zzae();
                }
                zzcfbVar.zzY();
                zzcfbVar.onPause();
                return zzddqVar.zzg();
            }
        }, this.zze);
    }
}
