package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgrr {
    private static final zzgrr zza = new zzgrr(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgrr() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgrr(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgrr zzc() {
        return zza;
    }

    public static zzgrr zze(zzgrr zzgrrVar, zzgrr zzgrrVar2) {
        int i = zzgrrVar.zzb + zzgrrVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgrrVar.zzc, i);
        System.arraycopy(zzgrrVar2.zzc, 0, copyOf, zzgrrVar.zzb, zzgrrVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgrrVar.zzd, i);
        System.arraycopy(zzgrrVar2.zzd, 0, copyOf2, zzgrrVar.zzb, zzgrrVar2.zzb);
        return new zzgrr(i, copyOf, copyOf2, true);
    }

    public static zzgrr zzf() {
        return new zzgrr(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzgrr)) {
            zzgrr zzgrrVar = (zzgrr) obj;
            int i = this.zzb;
            if (i == zzgrrVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzgrrVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzgrrVar.zzd;
                        int i3 = this.zzb;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    public final int zza() {
        int zzB;
        int zzA;
        int i;
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.zzd[i4]).longValue();
                        i = zzgod.zzA(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int i8 = zzgod.zzf;
                        int zzd = ((zzgno) this.zzd[i4]).zzd();
                        i = zzgod.zzA(i6 << 3) + zzgod.zzA(zzd) + zzd;
                    } else if (i7 == 3) {
                        int i9 = i6 << 3;
                        int i10 = zzgod.zzf;
                        zzB = ((zzgrr) this.zzd[i4]).zza();
                        int zzA2 = zzgod.zzA(i9);
                        zzA = zzA2 + zzA2;
                    } else if (i7 != 5) {
                        throw new IllegalStateException(zzgpi.zza());
                    } else {
                        ((Integer) this.zzd[i4]).intValue();
                        i = zzgod.zzA(i6 << 3) + 4;
                    }
                    i3 += i;
                } else {
                    int i11 = i6 << 3;
                    zzB = zzgod.zzB(((Long) this.zzd[i4]).longValue());
                    zzA = zzgod.zzA(i11);
                }
                i = zzA + zzB;
                i3 += i;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = zzgod.zzf;
                int zzd = ((zzgno) this.zzd[i3]).zzd();
                int zzA = zzgod.zzA(zzd) + zzd;
                int zzA2 = zzgod.zzA(16);
                int zzA3 = zzgod.zzA(this.zzc[i3] >>> 3);
                int zzA4 = zzgod.zzA(8);
                i2 += zzgod.zzA(24) + zzA + zzA2 + zzA3 + zzA4 + zzA4;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final zzgrr zzd(zzgrr zzgrrVar) {
        if (zzgrrVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgrrVar.zzb;
        zzl(i);
        System.arraycopy(zzgrrVar.zzc, 0, this.zzc, this.zzb, zzgrrVar.zzb);
        System.arraycopy(zzgrrVar.zzd, 0, this.zzd, this.zzb, zzgrrVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgqi.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzgoe zzgoeVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzgoeVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzgoeVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzgoeVar.zzd(i4, (zzgno) obj);
                } else if (i3 == 3) {
                    zzgoeVar.zzE(i4);
                    ((zzgrr) obj).zzk(zzgoeVar);
                    zzgoeVar.zzh(i4);
                } else if (i3 != 5) {
                    throw new RuntimeException(zzgpi.zza());
                } else {
                    zzgoeVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
