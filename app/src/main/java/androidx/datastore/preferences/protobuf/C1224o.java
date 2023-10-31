package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1157b0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.o */
/* loaded from: classes.dex */
public final class C1224o extends AbstractC1162c<Double> implements RandomAccess, InterfaceC1165c1 {

    /* renamed from: b */
    public double[] f3058b;

    /* renamed from: c */
    public int f3059c;

    static {
        new C1224o(0, new double[0]).f2946a = false;
    }

    public C1224o() {
        this(0, new double[10]);
    }

    public C1224o(int i, double[] dArr) {
        this.f3058b = dArr;
        this.f3059c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m11142a();
        if (i < 0 || i > (i2 = this.f3059c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f3059c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        double[] dArr = this.f3058b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f3058b, i, dArr2, i + 1, this.f3059c - i);
            this.f3058b = dArr2;
        }
        this.f3058b[i] = doubleValue;
        this.f3059c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m11142a();
        Charset charset = C1157b0.f2944a;
        collection.getClass();
        if (!(collection instanceof C1224o)) {
            return super.addAll(collection);
        }
        C1224o c1224o = (C1224o) collection;
        int i = c1224o.f3059c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3059c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f3058b;
            if (i3 > dArr.length) {
                this.f3058b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c1224o.f3058b, 0, this.f3058b, this.f3059c, c1224o.f3059c);
            this.f3059c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m10877b(double d) {
        m11142a();
        int i = this.f3059c;
        double[] dArr = this.f3058b;
        if (i == dArr.length) {
            double[] dArr2 = new double[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f3058b = dArr2;
        }
        double[] dArr3 = this.f3058b;
        int i2 = this.f3059c;
        this.f3059c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1160c
    /* renamed from: d */
    public final C1157b0.InterfaceC1160c mo10720d(int i) {
        if (i >= this.f3059c) {
            return new C1224o(this.f3059c, Arrays.copyOf(this.f3058b, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1224o) {
            C1224o c1224o = (C1224o) obj;
            if (this.f3059c != c1224o.f3059c) {
                return false;
            }
            double[] dArr = c1224o.f3058b;
            for (int i = 0; i < this.f3059c; i++) {
                if (Double.doubleToLongBits(this.f3058b[i]) != Double.doubleToLongBits(dArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10876i(i);
        return Double.valueOf(this.f3058b[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3059c; i2++) {
            i = (i * 31) + C1157b0.m11145b(Double.doubleToLongBits(this.f3058b[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final void m10876i(int i) {
        if (i >= 0 && i < this.f3059c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f3059c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m11142a();
        m10876i(i);
        double[] dArr = this.f3058b;
        double d = dArr[i];
        if (i < this.f3059c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f3059c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m11142a();
        for (int i = 0; i < this.f3059c; i++) {
            if (obj.equals(Double.valueOf(this.f3058b[i]))) {
                double[] dArr = this.f3058b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f3059c - i) - 1);
                this.f3059c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m11142a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f3058b;
        System.arraycopy(dArr, i2, dArr, i, this.f3059c - i2);
        this.f3059c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m11142a();
        m10876i(i);
        double[] dArr = this.f3058b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3059c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m10877b(((Double) obj).doubleValue());
        return true;
    }
}
