package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzecw implements zzebv {
    private final zzcqa zza;
    private final Context zzb;
    private final zzdnk zzc;
    private final zzfaa zzd;
    private final Executor zze;
    private final zzfon zzf;

    public zzecw(zzcqa zzcqaVar, Context context, Executor executor, zzdnk zzdnkVar, zzfaa zzfaaVar, zzfon zzfonVar) {
        this.zzb = context;
        this.zza = zzcqaVar;
        this.zze = executor;
        this.zzc = zzdnkVar;
        this.zzd = zzfaaVar;
        this.zzf = zzfonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(final zzezr zzezrVar, final zzezf zzezfVar) {
        return zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzecq
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzecw.this.zzc(zzezrVar, zzezfVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        zzezk zzezkVar = zzezfVar.zzt;
        return (zzezkVar == null || zzezkVar.zza == null) ? false : true;
    }

    public final /* synthetic */ zzfwb zzc(zzezr zzezrVar, zzezf zzezfVar, Object obj) throws Exception {
        View zzdnnVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfae.zza(this.zzb, zzezfVar.zzv);
        final zzcfb zza2 = this.zzc.zza(zza, zzezfVar, zzezrVar.zzb.zzb);
        zza2.zzZ(zzezfVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhq)).booleanValue() && zzezfVar.zzah) {
            zzdnnVar = zzcqr.zza(this.zzb, (View) zza2, zzezfVar);
        } else {
            zzdnnVar = new zzdnn(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzezfVar));
        }
        final zzcpe zza3 = this.zza.zza(new zzcru(zzezrVar, zzezfVar, null), new zzcpk(zzdnnVar, zza2, new zzcrd() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // com.google.android.gms.internal.ads.zzcrd
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcfb.this.zzq();
            }
        }, zzfae.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zzcwa zzc = zza3.zzc();
        zzcwc zzcwcVar = new zzcwc() { // from class: com.google.android.gms.internal.ads.zzecs
            @Override // com.google.android.gms.internal.ads.zzcwc
            public final void zzl() {
                zzcfb zzcfbVar = zzcfb.this;
                if (zzcfbVar.zzN() != null) {
                    zzcfbVar.zzN().zzq();
                }
            }
        };
        zzfwc zzfwcVar = zzcag.zzf;
        zzc.zzm(zzcwcVar, zzfwcVar);
        zza3.zzh();
        zzezk zzezkVar = zzezfVar.zzt;
        zzfwb zzj = zzdnj.zzj(zza2, zzezkVar.zzb, zzezkVar.zza);
        if (zzezfVar.zzN) {
            zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzect
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfb.this.zzae();
                }
            }, this.zze);
        }
        zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecu
            @Override // java.lang.Runnable
            public final void run() {
                zzecw.this.zzd(zza2);
            }
        }, this.zze);
        return zzfvr.zzl(zzj, new zzfon() { // from class: com.google.android.gms.internal.ads.zzecv
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj2) {
                return zzcpe.this.zza();
            }
        }, zzfwcVar);
    }

    public final /* synthetic */ void zzd(zzcfb zzcfbVar) {
        zzcfbVar.zzY();
        zzcfx zzq = zzcfbVar.zzq();
        com.google.android.gms.ads.internal.client.zzfl zzflVar = this.zzd.zza;
        if (zzflVar == null || zzq == null) {
            return;
        }
        zzq.zzs(zzflVar);
    }
}
