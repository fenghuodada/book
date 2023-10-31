package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i0 */
/* loaded from: classes3.dex */
public final class C8236i0 extends AbstractC8205c<Long> implements RandomAccess, InterfaceC8200a1 {

    /* renamed from: b */
    public long[] f16004b;

    /* renamed from: c */
    public int f16005c;

    static {
        new C8236i0(new long[0], 0).f15955a = false;
    }

    public C8236i0() {
        this(new long[10], 0);
    }

    public C8236i0(long[] jArr, int i) {
        this.f16004b = jArr;
        this.f16005c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m3923a();
        if (i < 0 || i > (i2 = this.f16005c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f16005c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        long[] jArr = this.f16004b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f16004b, i, jArr2, i + 1, this.f16005c - i);
            this.f16004b = jArr2;
        }
        this.f16004b[i] = longValue;
        this.f16005c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m3923a();
        Charset charset = C8196a0.f15949a;
        collection.getClass();
        if (!(collection instanceof C8236i0)) {
            return super.addAll(collection);
        }
        C8236i0 c8236i0 = (C8236i0) collection;
        int i = c8236i0.f16005c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16005c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f16004b;
            if (i3 > jArr.length) {
                this.f16004b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c8236i0.f16004b, 0, this.f16004b, this.f16005c, c8236i0.f16005c);
            this.f16005c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m3808b(long j) {
        m3923a();
        int i = this.f16005c;
        long[] jArr = this.f16004b;
        if (i == jArr.length) {
            long[] jArr2 = new long[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f16004b = jArr2;
        }
        long[] jArr3 = this.f16004b;
        int i2 = this.f16005c;
        this.f16005c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: d */
    public final C8196a0.InterfaceC8199c mo3453d(int i) {
        if (i >= this.f16005c) {
            return new C8236i0(Arrays.copyOf(this.f16004b, i), this.f16005c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8236i0) {
            C8236i0 c8236i0 = (C8236i0) obj;
            if (this.f16005c != c8236i0.f16005c) {
                return false;
            }
            long[] jArr = c8236i0.f16004b;
            for (int i = 0; i < this.f16005c; i++) {
                if (this.f16004b[i] != jArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3807i(i);
        return Long.valueOf(this.f16004b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16005c; i2++) {
            i = (i * 31) + C8196a0.m3933b(this.f16004b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void m3807i(int i) {
        if (i >= 0 && i < this.f16005c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f16005c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m3923a();
        m3807i(i);
        long[] jArr = this.f16004b;
        long j = jArr[i];
        if (i < this.f16005c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f16005c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3923a();
        for (int i = 0; i < this.f16005c; i++) {
            if (obj.equals(Long.valueOf(this.f16004b[i]))) {
                long[] jArr = this.f16004b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f16005c - i) - 1);
                this.f16005c--;
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
        long[] jArr = this.f16004b;
        System.arraycopy(jArr, i2, jArr, i, this.f16005c - i2);
        this.f16005c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m3923a();
        m3807i(i);
        long[] jArr = this.f16004b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16005c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3808b(((Long) obj).longValue());
        return true;
    }
}
