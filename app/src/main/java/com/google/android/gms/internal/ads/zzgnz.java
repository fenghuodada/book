package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgnz extends zzgod {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgnz(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzI() {
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzJ(byte b) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzK(int i, boolean z) throws IOException {
        zzs(i << 3);
        zzJ(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzL(int i, zzgno zzgnoVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgnoVar.zzd());
        zzgnoVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgod, com.google.android.gms.internal.ads.zzgnd
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zze(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzh(int i, int i2) throws IOException {
        zzs((i << 3) | 5);
        zzi(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzi(int i) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.zzc = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzj(int i, long j) throws IOException {
        zzs((i << 3) | 1);
        zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzk(long j) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.zzc = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzl(int i, int i2) throws IOException {
        zzs(i << 3);
        zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzn(int i, zzgqg zzgqgVar, zzgqz zzgqzVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(((zzgmx) zzgqgVar).zzat(zzgqzVar));
        zzgqzVar.zzm(zzgqgVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) throws IOException {
        int i = this.zzc;
        try {
            int zzA = zzgod.zzA(str.length() * 3);
            int zzA2 = zzgod.zzA(str.length());
            if (zzA2 != zzA) {
                zzs(zzgsf.zze(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = zzgsf.zzd(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + zzA2;
            this.zzc = i3;
            int zzd = zzgsf.zzd(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzs((zzd - i) - zzA2);
            this.zzc = zzd;
        } catch (zzgse e) {
            this.zzc = i;
            zzE(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgoa(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzr(int i, int i2) throws IOException {
        zzs(i << 3);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzs(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
            }
        }
        byte[] bArr2 = this.zza;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzt(int i, long j) throws IOException {
        zzs(i << 3);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzu(long j) throws IOException {
        boolean z;
        z = zzgod.zzb;
        if (z && this.zzb - this.zzc >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i = this.zzc;
                this.zzc = i + 1;
                zzgsa.zzq(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            zzgsa.zzq(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzgoa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
            }
        }
        byte[] bArr4 = this.zza;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
