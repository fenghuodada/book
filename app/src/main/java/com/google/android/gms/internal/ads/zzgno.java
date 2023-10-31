package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;
import androidx.core.p003os.C0740h;
import androidx.datastore.preferences.protobuf.C1194j;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzgno implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgno zzb = new zzgnk(zzgpg.zzd);
    private static final zzgnn zzd;
    private int zzc = 0;

    static {
        int i = zzgmz.zza;
        zzd = new zzgnn(null);
        zza = new zzgnf();
    }

    private static zzgno zzc(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (zzgno) it.next();
            }
            int i2 = i >>> 1;
            zzgno zzc = zzc(it, i2);
            zzgno zzc2 = zzc(it, i - i2);
            if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
                return zzgqy.zzC(zzc, zzc2);
            }
            throw new IllegalArgumentException(C1194j.m11060a("ByteString would be too long: ", zzc.zzd(), "+", zzc2.zzd()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(C1194j.m11060a("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(C1194j.m11060a("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException(C0740h.m11849a("Beginning index: ", i, " < 0"));
        }
        return i4;
    }

    public static zzgnl zzt() {
        return new zzgnl(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgno zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgno zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgnk(bArr2);
    }

    public static zzgno zzw(String str) {
        return new zzgnk(str.getBytes(zzgpg.zzb));
    }

    public static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(C0235r.m12816a("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(C1194j.m11060a("Index > length: ", i, ", ", i2));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzi(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgro.zza(this) : zzgro.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzgpg.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzgno zzk(int i, int i2);

    public abstract zzgnw zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgnd zzgndVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs */
    public zzgni iterator() {
        return new zzgne(this);
    }

    public final String zzx(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }
}
