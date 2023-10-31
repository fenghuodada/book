package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaja implements zzzz {
    private final zzfl zza;
    private final zzfd zzb = new zzfd();

    public /* synthetic */ zzaja(zzfl zzflVar, zzaiz zzaizVar) {
        this.zza = zzflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final zzzy zza(zzaap zzaapVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzaapVar.zzf();
        int min = (int) Math.min(20000L, zzaapVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzaae) zzaapVar).zzm(this.zzb.zzH(), 0, min, false);
        zzfd zzfdVar = this.zzb;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (zzfdVar.zza() >= 4) {
            if (zzajb.zzh(zzfdVar.zzH(), zzfdVar.zzc()) != 442) {
                zzfdVar.zzG(1);
            } else {
                zzfdVar.zzG(4);
                long zzc = zzajc.zzc(zzfdVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzzy.zzd(zzb, zzf);
                        }
                        j2 = i2;
                    } else if (100000 + zzb > j) {
                        j2 = zzfdVar.zzc();
                    } else {
                        i2 = zzfdVar.zzc();
                        j3 = zzb;
                    }
                    return zzzy.zze(zzf + j2);
                }
                int zzd = zzfdVar.zzd();
                if (zzfdVar.zza() >= 10) {
                    zzfdVar.zzG(9);
                    int zzk = zzfdVar.zzk() & 7;
                    if (zzfdVar.zza() >= zzk) {
                        zzfdVar.zzG(zzk);
                        if (zzfdVar.zza() >= 4) {
                            if (zzajb.zzh(zzfdVar.zzH(), zzfdVar.zzc()) == 443) {
                                zzfdVar.zzG(4);
                                int zzo = zzfdVar.zzo();
                                if (zzfdVar.zza() >= zzo) {
                                    zzfdVar.zzG(zzo);
                                }
                            }
                            while (zzfdVar.zza() >= 4 && (zzh = zzajb.zzh(zzfdVar.zzH(), zzfdVar.zzc())) != 442 && zzh != 441 && (zzh >>> 8) == 1) {
                                zzfdVar.zzG(4);
                                if (zzfdVar.zza() >= 2) {
                                    zzfdVar.zzF(Math.min(zzfdVar.zzd(), zzfdVar.zzc() + zzfdVar.zzo()));
                                }
                            }
                            i = zzfdVar.zzc();
                        }
                    }
                }
                zzfdVar.zzF(zzd);
                i = zzfdVar.zzc();
            }
        }
        return j3 != -9223372036854775807L ? zzzy.zzf(j3, zzf + i) : zzzy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzb() {
        zzfd zzfdVar = this.zzb;
        byte[] bArr = zzfn.zzf;
        int length = bArr.length;
        zzfdVar.zzD(bArr, 0);
    }
}
