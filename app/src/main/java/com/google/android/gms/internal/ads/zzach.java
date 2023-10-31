package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzach {
    protected final zzabr zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long[] zzk;
    private int[] zzl;

    public zzach(int i, int i2, long j, int i3, zzabr zzabrVar) {
        i2 = i2 != 1 ? 2 : i2;
        this.zzd = j;
        this.zze = i3;
        this.zza = zzabrVar;
        this.zzb = zzi(i, i2 == 2 ? 1667497984 : 1651965952);
        this.zzc = i2 == 2 ? zzi(i, 1650720768) : -1;
        this.zzk = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.zzl = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
    }

    private static int zzi(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final long zzj(int i) {
        return (this.zzd * i) / this.zze;
    }

    private final zzabo zzk(int i) {
        return new zzabo(this.zzl[i] * zzj(1), this.zzk[i]);
    }

    public final zzabl zza(long j) {
        int zzj = (int) (j / zzj(1));
        int zzb = zzfn.zzb(this.zzl, zzj, true, true);
        if (this.zzl[zzb] == zzj) {
            zzabo zzk = zzk(zzb);
            return new zzabl(zzk, zzk);
        }
        zzabo zzk2 = zzk(zzb);
        int i = zzb + 1;
        return i < this.zzk.length ? new zzabl(zzk2, zzk(i)) : new zzabl(zzk2, zzk2);
    }

    public final void zzb(long j) {
        if (this.zzj == this.zzl.length) {
            long[] jArr = this.zzk;
            this.zzk = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.zzl;
            this.zzl = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.zzk;
        int i = this.zzj;
        jArr2[i] = j;
        this.zzl[i] = this.zzi;
        this.zzj = i + 1;
    }

    public final void zzc() {
        this.zzk = Arrays.copyOf(this.zzk, this.zzj);
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
    }

    public final void zzd() {
        this.zzi++;
    }

    public final void zze(int i) {
        this.zzf = i;
        this.zzg = i;
    }

    public final void zzf(long j) {
        int i;
        if (this.zzj == 0) {
            i = 0;
        } else {
            i = this.zzl[zzfn.zzc(this.zzk, j, true, true)];
        }
        this.zzh = i;
    }

    public final boolean zzg(int i) {
        return this.zzb == i || this.zzc == i;
    }

    public final boolean zzh(zzaap zzaapVar) throws IOException {
        int i = this.zzg;
        int zze = i - this.zza.zze(zzaapVar, i, false);
        this.zzg = zze;
        boolean z = zze == 0;
        if (z) {
            if (this.zzf > 0) {
                this.zza.zzs(zzj(this.zzh), Arrays.binarySearch(this.zzl, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, null);
            }
            this.zzh++;
        }
        return z;
    }
}
