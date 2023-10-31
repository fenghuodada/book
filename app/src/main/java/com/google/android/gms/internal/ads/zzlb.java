package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzlb {
    private final zzla zza;
    private final zzkz zzb;
    private final zzdz zzc;
    private final zzcx zzd;
    private int zze;
    @Nullable
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzlb(zzkz zzkzVar, zzla zzlaVar, zzcx zzcxVar, int i, zzdz zzdzVar, Looper looper) {
        this.zzb = zzkzVar;
        this.zza = zzlaVar;
        this.zzd = zzcxVar;
        this.zzg = looper;
        this.zzc = zzdzVar;
        this.zzh = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzla zzc() {
        return this.zza;
    }

    public final zzlb zzd() {
        zzdy.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlb zze(@Nullable Object obj) {
        zzdy.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzlb zzf(int i) {
        zzdy.zzf(!this.zzi);
        this.zze = i;
        return this;
    }

    @Nullable
    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) throws InterruptedException, TimeoutException {
        zzdy.zzf(this.zzi);
        zzdy.zzf(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.zzk) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
