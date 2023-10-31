package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z */
/* loaded from: classes3.dex */
public final class C8316z extends AbstractC8205c<Integer> implements RandomAccess, InterfaceC8200a1 {

    /* renamed from: b */
    public int[] f16141b;

    /* renamed from: c */
    public int f16142c;

    static {
        new C8316z(new int[0], 0).f15955a = false;
    }

    public C8316z() {
        this(new int[10], 0);
    }

    public C8316z(int[] iArr, int i) {
        this.f16141b = iArr;
        this.f16142c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m3923a();
        if (i < 0 || i > (i2 = this.f16142c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f16142c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        int[] iArr = this.f16141b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f16141b, i, iArr2, i + 1, this.f16142c - i);
            this.f16141b = iArr2;
        }
        this.f16141b[i] = intValue;
        this.f16142c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m3923a();
        Charset charset = C8196a0.f15949a;
        collection.getClass();
        if (!(collection instanceof C8316z)) {
            return super.addAll(collection);
        }
        C8316z c8316z = (C8316z) collection;
        int i = c8316z.f16142c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16142c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f16141b;
            if (i3 > iArr.length) {
                this.f16141b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c8316z.f16141b, 0, this.f16141b, this.f16142c, c8316z.f16142c);
            this.f16142c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m3454b(int i) {
        m3923a();
        int i2 = this.f16142c;
        int[] iArr = this.f16141b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f16141b = iArr2;
        }
        int[] iArr3 = this.f16141b;
        int i3 = this.f16142c;
        this.f16142c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: d */
    public final C8196a0.InterfaceC8199c mo3453d(int i) {
        if (i >= this.f16142c) {
            return new C8316z(Arrays.copyOf(this.f16141b, i), this.f16142c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8316z) {
            C8316z c8316z = (C8316z) obj;
            if (this.f16142c != c8316z.f16142c) {
                return false;
            }
            int[] iArr = c8316z.f16141b;
            for (int i = 0; i < this.f16142c; i++) {
                if (this.f16141b[i] != iArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3452i(i);
        return Integer.valueOf(this.f16141b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16142c; i2++) {
            i = (i * 31) + this.f16141b[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void m3452i(int i) {
        if (i >= 0 && i < this.f16142c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f16142c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m3923a();
        m3452i(i);
        int[] iArr = this.f16141b;
        int i3 = iArr[i];
        if (i < this.f16142c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f16142c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3923a();
        for (int i = 0; i < this.f16142c; i++) {
            if (obj.equals(Integer.valueOf(this.f16141b[i]))) {
                int[] iArr = this.f16141b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f16142c - i) - 1);
                this.f16142c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m3923a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f16141b;
        System.arraycopy(iArr, i2, iArr, i, this.f16142c - i2);
        this.f16142c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m3923a();
        m3452i(i);
        int[] iArr = this.f16141b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16142c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3454b(((Integer) obj).intValue());
        return true;
    }
}
