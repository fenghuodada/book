package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1157b0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.j0 */
/* loaded from: classes.dex */
public final class C1195j0 extends AbstractC1162c<Long> implements RandomAccess, InterfaceC1165c1 {

    /* renamed from: b */
    public long[] f2993b;

    /* renamed from: c */
    public int f2994c;

    static {
        new C1195j0(new long[0], 0).f2946a = false;
    }

    public C1195j0() {
        this(new long[10], 0);
    }

    public C1195j0(long[] jArr, int i) {
        this.f2993b = jArr;
        this.f2994c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m11142a();
        if (i < 0 || i > (i2 = this.f2994c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f2994c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        long[] jArr = this.f2993b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f2993b, i, jArr2, i + 1, this.f2994c - i);
            this.f2993b = jArr2;
        }
        this.f2993b[i] = longValue;
        this.f2994c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m11142a();
        Charset charset = C1157b0.f2944a;
        collection.getClass();
        if (!(collection instanceof C1195j0)) {
            return super.addAll(collection);
        }
        C1195j0 c1195j0 = (C1195j0) collection;
        int i = c1195j0.f2994c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2994c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f2993b;
            if (i3 > jArr.length) {
                this.f2993b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c1195j0.f2993b, 0, this.f2993b, this.f2994c, c1195j0.f2994c);
            this.f2994c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m11059b(long j) {
        m11142a();
        int i = this.f2994c;
        long[] jArr = this.f2993b;
        if (i == jArr.length) {
            long[] jArr2 = new long[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f2993b = jArr2;
        }
        long[] jArr3 = this.f2993b;
        int i2 = this.f2994c;
        this.f2994c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1160c
    /* renamed from: d */
    public final C1157b0.InterfaceC1160c mo10720d(int i) {
        if (i >= this.f2994c) {
            return new C1195j0(Arrays.copyOf(this.f2993b, i), this.f2994c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1195j0) {
            C1195j0 c1195j0 = (C1195j0) obj;
            if (this.f2994c != c1195j0.f2994c) {
                return false;
            }
            long[] jArr = c1195j0.f2993b;
            for (int i = 0; i < this.f2994c; i++) {
                if (this.f2993b[i] != jArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m11058i(i);
        return Long.valueOf(this.f2993b[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2994c; i2++) {
            i = (i * 31) + C1157b0.m11145b(this.f2993b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void m11058i(int i) {
        if (i >= 0 && i < this.f2994c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f2994c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m11142a();
        m11058i(i);
        long[] jArr = this.f2993b;
        long j = jArr[i];
        if (i < this.f2994c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f2994c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m11142a();
        for (int i = 0; i < this.f2994c; i++) {
            if (obj.equals(Long.valueOf(this.f2993b[i]))) {
                long[] jArr = this.f2993b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f2994c - i) - 1);
                this.f2994c--;
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
        long[] jArr = this.f2993b;
        System.arraycopy(jArr, i2, jArr, i, this.f2994c - i2);
        this.f2994c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m11142a();
        m11058i(i);
        long[] jArr = this.f2993b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2994c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m11059b(((Long) obj).longValue());
        return true;
    }
}
