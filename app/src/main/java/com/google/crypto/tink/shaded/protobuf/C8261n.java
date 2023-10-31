package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n */
/* loaded from: classes3.dex */
public final class C8261n extends AbstractC8205c<Double> implements RandomAccess, InterfaceC8200a1 {

    /* renamed from: b */
    public double[] f16055b;

    /* renamed from: c */
    public int f16056c;

    static {
        new C8261n(0, new double[0]).f15955a = false;
    }

    public C8261n() {
        this(0, new double[10]);
    }

    public C8261n(int i, double[] dArr) {
        this.f16055b = dArr;
        this.f16056c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m3923a();
        if (i < 0 || i > (i2 = this.f16056c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f16056c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        double[] dArr = this.f16055b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f16055b, i, dArr2, i + 1, this.f16056c - i);
            this.f16055b = dArr2;
        }
        this.f16055b[i] = doubleValue;
        this.f16056c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m3923a();
        Charset charset = C8196a0.f15949a;
        collection.getClass();
        if (!(collection instanceof C8261n)) {
            return super.addAll(collection);
        }
        C8261n c8261n = (C8261n) collection;
        int i = c8261n.f16056c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16056c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f16055b;
            if (i3 > dArr.length) {
                this.f16055b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c8261n.f16055b, 0, this.f16055b, this.f16056c, c8261n.f16056c);
            this.f16056c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m3646b(double d) {
        m3923a();
        int i = this.f16056c;
        double[] dArr = this.f16055b;
        if (i == dArr.length) {
            double[] dArr2 = new double[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f16055b = dArr2;
        }
        double[] dArr3 = this.f16055b;
        int i2 = this.f16056c;
        this.f16056c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: d */
    public final C8196a0.InterfaceC8199c mo3453d(int i) {
        if (i >= this.f16056c) {
            return new C8261n(this.f16056c, Arrays.copyOf(this.f16055b, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8261n) {
            C8261n c8261n = (C8261n) obj;
            if (this.f16056c != c8261n.f16056c) {
                return false;
            }
            double[] dArr = c8261n.f16055b;
            for (int i = 0; i < this.f16056c; i++) {
                if (Double.doubleToLongBits(this.f16055b[i]) != Double.doubleToLongBits(dArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3645i(i);
        return Double.valueOf(this.f16055b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16056c; i2++) {
            i = (i * 31) + C8196a0.m3933b(Double.doubleToLongBits(this.f16055b[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final void m3645i(int i) {
        if (i >= 0 && i < this.f16056c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f16056c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m3923a();
        m3645i(i);
        double[] dArr = this.f16055b;
        double d = dArr[i];
        if (i < this.f16056c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f16056c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3923a();
        for (int i = 0; i < this.f16056c; i++) {
            if (obj.equals(Double.valueOf(this.f16055b[i]))) {
                double[] dArr = this.f16055b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f16056c - i) - 1);
                this.f16056c--;
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
        double[] dArr = this.f16055b;
        System.arraycopy(dArr, i2, dArr, i, this.f16056c - i2);
        this.f16056c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m3923a();
        m3645i(i);
        double[] dArr = this.f16055b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16056c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3646b(((Double) obj).doubleValue());
        return true;
    }
}
