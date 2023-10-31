package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzexi implements zzejv {
    private final Context zza;
    private final Executor zzb;
    private final zzcgw zzc;
    private final zzejf zzd;
    private final zzeyi zze;
    @Nullable
    private zzbci zzf;
    private final zzfft zzg;
    private final zzezy zzh;
    private zzfwb zzi;

    public zzexi(Context context, Executor executor, zzcgw zzcgwVar, zzejf zzejfVar, zzeyi zzeyiVar, zzezy zzezyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgwVar;
        this.zzd = zzejfVar;
        this.zzh = zzezyVar;
        this.zze = zzeyiVar;
        this.zzg = zzcgwVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zza() {
        zzfwb zzfwbVar = this.zzi;
        return (zzfwbVar == null || zzfwbVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzejt zzejtVar, zzeju zzejuVar) {
        zzdeq zzf;
        zzffq zzffqVar;
        if (str == null) {
            zzbzt.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexc
                @Override // java.lang.Runnable
                public final void run() {
                    zzexi.this.zzh();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzir)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzj().zzm(true);
            }
            com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzexb) zzejtVar).zza;
            zzezy zzezyVar = this.zzh;
            zzezyVar.zzs(str);
            zzezyVar.zzr(zzqVar);
            zzezyVar.zzE(zzlVar);
            zzfaa zzG = zzezyVar.zzG();
            zzfff zzb = zzffe.zzb(this.zza, zzffp.zzf(zzG), 4, zzlVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhJ)).booleanValue()) {
                zzdep zzf2 = this.zzc.zzf();
                zzcuq zzcuqVar = new zzcuq();
                zzcuqVar.zze(this.zza);
                zzcuqVar.zzi(zzG);
                zzf2.zze(zzcuqVar.zzj());
                zzdat zzdatVar = new zzdat();
                zzdatVar.zzj(this.zzd, this.zzb);
                zzdatVar.zzk(this.zzd, this.zzb);
                zzf2.zzd(zzdatVar.zzn());
                zzf2.zzc(new zzeho(this.zzf));
                zzf = zzf2.zzf();
            } else {
                zzdat zzdatVar2 = new zzdat();
                zzeyi zzeyiVar = this.zze;
                if (zzeyiVar != null) {
                    zzdatVar2.zze(zzeyiVar, this.zzb);
                    zzdatVar2.zzf(this.zze, this.zzb);
                    zzdatVar2.zzb(this.zze, this.zzb);
                }
                zzdep zzf3 = this.zzc.zzf();
                zzcuq zzcuqVar2 = new zzcuq();
                zzcuqVar2.zze(this.zza);
                zzcuqVar2.zzi(zzG);
                zzf3.zze(zzcuqVar2.zzj());
                zzdatVar2.zzj(this.zzd, this.zzb);
                zzdatVar2.zze(this.zzd, this.zzb);
                zzdatVar2.zzf(this.zzd, this.zzb);
                zzdatVar2.zzb(this.zzd, this.zzb);
                zzdatVar2.zza(this.zzd, this.zzb);
                zzdatVar2.zzl(this.zzd, this.zzb);
                zzdatVar2.zzk(this.zzd, this.zzb);
                zzdatVar2.zzi(this.zzd, this.zzb);
                zzdatVar2.zzc(this.zzd, this.zzb);
                zzf3.zzd(zzdatVar2.zzn());
                zzf3.zzc(new zzeho(this.zzf));
                zzf = zzf3.zzf();
            }
            zzdeq zzdeqVar = zzf;
            if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
                zzffq zzf4 = zzdeqVar.zzf();
                zzf4.zzh(4);
                zzf4.zzb(zzlVar.zzp);
                zzffqVar = zzf4;
            } else {
                zzffqVar = null;
            }
            zzcsm zza = zzdeqVar.zza();
            zzfwb zzi = zza.zzi(zza.zzj());
            this.zzi = zzi;
            zzfvr.zzq(zzi, new zzexh(this, zzejuVar, zzffqVar, zzb, zzdeqVar), this.zzb);
            return true;
        }
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzfba.zzd(6, null, null));
    }

    public final void zzi(zzbci zzbciVar) {
        this.zzf = zzbciVar;
    }
}
