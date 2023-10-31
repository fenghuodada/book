package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgob extends zzgny {
    private final OutputStream zzg;

    public zzgob(OutputStream outputStream, int i) {
        super(i);
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzJ(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzK(int i, boolean z) throws IOException {
        zzH(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzL(int i, zzgno zzgnoVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgnoVar.zzd());
        zzgnoVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgod, com.google.android.gms.internal.ads.zzgnd
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzp(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzh(int i, int i2) throws IOException {
        zzH(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzi(int i) throws IOException {
        zzH(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzj(int i, long j) throws IOException {
        zzH(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzk(long j) throws IOException {
        zzH(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzl(int i, int i2) throws IOException {
        zzH(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
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
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
        } else {
            System.arraycopy(bArr, i, this.zza, i4, i5);
            int i6 = i + i5;
            this.zzc = this.zzb;
            this.zzd += i5;
            zzG();
            i2 -= i5;
            if (i2 <= this.zzb) {
                System.arraycopy(bArr, i6, this.zza, 0, i2);
                this.zzc = i2;
            } else {
                this.zzg.write(bArr, i6, i2);
            }
        }
        this.zzd += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzr(int i, int i2) throws IOException {
        zzH(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzs(int i) throws IOException {
        zzH(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzt(int i, long j) throws IOException {
        zzH(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgod
    public final void zzu(long j) throws IOException {
        zzH(10);
        zzg(j);
    }

    public final void zzv(String str) throws IOException {
        int zze;
        try {
            int length = str.length() * 3;
            int zzA = zzgod.zzA(length);
            int i = zzA + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int zzd = zzgsf.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i > i2 - this.zzc) {
                zzG();
            }
            int zzA2 = zzgod.zzA(str.length());
            int i3 = this.zzc;
            try {
                if (zzA2 == zzA) {
                    int i4 = i3 + zzA2;
                    this.zzc = i4;
                    int zzd2 = zzgsf.zzd(str, this.zza, i4, this.zzb - i4);
                    this.zzc = i3;
                    zze = (zzd2 - i3) - zzA2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzgsf.zze(str);
                    zzf(zze);
                    this.zzc = zzgsf.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzgse e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzgoa(e2);
            }
        } catch (zzgse e3) {
            zzE(str, e3);
        }
    }
}
