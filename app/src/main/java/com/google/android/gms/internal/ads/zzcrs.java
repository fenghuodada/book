package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcrs implements zzfvn {
    final /* synthetic */ zzfvn zza;
    final /* synthetic */ zzcrt zzb;

    public zzcrs(zzcrt zzcrtVar, zzfvn zzfvnVar) {
        this.zzb = zzcrtVar;
        this.zza = zzfvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrq
            @Override // java.lang.Runnable
            public final void run() {
                zzcrt.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrq
            @Override // java.lang.Runnable
            public final void run() {
                zzcrt.this.zzd();
            }
        });
        this.zza.zzb((zzcrf) obj);
    }
}
