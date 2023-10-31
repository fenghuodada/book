package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class zzahu extends zzahs {
    @Nullable
    private zzaht zza;
    private int zzb;
    private boolean zzc;
    @Nullable
    private zzabw zzd;
    @Nullable
    private zzabu zze;

    @Override // com.google.android.gms.internal.ads.zzahs
    public final long zza(zzfd zzfdVar) {
        if ((zzfdVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzfdVar.zzH()[0];
        zzaht zzahtVar = this.zza;
        zzdy.zzb(zzahtVar);
        int i = !zzahtVar.zzd[(b >> 1) & (255 >>> (8 - zzahtVar.zze))].zza ? zzahtVar.zza.zze : zzahtVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzfdVar.zzb() < zzfdVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfdVar.zzH(), zzfdVar.zzd() + 4);
            zzfdVar.zzD(copyOf, copyOf.length);
        } else {
            zzfdVar.zzE(zzfdVar.zzd() + 4);
        }
        long j = i2;
        byte[] zzH = zzfdVar.zzH();
        zzH[zzfdVar.zzd() - 4] = (byte) (j & 255);
        zzH[zzfdVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        zzH[zzfdVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        zzH[zzfdVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzfd zzfdVar, long j, zzahp zzahpVar) throws IOException {
        zzaht zzahtVar;
        int i;
        int i2;
        int i3;
        zzabw zzabwVar;
        if (this.zza != null) {
            zzahpVar.zza.getClass();
            return false;
        }
        zzabw zzabwVar2 = this.zzd;
        int i4 = 4;
        if (zzabwVar2 == null) {
            zzabx.zzd(1, zzfdVar, false);
            int zzh = zzfdVar.zzh();
            int zzk = zzfdVar.zzk();
            int zzh2 = zzfdVar.zzh();
            int zzg = zzfdVar.zzg();
            int i5 = zzg <= 0 ? -1 : zzg;
            int zzg2 = zzfdVar.zzg();
            int i6 = zzg2 <= 0 ? -1 : zzg2;
            int zzg3 = zzfdVar.zzg();
            int i7 = zzg3 <= 0 ? -1 : zzg3;
            int zzk2 = zzfdVar.zzk();
            this.zzd = new zzabw(zzh, zzk, zzh2, i5, i6, i7, (int) Math.pow(2.0d, zzk2 & 15), (int) Math.pow(2.0d, (zzk2 & 240) >> 4), 1 == (zzfdVar.zzk() & 1), Arrays.copyOf(zzfdVar.zzH(), zzfdVar.zzd()));
        } else {
            zzabu zzabuVar = this.zze;
            if (zzabuVar == null) {
                this.zze = zzabx.zzc(zzfdVar, true, true);
            } else {
                byte[] bArr = new byte[zzfdVar.zzd()];
                System.arraycopy(zzfdVar.zzH(), 0, bArr, 0, zzfdVar.zzd());
                int i8 = zzabwVar2.zza;
                int i9 = 5;
                zzabx.zzd(5, zzfdVar, false);
                int zzk3 = zzfdVar.zzk() + 1;
                zzabt zzabtVar = new zzabt(zzfdVar.zzH());
                zzabtVar.zzc(zzfdVar.zzc() * 8);
                int i10 = 0;
                while (true) {
                    int i11 = 2;
                    int i12 = 16;
                    if (i10 >= zzk3) {
                        zzabw zzabwVar3 = zzabwVar2;
                        int i13 = 6;
                        int zzb = zzabtVar.zzb(6) + 1;
                        for (int i14 = 0; i14 < zzb; i14++) {
                            if (zzabtVar.zzb(16) != 0) {
                                throw zzce.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i15 = 1;
                        int zzb2 = zzabtVar.zzb(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 < zzb2) {
                                int zzb3 = zzabtVar.zzb(i12);
                                if (zzb3 == 0) {
                                    i3 = zzb2;
                                    int i18 = 8;
                                    zzabtVar.zzc(8);
                                    zzabtVar.zzc(16);
                                    zzabtVar.zzc(16);
                                    zzabtVar.zzc(6);
                                    zzabtVar.zzc(8);
                                    int zzb4 = zzabtVar.zzb(4) + 1;
                                    int i19 = 0;
                                    while (i19 < zzb4) {
                                        zzabtVar.zzc(i18);
                                        i19++;
                                        i18 = 8;
                                    }
                                } else if (zzb3 != i15) {
                                    throw zzce.zza("floor type greater than 1 not decodable: " + zzb3, null);
                                } else {
                                    int zzb5 = zzabtVar.zzb(i9);
                                    int[] iArr = new int[zzb5];
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < zzb5; i21++) {
                                        int zzb6 = zzabtVar.zzb(4);
                                        iArr[i21] = zzb6;
                                        if (zzb6 > i20) {
                                            i20 = zzb6;
                                        }
                                    }
                                    int i22 = i20 + 1;
                                    int[] iArr2 = new int[i22];
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        iArr2[i23] = zzabtVar.zzb(i17) + 1;
                                        int zzb7 = zzabtVar.zzb(i11);
                                        int i24 = 8;
                                        if (zzb7 > 0) {
                                            zzabtVar.zzc(8);
                                        }
                                        int i25 = zzb2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << zzb7); i27 = 1) {
                                            zzabtVar.zzc(i24);
                                            i26++;
                                            i24 = 8;
                                        }
                                        i23++;
                                        zzb2 = i25;
                                        i11 = 2;
                                        i17 = 3;
                                    }
                                    i3 = zzb2;
                                    zzabtVar.zzc(i11);
                                    int zzb8 = zzabtVar.zzb(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < zzb5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            zzabtVar.zzc(zzb8);
                                            i29++;
                                        }
                                    }
                                }
                                i16++;
                                zzb2 = i3;
                                i13 = 6;
                                i12 = 16;
                                i11 = 2;
                                i15 = 1;
                                i9 = 5;
                            } else {
                                int i31 = 1;
                                int zzb9 = zzabtVar.zzb(i13) + 1;
                                int i32 = 0;
                                while (i32 < zzb9) {
                                    if (zzabtVar.zzb(16) > 2) {
                                        throw zzce.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzabtVar.zzc(24);
                                    zzabtVar.zzc(24);
                                    zzabtVar.zzc(24);
                                    int zzb10 = zzabtVar.zzb(i13) + i31;
                                    int i33 = 8;
                                    zzabtVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i34 = 0; i34 < zzb10; i34++) {
                                        iArr3[i34] = ((zzabtVar.zzd() ? zzabtVar.zzb(5) : 0) * 8) + zzabtVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < zzb10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzabtVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i13 = 6;
                                    i31 = 1;
                                }
                                int zzb11 = zzabtVar.zzb(i13) + 1;
                                for (int i37 = 0; i37 < zzb11; i37++) {
                                    int zzb12 = zzabtVar.zzb(16);
                                    if (zzb12 != 0) {
                                        zzer.zzb("VorbisUtil", "mapping type other than 0 not supported: " + zzb12);
                                    } else {
                                        if (zzabtVar.zzd()) {
                                            i = 1;
                                            i2 = zzabtVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzabtVar.zzd()) {
                                            int zzb13 = zzabtVar.zzb(8) + i;
                                            for (int i38 = 0; i38 < zzb13; i38++) {
                                                int i39 = i8 - 1;
                                                zzabtVar.zzc(zzabx.zza(i39));
                                                zzabtVar.zzc(zzabx.zza(i39));
                                            }
                                        }
                                        if (zzabtVar.zzb(2) != 0) {
                                            throw zzce.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i40 = 0; i40 < i8; i40++) {
                                                zzabtVar.zzc(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i2; i41++) {
                                            zzabtVar.zzc(8);
                                            zzabtVar.zzc(8);
                                            zzabtVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzabtVar.zzb(6) + 1;
                                zzabv[] zzabvVarArr = new zzabv[zzb14];
                                for (int i42 = 0; i42 < zzb14; i42++) {
                                    zzabvVarArr[i42] = new zzabv(zzabtVar.zzd(), zzabtVar.zzb(16), zzabtVar.zzb(16), zzabtVar.zzb(8));
                                }
                                if (!zzabtVar.zzd()) {
                                    throw zzce.zza("framing bit after modes not set as expected", null);
                                }
                                zzahtVar = new zzaht(zzabwVar3, zzabuVar, bArr, zzabvVarArr, zzabx.zza(zzb14 - 1));
                            }
                        }
                    } else if (zzabtVar.zzb(24) != 5653314) {
                        throw zzce.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzabtVar.zza(), null);
                    } else {
                        int zzb15 = zzabtVar.zzb(16);
                        int zzb16 = zzabtVar.zzb(24);
                        if (zzabtVar.zzd()) {
                            zzabtVar.zzc(5);
                            for (int i43 = 0; i43 < zzb16; i43 += zzabtVar.zzb(zzabx.zza(zzb16 - i43))) {
                            }
                        } else {
                            boolean zzd = zzabtVar.zzd();
                            for (int i44 = 0; i44 < zzb16; i44++) {
                                if (!zzd || zzabtVar.zzd()) {
                                    zzabtVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzabtVar.zzb(i4);
                        if (zzb17 > 2) {
                            throw zzce.zza("lookup type greater than 2 not decodable: " + zzb17, null);
                        }
                        if (zzb17 == 1) {
                            i11 = zzb17;
                        } else if (zzb17 != 2) {
                            zzabwVar = zzabwVar2;
                            i10++;
                            zzabwVar2 = zzabwVar;
                            i4 = 4;
                        }
                        zzabtVar.zzc(32);
                        zzabtVar.zzc(32);
                        int zzb18 = zzabtVar.zzb(i4) + 1;
                        zzabtVar.zzc(1);
                        zzabwVar = zzabwVar2;
                        zzabtVar.zzc((int) ((i11 == 1 ? zzb15 != 0 ? (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15)) : 0L : zzb16 * zzb15) * zzb18));
                        i10++;
                        zzabwVar2 = zzabwVar;
                        i4 = 4;
                    }
                }
            }
        }
        zzahtVar = null;
        this.zza = zzahtVar;
        if (zzahtVar == null) {
            return true;
        }
        zzabw zzabwVar4 = zzahtVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzabwVar4.zzg);
        arrayList.add(zzahtVar.zzc);
        zzca zzb19 = zzabx.zzb(zzfrr.zzk(zzahtVar.zzb.zzb));
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/vorbis");
        zzakVar.zzv(zzabwVar4.zzd);
        zzakVar.zzO(zzabwVar4.zzc);
        zzakVar.zzw(zzabwVar4.zza);
        zzakVar.zzT(zzabwVar4.zzb);
        zzakVar.zzI(arrayList);
        zzakVar.zzM(zzb19);
        zzahpVar.zza = zzakVar.zzY();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzabw zzabwVar = this.zzd;
        this.zzb = zzabwVar != null ? zzabwVar.zze : 0;
    }
}
