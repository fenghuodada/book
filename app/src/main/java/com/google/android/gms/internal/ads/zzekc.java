package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzekc implements zzejv {
    private final zzezy zza;
    private final zzcgw zzb;
    private final Context zzc;
    private final zzejs zzd;
    private final zzfft zze;
    @Nullable
    private zzcrt zzf;

    public zzekc(zzcgw zzcgwVar, Context context, zzejs zzejsVar, zzezy zzezyVar) {
        this.zzb = zzcgwVar;
        this.zzc = context;
        this.zzd = zzejsVar;
        this.zza = zzezyVar;
        this.zze = zzcgwVar.zzy();
        zzezyVar.zzu(zzejsVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zza() {
        zzcrt zzcrtVar = this.zzf;
        return zzcrtVar != null && zzcrtVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzejt zzejtVar, zzeju zzejuVar) throws RemoteException {
        zzffq zzffqVar;
        Executor zzA;
        Runnable runnable;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
            zzbzt.zzg("Failed to load the ad because app ID is missing.");
            zzA = this.zzb.zzA();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzejx
                @Override // java.lang.Runnable
                public final void run() {
                    zzekc.this.zzf();
                }
            };
        } else if (str != null) {
            zzfau.zza(this.zzc, zzlVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzir)).booleanValue() && zzlVar.zzf) {
                this.zzb.zzj().zzm(true);
            }
            int i = ((zzejw) zzejtVar).zza;
            zzezy zzezyVar = this.zza;
            zzezyVar.zzE(zzlVar);
            zzezyVar.zzz(i);
            zzfaa zzG = zzezyVar.zzG();
            zzfff zzb = zzffe.zzb(this.zzc, zzffp.zzf(zzG), 8, zzlVar);
            com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzG.zzn;
            if (zzcbVar != null) {
                this.zzd.zzd().zzi(zzcbVar);
            }
            zzdfl zzg = this.zzb.zzg();
            zzcuq zzcuqVar = new zzcuq();
            zzcuqVar.zze(this.zzc);
            zzcuqVar.zzi(zzG);
            zzg.zzf(zzcuqVar.zzj());
            zzdat zzdatVar = new zzdat();
            zzdatVar.zzk(this.zzd.zzd(), this.zzb.zzA());
            zzg.zze(zzdatVar.zzn());
            zzg.zzd(this.zzd.zzc());
            zzg.zzc(new zzcpa(null));
            zzdfm zzg2 = zzg.zzg();
            if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
                zzffq zzf = zzg2.zzf();
                zzf.zzh(8);
                zzf.zzb(zzlVar.zzp);
                zzffqVar = zzf;
            } else {
                zzffqVar = null;
            }
            this.zzb.zzw().zzc(1);
            zzfwc zzfwcVar = zzcag.zza;
            zzgvw.zzb(zzfwcVar);
            ScheduledExecutorService zzB = this.zzb.zzB();
            zzcsm zza = zzg2.zza();
            zzcrt zzcrtVar = new zzcrt(zzfwcVar, zzB, zza.zzi(zza.zzj()));
            this.zzf = zzcrtVar;
            zzcrtVar.zze(new zzekb(this, zzejuVar, zzffqVar, zzb, zzg2));
            return true;
        } else {
            zzbzt.zzg("Ad unit ID should not be null for NativeAdLoader.");
            zzA = this.zzb.zzA();
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzejy
                @Override // java.lang.Runnable
                public final void run() {
                    zzekc.this.zzg();
                }
            };
        }
        zzA.execute(runnable);
        return false;
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzfba.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzfba.zzd(6, null, null));
    }
}
