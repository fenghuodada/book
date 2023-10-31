package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbma implements zzcan {
    final /* synthetic */ zzbmj zza;
    final /* synthetic */ zzfff zzb;
    final /* synthetic */ zzbmk zzc;

    public zzbma(zzbmk zzbmkVar, zzbmj zzbmjVar, zzfff zzfffVar) {
        this.zzc = zzbmkVar;
        this.zza = zzbmjVar;
        this.zzb = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final void zza() {
        Object obj;
        zzfft zzfftVar;
        zzfft zzfftVar2;
        obj = this.zzc.zza;
        synchronized (obj) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbcw.zzd.zze()).booleanValue()) {
                zzbmk zzbmkVar = this.zzc;
                zzfftVar = zzbmkVar.zze;
                if (zzfftVar != null) {
                    zzfftVar2 = zzbmkVar.zze;
                    zzfff zzfffVar = this.zzb;
                    zzfffVar.zzc("Failed loading new engine");
                    zzfffVar.zzf(false);
                    zzfftVar2.zzb(zzfffVar.zzl());
                }
            }
        }
    }
}
