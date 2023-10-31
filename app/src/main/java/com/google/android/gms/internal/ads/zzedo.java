package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzedo implements zzfvn {
    final /* synthetic */ zzedp zza;

    public zzedo(zzedp zzedpVar) {
        this.zza = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzcqa zzcqaVar;
        zzcvk zzcvkVar;
        zzcqaVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcqaVar.zzd().zza(th);
        zzcvkVar = this.zza.zzd;
        zzcvkVar.zza(zza);
        zzfau.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcpd) obj).zzj();
    }
}
