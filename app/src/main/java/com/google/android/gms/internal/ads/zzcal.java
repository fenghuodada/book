package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzcal implements zzfwb {
    private final zzfwk zza = zzfwk.zzf();

    private static final boolean zza(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfwb
    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }

    public final boolean zzd(@Nullable Object obj) {
        boolean zzd = this.zza.zzd(obj);
        zza(zzd);
        return zzd;
    }

    public final boolean zze(Throwable th) {
        boolean zze = this.zza.zze(th);
        zza(zze);
        return zze;
    }
}
