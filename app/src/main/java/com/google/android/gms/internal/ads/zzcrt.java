package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcrt {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfwb zzc;
    private volatile boolean zzd = true;

    public zzcrt(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfwb zzfwbVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfwbVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzcrt zzcrtVar, List list, final zzfvn zzfvnVar) {
        if (list == null || list.isEmpty()) {
            zzcrtVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrn
                @Override // java.lang.Runnable
                public final void run() {
                    zzfvn.this.zza(new zzdtz(3));
                }
            });
            return;
        }
        zzfwb zzh = zzfvr.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final zzfwb zzfwbVar = (zzfwb) it.next();
            zzh = zzfvr.zzm(zzfvr.zzf(zzh, Throwable.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzcro
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    zzfvn.this.zza((Throwable) obj);
                    return zzfvr.zzh(null);
                }
            }, zzcrtVar.zza), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzcrp
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    return zzcrt.this.zza(zzfvnVar, zzfwbVar, (zzcrf) obj);
                }
            }, zzcrtVar.zza);
        }
        zzfvr.zzq(zzh, new zzcrs(zzcrtVar, zzfvnVar), zzcrtVar.zza);
    }

    public final /* synthetic */ zzfwb zza(zzfvn zzfvnVar, zzfwb zzfwbVar, zzcrf zzcrfVar) throws Exception {
        if (zzcrfVar != null) {
            zzfvnVar.zzb(zzcrfVar);
        }
        return zzfvr.zzn(zzfwbVar, ((Long) zzbdq.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfvn zzfvnVar) {
        zzfvr.zzq(this.zzc, new zzcrr(this, zzfvnVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
