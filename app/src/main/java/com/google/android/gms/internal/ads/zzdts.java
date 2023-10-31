package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdts implements zzfvn {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdtt zzb;

    public zzdts(zzdtt zzdttVar, String str) {
        this.zzb = zzdttVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdth zzdthVar;
        ((zzdsn) obj).zzf();
        zzdthVar = this.zzb.zzc;
        zzdthVar.zzk(this.zza);
    }
}
