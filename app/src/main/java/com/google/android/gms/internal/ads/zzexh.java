package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzexh implements zzfvn {
    final /* synthetic */ zzeju zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzfff zzc;
    final /* synthetic */ zzdeq zzd;
    final /* synthetic */ zzexi zze;

    public zzexh(zzexi zzexiVar, zzeju zzejuVar, zzffq zzffqVar, zzfff zzfffVar, zzdeq zzdeqVar) {
        this.zze = zzexiVar;
        this.zza = zzejuVar;
        this.zzb = zzffqVar;
        this.zzc = zzfffVar;
        this.zzd = zzdeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzfft zzfftVar;
        zzffq zzffqVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhJ)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejf zzejfVar;
                        zzexh zzexhVar = zzexh.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzejfVar = zzexhVar.zze.zzd;
                        zzejfVar.zza(zzeVar);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeyi zzeyiVar;
                        zzexh zzexhVar = zzexh.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzeyiVar = zzexhVar.zze.zze;
                        zzeyiVar.zza(zzeVar);
                    }
                });
            }
            zzfau.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zzg;
                zzfff zzfffVar = this.zzc;
                zzfffVar.zza(zza);
                zzfffVar.zzg(th);
                zzfffVar.zzf(false);
                zzfftVar.zzb(zzfffVar.zzl());
            } else {
                zzffqVar.zzc(zza);
                zzfff zzfffVar2 = this.zzc;
                zzfffVar2.zzg(th);
                zzfffVar2.zzf(false);
                zzffqVar.zza(zzfffVar2);
                zzffqVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfft zzfftVar;
        zzffq zzffqVar;
        Executor executor;
        Executor executor2;
        zzejf zzejfVar;
        zzeyi zzeyiVar;
        zzddp zzddpVar = (zzddp) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbbc zzbbcVar = zzbbk.zzhJ;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue()) {
                zzczn zzn = zzddpVar.zzn();
                zzejfVar = this.zze.zzd;
                zzn.zza(zzejfVar);
                zzeyiVar = this.zze.zze;
                zzn.zzd(zzeyiVar);
            }
            this.zza.zzb(zzddpVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejf zzejfVar2;
                        zzejfVar2 = zzexh.this.zze.zzd;
                        zzejfVar2.zzn();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexe
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeyi zzeyiVar2;
                        zzeyiVar2 = zzexh.this.zze.zze;
                        zzeyiVar2.zzn();
                    }
                });
            }
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zzg;
                zzfff zzfffVar = this.zzc;
                zzfffVar.zzb(zzddpVar.zzp().zzb);
                zzfffVar.zzd(zzddpVar.zzl().zzg());
                zzfffVar.zzf(true);
                zzfftVar.zzb(zzfffVar.zzl());
            } else {
                zzffqVar.zzf(zzddpVar.zzp().zzb);
                zzffqVar.zze(zzddpVar.zzl().zzg());
                zzfff zzfffVar2 = this.zzc;
                zzfffVar2.zzf(true);
                zzffqVar.zza(zzfffVar2);
                zzffqVar.zzg();
            }
        }
    }
}
