package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzaee {
    public static final zzaec zza = new zzaec() { // from class: com.google.android.gms.internal.ads.zzaeb
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzca zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzaec r13, com.google.android.gms.internal.ads.zzadf r14) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaee.zza(byte[], int, com.google.android.gms.internal.ads.zzaec, com.google.android.gms.internal.ads.zzadf):com.google.android.gms.internal.ads.zzca");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            if ((zzd - i) % 2 == 0 && bArr[zzd + 1] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, zzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzfd zzfdVar, int i) {
        byte[] zzH = zzfdVar.zzH();
        int zzc = zzfdVar.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzc + i) {
                return i;
            }
            if ((zzH[i2] & 255) == 255 && zzH[i3] == 0) {
                System.arraycopy(zzH, i2 + 2, zzH, i3, (i - (i2 - zzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0267, code lost:
        if (r9 == 67) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ee A[Catch: all -> 0x0513, TRY_LEAVE, TryCatch #0 {all -> 0x0513, blocks: (B:224:0x04ee, B:125:0x0213, B:141:0x0269, B:143:0x027b, B:150:0x02bc, B:147:0x029d, B:149:0x02b6, B:162:0x02fe, B:171:0x0345, B:174:0x037a, B:177:0x038b, B:178:0x0393, B:180:0x0399, B:182:0x03a0, B:183:0x03a4, B:190:0x03c6, B:194:0x03f3, B:196:0x03fd, B:197:0x0430, B:198:0x043c, B:200:0x0442, B:202:0x0449, B:203:0x044d, B:207:0x0462, B:216:0x048d, B:218:0x04b7, B:219:0x04c6, B:222:0x04dd), top: B:236:0x00ed }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzaef zzf(int r35, com.google.android.gms.internal.ads.zzfd r36, boolean r37, int r38, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzaec r39) {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaee.zzf(int, com.google.android.gms.internal.ads.zzfd, boolean, int, com.google.android.gms.internal.ads.zzaec):com.google.android.gms.internal.ads.zzaef");
    }

    private static zzfrr zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfrr.zzm("");
        }
        zzfro zzfroVar = new zzfro();
        while (true) {
            int zzc = zzc(bArr, i2, i);
            if (i2 >= zzc) {
                break;
            }
            zzfroVar.zzf(new String(bArr, i2, zzc - i2, zzj(i)));
            i2 = zzb(i) + zzc;
        }
        zzfrr zzi = zzfroVar.zzi();
        return zzi.isEmpty() ? zzfrr.zzm("") : zzi;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static Charset zzj(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zzfol.zzb : zzfol.zzc : zzfol.zzd : zzfol.zzf;
    }

    private static boolean zzk(zzfd zzfdVar, int i, int i2, boolean z) {
        int zzm;
        long zzm2;
        int i3;
        int i4;
        int zzc = zzfdVar.zzc();
        while (true) {
            try {
                if (zzfdVar.zza() < i2) {
                    return true;
                }
                if (i >= 3) {
                    zzm = zzfdVar.zze();
                    zzm2 = zzfdVar.zzs();
                    i3 = zzfdVar.zzo();
                } else {
                    zzm = zzfdVar.zzm();
                    zzm2 = zzfdVar.zzm();
                    i3 = 0;
                }
                if (zzm == 0 && zzm2 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & zzm2) != 0) {
                        return false;
                    }
                    zzm2 = ((zzm2 >> 24) << 21) | (((zzm2 >> 16) & 255) << 14) | (zzm2 & 255) | (((zzm2 >> 8) & 255) << 7);
                }
                if (i == 4) {
                    r4 = i3 & 1;
                    i4 = (i3 & 64) == 0 ? 0 : 1;
                } else if (i == 3) {
                    i4 = (i3 & 32) != 0 ? 1 : 0;
                    if ((i3 & 128) == 0) {
                        r4 = 0;
                    }
                } else {
                    i4 = 0;
                    r4 = 0;
                }
                if (r4 != 0) {
                    i4 += 4;
                }
                if (zzm2 < i4) {
                    return false;
                }
                if (zzfdVar.zza() < zzm2) {
                    return false;
                }
                zzfdVar.zzG((int) zzm2);
            } finally {
                zzfdVar.zzF(zzc);
            }
        }
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzfn.zzf : Arrays.copyOfRange(bArr, i, i2);
    }
}
