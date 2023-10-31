package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1157b0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.a0 */
/* loaded from: classes.dex */
public final class C1154a0 extends AbstractC1162c<Integer> implements RandomAccess, InterfaceC1165c1 {

    /* renamed from: b */
    public int[] f2942b;

    /* renamed from: c */
    public int f2943c;

    static {
        new C1154a0(new int[0], 0).f2946a = false;
    }

    public C1154a0() {
        this(new int[10], 0);
    }

    public C1154a0(int[] iArr, int i) {
        this.f2942b = iArr;
        this.f2943c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m11142a();
        if (i < 0 || i > (i2 = this.f2943c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f2943c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        int[] iArr = this.f2942b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f2942b, i, iArr2, i + 1, this.f2943c - i);
            this.f2942b = iArr2;
        }
        this.f2942b[i] = intValue;
        this.f2943c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m11142a();
        Charset charset = C1157b0.f2944a;
        collection.getClass();
        if (!(collection instanceof C1154a0)) {
            return super.addAll(collection);
        }
        C1154a0 c1154a0 = (C1154a0) collection;
        int i = c1154a0.f2943c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2943c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f2942b;
            if (i3 > iArr.length) {
                this.f2942b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c1154a0.f2942b, 0, this.f2942b, this.f2943c, c1154a0.f2943c);
            this.f2943c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m11149b(int i) {
        m11142a();
        int i2 = this.f2943c;
        int[] iArr = this.f2942b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f2942b = iArr2;
        }
        int[] iArr3 = this.f2942b;
        int i3 = this.f2943c;
        this.f2943c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1160c
    /* renamed from: d */
    public final C1157b0.InterfaceC1160c mo10720d(int i) {
        if (i >= this.f2943c) {
            return new C1154a0(Arrays.copyOf(this.f2942b, i), this.f2943c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1154a0) {
            C1154a0 c1154a0 = (C1154a0) obj;
            if (this.f2943c != c1154a0.f2943c) {
                return false;
            }
            int[] iArr = c1154a0.f2942b;
            for (int i = 0; i < this.f2943c; i++) {
                if (this.f2942b[i] != iArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m11148i(i);
        return Integer.valueOf(this.f2942b[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f2943c; i2++) {
            i = (i * 31) + this.f2942b[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void m11148i(int i) {
        if (i >= 0 && i < this.f2943c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f2943c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m11142a();
        m11148i(i);
        int[] iArr = this.f2942b;
        int i3 = iArr[i];
        if (i < this.f2943c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f2943c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m11142a();
        for (int i = 0; i < this.f2943c; i++) {
            if (obj.equals(Integer.valueOf(this.f2942b[i]))) {
                int[] iArr = this.f2942b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f2943c - i) - 1);
                this.f2943c--;
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
        int[] iArr = this.f2942b;
        System.arraycopy(iArr, i2, iArr, i, this.f2943c - i2);
        this.f2943c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m11142a();
        m11148i(i);
        int[] iArr = this.f2942b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2943c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m11149b(((Integer) obj).intValue());
        return true;
    }
}
