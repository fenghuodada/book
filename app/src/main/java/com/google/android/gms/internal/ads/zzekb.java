package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzekb implements zzfvn {
    final /* synthetic */ zzeju zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzfff zzc;
    final /* synthetic */ zzdfm zzd;
    final /* synthetic */ zzekc zze;

    public zzekb(zzekc zzekcVar, zzeju zzejuVar, zzffq zzffqVar, zzfff zzfffVar, zzdfm zzdfmVar) {
        this.zze = zzekcVar;
        this.zza = zzejuVar;
        this.zzb = zzffqVar;
        this.zzc = zzfffVar;
        this.zzd = zzdfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzcgw zzcgwVar;
        zzfft zzfftVar;
        zzffq zzffqVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza);
        zzcgwVar = this.zze.zzb;
        zzcgwVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // java.lang.Runnable
            public final void run() {
                zzejs zzejsVar;
                zzekb zzekbVar = zzekb.this;
                com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                zzejsVar = zzekbVar.zze.zzd;
                zzejsVar.zza().zza(zzeVar);
            }
        });
        zzfau.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
            zzfftVar = this.zze.zze;
            zzfff zzfffVar = this.zzc;
            zzfffVar.zza(zza);
            zzfffVar.zzg(th);
            zzfffVar.zzf(false);
            zzfftVar.zzb(zzfffVar.zzl());
            return;
        }
        zzffqVar.zzc(zza);
        zzfff zzfffVar2 = this.zzc;
        zzfffVar2.zzg(th);
        zzfffVar2.zzf(false);
        zzffqVar.zza(zzfffVar2);
        zzffqVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzejs zzejsVar;
        zzcgw zzcgwVar;
        zzfft zzfftVar;
        zzffq zzffqVar;
        zzcrf zzcrfVar = (zzcrf) obj;
        synchronized (this.zze) {
            zzczn zzn = zzcrfVar.zzn();
            zzejsVar = this.zze.zzd;
            zzn.zza(zzejsVar.zzd());
            this.zza.zzb(zzcrfVar);
            zzcgwVar = this.zze.zzb;
            zzcgwVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejz
                @Override // java.lang.Runnable
                public final void run() {
                    zzejs zzejsVar2;
                    zzejsVar2 = zzekb.this.zze.zzd;
                    zzejsVar2.zzb().zzn();
                }
            });
            if (!((Boolean) zzbcw.zzc.zze()).booleanValue() || (zzffqVar = this.zzb) == null) {
                zzfftVar = this.zze.zze;
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
