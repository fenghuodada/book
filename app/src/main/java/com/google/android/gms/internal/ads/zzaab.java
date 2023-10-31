package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaab {
    public static void zza(long j, zzfd zzfdVar, zzabr[] zzabrVarArr) {
        int i;
        while (true) {
            if (zzfdVar.zza() <= 1) {
                return;
            }
            int zzc = zzc(zzfdVar);
            int zzc2 = zzc(zzfdVar);
            int zzc3 = zzfdVar.zzc() + zzc2;
            if (zzc2 == -1 || zzc2 > zzfdVar.zza()) {
                zzer.zze("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzc3 = zzfdVar.zzd();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzk = zzfdVar.zzk();
                int zzo = zzfdVar.zzo();
                if (zzo == 49) {
                    i = zzfdVar.zze();
                    zzo = 49;
                } else {
                    i = 0;
                }
                int zzk2 = zzfdVar.zzk();
                if (zzo == 47) {
                    zzfdVar.zzG(1);
                    zzo = 47;
                }
                boolean z = zzk == 181 && (zzo == 49 || zzo == 47) && zzk2 == 3;
                if (zzo == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzfdVar, zzabrVarArr);
                }
            }
            zzfdVar.zzF(zzc3);
        }
    }

    public static void zzb(long j, zzfd zzfdVar, zzabr[] zzabrVarArr) {
        int zzk = zzfdVar.zzk();
        if ((zzk & 64) != 0) {
            int i = zzk & 31;
            zzfdVar.zzG(1);
            int zzc = zzfdVar.zzc();
            for (zzabr zzabrVar : zzabrVarArr) {
                int i2 = i * 3;
                zzfdVar.zzF(zzc);
                zzabrVar.zzq(zzfdVar, i2);
                if (j != -9223372036854775807L) {
                    zzabrVar.zzs(j, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zzc(zzfd zzfdVar) {
        int i = 0;
        while (zzfdVar.zza() != 0) {
            int zzk = zzfdVar.zzk();
            i += zzk;
            if (zzk != 255) {
                return i;
            }
        }
        return -1;
    }
}
