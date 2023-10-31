package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeda implements zzecb {
    private final Context zza;
    private final zzcqa zzb;
    private final Executor zzc;

    public zzeda(Context context, zzcqa zzcqaVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcqaVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final /* bridge */ /* synthetic */ Object zza(zzezr zzezrVar, final zzezf zzezfVar, zzeby zzebyVar) throws zzfaf, zzefn {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhq)).booleanValue() && zzezfVar.zzah) {
            zzboh zzc = ((zzfav) zzebyVar.zzb).zzc();
            if (zzc == null) {
                zzbzt.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfaf(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfaf(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzecz
                            @Override // com.google.android.gms.internal.ads.zzfuy
                            public final zzfwb zza(Object obj) {
                                return zzeda.this.zzc(zza, zzezfVar, obj);
                            }
                        }, zzcag.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfaf(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfaf(e2);
            }
        } else {
            zza = ((zzfav) zzebyVar.zzb).zza();
        }
        zzcqa zzcqaVar = this.zzb;
        zzcru zzcruVar = new zzcru(zzezrVar, zzezfVar, zzebyVar.zza);
        final zzfav zzfavVar = (zzfav) zzebyVar.zzb;
        zzcpe zza2 = zzcqaVar.zza(zzcruVar, new zzcpk(zza, null, new zzcrd() { // from class: com.google.android.gms.internal.ads.zzecy
            @Override // com.google.android.gms.internal.ads.zzcrd
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfav.this.zzb();
            }
        }, (zzezg) zzezfVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzm(new zzcnf((zzfav) zzebyVar.zzb), this.zzc);
        ((zzedr) zzebyVar.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecb
    public final void zzb(zzezr zzezrVar, zzezf zzezfVar, zzeby zzebyVar) throws zzfaf {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzezrVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhq)).booleanValue() && zzezfVar.zzah) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfae.zza(this.zza, zzezfVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhq)).booleanValue() && zzezfVar.zzah) {
            ((zzfav) zzebyVar.zzb).zzn(this.zza, zzqVar3, zzezrVar.zza.zza.zzd, zzezfVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzezfVar.zzt), (zzboe) zzebyVar.zzc);
        } else {
            ((zzfav) zzebyVar.zzb).zzm(this.zza, zzqVar3, zzezrVar.zza.zza.zzd, zzezfVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzezfVar.zzt), (zzboe) zzebyVar.zzc);
        }
    }

    public final /* synthetic */ zzfwb zzc(View view, zzezf zzezfVar, Object obj) throws Exception {
        return zzfvr.zzh(zzcqr.zza(this.zza, view, zzezfVar));
    }
}
