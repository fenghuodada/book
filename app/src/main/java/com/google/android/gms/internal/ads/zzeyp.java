package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeyp implements zzfvn {
    final /* synthetic */ zzeju zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzfff zzc;
    final /* synthetic */ zzeyr zzd;
    final /* synthetic */ zzeys zze;

    public zzeyp(zzeys zzeysVar, zzeju zzejuVar, zzffq zzffqVar, zzfff zzfffVar, zzeyr zzeyrVar) {
        this.zze = zzeysVar;
        this.zza = zzejuVar;
        this.zzb = zzffqVar;
        this.zzc = zzfffVar;
        this.zzd = zzeyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzeww zzewwVar;
        zzeyi zzeyiVar;
        zzdms zzk;
        zzfft zzfftVar;
        zzffq zzffqVar;
        Executor executor;
        zzewwVar = this.zze.zze;
        zzdmt zzdmtVar = (zzdmt) zzewwVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdmtVar == null ? zzfba.zzb(th, null) : zzdmtVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzdmtVar != null) {
                zzdmtVar.zza().zza(zzb);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeyi zzeyiVar2;
                        zzeyp zzeypVar = zzeyp.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zzb;
                        zzeyiVar2 = zzeypVar.zze.zzd;
                        zzeyiVar2.zza(zzeVar);
                    }
                });
            } else {
                zzeyiVar = this.zze.zzd;
                zzeyiVar.zza(zzb);
                zzk = this.zze.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzd();
            }
            zzfau.zzb(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zzg;
                zzfff zzfffVar = this.zzc;
                zzfffVar.zza(zzb);
                zzfffVar.zzg(th);
                zzfffVar.zzf(false);
                zzfftVar.zzb(zzfffVar.zzl());
            } else {
                zzffqVar.zzc(zzb);
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
        zzeyi zzeyiVar;
        Executor executor;
        final zzeyi zzeyiVar2;
        zzeyi zzeyiVar3;
        zzfft zzfftVar;
        zzffq zzffqVar;
        zzdmo zzdmoVar = (zzdmo) obj;
        synchronized (this.zze) {
            zzczn zzn = zzdmoVar.zzn();
            zzeyiVar = this.zze.zzd;
            zzn.zzd(zzeyiVar);
            this.zza.zzb(zzdmoVar);
            zzeys zzeysVar = this.zze;
            executor = zzeysVar.zzb;
            zzeyiVar2 = zzeysVar.zzd;
            zzeyiVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyn
                @Override // java.lang.Runnable
                public final void run() {
                    zzeyi.this.zzn();
                }
            });
            zzeyiVar3 = this.zze.zzd;
            zzeyiVar3.onAdMetadataChanged();
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zzg;
                zzfff zzfffVar = this.zzc;
                zzfffVar.zzb(zzdmoVar.zzp().zzb);
                zzfffVar.zzd(zzdmoVar.zzl().zzg());
                zzfffVar.zzf(true);
                zzfftVar.zzb(zzfffVar.zzl());
            } else {
                zzffqVar.zzf(zzdmoVar.zzp().zzb);
                zzffqVar.zze(zzdmoVar.zzl().zzg());
                zzfff zzfffVar2 = this.zzc;
                zzfffVar2.zzf(true);
                zzffqVar.zza(zzfffVar2);
                zzffqVar.zzg();
            }
        }
    }
}
