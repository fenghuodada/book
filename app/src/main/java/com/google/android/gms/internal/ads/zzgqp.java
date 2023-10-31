package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C1169e;
import androidx.datastore.preferences.protobuf.C1194j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgqp extends zzgmy implements RandomAccess {
    private static final zzgqp zza = new zzgqp(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzgqp() {
        this(new Object[10], 0, true);
    }

    private zzgqp(Object[] objArr, int i, boolean z) {
        super(z);
        this.zzb = objArr;
        this.zzc = i;
    }

    public static zzgqp zze() {
        return zza;
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
    public final void add(int i, Object obj) {
        int i2;
        zzbH();
        if (i >= 0 && i <= (i2 = this.zzc)) {
            Object[] objArr = this.zzb;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[C1169e.m11131a(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.zzb, i, objArr2, i + 1, this.zzc - i);
                this.zzb = objArr2;
            }
            this.zzb[i] = obj;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbH();
        int i = this.zzc;
        Object[] objArr = this.zzb;
        if (i == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzg(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zzbH();
        zzg(i);
        Object[] objArr = this.zzb;
        Object obj = objArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzbH();
        zzg(i);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final /* bridge */ /* synthetic */ zzgpf zzd(int i) {
        if (i >= this.zzc) {
            return new zzgqp(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }
}
