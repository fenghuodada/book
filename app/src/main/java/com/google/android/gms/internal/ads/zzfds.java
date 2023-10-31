package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfds implements zzfvn {
    final /* synthetic */ zzfdi zza;
    final /* synthetic */ zzfdu zzb;

    public zzfds(zzfdu zzfduVar, zzfdi zzfdiVar) {
        this.zzb = zzfduVar;
        this.zza = zzfdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzfdw zzfdwVar;
        zzfdwVar = this.zzb.zza.zzd;
        zzfdwVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zzb(Object obj) {
        zzfdw zzfdwVar;
        zzfdwVar = this.zzb.zza.zzd;
        zzfdwVar.zzd(this.zza);
    }
}
