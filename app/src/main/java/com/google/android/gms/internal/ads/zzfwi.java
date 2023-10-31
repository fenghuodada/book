package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzfwi {
    public static zzfwc zza(ExecutorService executorService) {
        if (executorService instanceof zzfwc) {
            return (zzfwc) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzfwh((ScheduledExecutorService) executorService) : new zzfwe(executorService);
    }

    public static Executor zzb() {
        return zzfvf.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzfuf zzfufVar) {
        executor.getClass();
        return executor == zzfvf.INSTANCE ? executor : new zzfwd(executor, zzfufVar);
    }
}
