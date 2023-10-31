package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzblz implements zzcap {
    final /* synthetic */ zzbmj zza;
    final /* synthetic */ zzfff zzb;
    final /* synthetic */ zzbmk zzc;

    public zzblz(zzbmk zzbmkVar, zzbmj zzbmjVar, zzfff zzfffVar) {
        this.zzc = zzbmkVar;
        this.zza = zzbmjVar;
        this.zzb = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbmj zzbmjVar;
        zzfft zzfftVar;
        zzfft zzfftVar2;
        zzbmj zzbmjVar2;
        zzbmj zzbmjVar3;
        zzblf zzblfVar = (zzblf) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            this.zzc.zzi = 0;
            zzbmk zzbmkVar = this.zzc;
            zzbmjVar = zzbmkVar.zzh;
            if (zzbmjVar != null) {
                zzbmj zzbmjVar4 = this.zza;
                zzbmjVar2 = zzbmkVar.zzh;
                if (zzbmjVar4 != zzbmjVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbmjVar3 = this.zzc.zzh;
                    zzbmjVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbcw.zzd.zze()).booleanValue()) {
                zzbmk zzbmkVar2 = this.zzc;
                zzfftVar = zzbmkVar2.zze;
                if (zzfftVar != null) {
                    zzfftVar2 = zzbmkVar2.zze;
                    zzfff zzfffVar = this.zzb;
                    zzfffVar.zzf(true);
                    zzfftVar2.zzb(zzfffVar.zzl());
                }
            }
        }
    }
}
