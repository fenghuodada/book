package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f */
/* loaded from: classes3.dex */
public final class C8217f extends AbstractC8205c<Boolean> implements RandomAccess, InterfaceC8200a1 {

    /* renamed from: b */
    public boolean[] f15985b;

    /* renamed from: c */
    public int f15986c;

    static {
        new C8217f(new boolean[0], 0).f15955a = false;
    }

    public C8217f() {
        this(new boolean[10], 0);
    }

    public C8217f(boolean[] zArr, int i) {
        this.f15985b = zArr;
        this.f15986c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m3923a();
        if (i < 0 || i > (i2 = this.f15986c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f15986c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        boolean[] zArr = this.f15985b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f15985b, i, zArr2, i + 1, this.f15986c - i);
            this.f15985b = zArr2;
        }
        this.f15985b[i] = booleanValue;
        this.f15986c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m3923a();
        Charset charset = C8196a0.f15949a;
        collection.getClass();
        if (!(collection instanceof C8217f)) {
            return super.addAll(collection);
        }
        C8217f c8217f = (C8217f) collection;
        int i = c8217f.f15986c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15986c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f15985b;
            if (i3 > zArr.length) {
                this.f15985b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c8217f.f15985b, 0, this.f15985b, this.f15986c, c8217f.f15986c);
            this.f15986c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m3876b(boolean z) {
        m3923a();
        int i = this.f15986c;
        boolean[] zArr = this.f15985b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f15985b = zArr2;
        }
        boolean[] zArr3 = this.f15985b;
        int i2 = this.f15986c;
        this.f15986c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: d */
    public final C8196a0.InterfaceC8199c mo3453d(int i) {
        if (i >= this.f15986c) {
            return new C8217f(Arrays.copyOf(this.f15985b, i), this.f15986c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8217f) {
            C8217f c8217f = (C8217f) obj;
            if (this.f15986c != c8217f.f15986c) {
                return false;
            }
            boolean[] zArr = c8217f.f15985b;
            for (int i = 0; i < this.f15986c; i++) {
                if (this.f15985b[i] != zArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3875i(i);
        return Boolean.valueOf(this.f15985b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15986c; i2++) {
            i = (i * 31) + C8196a0.m3934a(this.f15985b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void m3875i(int i) {
        if (i >= 0 && i < this.f15986c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f15986c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m3923a();
        m3875i(i);
        boolean[] zArr = this.f15985b;
        boolean z = zArr[i];
        if (i < this.f15986c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f15986c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3923a();
        for (int i = 0; i < this.f15986c; i++) {
            if (obj.equals(Boolean.valueOf(this.f15985b[i]))) {
                boolean[] zArr = this.f15985b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f15986c - i) - 1);
                this.f15986c--;
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
        boolean[] zArr = this.f15985b;
        System.arraycopy(zArr, i2, zArr, i, this.f15986c - i2);
        this.f15986c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m3923a();
        m3875i(i);
        boolean[] zArr = this.f15985b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15986c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3876b(((Boolean) obj).booleanValue());
        return true;
    }
}
