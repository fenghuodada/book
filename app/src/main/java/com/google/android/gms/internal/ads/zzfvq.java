package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfvq {
    private final boolean zza;
    private final zzfrr zzb;

    public /* synthetic */ zzfvq(boolean z, zzfrr zzfrrVar, zzfvp zzfvpVar) {
        this.zza = z;
        this.zzb = zzfrrVar;
    }

    public final zzfwb zza(Callable callable, Executor executor) {
        return new zzfve(this.zzb, this.zza, executor, callable);
    }
}
