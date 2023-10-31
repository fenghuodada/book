package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C1169e;
import androidx.datastore.preferences.protobuf.C1194j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgox extends zzgmy implements RandomAccess, zzgpb, zzgqn {
    private static final zzgox zza = new zzgox(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzgox() {
        this(new int[10], 0, true);
    }

    private zzgox(int[] iArr, int i, boolean z) {
        super(z);
        this.zzb = iArr;
        this.zzc = i;
    }

    public static zzgox zzf() {
        return zza;
    }

    private final String zzi(int i) {
        return C1194j.m11060a("Index:", i, ", Size:", this.zzc);
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzbH();
        if (i >= 0 && i <= (i2 = this.zzc)) {
            int[] iArr = this.zzb;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[C1169e.m11131a(i2, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.zzb, i, iArr2, i + 1, this.zzc - i);
                this.zzb = iArr2;
            }
            this.zzb[i] = intValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbH();
        byte[] bArr = zzgpg.zzd;
        collection.getClass();
        if (collection instanceof zzgox) {
            zzgox zzgoxVar = (zzgox) collection;
            int i = zzgoxVar.zzc;
            if (i == 0) {
                return false;
            }
            int i2 = this.zzc;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.zzb;
                if (i3 > iArr.length) {
                    this.zzb = Arrays.copyOf(iArr, i3);
                }
                System.arraycopy(zzgoxVar.zzb, 0, this.zzb, this.zzc, zzgoxVar.zzc);
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
        if (obj instanceof zzgox) {
            zzgox zzgoxVar = (zzgox) obj;
            if (this.zzc != zzgoxVar.zzc) {
                return false;
            }
            int[] iArr = zzgoxVar.zzb;
            for (int i = 0; i < this.zzc; i++) {
                if (this.zzb[i] != iArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Integer.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == intValue) {
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
        zzj(i);
        int[] iArr = this.zzb;
        int i3 = iArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzbH();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i2, iArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbH();
        zzj(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zze(int i) {
        zzj(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    /* renamed from: zzg */
    public final zzgpb zzd(int i) {
        if (i >= this.zzc) {
            return new zzgox(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgpb
    public final void zzh(int i) {
        zzbH();
        int i2 = this.zzc;
        int[] iArr = this.zzb;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        iArr3[i3] = i;
    }
}
