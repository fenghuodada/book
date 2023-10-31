package com.google.android.gms.internal.ads;

import androidx.core.provider.C0758e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfvv implements zzfwb {
    static final zzfwb zza = new zzfvv(null);
    private static final Logger zzb = Logger.getLogger(zzfvv.class.getName());
    private final Object zzc;

    public zzfvv(Object obj) {
        this.zzc = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.zzc);
        return obj + "[status=SUCCESS, result=[" + valueOf + "]]";
    }

    @Override // com.google.android.gms.internal.ads.zzfwb
    public final void zzc(Runnable runnable, Executor executor) {
        zzfoz.zzc(runnable, "Runnable was null.");
        zzfoz.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            zzb.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", C0758e.m11827a("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }
}
