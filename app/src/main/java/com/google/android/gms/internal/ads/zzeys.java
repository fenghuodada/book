package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeys implements zzejv {
    private final Context zza;
    private final Executor zzb;
    private final zzcgw zzc;
    private final zzeyi zzd;
    private final zzeww zze;
    private final zzezs zzf;
    private final zzfft zzg;
    private final zzezy zzh;
    private zzfwb zzi;

    public zzeys(Context context, Executor executor, zzcgw zzcgwVar, zzeww zzewwVar, zzeyi zzeyiVar, zzezy zzezyVar, zzezs zzezsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgwVar;
        this.zze = zzewwVar;
        this.zzd = zzeyiVar;
        this.zzh = zzezyVar;
        this.zzf = zzezsVar;
        this.zzg = zzcgwVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdms zzk(zzewu zzewuVar) {
        zzdms zzh = this.zzc.zzh();
        zzcuq zzcuqVar = new zzcuq();
        zzcuqVar.zze(this.zza);
        zzcuqVar.zzi(((zzeyr) zzewuVar).zza);
        zzcuqVar.zzh(this.zzf);
        zzh.zzd(zzcuqVar.zzj());
        zzh.zzc(new zzdat().zzn());
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzejt zzejtVar, zzeju zzejuVar) throws RemoteException {
        zzffq zzffqVar;
        zzbvd zzbvdVar = new zzbvd(zzlVar, str);
        if (zzbvdVar.zzb == null) {
            zzbzt.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyl
                @Override // java.lang.Runnable
                public final void run() {
                    zzeys.this.zzi();
                }
            });
            return false;
        }
        zzfwb zzfwbVar = this.zzi;
        if (zzfwbVar == null || zzfwbVar.isDone()) {
            if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
                zzeww zzewwVar = this.zze;
                if (zzewwVar.zzd() != null) {
                    zzffq zzh = ((zzdmt) zzewwVar.zzd()).zzh();
                    zzh.zzh(5);
                    zzh.zzb(zzbvdVar.zza.zzp);
                    zzffqVar = zzh;
                    zzfau.zza(this.zza, zzbvdVar.zza.zzf);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzir)).booleanValue() && zzbvdVar.zza.zzf) {
                        this.zzc.zzj().zzm(true);
                    }
                    zzezy zzezyVar = this.zzh;
                    zzezyVar.zzs(zzbvdVar.zzb);
                    zzezyVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                    zzezyVar.zzE(zzbvdVar.zza);
                    zzfaa zzG = zzezyVar.zzG();
                    zzfff zzb = zzffe.zzb(this.zza, zzffp.zzf(zzG), 5, zzbvdVar.zza);
                    zzeyr zzeyrVar = new zzeyr(null);
                    zzeyrVar.zza = zzG;
                    zzeyrVar.zzb = null;
                    zzfwb zzc = this.zze.zzc(new zzewx(zzeyrVar, null), new zzewv() { // from class: com.google.android.gms.internal.ads.zzeym
                        @Override // com.google.android.gms.internal.ads.zzewv
                        public final zzcuo zza(zzewu zzewuVar) {
                            zzdms zzk;
                            zzk = zzeys.this.zzk(zzewuVar);
                            return zzk;
                        }
                    }, null);
                    this.zzi = zzc;
                    zzfvr.zzq(zzc, new zzeyp(this, zzejuVar, zzffqVar, zzb, zzeyrVar), this.zzb);
                    return true;
                }
            }
            zzffqVar = null;
            zzfau.zza(this.zza, zzbvdVar.zza.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzir)).booleanValue()) {
                this.zzc.zzj().zzm(true);
            }
            zzezy zzezyVar2 = this.zzh;
            zzezyVar2.zzs(zzbvdVar.zzb);
            zzezyVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
            zzezyVar2.zzE(zzbvdVar.zza);
            zzfaa zzG2 = zzezyVar2.zzG();
            zzfff zzb2 = zzffe.zzb(this.zza, zzffp.zzf(zzG2), 5, zzbvdVar.zza);
            zzeyr zzeyrVar2 = new zzeyr(null);
            zzeyrVar2.zza = zzG2;
            zzeyrVar2.zzb = null;
            zzfwb zzc2 = this.zze.zzc(new zzewx(zzeyrVar2, null), new zzewv() { // from class: com.google.android.gms.internal.ads.zzeym
                @Override // com.google.android.gms.internal.ads.zzewv
                public final zzcuo zza(zzewu zzewuVar) {
                    zzdms zzk;
                    zzk = zzeys.this.zzk(zzewuVar);
                    return zzk;
                }
            }, null);
            this.zzi = zzc2;
            zzfvr.zzq(zzc2, new zzeyp(this, zzejuVar, zzffqVar, zzb2, zzeyrVar2), this.zzb);
            return true;
        }
        return false;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzfba.zzd(6, null, null));
    }

    public final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
