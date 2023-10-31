package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeec implements zzecb {
    private final Context zza;
    private final zzdeq zzb;
    private final zzbzz zzc;
    private final Executor zzd;

    public zzeec(Context context, zzbzz zzbzzVar, zzdeq zzdeqVar, Executor executor) {
        this.zza = context;
        this.zzc = zzbzzVar;
        this.zzb = zzdeqVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, zzezf zzezfVar, final zzeby zzebyVar) throws zzfaf, zzefn {
        zzddq zze = this.zzb.zze(new zzcru(zzezrVar, zzezfVar, zzebyVar.zza), new zzddt(new zzdey() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(boolean z, Context context, zzcvv zzcvvVar) {
                zzeec.this.zzc(zzebyVar, z, context, zzcvvVar);
            }
        }, null));
        zze.zzd().zzm(new zzcnf((zzfav) zzebyVar.zzb), this.zzd);
        ((zzedr) zzebyVar.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        ((zzfav) zzebyVar.zzb).zzo(this.zza, zzezrVar.zza.zza.zzd, zzezfVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzezfVar.zzt), (zzboe) zzebyVar.zzc);
    }

    public final /* synthetic */ void zzc(zzeby zzebyVar, boolean z, Context context, zzcvv zzcvvVar) throws zzdex {
        try {
            ((zzfav) zzebyVar.zzb).zzv(z);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaE)).intValue()) {
                ((zzfav) zzebyVar.zzb).zzx();
            } else {
                ((zzfav) zzebyVar.zzb).zzy(context);
            }
        } catch (zzfaf e) {
            zzbzt.zzi("Cannot show interstitial.");
            throw new zzdex(e.getCause());
        }
    }
}
