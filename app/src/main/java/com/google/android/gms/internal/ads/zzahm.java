package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzahm {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfd zzg = new zzfd(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaap zzaapVar, boolean z) throws IOException {
        zza();
        this.zzg.zzC(27);
        if (zzaas.zzc(zzaapVar, this.zzg.zzH(), 0, 27, z) && this.zzg.zzs() == 1332176723) {
            if (this.zzg.zzk() != 0) {
                if (z) {
                    return false;
                }
                throw zzce.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzk();
            this.zzb = this.zzg.zzp();
            this.zzg.zzq();
            this.zzg.zzq();
            this.zzg.zzq();
            int zzk = this.zzg.zzk();
            this.zzc = zzk;
            this.zzd = zzk + 27;
            this.zzg.zzC(zzk);
            if (zzaas.zzc(zzaapVar, this.zzg.zzH(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzk();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzaap zzaapVar, long j) throws IOException {
        int i;
        zzdy.zzd(zzaapVar.zzf() == zzaapVar.zze());
        this.zzg.zzC(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || zzaapVar.zzf() + 4 < j) && zzaas.zzc(zzaapVar, this.zzg.zzH(), 0, 4, true)) {
                this.zzg.zzF(0);
                if (this.zzg.zzs() == 1332176723) {
                    zzaapVar.zzj();
                    return true;
                }
                ((zzaae) zzaapVar).zzo(1, false);
            }
        }
        do {
            if (i != 0 && zzaapVar.zzf() >= j) {
                break;
            }
        } while (zzaapVar.zzc(1) != -1);
        return false;
    }
}
