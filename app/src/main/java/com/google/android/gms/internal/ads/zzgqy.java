package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgqy extends zzgno {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgno zzd;
    private final zzgno zze;
    private final int zzf;
    private final int zzg;

    private zzgqy(zzgno zzgnoVar, zzgno zzgnoVar2) {
        this.zzd = zzgnoVar;
        this.zze = zzgnoVar2;
        int zzd = zzgnoVar.zzd();
        this.zzf = zzd;
        this.zzc = zzgnoVar2.zzd() + zzd;
        this.zzg = Math.max(zzgnoVar.zzf(), zzgnoVar2.zzf()) + 1;
    }

    public static zzgno zzC(zzgno zzgnoVar, zzgno zzgnoVar2) {
        if (zzgnoVar2.zzd() == 0) {
            return zzgnoVar;
        }
        if (zzgnoVar.zzd() == 0) {
            return zzgnoVar2;
        }
        int zzd = zzgnoVar2.zzd() + zzgnoVar.zzd();
        if (zzd < 128) {
            return zzD(zzgnoVar, zzgnoVar2);
        }
        if (zzgnoVar instanceof zzgqy) {
            zzgqy zzgqyVar = (zzgqy) zzgnoVar;
            if (zzgnoVar2.zzd() + zzgqyVar.zze.zzd() < 128) {
                return new zzgqy(zzgqyVar.zzd, zzD(zzgqyVar.zze, zzgnoVar2));
            } else if (zzgqyVar.zzd.zzf() > zzgqyVar.zze.zzf() && zzgqyVar.zzg > zzgnoVar2.zzf()) {
                return new zzgqy(zzgqyVar.zzd, new zzgqy(zzgqyVar.zze, zzgnoVar2));
            }
        }
        return zzd >= zzc(Math.max(zzgnoVar.zzf(), zzgnoVar2.zzf()) + 1) ? new zzgqy(zzgnoVar, zzgnoVar2) : zzgqu.zza(new zzgqu(null), zzgnoVar, zzgnoVar2);
    }

    private static zzgno zzD(zzgno zzgnoVar, zzgno zzgnoVar2) {
        int zzd = zzgnoVar.zzd();
        int zzd2 = zzgnoVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgnoVar.zzz(bArr, 0, 0, zzd);
        zzgnoVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgnk(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgno)) {
            return false;
        }
        zzgno zzgnoVar = (zzgno) obj;
        if (this.zzc != zzgnoVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgnoVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgqw zzgqwVar = new zzgqw(this, null);
        zzgnj next = zzgqwVar.next();
        zzgqw zzgqwVar2 = new zzgqw(zzgnoVar, null);
        zzgnj next2 = zzgqwVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i2;
            int min = Math.min(zzd, zzd2);
            if (!(i == 0 ? next.zzg(next2, i2, min) : next2.zzg(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgqwVar.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == zzd2) {
                next2 = zzgqwVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgno, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgqs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final byte zza(int i) {
        zzgno.zzy(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zze.zze(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final zzgno zzk(int i, int i2) {
        int zzq = zzgno.zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgno.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgno zzgnoVar = this.zzd;
        return new zzgqy(zzgnoVar.zzk(i, zzgnoVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final zzgnw zzl() {
        ArrayList arrayList = new ArrayList();
        zzgqw zzgqwVar = new zzgqw(this, null);
        while (zzgqwVar.hasNext()) {
            arrayList.add(zzgqwVar.next().zzn());
        }
        Iterator it = arrayList.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i += byteBuffer.remaining();
            z = byteBuffer.hasArray() ? z | true : byteBuffer.isDirect() ? z | true : z | true;
        }
        return z ? new zzgns(arrayList, i, true, null) : zzgnw.zzH(new zzgpj(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final void zzo(zzgnd zzgndVar) throws IOException {
        this.zzd.zzo(zzgndVar);
        this.zze.zzo(zzgndVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgno zzgnoVar = this.zze;
        return zzgnoVar.zzj(zzj, 0, zzgnoVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgno
    public final zzgni zzs() {
        return new zzgqs(this);
    }
}
