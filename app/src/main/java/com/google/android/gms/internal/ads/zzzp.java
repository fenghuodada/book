package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;
import okio.Utf8;

/* loaded from: classes.dex */
public final class zzzp {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
        }
        int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i + i;
    }

    public static zzam zzc(zzfd zzfdVar, String str, String str2, @Nullable zzad zzadVar) {
        zzfc zzfcVar = new zzfc();
        zzfcVar.zzh(zzfdVar);
        int i = zzc[zzfcVar.zzd(2)];
        zzfcVar.zzl(8);
        int i2 = zze[zzfcVar.zzd(3)];
        if (zzfcVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzfcVar.zzd(5)] * 1000;
        zzfcVar.zze();
        zzfdVar.zzF(zzfcVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzH(str);
        zzakVar.zzS("audio/ac3");
        zzakVar.zzw(i2);
        zzakVar.zzT(i);
        zzakVar.zzB(zzadVar);
        zzakVar.zzK(str2);
        zzakVar.zzv(i3);
        zzakVar.zzO(i3);
        return zzakVar.zzY();
    }

    public static zzam zzd(zzfd zzfdVar, String str, String str2, @Nullable zzad zzadVar) {
        String str3;
        zzfc zzfcVar = new zzfc();
        zzfcVar.zzh(zzfdVar);
        int zzd2 = zzfcVar.zzd(13) * 1000;
        zzfcVar.zzl(3);
        int i = zzc[zzfcVar.zzd(2)];
        zzfcVar.zzl(10);
        int i2 = zze[zzfcVar.zzd(3)];
        if (zzfcVar.zzd(1) != 0) {
            i2++;
        }
        zzfcVar.zzl(3);
        int zzd3 = zzfcVar.zzd(4);
        zzfcVar.zzl(1);
        if (zzd3 > 0) {
            zzfcVar.zzm(6);
            if (zzfcVar.zzd(1) != 0) {
                i2 += 2;
            }
            zzfcVar.zzl(1);
        }
        if (zzfcVar.zza() > 7) {
            zzfcVar.zzl(7);
            if (zzfcVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzfcVar.zze();
                zzfdVar.zzF(zzfcVar.zzb());
                zzak zzakVar = new zzak();
                zzakVar.zzH(str);
                zzakVar.zzS(str3);
                zzakVar.zzw(i2);
                zzakVar.zzT(i);
                zzakVar.zzB(zzadVar);
                zzakVar.zzK(str2);
                zzakVar.zzO(zzd2);
                return zzakVar.zzY();
            }
        }
        str3 = "audio/eac3";
        zzfcVar.zze();
        zzfdVar.zzF(zzfcVar.zzb());
        zzak zzakVar2 = new zzak();
        zzakVar2.zzH(str);
        zzakVar2.zzS(str3);
        zzakVar2.zzw(i2);
        zzakVar2.zzT(i);
        zzakVar2.zzB(zzadVar);
        zzakVar2.zzK(str2);
        zzakVar2.zzO(zzd2);
        return zzakVar2.zzY();
    }

    public static zzzo zze(zzfc zzfcVar) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzc2 = zzfcVar.zzc();
        zzfcVar.zzl(40);
        int zzd2 = zzfcVar.zzd(5);
        zzfcVar.zzj(zzc2);
        int i12 = -1;
        if (zzd2 > 10) {
            zzfcVar.zzl(16);
            int zzd3 = zzfcVar.zzd(2);
            if (zzd3 == 0) {
                i12 = 0;
            } else if (zzd3 == 1) {
                i12 = 1;
            } else if (zzd3 == 2) {
                i12 = 2;
            }
            zzfcVar.zzl(3);
            int zzd4 = zzfcVar.zzd(11) + 1;
            int zzd5 = zzfcVar.zzd(2);
            if (zzd5 == 3) {
                i8 = zzd[zzfcVar.zzd(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int zzd6 = zzfcVar.zzd(2);
                int i13 = zzb[zzd6];
                i7 = zzd6;
                i8 = zzc[zzd5];
                i9 = i13;
            }
            int i14 = zzd4 + zzd4;
            int i15 = (i14 * i8) / (i9 * 32);
            int zzd7 = zzfcVar.zzd(3);
            boolean zzn = zzfcVar.zzn();
            i = zze[zzd7] + (zzn ? 1 : 0);
            zzfcVar.zzl(10);
            if (zzfcVar.zzn()) {
                zzfcVar.zzl(8);
            }
            if (zzd7 == 0) {
                zzfcVar.zzl(5);
                if (zzfcVar.zzn()) {
                    zzfcVar.zzl(8);
                }
                i10 = 0;
                zzd7 = 0;
            } else {
                i10 = zzd7;
            }
            if (i12 == 1) {
                if (zzfcVar.zzn()) {
                    zzfcVar.zzl(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzfcVar.zzn()) {
                if (i10 > 2) {
                    zzfcVar.zzl(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzfcVar.zzl(6);
                }
                if ((i10 & 4) != 0) {
                    zzfcVar.zzl(6);
                }
                if (zzn && zzfcVar.zzn()) {
                    zzfcVar.zzl(5);
                }
                if (i11 == 0) {
                    if (zzfcVar.zzn()) {
                        zzfcVar.zzl(6);
                    }
                    if (i10 == 0 && zzfcVar.zzn()) {
                        zzfcVar.zzl(6);
                    }
                    if (zzfcVar.zzn()) {
                        zzfcVar.zzl(6);
                    }
                    int zzd8 = zzfcVar.zzd(2);
                    if (zzd8 == 1) {
                        zzfcVar.zzl(5);
                    } else if (zzd8 == 2) {
                        zzfcVar.zzl(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzfcVar.zzd(5);
                        if (zzfcVar.zzn()) {
                            zzfcVar.zzl(5);
                            if (zzfcVar.zzn()) {
                                zzfcVar.zzl(4);
                            }
                            if (zzfcVar.zzn()) {
                                zzfcVar.zzl(4);
                            }
                            if (zzfcVar.zzn()) {
                                zzfcVar.zzl(4);
                            }
                            if (zzfcVar.zzn()) {
                                zzfcVar.zzl(4);
                            }
                            if (zzfcVar.zzn()) {
                                zzfcVar.zzl(4);
                            }
                            if (zzfcVar.zzn()) {
                                zzfcVar.zzl(4);
                            }
                            if (zzfcVar.zzn()) {
                                zzfcVar.zzl(4);
                            }
                            if (zzfcVar.zzn()) {
                                if (zzfcVar.zzn()) {
                                    zzfcVar.zzl(4);
                                }
                                if (zzfcVar.zzn()) {
                                    zzfcVar.zzl(4);
                                }
                            }
                        }
                        if (zzfcVar.zzn()) {
                            zzfcVar.zzl(5);
                            if (zzfcVar.zzn()) {
                                zzfcVar.zzl(7);
                                if (zzfcVar.zzn()) {
                                    zzfcVar.zzl(8);
                                }
                            }
                        }
                        zzfcVar.zzl((zzd9 + 2) * 8);
                        zzfcVar.zze();
                    }
                    if (i10 < 2) {
                        if (zzfcVar.zzn()) {
                            zzfcVar.zzl(14);
                        }
                        if (zzd7 == 0 && zzfcVar.zzn()) {
                            zzfcVar.zzl(14);
                        }
                    }
                    if (zzfcVar.zzn()) {
                        if (i7 == 0) {
                            zzfcVar.zzl(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (zzfcVar.zzn()) {
                                    zzfcVar.zzl(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (zzfcVar.zzn()) {
                zzfcVar.zzl(5);
                if (i10 == 2) {
                    zzfcVar.zzl(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzfcVar.zzl(2);
                }
                if (zzfcVar.zzn()) {
                    zzfcVar.zzl(8);
                }
                if (i10 == 0 && zzfcVar.zzn()) {
                    zzfcVar.zzl(8);
                }
                if (zzd5 < 3) {
                    zzfcVar.zzk();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzfcVar.zzk();
            }
            if (i11 == 2 && (i7 == 3 || zzfcVar.zzn())) {
                zzfcVar.zzl(6);
            }
            str = (zzfcVar.zzn() && zzfcVar.zzd(6) == 1 && zzfcVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i12;
            i4 = i14;
            i5 = i8;
            i6 = i9 * 256;
            i3 = i15;
        } else {
            zzfcVar.zzl(32);
            int zzd10 = zzfcVar.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzfcVar.zzd(6);
            int i17 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzfcVar.zzl(8);
            int zzd12 = zzfcVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzfcVar.zzl(2);
            }
            if ((zzd12 & 4) != 0) {
                zzfcVar.zzl(2);
            }
            if (zzd12 == 2) {
                zzfcVar.zzl(2);
            }
            int i18 = zzd10 < 3 ? zzc[zzd10] : -1;
            i = zze[zzd12] + (zzfcVar.zzn() ? 1 : 0);
            i2 = -1;
            str = str2;
            i3 = i17;
            i4 = zzf2;
            i5 = i18;
            i6 = 1536;
        }
        return new zzzo(str, i2, i, i5, i4, i6, i3, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
