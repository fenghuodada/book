package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcag {
    public static final zzfwc zza;
    public static final zzfwc zzb;
    public static final zzfwc zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfwc zze;
    public static final zzfwc zzf;

    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (ClientLibraryUtils.isPackageSide()) {
            zzflu.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcac("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcac("Default"));
        }
        zza = new zzcaf(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor2 = zzflu.zza().zzc(5, new zzcac("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcac("Loader"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor4;
        }
        zzb = new zzcaf(threadPoolExecutor2, null);
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor3 = zzflu.zza().zzb(new zzcac("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcac("Activeview"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor3 = threadPoolExecutor5;
        }
        zzc = new zzcaf(threadPoolExecutor3, null);
        zzd = new zzcab(3, new zzcac("Schedule"));
        zze = new zzcaf(new zzcad(), null);
        zzf = new zzcaf(zzfwi.zzb(), null);
    }
}
