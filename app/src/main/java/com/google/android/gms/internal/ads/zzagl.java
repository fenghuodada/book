package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzagl {
    private static final byte[] zza;

    static {
        int i = zzfn.zza;
        zza = "OpusHead".getBytes(zzfol.zzc);
    }

    @Nullable
    public static zzca zza(zzaga zzagaVar) {
        zzaes zzaesVar;
        zzagb zzb = zzagaVar.zzb(1751411826);
        zzagb zzb2 = zzagaVar.zzb(1801812339);
        zzagb zzb3 = zzagaVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzfd zzfdVar = zzb2.zza;
        zzfdVar.zzF(12);
        int zze = zzfdVar.zze();
        String[] strArr = new String[zze];
        for (int i = 0; i < zze; i++) {
            int zze2 = zzfdVar.zze();
            zzfdVar.zzG(4);
            strArr[i] = zzfdVar.zzx(zze2 - 8, zzfol.zzc);
        }
        zzfd zzfdVar2 = zzb3.zza;
        zzfdVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzfdVar2.zza() > 8) {
            int zzc = zzfdVar2.zzc();
            int zze3 = zzfdVar2.zze();
            int zze4 = zzfdVar2.zze() - 1;
            if (zze4 < 0 || zze4 >= zze) {
                zzer.zze("AtomParsers", "Skipped metadata with unknown key index: " + zze4);
            } else {
                String str = strArr[zze4];
                int i2 = zzc + zze3;
                while (true) {
                    int zzc2 = zzfdVar2.zzc();
                    if (zzc2 >= i2) {
                        zzaesVar = null;
                        break;
                    }
                    int zze5 = zzfdVar2.zze();
                    if (zzfdVar2.zze() == 1684108385) {
                        int zze6 = zzfdVar2.zze();
                        int zze7 = zzfdVar2.zze();
                        int i3 = zze5 - 16;
                        byte[] bArr = new byte[i3];
                        zzfdVar2.zzB(bArr, 0, i3);
                        zzaesVar = new zzaes(str, bArr, zze7, zze6);
                        break;
                    }
                    zzfdVar2.zzF(zzc2 + zze5);
                }
                if (zzaesVar != null) {
                    arrayList.add(zzaesVar);
                }
            }
            zzfdVar2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzca(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r3 != 13) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzagk zzb(com.google.android.gms.internal.ads.zzagb r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagl.zzb(com.google.android.gms.internal.ads.zzagb):com.google.android.gms.internal.ads.zzagk");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
        if (r4 == 0) goto L637;
     */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0bbb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0e28 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzc(com.google.android.gms.internal.ads.zzaga r55, com.google.android.gms.internal.ads.zzabd r56, long r57, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzad r59, boolean r60, boolean r61, com.google.android.gms.internal.ads.zzfon r62) throws com.google.android.gms.internal.ads.zzce {
        /*
            Method dump skipped, instructions count: 3634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagl.zzc(com.google.android.gms.internal.ads.zzaga, com.google.android.gms.internal.ads.zzabd, long, com.google.android.gms.internal.ads.zzad, boolean, boolean, com.google.android.gms.internal.ads.zzfon):java.util.List");
    }

    public static void zzd(zzfd zzfdVar) {
        int zzc = zzfdVar.zzc();
        zzfdVar.zzG(4);
        if (zzfdVar.zze() != 1751411826) {
            zzc += 4;
        }
        zzfdVar.zzF(zzc);
    }

    private static int zze(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzfd zzfdVar) {
        int zzk = zzfdVar.zzk();
        int i = zzk & 127;
        while ((zzk & 128) == 128) {
            zzk = zzfdVar.zzk();
            i = (i << 7) | (zzk & 127);
        }
        return i;
    }

    private static int zzg(zzfd zzfdVar) {
        zzfdVar.zzF(16);
        return zzfdVar.zze();
    }

    @Nullable
    private static Pair zzh(zzaga zzagaVar) {
        zzagb zzb = zzagaVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzfd zzfdVar = zzb.zza;
        zzfdVar.zzF(8);
        int zze = zzagc.zze(zzfdVar.zze());
        int zzn = zzfdVar.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        for (int i = 0; i < zzn; i++) {
            jArr[i] = zze == 1 ? zzfdVar.zzt() : zzfdVar.zzs();
            jArr2[i] = zze == 1 ? zzfdVar.zzr() : zzfdVar.zze();
            if (zzfdVar.zzy() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzfdVar.zzG(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzfd zzfdVar) {
        zzfdVar.zzF(8);
        int zze = zzagc.zze(zzfdVar.zze());
        zzfdVar.zzG(zze == 0 ? 8 : 16);
        long zzs = zzfdVar.zzs();
        zzfdVar.zzG(zze == 0 ? 4 : 8);
        int zzo = zzfdVar.zzo();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzo >> 10) & 31) + 96));
        sb.append((char) (((zzo >> 5) & 31) + 96));
        sb.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb.toString());
    }

    @Nullable
    private static Pair zzj(zzfd zzfdVar, int i, int i2) throws zzce {
        Integer num;
        zzahb zzahbVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzc = zzfdVar.zzc();
        while (zzc - i < i2) {
            zzfdVar.zzF(zzc);
            int zze = zzfdVar.zze();
            zzaas.zzb(zze > 0, "childAtomSize must be positive");
            if (zzfdVar.zze() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zze) {
                    zzfdVar.zzF(i5);
                    int zze2 = zzfdVar.zze();
                    int zze3 = zzfdVar.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzfdVar.zze());
                    } else if (zze3 == 1935894637) {
                        zzfdVar.zzG(4);
                        str = zzfdVar.zzx(4, zzfol.zzc);
                    } else if (zze3 == 1935894633) {
                        i7 = i5;
                        i6 = zze2;
                    }
                    i5 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzaas.zzb(num2 != null, "frma atom is mandatory");
                    zzaas.zzb(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzahbVar = null;
                            break;
                        }
                        zzfdVar.zzF(i8);
                        int zze4 = zzfdVar.zze();
                        if (zzfdVar.zze() == 1952804451) {
                            int zze5 = zzagc.zze(zzfdVar.zze());
                            zzfdVar.zzG(1);
                            if (zze5 == 0) {
                                zzfdVar.zzG(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzk = zzfdVar.zzk();
                                int i9 = zzk & 240;
                                i3 = zzk & 15;
                                i4 = i9 >> 4;
                            }
                            boolean z = zzfdVar.zzk() == 1;
                            int zzk2 = zzfdVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzfdVar.zzB(bArr2, 0, 16);
                            if (z && zzk2 == 0) {
                                int zzk3 = zzfdVar.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzfdVar.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzahbVar = new zzahb(z, str, zzk2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zze4;
                        }
                    }
                    zzaas.zzb(zzahbVar != null, "tenc atom is mandatory");
                    int i10 = zzfn.zza;
                    create = Pair.create(num, zzahbVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zze;
        }
        return null;
    }

    @Nullable
    private static zzca zzk(zzfd zzfdVar) {
        short zzy = zzfdVar.zzy();
        zzfdVar.zzG(2);
        String zzx = zzfdVar.zzx(zzy, zzfol.zzc);
        int max = Math.max(zzx.lastIndexOf(43), zzx.lastIndexOf(45));
        try {
            return new zzca(-9223372036854775807L, new zzaey(Float.parseFloat(zzx.substring(0, max)), Float.parseFloat(zzx.substring(max, zzx.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzage zzl(zzfd zzfdVar, int i) {
        zzfdVar.zzF(i + 12);
        zzfdVar.zzG(1);
        zzf(zzfdVar);
        zzfdVar.zzG(2);
        int zzk = zzfdVar.zzk();
        if ((zzk & 128) != 0) {
            zzfdVar.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzfdVar.zzG(zzfdVar.zzk());
        }
        if ((zzk & 32) != 0) {
            zzfdVar.zzG(2);
        }
        zzfdVar.zzG(1);
        zzf(zzfdVar);
        String zzd = zzcd.zzd(zzfdVar.zzk());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzage(zzd, null, -1L, -1L);
        }
        zzfdVar.zzG(4);
        long zzs = zzfdVar.zzs();
        long zzs2 = zzfdVar.zzs();
        zzfdVar.zzG(1);
        int zzf = zzf(zzfdVar);
        byte[] bArr = new byte[zzf];
        zzfdVar.zzB(bArr, 0, zzf);
        return new zzage(zzd, bArr, zzs2 <= 0 ? -1L : zzs2, zzs > 0 ? zzs : -1L);
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzn(com.google.android.gms.internal.ads.zzfd r23, int r24, int r25, int r26, int r27, java.lang.String r28, boolean r29, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzad r30, com.google.android.gms.internal.ads.zzagg r31, int r32) throws com.google.android.gms.internal.ads.zzce {
        /*
            Method dump skipped, instructions count: 993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagl.zzn(com.google.android.gms.internal.ads.zzfd, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzad, com.google.android.gms.internal.ads.zzagg, int):void");
    }

    private static void zzo(zzfd zzfdVar, int i, int i2, int i3, zzagg zzaggVar) {
        zzfdVar.zzF(i2 + 16);
        zzfdVar.zzv((char) 0);
        String zzv = zzfdVar.zzv((char) 0);
        if (zzv != null) {
            zzak zzakVar = new zzak();
            zzakVar.zzG(i3);
            zzakVar.zzS(zzv);
            zzaggVar.zzb = zzakVar.zzY();
        }
    }

    private static boolean zzp(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[Math.max(0, Math.min(4, i))] && jArr[Math.max(0, Math.min(length + (-4), i))] < j3 && j3 <= j;
    }

    @Nullable
    private static byte[] zzq(zzfd zzfdVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            zzfdVar.zzF(i3);
            int zze = zzfdVar.zze();
            if (zzfdVar.zze() == 1886547818) {
                return Arrays.copyOfRange(zzfdVar.zzH(), i3, zze + i3);
            }
            i3 += zze;
        }
        return null;
    }
}
