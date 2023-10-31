package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzaid implements zzaih {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfc zzc = new zzfc(new byte[7], 7);
    private final zzfd zzd = new zzfd(Arrays.copyOf(zza, 10));
    @Nullable
    private final String zze;
    private String zzf;
    private zzabr zzg;
    private zzabr zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzabr zzu;
    private long zzv;

    public zzaid(boolean z, @Nullable String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzabr zzabrVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzabrVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzfd zzfdVar, byte[] bArr, int i) {
        int min = Math.min(zzfdVar.zza(), i - this.zzj);
        zzfdVar.zzB(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | 65280);
    }

    private static final boolean zzm(zzfd zzfdVar, byte[] bArr, int i) {
        if (zzfdVar.zza() < i) {
            return false;
        }
        zzfdVar.zzB(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zza(zzfd zzfdVar) throws zzce {
        int i;
        zzabr zzabrVar;
        long j;
        int i2;
        int i3;
        int i4;
        this.zzg.getClass();
        int i5 = zzfn.zza;
        while (zzfdVar.zza() > 0) {
            int i6 = this.zzi;
            int i7 = 13;
            int i8 = 2;
            if (i6 == 0) {
                byte[] zzH = zzfdVar.zzH();
                int zzc = zzfdVar.zzc();
                int zzd = zzfdVar.zzd();
                while (zzc < zzd) {
                    int i9 = zzc + 1;
                    int i10 = zzH[zzc] & 255;
                    if (this.zzk == 512 && zzl((byte) -1, (byte) i10)) {
                        if (!this.zzm) {
                            int i11 = i9 - 2;
                            zzfdVar.zzF(i11 + 1);
                            if (zzm(zzfdVar, this.zzc.zza, 1)) {
                                this.zzc.zzj(4);
                                int zzd2 = this.zzc.zzd(1);
                                int i12 = this.zzn;
                                if (i12 == -1 || zzd2 == i12) {
                                    if (this.zzo != -1) {
                                        if (zzm(zzfdVar, this.zzc.zza, 1)) {
                                            this.zzc.zzj(i8);
                                            if (this.zzc.zzd(4) == this.zzo) {
                                                zzfdVar.zzF(i11 + 2);
                                            }
                                        }
                                    }
                                    if (zzm(zzfdVar, this.zzc.zza, 4)) {
                                        this.zzc.zzj(14);
                                        int zzd3 = this.zzc.zzd(i7);
                                        if (zzd3 >= 7) {
                                            byte[] zzH2 = zzfdVar.zzH();
                                            int zzd4 = zzfdVar.zzd();
                                            int i13 = i11 + zzd3;
                                            if (i13 < zzd4) {
                                                byte b = zzH2[i13];
                                                if (b == -1) {
                                                    int i14 = i13 + 1;
                                                    if (i14 != zzd4) {
                                                        byte b2 = zzH2[i14];
                                                        if (zzl((byte) -1, b2) && ((b2 & 8) >> 3) == zzd2) {
                                                        }
                                                    }
                                                } else if (b == 73) {
                                                    int i15 = i13 + 1;
                                                    if (i15 != zzd4) {
                                                        if (zzH2[i15] == 68) {
                                                            int i16 = i13 + 2;
                                                            if (i16 != zzd4) {
                                                                if (zzH2[i16] == 51) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                zzfdVar.zzF(i9);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.zzp = (i10 & 8) >> 3;
                        this.zzl = 1 == ((i10 & 1) ^ 1);
                        if (this.zzm) {
                            zzi();
                        } else {
                            this.zzi = 1;
                            this.zzj = 0;
                        }
                        zzfdVar.zzF(i9);
                        break;
                        break;
                    }
                    int i17 = this.zzk;
                    int i18 = i17 | i10;
                    if (i18 == 329) {
                        i3 = 2;
                        i4 = 768;
                    } else if (i18 == 511) {
                        i3 = 2;
                        i4 = AdRequest.MAX_CONTENT_URL_LENGTH;
                    } else if (i18 == 836) {
                        i3 = 2;
                        i4 = 1024;
                    } else if (i18 == 1075) {
                        this.zzi = 2;
                        this.zzj = 3;
                        this.zzs = 0;
                        this.zzd.zzF(0);
                        zzfdVar.zzF(i9);
                        break;
                        break;
                    } else if (i17 != 256) {
                        this.zzk = 256;
                        zzc = i9 - 1;
                        i7 = 13;
                        i8 = 2;
                    } else {
                        i3 = 2;
                        i8 = i3;
                        zzc = i9;
                        i7 = 13;
                    }
                    this.zzk = i4;
                    i8 = i3;
                    zzc = i9;
                    i7 = 13;
                }
                zzfdVar.zzF(zzc);
            } else if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        int min = Math.min(zzfdVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzfdVar, min);
                        int i19 = this.zzj + min;
                        this.zzj = i19;
                        int i20 = this.zzs;
                        if (i19 == i20) {
                            long j2 = this.zzt;
                            if (j2 != -9223372036854775807L) {
                                this.zzu.zzs(j2, 1, i20, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzfdVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzj(0);
                            if (this.zzq) {
                                this.zzc.zzl(10);
                            } else {
                                int zzd5 = this.zzc.zzd(2) + 1;
                                if (zzd5 != 2) {
                                    zzer.zze("AdtsReader", "Detected audio object type: " + zzd5 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzl(5);
                                int zzd6 = this.zzc.zzd(3);
                                int i21 = this.zzo;
                                byte[] bArr = {(byte) (((i21 >> 1) & 7) | 16), (byte) (((zzd6 << 3) & 120) | ((i21 << 7) & 128))};
                                zzzl zza2 = zzzm.zza(bArr);
                                zzak zzakVar = new zzak();
                                zzakVar.zzH(this.zzf);
                                zzakVar.zzS("audio/mp4a-latm");
                                zzakVar.zzx(zza2.zzc);
                                zzakVar.zzw(zza2.zzb);
                                zzakVar.zzT(zza2.zza);
                                zzakVar.zzI(Collections.singletonList(bArr));
                                zzakVar.zzK(this.zze);
                                zzam zzY = zzakVar.zzY();
                                this.zzr = 1024000000 / zzY.zzA;
                                this.zzg.zzk(zzY);
                                this.zzq = true;
                            }
                            this.zzc.zzl(4);
                            int zzd7 = this.zzc.zzd(13) - 7;
                            if (this.zzl) {
                                zzd7 -= 2;
                            }
                            i = zzd7;
                            zzabrVar = this.zzg;
                            j = this.zzr;
                            i2 = 0;
                            zzj(zzabrVar, j, i2, i);
                        }
                    }
                } else if (zzk(zzfdVar, this.zzd.zzH(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzF(6);
                    zzabrVar = this.zzh;
                    j = 0;
                    i = 10 + this.zzd.zzj();
                    i2 = 10;
                    zzj(zzabrVar, j, i2, i);
                }
            } else if (zzfdVar.zza() != 0) {
                zzfc zzfcVar = this.zzc;
                zzfcVar.zza[0] = zzfdVar.zzH()[zzfdVar.zzc()];
                zzfcVar.zzj(2);
                int zzd8 = this.zzc.zzd(4);
                int i22 = this.zzo;
                if (i22 == -1 || zzd8 == i22) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzd8;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zzf = zzajtVar.zzb();
        zzabr zzv = zzaarVar.zzv(zzajtVar.zza(), 1);
        this.zzg = zzv;
        this.zzu = zzv;
        if (!this.zzb) {
            this.zzh = new zzaan();
            return;
        }
        zzajtVar.zzc();
        zzabr zzv2 = zzaarVar.zzv(zzajtVar.zza(), 5);
        this.zzh = zzv2;
        zzak zzakVar = new zzak();
        zzakVar.zzH(zzajtVar.zzb());
        zzakVar.zzS("application/id3");
        zzv2.zzk(zzakVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
