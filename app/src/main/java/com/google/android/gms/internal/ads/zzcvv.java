package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcvv extends zzdas implements zzcvm {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcvv(zzcvu zzcvuVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzm(zzcvuVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcvo
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcvm) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zzb() {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcvq
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcvm) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zzc(final zzdex zzdexVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcvn
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcvm) obj).zzc(zzdex.this);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzbzt.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdex("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvp
            @Override // java.lang.Runnable
            public final void run() {
                zzcvv.this.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjm)).intValue(), TimeUnit.MILLISECONDS);
    }
}
