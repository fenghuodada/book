package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzflt implements zzflr {
    private zzflt() {
    }

    public /* synthetic */ zzflt(zzfls zzflsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzflr
    public final ExecutorService zza(int i) {
        return zzc(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzflr
    public final ExecutorService zzb(ThreadFactory threadFactory, int i) {
        return zzc(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzflr
    public final ExecutorService zzc(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
