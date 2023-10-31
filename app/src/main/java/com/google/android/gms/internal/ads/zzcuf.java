package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcuf implements zzcvi, zzdcf, zzdaa, zzcvy, zzaty {
    private final zzcwa zza;
    private final zzezf zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final zzfwk zze = zzfwk.zzf();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcuf(zzcwa zzcwaVar, zzezf zzezfVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzcwaVar;
        this.zzb = zzezfVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    private final boolean zzh() {
        return this.zzb.zzZ == 2;
    }

    public final /* synthetic */ void zzb() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzd(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzbr() {
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zzc(zzatx zzatxVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjM)).booleanValue() && !zzh() && zzatxVar.zzj && this.zzg.compareAndSet(false, true)) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaa
    public final void zzd() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjM)).booleanValue() || zzh()) {
            return;
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdaa
    public final synchronized void zze() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbs)).booleanValue() && zzh()) {
            if (this.zzb.zzr == 0) {
                this.zza.zza();
                return;
            }
            zzfvr.zzq(this.zze, new zzcue(this), this.zzd);
            this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcud
                @Override // java.lang.Runnable
                public final void run() {
                    zzcuf.this.zzb();
                }
            }, this.zzb.zzr, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvy
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zze(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzo() {
        int i = this.zzb.zzZ;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjM)).booleanValue()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzp(zzbuw zzbuwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzq() {
    }
}
