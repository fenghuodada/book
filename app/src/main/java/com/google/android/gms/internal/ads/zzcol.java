package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcol implements zzaur {
    private final ScheduledExecutorService zza;
    private final Clock zzb;
    @Nullable
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcol(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = scheduledExecutorService;
        this.zzb = clock;
        com.google.android.gms.ads.internal.zzt.zzb().zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaur
    public final void zza(boolean z) {
        if (z) {
            zzc();
        } else {
            zzb();
        }
    }

    @VisibleForTesting
    public final synchronized void zzb() {
        if (this.zzg) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.zze = -1L;
        } else {
            this.zzc.cancel(true);
            this.zze = this.zzd - this.zzb.elapsedRealtime();
        }
        this.zzg = true;
    }

    @VisibleForTesting
    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        if (this.zzg) {
            if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
            }
            this.zzg = false;
        }
    }

    public final synchronized void zzd(int i, Runnable runnable) {
        this.zzf = runnable;
        long j = i;
        this.zzd = this.zzb.elapsedRealtime() + j;
        this.zzc = this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
