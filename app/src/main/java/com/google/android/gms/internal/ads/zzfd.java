package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0235r;
import com.applovin.impl.sdk.p033e.C3132a0;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: classes.dex */
public final class zzfd {
    private static final zzfrw zza = zzfrw.zzo(zzfol.zza, zzfol.zzc, zzfol.zzf, zzfol.zzd, zzfol.zze);
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfd() {
        this.zzb = zzfn.zzf;
    }

    public zzfd(int i) {
        this.zzb = new byte[i];
        this.zzd = i;
    }

    public zzfd(byte[] bArr) {
        this.zzb = bArr;
        this.zzd = bArr.length;
    }

    public zzfd(byte[] bArr, int i) {
        this.zzb = bArr;
        this.zzd = i;
    }

    public final void zzA(zzfc zzfcVar, int i) {
        zzB(zzfcVar.zza, 0, i);
        zzfcVar.zzj(0);
    }

    public final void zzB(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzb, this.zzc, bArr, i, i2);
        this.zzc += i2;
    }

    public final void zzC(int i) {
        byte[] bArr = this.zzb;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzD(bArr, i);
    }

    public final void zzD(byte[] bArr, int i) {
        this.zzb = bArr;
        this.zzd = i;
        this.zzc = 0;
    }

    public final void zzE(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzb.length) {
            z = true;
        }
        zzdy.zzd(z);
        this.zzd = i;
    }

    public final void zzF(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzd) {
            z = true;
        }
        zzdy.zzd(z);
        this.zzc = i;
    }

    public final void zzG(int i) {
        zzF(this.zzc + i);
    }

    public final byte[] zzH() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzd - this.zzc;
    }

    public final int zzb() {
        return this.zzb.length;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final int zze() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.zzc = i4 + 1;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public final int zzf() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.zzc = i3 + 1;
        return (bArr[i3] & 255) | (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
    }

    public final int zzg() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.zzc = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public final int zzh() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException(C0235r.m12816a("Top bit not zero: ", zzg));
    }

    public final int zzi() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final int zzj() {
        return (zzk() << 21) | (zzk() << 14) | (zzk() << 7) | zzk();
    }

    public final int zzk() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        this.zzc = i + 1;
        return bArr[i] & 255;
    }

    public final int zzl() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2 + 1 + 2;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final int zzm() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.zzc = i3 + 1;
        return (bArr[i3] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
    }

    public final int zzn() {
        int zze = zze();
        if (zze >= 0) {
            return zze;
        }
        throw new IllegalStateException(C0235r.m12816a("Top bit not zero: ", zze));
    }

    public final int zzo() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final long zzp() {
        int i;
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        int i5 = i4 + 1;
        long j3 = bArr[i4];
        int i6 = i5 + 1;
        long j4 = bArr[i5];
        int i7 = i6 + 1;
        long j5 = bArr[i6];
        int i8 = i7 + 1;
        long j6 = bArr[i7];
        long j7 = bArr[i8];
        this.zzc = i8 + 1 + 1;
        return ((bArr[i] & 255) << 56) | ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final long zzq() {
        int i;
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        long j3 = bArr[i4];
        this.zzc = i4 + 1 + 1;
        return ((bArr[i] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long zzr() {
        int i;
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        int i5 = i4 + 1;
        long j3 = bArr[i4];
        int i6 = i5 + 1;
        long j4 = bArr[i5];
        int i7 = i6 + 1;
        long j5 = bArr[i6];
        int i8 = i7 + 1;
        long j6 = bArr[i7];
        long j7 = bArr[i8];
        this.zzc = i8 + 1 + 1;
        return (bArr[i] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long zzs() {
        int i;
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        int i3 = i2 + 1;
        long j = bArr[i2];
        int i4 = i3 + 1;
        long j2 = bArr[i3];
        long j3 = bArr[i4];
        this.zzc = i4 + 1 + 1;
        return (bArr[i] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long zzt() {
        long zzr = zzr();
        if (zzr >= 0) {
            return zzr;
        }
        throw new IllegalStateException(C3132a0.m7696a("Top bit not zero: ", zzr));
    }

    public final long zzu() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.zzb[this.zzc];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            for (i2 = 1; i2 < i; i2++) {
                if ((this.zzb[this.zzc + i2] & 192) == 128) {
                    j = (j << 6) | (b & Utf8.REPLACEMENT_BYTE);
                } else {
                    throw new NumberFormatException(C3132a0.m7696a("Invalid UTF-8 sequence continuation byte: ", j));
                }
            }
            this.zzc += i;
            return j;
        }
        throw new NumberFormatException(C3132a0.m7696a("Invalid UTF-8 sequence first byte: ", j));
    }

    @Nullable
    public final String zzv(char c) {
        int i = this.zzd;
        int i2 = this.zzc;
        if (i - i2 != 0) {
            while (i2 < this.zzd && this.zzb[i2] != 0) {
                i2++;
            }
            byte[] bArr = this.zzb;
            int i3 = this.zzc;
            String zzv = zzfn.zzv(bArr, i3, i2 - i3);
            this.zzc = i2;
            if (i2 < this.zzd) {
                this.zzc = i2 + 1;
            }
            return zzv;
        }
        return null;
    }

    public final String zzw(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.zzc;
        int i3 = (i2 + i) - 1;
        String zzv = zzfn.zzv(this.zzb, i2, (i3 >= this.zzd || this.zzb[i3] != 0) ? i : i - 1);
        this.zzc += i;
        return zzv;
    }

    public final String zzx(int i, Charset charset) {
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        String str = new String(bArr, i2, i, charset);
        this.zzc = i2 + i;
        return str;
    }

    public final short zzy() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        int i2 = i + 1;
        this.zzc = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final void zzz(int i) {
        byte[] bArr = this.zzb;
        if (i > bArr.length) {
            this.zzb = Arrays.copyOf(bArr, i);
        }
    }
}
