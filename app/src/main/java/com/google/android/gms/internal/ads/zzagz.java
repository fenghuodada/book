package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzagz {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzaap zzaapVar) throws IOException {
        return zzc(zzaapVar, true, false);
    }

    public static boolean zzb(zzaap zzaapVar, boolean z) throws IOException {
        return zzc(zzaapVar, false, false);
    }

    private static boolean zzc(zzaap zzaapVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long j;
        int i;
        zzfd zzfdVar;
        long zzd = zzaapVar.zzd();
        long j2 = -1;
        int i2 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i2 != 0 && zzd <= 4096) {
            j3 = zzd;
        }
        zzfd zzfdVar2 = new zzfd(64);
        int i3 = (int) j3;
        boolean z4 = false;
        int i4 = 0;
        boolean z5 = false;
        while (i4 < i3) {
            zzfdVar2.zzC(8);
            if (!zzaapVar.zzm(zzfdVar2.zzH(), z4 ? 1 : 0, 8, true)) {
                z3 = z4 ? 1 : 0;
                break;
            }
            long zzs = zzfdVar2.zzs();
            int zze = zzfdVar2.zze();
            if (zzs == 1) {
                zzaapVar.zzh(zzfdVar2.zzH(), 8, 8);
                i = 16;
                zzfdVar2.zzE(16);
                j = zzfdVar2.zzr();
            } else {
                if (zzs == 0) {
                    long zzd2 = zzaapVar.zzd();
                    if (zzd2 != j2) {
                        zzs = (zzd2 - zzaapVar.zze()) + 8;
                    }
                }
                j = zzs;
                i = 8;
            }
            long j4 = i;
            if (j < j4) {
                return z4;
            }
            i4 += i;
            if (zze == 1836019574) {
                i3 += (int) j;
                if (i2 != 0 && i3 > zzd) {
                    i3 = (int) zzd;
                }
                j2 = -1;
            } else if (zze == 1836019558 || zze == 1836475768) {
                z3 = true;
                break;
            } else {
                zzfd zzfdVar3 = zzfdVar2;
                if ((i4 + j) - j4 >= i3) {
                    break;
                }
                int i5 = (int) (j - j4);
                i4 += i5;
                if (zze != 1718909296) {
                    zzfdVar = zzfdVar3;
                    if (i5 != 0) {
                        zzaapVar.zzg(i5);
                    }
                } else if (i5 < 8) {
                    return false;
                } else {
                    zzfdVar = zzfdVar3;
                    zzfdVar.zzC(i5);
                    zzaapVar.zzh(zzfdVar.zzH(), 0, i5);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 != 1) {
                            int zze2 = zzfdVar.zze();
                            if ((zze2 >>> 8) != 3368816) {
                                if (zze2 == 1751476579) {
                                    zze2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i8 = 0; i8 < 29; i8++) {
                                    if (iArr[i8] != zze2) {
                                    }
                                }
                                continue;
                            }
                            z5 = true;
                            break;
                        }
                        zzfdVar.zzG(4);
                    }
                    if (!z5) {
                        return false;
                    }
                }
                zzfdVar2 = zzfdVar;
                j2 = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}
