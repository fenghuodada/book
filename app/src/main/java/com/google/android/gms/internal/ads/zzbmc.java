package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbmc implements zzcap {
    final /* synthetic */ zzbme zza;

    public zzbmc(zzbme zzbmeVar) {
        this.zza = zzbmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbmj zzbmjVar;
        zzbml zzbmlVar = (zzbml) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbmjVar = this.zza.zzb;
        zzbmjVar.zzd();
    }
}
