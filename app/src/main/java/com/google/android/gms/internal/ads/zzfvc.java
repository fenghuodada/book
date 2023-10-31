package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzfvc extends zzfvd {
    final /* synthetic */ zzfve zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvc(zzfve zzfveVar, Callable callable, Executor executor) {
        super(zzfveVar, executor);
        this.zza = zzfveVar;
        callable.getClass();
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfwa
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
