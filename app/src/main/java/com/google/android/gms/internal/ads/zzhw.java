package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0485b;

/* loaded from: classes.dex */
public final class zzhw implements zzkg {
    private final zzxm zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private int zzh;
    private boolean zzi;

    public zzhw() {
        zzxm zzxmVar = new zzxm(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzxmVar;
        this.zzc = zzfn.zzo(50000L);
        this.zzd = zzfn.zzo(50000L);
        this.zze = zzfn.zzo(2500L);
        this.zzf = zzfn.zzo(5000L);
        this.zzh = 13107200;
        this.zzg = zzfn.zzo(0L);
    }

    private static void zzj(int i, int i2, String str, String str2) {
        boolean z;
        String m12391a = C0485b.m12391a(str, " cannot be less than ", str2);
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        zzdy.zze(z, m12391a);
    }

    private final void zzk(boolean z) {
        this.zzh = 13107200;
        this.zzi = false;
        if (z) {
            this.zzb.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zze(zzcx zzcxVar, zzbx zzbxVar, zzle[] zzleVarArr, zzvk zzvkVar, zzwx[] zzwxVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzleVarArr.length;
            if (i >= 2) {
                int max = Math.max(13107200, i2);
                this.zzh = max;
                this.zzb.zzf(max);
                return;
            }
            if (zzwxVarArr[i] != null) {
                i2 += zzleVarArr[i].zzb() != 1 ? 131072000 : 13107200;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(long j, long j2, float f) {
        int zza = this.zzb.zza();
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        int i2 = this.zzh;
        long j3 = this.zzc;
        if (i > 0) {
            j3 = Math.min(zzfn.zzm(j3, f), this.zzd);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = zza < i2;
            this.zzi = z;
            if (!z && j2 < 500000) {
                zzer.zze("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzd || zza >= i2) {
            this.zzi = false;
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzh(zzcx zzcxVar, zzbx zzbxVar, long j, float f, boolean z, long j2) {
        long zzn = zzfn.zzn(j, f);
        long j3 = z ? this.zzf : this.zze;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || zzn >= j3 || this.zzb.zza() >= this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzxm zzi() {
        return this.zzb;
    }
}
