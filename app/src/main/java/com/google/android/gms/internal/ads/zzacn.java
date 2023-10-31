package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzacn implements zzzz {
    private final zzabb zza;
    private final int zzb;
    private final zzaaw zzc = new zzaaw();

    public /* synthetic */ zzacn(zzabb zzabbVar, int i, zzacm zzacmVar) {
        this.zza = zzabbVar;
        this.zzb = i;
    }

    private final long zzc(zzaap zzaapVar) throws IOException {
        while (zzaapVar.zze() < zzaapVar.zzd() - 6) {
            zzabb zzabbVar = this.zza;
            int i = this.zzb;
            zzaaw zzaawVar = this.zzc;
            long zze = zzaapVar.zze();
            byte[] bArr = new byte[2];
            zzaae zzaaeVar = (zzaae) zzaapVar;
            zzaaeVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzaapVar.zzj();
                zzaaeVar.zzl((int) (zze - zzaapVar.zzf()), false);
            } else {
                zzfd zzfdVar = new zzfd(16);
                System.arraycopy(bArr, 0, zzfdVar.zzH(), 0, 2);
                zzfdVar.zzE(zzaas.zza(zzaapVar, zzfdVar.zzH(), 2, 14));
                zzaapVar.zzj();
                zzaaeVar.zzl((int) (zze - zzaapVar.zzf()), false);
                if (zzaax.zzc(zzfdVar, zzabbVar, i, zzaawVar)) {
                    break;
                }
            }
            zzaaeVar.zzl(1, false);
        }
        if (zzaapVar.zze() >= zzaapVar.zzd() - 6) {
            ((zzaae) zzaapVar).zzl((int) (zzaapVar.zzd() - zzaapVar.zze()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final zzzy zza(zzaap zzaapVar, long j) throws IOException {
        long zzf = zzaapVar.zzf();
        long zzc = zzc(zzaapVar);
        long zze = zzaapVar.zze();
        ((zzaae) zzaapVar).zzl(Math.max(6, this.zza.zzc), false);
        int i = (zzc > j ? 1 : (zzc == j ? 0 : -1));
        long zzc2 = zzc(zzaapVar);
        return (i > 0 || zzc2 <= j) ? zzc2 <= j ? zzzy.zzf(zzc2, zzaapVar.zze()) : zzzy.zzd(zzc, zzf) : zzzy.zze(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ void zzb() {
    }
}
