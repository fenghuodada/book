package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfwq extends zzfwa {
    final /* synthetic */ zzfwr zza;
    private final Callable zzb;

    public zzfwq(zzfwr zzfwrVar, Callable callable) {
        this.zza = zzfwrVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final Object zza() throws Exception {
        return this.zzb.call();
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
    public final void zze(Object obj) {
        this.zza.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
