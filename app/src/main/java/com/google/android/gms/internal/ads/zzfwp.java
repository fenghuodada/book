package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfwp extends zzfwa {
    final /* synthetic */ zzfwr zza;
    private final zzfux zzb;

    public zzfwp(zzfwr zzfwrVar, zzfux zzfuxVar) {
        this.zza = zzfwrVar;
        zzfuxVar.getClass();
        this.zzb = zzfuxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfwb zza = this.zzb.zza();
        zzfoz.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfwb) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
