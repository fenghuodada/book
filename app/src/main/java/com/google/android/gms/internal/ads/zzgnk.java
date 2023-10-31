package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C1169e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzgnk extends zzgnj {
    protected final byte[] zza;

    public zzgnk(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgno) && zzd() == ((zzgno) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzgnk) {
                zzgnk zzgnkVar = (zzgnk) obj;
                int zzr = zzr();
                int zzr2 = zzgnkVar.zzr();
                if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
                    return zzg(zzgnkVar, 0, zzd());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgnj
    public final boolean zzg(zzgno zzgnoVar, int i, int i2) {
        if (i2 <= zzgnoVar.zzd()) {
            int i3 = i + i2;
            if (i3 <= zzgnoVar.zzd()) {
                if (zzgnoVar instanceof zzgnk) {
                    zzgnk zzgnkVar = (zzgnk) zzgnoVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgnkVar.zza;
                    int zzc = zzc() + i2;
                    int zzc2 = zzc();
                    int zzc3 = zzgnkVar.zzc() + i;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgnoVar.zzk(i, i3).equals(zzk(0, i2));
            }
            int zzd = zzgnoVar.zzd();
            StringBuilder m11130b = C1169e.m11130b("Ran off end of other: ", i, ", ", i2, ", ");
            m11130b.append(zzd);
            throw new IllegalArgumentException(m11130b.toString());
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i2 + zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final int zzi(int i, int i2, int i3) {
        return zzgpg.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzgsf.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final zzgno zzk(int i, int i2) {
        int zzq = zzgno.zzq(i, i2, zzd());
        return zzq == 0 ? zzgno.zzb : new zzgnh(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final zzgnw zzl() {
        return zzgnw.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final void zzo(zzgnd zzgndVar) throws IOException {
        zzgndVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final boolean zzp() {
        int zzc = zzc();
        return zzgsf.zzj(this.zza, zzc, zzd() + zzc);
    }
}
