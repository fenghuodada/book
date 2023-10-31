package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1157b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.e1 */
/* loaded from: classes.dex */
public final class C1173e1<E> extends AbstractC1162c<E> implements RandomAccess {

    /* renamed from: d */
    public static final C1173e1<Object> f2967d;

    /* renamed from: b */
    public E[] f2968b;

    /* renamed from: c */
    public int f2969c;

    static {
        C1173e1<Object> c1173e1 = new C1173e1<>(new Object[0], 0);
        f2967d = c1173e1;
        c1173e1.f2946a = false;
    }

    public C1173e1(E[] eArr, int i) {
        this.f2968b = eArr;
        this.f2969c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m11142a();
        if (i >= 0 && i <= (i2 = this.f2969c)) {
            E[] eArr = this.f2968b;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[C1169e.m11131a(i2, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f2968b, i, eArr2, i + 1, this.f2969c - i);
                this.f2968b = eArr2;
            }
            this.f2968b[i] = e;
            this.f2969c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f2969c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m11142a();
        int i = this.f2969c;
        E[] eArr = this.f2968b;
        if (i == eArr.length) {
            this.f2968b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2968b;
        int i2 = this.f2969c;
        this.f2969c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m11128b(int i) {
        if (i >= 0 && i < this.f2969c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f2969c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1160c
    /* renamed from: d */
    public final C1157b0.InterfaceC1160c mo10720d(int i) {
        if (i >= this.f2969c) {
            return new C1173e1(Arrays.copyOf(this.f2968b, i), this.f2969c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m11128b(i);
        return this.f2968b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        m11142a();
        m11128b(i);
        E[] eArr = this.f2968b;
        E e = eArr[i];
        if (i < this.f2969c - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f2969c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m11142a();
        m11128b(i);
        E[] eArr = this.f2968b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2969c;
    }
}
