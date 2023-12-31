package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzrj {
    private int zza = 0;
    private int zzb = -1;
    private int zzc = 0;
    private int[] zzd;
    private int zze;

    public zzrj() {
        int[] iArr = new int[16];
        this.zzd = iArr;
        this.zze = iArr.length - 1;
    }

    public final int zza() {
        int i = this.zzc;
        if (i != 0) {
            int[] iArr = this.zzd;
            int i2 = this.zza;
            int i3 = iArr[i2];
            this.zza = (i2 + 1) & this.zze;
            this.zzc = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    public final void zzb(int i) {
        int i2 = this.zzc;
        int[] iArr = this.zzd;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[i3];
            int i4 = this.zza;
            int i5 = length - i4;
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.zzd, 0, iArr2, i5, i4);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = iArr2;
            this.zze = iArr2.length - 1;
            iArr = iArr2;
        }
        int i6 = (this.zzb + 1) & this.zze;
        this.zzb = i6;
        iArr[i6] = i;
        this.zzc++;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }
}
