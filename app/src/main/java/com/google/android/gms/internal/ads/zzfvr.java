package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfvr extends zzfvt {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfvq zza(Iterable iterable) {
        return new zzfvq(false, zzfrr.zzj(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfvq zzb(Iterable iterable) {
        int i = zzfrr.zzd;
        iterable.getClass();
        return new zzfvq(true, zzfrr.zzj(iterable), null);
    }

    @SafeVarargs
    public static zzfvq zzc(zzfwb... zzfwbVarArr) {
        return new zzfvq(true, zzfrr.zzk(zzfwbVarArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfwb zzd(Iterable iterable) {
        return new zzfuz(zzfrr.zzj(iterable), true);
    }

    public static zzfwb zze(zzfwb zzfwbVar, Class cls, zzfon zzfonVar, Executor executor) {
        zzfuc zzfucVar = new zzfuc(zzfwbVar, cls, zzfonVar);
        zzfwbVar.zzc(zzfucVar, zzfwi.zzc(executor, zzfucVar));
        return zzfucVar;
    }

    public static zzfwb zzf(zzfwb zzfwbVar, Class cls, zzfuy zzfuyVar, Executor executor) {
        zzfub zzfubVar = new zzfub(zzfwbVar, cls, zzfuyVar);
        zzfwbVar.zzc(zzfubVar, zzfwi.zzc(executor, zzfubVar));
        return zzfubVar;
    }

    public static zzfwb zzg(Throwable th) {
        th.getClass();
        return new zzfvu(th);
    }

    public static zzfwb zzh(Object obj) {
        return obj == null ? zzfvv.zza : new zzfvv(obj);
    }

    public static zzfwb zzi() {
        return zzfvv.zza;
    }

    public static zzfwb zzj(Callable callable, Executor executor) {
        zzfwr zzfwrVar = new zzfwr(callable);
        executor.execute(zzfwrVar);
        return zzfwrVar;
    }

    public static zzfwb zzk(zzfux zzfuxVar, Executor executor) {
        zzfwr zzfwrVar = new zzfwr(zzfuxVar);
        executor.execute(zzfwrVar);
        return zzfwrVar;
    }

    public static zzfwb zzl(zzfwb zzfwbVar, zzfon zzfonVar, Executor executor) {
        int i = zzfun.zzc;
        zzfonVar.getClass();
        zzfum zzfumVar = new zzfum(zzfwbVar, zzfonVar);
        zzfwbVar.zzc(zzfumVar, zzfwi.zzc(executor, zzfumVar));
        return zzfumVar;
    }

    public static zzfwb zzm(zzfwb zzfwbVar, zzfuy zzfuyVar, Executor executor) {
        int i = zzfun.zzc;
        executor.getClass();
        zzful zzfulVar = new zzful(zzfwbVar, zzfuyVar);
        zzfwbVar.zzc(zzfulVar, zzfwi.zzc(executor, zzfulVar));
        return zzfulVar;
    }

    public static zzfwb zzn(zzfwb zzfwbVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzfwbVar.isDone() ? zzfwbVar : zzfwo.zzg(zzfwbVar, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzo(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzfwt.zza(future);
        }
        throw new IllegalStateException(zzfpo.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzp(Future future) {
        try {
            return zzfwt.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfvg((Error) cause);
            }
            throw new zzfws(cause);
        }
    }

    public static void zzq(zzfwb zzfwbVar, zzfvn zzfvnVar, Executor executor) {
        zzfvnVar.getClass();
        zzfwbVar.zzc(new zzfvo(zzfwbVar, zzfvnVar), executor);
    }
}
