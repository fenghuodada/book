package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgnb {
    public static int zza(byte[] bArr, int i, zzgna zzgnaVar) throws zzgpi {
        int zzj = zzj(bArr, i, zzgnaVar);
        int i2 = zzgnaVar.zza;
        if (i2 >= 0) {
            if (i2 <= bArr.length - zzj) {
                if (i2 == 0) {
                    zzgnaVar.zzc = zzgno.zzb;
                    return zzj;
                }
                zzgnaVar.zzc = zzgno.zzv(bArr, zzj, i2);
                return zzj + i2;
            }
            throw zzgpi.zzj();
        }
        throw zzgpi.zzf();
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzgqz zzgqzVar, byte[] bArr, int i, int i2, int i3, zzgna zzgnaVar) throws IOException {
        Object zze = zzgqzVar.zze();
        int zzn = zzn(zze, zzgqzVar, bArr, i, i2, i3, zzgnaVar);
        zzgqzVar.zzf(zze);
        zzgnaVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzgqz zzgqzVar, byte[] bArr, int i, int i2, zzgna zzgnaVar) throws IOException {
        Object zze = zzgqzVar.zze();
        int zzo = zzo(zze, zzgqzVar, bArr, i, i2, zzgnaVar);
        zzgqzVar.zzf(zze);
        zzgnaVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzgqz zzgqzVar, int i, byte[] bArr, int i2, int i3, zzgpf zzgpfVar, zzgna zzgnaVar) throws IOException {
        int zzd = zzd(zzgqzVar, bArr, i2, i3, zzgnaVar);
        while (true) {
            zzgpfVar.add(zzgnaVar.zzc);
            if (zzd >= i3) {
                break;
            }
            int zzj = zzj(bArr, zzd, zzgnaVar);
            if (i != zzgnaVar.zza) {
                break;
            }
            zzd = zzd(zzgqzVar, bArr, zzj, i3, zzgnaVar);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzgpf zzgpfVar, zzgna zzgnaVar) throws IOException {
        zzgox zzgoxVar = (zzgox) zzgpfVar;
        int zzj = zzj(bArr, i, zzgnaVar);
        int i2 = zzgnaVar.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzgnaVar);
            zzgoxVar.zzh(zzgnaVar.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzgpi.zzj();
    }

    public static int zzg(byte[] bArr, int i, zzgna zzgnaVar) throws zzgpi {
        int zzj = zzj(bArr, i, zzgnaVar);
        int i2 = zzgnaVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzgnaVar.zzc = "";
                return zzj;
            }
            zzgnaVar.zzc = new String(bArr, zzj, i2, zzgpg.zzb);
            return zzj + i2;
        }
        throw zzgpi.zzf();
    }

    public static int zzh(byte[] bArr, int i, zzgna zzgnaVar) throws zzgpi {
        int zzj = zzj(bArr, i, zzgnaVar);
        int i2 = zzgnaVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzgnaVar.zzc = "";
                return zzj;
            }
            zzgnaVar.zzc = zzgsf.zzh(bArr, zzj, i2);
            return zzj + i2;
        }
        throw zzgpi.zzf();
    }

    public static int zzi(int i, byte[] bArr, int i2, int i3, zzgrr zzgrrVar, zzgna zzgnaVar) throws zzgpi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzm = zzm(bArr, i2, zzgnaVar);
                zzgrrVar.zzj(i, Long.valueOf(zzgnaVar.zzb));
                return zzm;
            } else if (i4 == 1) {
                zzgrrVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzj = zzj(bArr, i2, zzgnaVar);
                int i5 = zzgnaVar.zza;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - zzj) {
                        zzgrrVar.zzj(i, i5 == 0 ? zzgno.zzb : zzgno.zzv(bArr, zzj, i5));
                        return zzj + i5;
                    }
                    throw zzgpi.zzj();
                }
                throw zzgpi.zzf();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzgrrVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                    return i2 + 4;
                }
                throw zzgpi.zzc();
            } else {
                int i6 = (i & (-8)) | 4;
                zzgrr zzf = zzgrr.zzf();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i2, zzgnaVar);
                    int i8 = zzgnaVar.zza;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zzj2;
                        break;
                    }
                    int zzi = zzi(i7, bArr, zzj2, i3, zzf, zzgnaVar);
                    i7 = i8;
                    i2 = zzi;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzgpi.zzg();
                }
                zzgrrVar.zzj(i, zzf);
                return i2;
            }
        }
        throw zzgpi.zzc();
    }

    public static int zzj(byte[] bArr, int i, zzgna zzgnaVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzgnaVar.zza = b;
            return i2;
        }
        return zzk(b, bArr, i2, zzgnaVar);
    }

    public static int zzk(int i, byte[] bArr, int i2, zzgna zzgnaVar) {
        int i3;
        int i4;
        byte b = bArr[i2];
        int i5 = i2 + 1;
        int i6 = i & 127;
        if (b < 0) {
            int i7 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i5 + 1;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i6 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i5 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i5 + 1;
                    byte b4 = bArr[i5];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                zzgnaVar.zza = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            zzgnaVar.zza = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        zzgnaVar.zza = i6 | i4;
        return i5;
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzgpf zzgpfVar, zzgna zzgnaVar) {
        zzgox zzgoxVar = (zzgox) zzgpfVar;
        int zzj = zzj(bArr, i2, zzgnaVar);
        while (true) {
            zzgoxVar.zzh(zzgnaVar.zza);
            if (zzj >= i3) {
                break;
            }
            int zzj2 = zzj(bArr, zzj, zzgnaVar);
            if (i != zzgnaVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgnaVar);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzgna zzgnaVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgnaVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i4;
            i3 = i5;
            b = b2;
        }
        zzgnaVar.zzb = j2;
        return i3;
    }

    public static int zzn(Object obj, zzgqz zzgqzVar, byte[] bArr, int i, int i2, int i3, zzgna zzgnaVar) throws IOException {
        int zzc = ((zzgqj) zzgqzVar).zzc(obj, bArr, i, i2, i3, zzgnaVar);
        zzgnaVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzgqz zzgqzVar, byte[] bArr, int i, int i2, zzgna zzgnaVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzk(i4, bArr, i3, zzgnaVar);
            i4 = zzgnaVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzgpi.zzj();
        }
        int i6 = i4 + i5;
        zzgqzVar.zzi(obj, bArr, i5, i6, zzgnaVar);
        zzgnaVar.zzc = obj;
        return i6;
    }

    public static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
