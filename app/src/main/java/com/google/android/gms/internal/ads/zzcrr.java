package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcrr implements zzfvn {
    final /* synthetic */ zzfvn zza;
    final /* synthetic */ zzcrt zzb;

    public zzcrr(zzcrt zzcrtVar, zzfvn zzfvnVar) {
        this.zzb = zzcrtVar;
        this.zza = zzfvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrq
            @Override // java.lang.Runnable
            public final void run() {
                zzcrt.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrt.zzb(this.zzb, ((zzcrm) obj).zza, this.zza);
    }
}
