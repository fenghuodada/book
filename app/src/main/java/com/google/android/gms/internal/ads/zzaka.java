package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzaka implements zzajz {
    private final zzaar zza;
    private final zzabr zzb;
    private final zzakc zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaka(zzaar zzaarVar, zzabr zzabrVar, zzakc zzakcVar, String str, int i) throws zzce {
        this.zza = zzaarVar;
        this.zzb = zzabrVar;
        this.zzc = zzakcVar;
        int i2 = zzakcVar.zzb * zzakcVar.zze;
        int i3 = zzakcVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzce.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzakcVar.zzc * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.zze = max;
        zzak zzakVar = new zzak();
        zzakVar.zzS(str);
        zzakVar.zzv(i6);
        zzakVar.zzO(i6);
        zzakVar.zzL(max);
        zzakVar.zzw(zzakcVar.zzb);
        zzakVar.zzT(zzakcVar.zzc);
        zzakVar.zzN(i);
        this.zzd = zzakVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void zza(int i, long j) {
        this.zza.zzN(new zzakf(this.zzc, 1, i, j));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final boolean zzc(zzaap zzaapVar, long j) throws IOException {
        int i;
        zzakc zzakcVar;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.zzg) >= (i3 = this.zze)) {
                break;
            }
            int zza = zzabp.zza(this.zzb, zzaapVar, (int) Math.min(i3 - i2, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        int i4 = this.zzc.zzd;
        int i5 = this.zzg / i4;
        if (i5 > 0) {
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzs(this.zzf + zzfn.zzp(this.zzh, 1000000L, zzakcVar.zzc), 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return i <= 0;
    }
}
