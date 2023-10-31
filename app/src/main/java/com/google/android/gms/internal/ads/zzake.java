package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzake {
    public static Pair zza(zzaap zzaapVar) throws IOException {
        zzaapVar.zzj();
        zzakd zzd = zzd(1684108385, zzaapVar, new zzfd(8));
        ((zzaae) zzaapVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzaapVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzakc zzb(zzaap zzaapVar) throws IOException {
        byte[] bArr;
        zzfd zzfdVar = new zzfd(16);
        zzakd zzd = zzd(1718449184, zzaapVar, zzfdVar);
        zzdy.zzf(zzd.zzb >= 16);
        zzaae zzaaeVar = (zzaae) zzaapVar;
        zzaaeVar.zzm(zzfdVar.zzH(), 0, 16, false);
        zzfdVar.zzF(0);
        int zzi = zzfdVar.zzi();
        int zzi2 = zzfdVar.zzi();
        int zzh = zzfdVar.zzh();
        int zzh2 = zzfdVar.zzh();
        int zzi3 = zzfdVar.zzi();
        int zzi4 = zzfdVar.zzi();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zzaaeVar.zzm(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzfn.zzf;
        }
        ((zzaae) zzaapVar).zzo((int) (zzaapVar.zze() - zzaapVar.zzf()), false);
        return new zzakc(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr);
    }

    public static boolean zzc(zzaap zzaapVar) throws IOException {
        zzfd zzfdVar = new zzfd(8);
        int i = zzakd.zza(zzaapVar, zzfdVar).zza;
        if (i == 1380533830 || i == 1380333108) {
            ((zzaae) zzaapVar).zzm(zzfdVar.zzH(), 0, 4, false);
            zzfdVar.zzF(0);
            int zze = zzfdVar.zze();
            if (zze != 1463899717) {
                zzer.zzb("WavHeaderReader", "Unsupported form type: " + zze);
                return false;
            }
            return true;
        }
        return false;
    }

    private static zzakd zzd(int i, zzaap zzaapVar, zzfd zzfdVar) throws IOException {
        while (true) {
            zzakd zza = zzakd.zza(zzaapVar, zzfdVar);
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzer.zze("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb + 8;
            if (j > 2147483647L) {
                int i3 = zza.zza;
                throw zzce.zzc("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            ((zzaae) zzaapVar).zzo((int) j, false);
        }
    }
}
