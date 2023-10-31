package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzecg implements zzebv {
    private final zzcor zza;
    private final Context zzb;
    private final zzdnk zzc;
    private final zzfaa zzd;
    private final Executor zze;
    private final zzbzz zzf;
    private final zzbik zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziq)).booleanValue();

    public zzecg(zzcor zzcorVar, Context context, Executor executor, zzdnk zzdnkVar, zzfaa zzfaaVar, zzbzz zzbzzVar, zzbik zzbikVar) {
        this.zzb = context;
        this.zza = zzcorVar;
        this.zze = executor;
        this.zzc = zzdnkVar;
        this.zzd = zzfaaVar;
        this.zzf = zzbzzVar;
        this.zzg = zzbikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(final zzezr zzezrVar, final zzezf zzezfVar) {
        final zzdno zzdnoVar = new zzdno();
        zzfwb zzm = zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzece
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzecg.this.zzc(zzezfVar, zzezrVar, zzdnoVar, obj);
            }
        }, this.zze);
        zzm.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecf
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
        final zzcfb zza = this.zzc.zza(this.zzd.zze, zzezfVar, zzezrVar.zzb.zzb);
        zza.zzZ(zzezfVar.zzX);
        zzdnoVar.zza(this.zzb, (View) zza);
        zzcal zzcalVar = new zzcal();
        final zzcoo zza2 = this.zza.zza(new zzcru(zzezrVar, zzezfVar, null), new zzddt(new zzeci(this.zzf, zzcalVar, zzezfVar, zza, this.zzd, this.zzh, this.zzg), zza), new zzcop(zzezfVar.zzab));
        zza2.zzh().zzi(zza, false, this.zzh ? this.zzg : null);
        zzcalVar.zzd(zza2);
        zza2.zzc().zzm(new zzcwc() { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // com.google.android.gms.internal.ads.zzcwc
            public final void zzl() {
                zzcfb zzcfbVar = zzcfb.this;
                if (zzcfbVar.zzN() != null) {
                    zzcfbVar.zzN().zzq();
                }
            }
        }, zzcag.zzf);
        zza2.zzh();
        zzezk zzezkVar = zzezfVar.zzt;
        return zzfvr.zzl(zzdnj.zzj(zza, zzezkVar.zzb, zzezkVar.zza), new zzfon() { // from class: com.google.android.gms.internal.ads.zzecd
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj2) {
                zzcfb zzcfbVar = zza;
                zzezf zzezfVar2 = zzezfVar;
                zzcoo zzcooVar = zza2;
                if (zzezfVar2.zzN) {
                    zzcfbVar.zzae();
                }
                zzcfbVar.zzY();
                zzcfbVar.onPause();
                return zzcooVar.zza();
            }
        }, this.zze);
    }
}
