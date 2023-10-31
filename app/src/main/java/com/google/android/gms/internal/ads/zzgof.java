package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C1169e;
import androidx.datastore.preferences.protobuf.C1194j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzgof extends zzgmy implements RandomAccess, zzgqn {
    private static final zzgof zza = new zzgof(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    public zzgof() {
        this(new double[10], 0, true);
    }

    private zzgof(double[] dArr, int i, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i;
    }

    private final String zzf(int i) {
        return C1194j.m11060a("Index:", i, ", Size:", this.zzc);
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zzbH();
        if (i >= 0 && i <= (i2 = this.zzc)) {
            double[] dArr = this.zzb;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[C1169e.m11131a(i2, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.zzb, i, dArr2, i + 1, this.zzc - i);
                this.zzb = dArr2;
            }
            this.zzb[i] = doubleValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbH();
        byte[] bArr = zzgpg.zzd;
        collection.getClass();
        if (collection instanceof zzgof) {
            zzgof zzgofVar = (zzgof) collection;
            int i = zzgofVar.zzc;
            if (i == 0) {
                return false;
            }
            int i2 = this.zzc;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                double[] dArr = this.zzb;
                if (i3 > dArr.length) {
                    this.zzb = Arrays.copyOf(dArr, i3);
                }
                System.arraycopy(zzgofVar.zzb, 0, this.zzb, this.zzc, zzgofVar.zzc);
                this.zzc = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgof) {
            zzgof zzgofVar = (zzgof) obj;
            if (this.zzc != zzgofVar.zzc) {
                return false;
            }
            double[] dArr = zzgofVar.zzb;
            for (int i = 0; i < this.zzc; i++) {
                if (Double.doubleToLongBits(this.zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Double.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i2]);
            byte[] bArr = zzgpg.zzd;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == doubleValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zzbH();
        zzg(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzbH();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbH();
        zzg(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final /* bridge */ /* synthetic */ zzgpf zzd(int i) {
        if (i >= this.zzc) {
            return new zzgof(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d) {
        zzbH();
        int i = this.zzc;
        double[] dArr = this.zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        dArr3[i2] = d;
    }
}
