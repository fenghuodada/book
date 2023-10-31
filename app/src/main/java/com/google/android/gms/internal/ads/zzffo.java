package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzffo implements zzfvn {
    final /* synthetic */ zzffq zza;
    final /* synthetic */ zzfff zzb;

    public zzffo(zzffq zzffqVar, zzfff zzfffVar) {
        this.zza = zzffqVar;
        this.zzb = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzffq zzffqVar = this.zza;
        zzfff zzfffVar = this.zzb;
        zzfffVar.zzg(th);
        zzfffVar.zzf(false);
        zzffqVar.zza(zzfffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zzb(Object obj) {
    }
}
