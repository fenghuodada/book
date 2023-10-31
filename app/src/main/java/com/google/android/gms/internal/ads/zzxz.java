package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzxz {
    public static final zzxt zza = new zzxt(0, -9223372036854775807L, null);
    public static final zzxt zzb = new zzxt(1, -9223372036854775807L, null);
    public static final zzxt zzc = new zzxt(2, -9223372036854775807L, null);
    public static final zzxt zzd = new zzxt(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzfn.zzz("ExoPlayer:Loader:ProgressiveMediaPeriod");
    @Nullable
    private zzxu zzf;
    @Nullable
    private IOException zzg;

    public zzxz(String str) {
    }

    public static zzxt zzb(boolean z, long j) {
        return new zzxt(z ? 1 : 0, j, null);
    }

    public final long zza(zzxv zzxvVar, zzxr zzxrVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzdy.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzxu(this, myLooper, zzxvVar, zzxrVar, i, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzxu zzxuVar = this.zzf;
        zzdy.zzb(zzxuVar);
        zzxuVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzxu zzxuVar = this.zzf;
        if (zzxuVar != null) {
            zzxuVar.zzb(i);
        }
    }

    public final void zzj(@Nullable zzxw zzxwVar) {
        zzxu zzxuVar = this.zzf;
        if (zzxuVar != null) {
            zzxuVar.zza(true);
        }
        this.zze.execute(new zzxx(zzxwVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
