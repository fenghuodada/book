package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzajj implements zzzz {
    private final zzfl zza;
    private final zzfd zzb = new zzfd();
    private final int zzc;

    public zzajj(int i, zzfl zzflVar, int i2) {
        this.zzc = i;
        this.zza = zzflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final zzzy zza(zzaap zzaapVar, long j) throws IOException {
        int zza;
        int zza2;
        long j2;
        long zzf = zzaapVar.zzf();
        int min = (int) Math.min(112800L, zzaapVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzaae) zzaapVar).zzm(this.zzb.zzH(), 0, min, false);
        zzfd zzfdVar = this.zzb;
        int zzd = zzfdVar.zzd();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (zzfdVar.zza() >= 188 && (zza2 = (zza = zzajv.zza(zzfdVar.zzH(), zzfdVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzajv.zzb(zzfdVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j) {
                    if (j4 == -9223372036854775807L) {
                        return zzzy.zzd(zzb2, zzf);
                    }
                    j2 = zzf + j5;
                } else if (100000 + zzb2 > j) {
                    j2 = zzf + zza;
                } else {
                    j5 = zza;
                    j4 = zzb2;
                }
                return zzzy.zze(j2);
            }
            zzfdVar.zzF(zza2);
            j3 = zza2;
        }
        return j4 != -9223372036854775807L ? zzzy.zzf(j4, zzf + j3) : zzzy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzb() {
        zzfd zzfdVar = this.zzb;
        byte[] bArr = zzfn.zzf;
        int length = bArr.length;
        zzfdVar.zzD(bArr, 0);
    }
}
