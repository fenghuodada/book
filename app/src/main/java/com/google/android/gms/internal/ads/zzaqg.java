package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaqg implements zzfjw {
    final /* synthetic */ zzfit zza;

    public zzaqg(zzfit zzfitVar) {
        this.zza = zzfitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
