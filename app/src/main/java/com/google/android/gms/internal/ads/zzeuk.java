package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeuk implements zzfvn {
    final /* synthetic */ zzeju zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzfff zzc;
    final /* synthetic */ zzeum zzd;
    final /* synthetic */ zzeun zze;

    public zzeuk(zzeun zzeunVar, zzeju zzejuVar, zzffq zzffqVar, zzfff zzfffVar, zzeum zzeumVar) {
        this.zze = zzeunVar;
        this.zza = zzejuVar;
        this.zzb = zzffqVar;
        this.zzc = zzfffVar;
        this.zzd = zzeumVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcup] */
    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzeww zzewwVar;
        zzevd zzevdVar;
        zzcuo zzm;
        zzfft zzfftVar;
        zzffq zzffqVar;
        Executor executor;
        zzewwVar = this.zze.zze;
        zzcon zzconVar = (zzcon) zzewwVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzconVar == null ? zzfba.zzb(th, null) : zzconVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzconVar != null) {
                zzconVar.zzc().zza(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhI)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuj
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzevd zzevdVar2;
                            zzeuk zzeukVar = zzeuk.this;
                            com.google.android.gms.ads.internal.client.zze zzeVar = zzb;
                            zzevdVar2 = zzeukVar.zze.zzd;
                            zzevdVar2.zza(zzeVar);
                        }
                    });
                }
            } else {
                zzevdVar = this.zze.zzd;
                zzevdVar.zza(zzb);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzd();
            }
            zzfau.zzb(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zzh;
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
        zzfft zzfftVar;
        zzffq zzffqVar;
        zzevd zzevdVar;
        zzcrf zzcrfVar = (zzcrf) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhI)).booleanValue()) {
                zzczn zzn = zzcrfVar.zzn();
                zzevdVar = this.zze.zzd;
                zzn.zzb(zzevdVar);
            }
            this.zza.zzb(zzcrfVar);
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zzh;
                zzfff zzfffVar = this.zzc;
                zzfffVar.zzb(zzcrfVar.zzp().zzb);
                zzfffVar.zzd(zzcrfVar.zzl().zzg());
                zzfffVar.zzf(true);
                zzfftVar.zzb(zzfffVar.zzl());
            } else {
                zzffqVar.zzf(zzcrfVar.zzp().zzb);
                zzffqVar.zze(zzcrfVar.zzl().zzg());
                zzfff zzfffVar2 = this.zzc;
                zzfffVar2.zzf(true);
                zzffqVar.zza(zzfffVar2);
                zzffqVar.zzg();
            }
        }
    }
}
