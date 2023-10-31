package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaiy implements zzaju {
    private final zzaih zza;
    private final zzfc zzb = new zzfc(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfl zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaiy(zzaih zzaihVar) {
        this.zza = zzaihVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzfd zzfdVar, @Nullable byte[] bArr, int i) {
        int min = Math.min(zzfdVar.zza(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfdVar.zzG(min);
        } else {
            zzfdVar.zzB(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final void zza(zzfd zzfdVar, int i) throws zzce {
        long j;
        long j2;
        int i2;
        zzdy.zzb(this.zze);
        int i3 = -1;
        int i4 = 2;
        int i5 = 1;
        if ((i & 1) != 0) {
            int i6 = this.zzc;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.zzj;
                    if (i7 != -1) {
                        zzer.zze("PesReader", "Unexpected start indicator: expected " + i7 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    zzer.zze("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i8 = i;
        while (zzfdVar.zza() > 0) {
            int i9 = this.zzc;
            if (i9 != 0) {
                if (i9 != i5) {
                    if (i9 != i4) {
                        int zza = zzfdVar.zza();
                        int i10 = this.zzj;
                        int i11 = i10 != i3 ? zza - i10 : 0;
                        if (i11 > 0) {
                            zza -= i11;
                            zzfdVar.zzE(zzfdVar.zzc() + zza);
                        }
                        this.zza.zza(zzfdVar);
                        int i12 = this.zzj;
                        if (i12 != i3) {
                            int i13 = i12 - zza;
                            this.zzj = i13;
                            if (i13 == 0) {
                                this.zza.zzc();
                                zzd(i5);
                            }
                        }
                    } else {
                        if (zze(zzfdVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfdVar, null, this.zzi)) {
                            this.zzb.zzj(0);
                            if (this.zzf) {
                                this.zzb.zzl(4);
                                long zzd = this.zzb.zzd(3);
                                this.zzb.zzl(i5);
                                int zzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzl(i5);
                                long zzd3 = this.zzb.zzd(15);
                                this.zzb.zzl(i5);
                                if (this.zzh || !this.zzg) {
                                    j2 = zzd3;
                                } else {
                                    this.zzb.zzl(4);
                                    this.zzb.zzl(i5);
                                    this.zzb.zzl(i5);
                                    long zzd4 = this.zzb.zzd(15);
                                    this.zzb.zzl(i5);
                                    j2 = zzd3;
                                    this.zze.zzb((this.zzb.zzd(3) << 30) | (this.zzb.zzd(15) << 15) | zzd4);
                                    this.zzh = true;
                                }
                                j = this.zze.zzb((zzd << 30) | zzd2 | j2);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i8 |= true != this.zzk ? 0 : 4;
                            this.zza.zzd(j, i8);
                            zzd(3);
                            i3 = -1;
                            i4 = 2;
                            i5 = 1;
                        }
                    }
                } else if (zze(zzfdVar, this.zzb.zza, 9)) {
                    int i14 = 0;
                    this.zzb.zzj(0);
                    int zzd5 = this.zzb.zzd(24);
                    i5 = 1;
                    if (zzd5 != 1) {
                        zzer.zze("PesReader", "Unexpected start code prefix: " + zzd5);
                        i3 = -1;
                        this.zzj = -1;
                        i2 = 2;
                    } else {
                        this.zzb.zzl(8);
                        int zzd6 = this.zzb.zzd(16);
                        this.zzb.zzl(5);
                        this.zzk = this.zzb.zzn();
                        this.zzb.zzl(2);
                        this.zzf = this.zzb.zzn();
                        this.zzg = this.zzb.zzn();
                        this.zzb.zzl(6);
                        int zzd7 = this.zzb.zzd(8);
                        this.zzi = zzd7;
                        if (zzd6 != 0) {
                            int i15 = (zzd6 - 3) - zzd7;
                            this.zzj = i15;
                            if (i15 < 0) {
                                zzer.zze("PesReader", "Found negative packet payload size: " + i15);
                            } else {
                                i3 = -1;
                                i14 = 2;
                                i2 = 2;
                            }
                        }
                        i3 = -1;
                        this.zzj = -1;
                        i14 = 2;
                        i2 = 2;
                    }
                    zzd(i14);
                    i4 = i2;
                } else {
                    i3 = -1;
                    i5 = 1;
                    i4 = 2;
                }
            } else {
                zzfdVar.zzG(zzfdVar.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final void zzb(zzfl zzflVar, zzaar zzaarVar, zzajt zzajtVar) {
        this.zze = zzflVar;
        this.zza.zzb(zzaarVar, zzajtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
