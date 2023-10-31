package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1157b0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.f */
/* loaded from: classes.dex */
public final class C1174f extends AbstractC1162c<Boolean> implements RandomAccess, InterfaceC1165c1 {

    /* renamed from: b */
    public boolean[] f2970b;

    /* renamed from: c */
    public int f2971c;

    static {
        new C1174f(new boolean[0], 0).f2946a = false;
    }

    public C1174f() {
        this(new boolean[10], 0);
    }

    public C1174f(boolean[] zArr, int i) {
        this.f2970b = zArr;
        this.f2971c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m11142a();
        if (i < 0 || i > (i2 = this.f2971c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f2971c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        boolean[] zArr = this.f2970b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f2970b, i, zArr2, i + 1, this.f2971c - i);
            this.f2970b = zArr2;
        }
        this.f2970b[i] = booleanValue;
        this.f2971c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m11142a();
        Charset charset = C1157b0.f2944a;
        collection.getClass();
        if (!(collection instanceof C1174f)) {
            return super.addAll(collection);
        }
        C1174f c1174f = (C1174f) collection;
        int i = c1174f.f2971c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2971c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f2970b;
            if (i3 > zArr.length) {
                this.f2970b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c1174f.f2970b, 0, this.f2970b, this.f2971c, c1174f.f2971c);
            this.f2971c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m11127b(boolean z) {
        m11142a();
        int i = this.f2971c;
        boolean[] zArr = this.f2970b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f2970b = zArr2;
        }
        boolean[] zArr3 = this.f2970b;
        int i2 = this.f2971c;
        this.f2971c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1160c
    /* renamed from: d */
    public final C1157b0.InterfaceC1160c mo10720d(int i) {
        if (i >= this.f2971c) {
            return new C1174f(Arrays.copyOf(this.f2970b, i), this.f2971c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1174f) {
            C1174f c1174f = (C1174f) obj;
            if (this.f2971c != c1174f.f2971c) {
                return false;
            }
            boolean[] zArr = c1174f.f2970b;
            for (int i = 0; i < this.f2971c; i++) {
                if (this.f2970b[i] != zArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m11126i(i);
        return Boolean.valueOf(this.f2970b[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2971c; i2++) {
            i = (i * 31) + C1157b0.m11146a(this.f2970b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void m11126i(int i) {
        if (i >= 0 && i < this.f2971c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f2971c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m11142a();
        m11126i(i);
        boolean[] zArr = this.f2970b;
        boolean z = zArr[i];
        if (i < this.f2971c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f2971c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m11142a();
        for (int i = 0; i < this.f2971c; i++) {
            if (obj.equals(Boolean.valueOf(this.f2970b[i]))) {
                boolean[] zArr = this.f2970b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f2971c - i) - 1);
                this.f2971c--;
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
        boolean[] zArr = this.f2970b;
        System.arraycopy(zArr, i2, zArr, i, this.f2971c - i2);
        this.f2971c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m11142a();
        m11126i(i);
        boolean[] zArr = this.f2970b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2971c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m11127b(((Boolean) obj).booleanValue());
        return true;
    }
}
