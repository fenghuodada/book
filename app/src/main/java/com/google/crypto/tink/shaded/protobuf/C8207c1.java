package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c1 */
/* loaded from: classes3.dex */
public final class C8207c1<E> extends AbstractC8205c<E> implements RandomAccess {

    /* renamed from: d */
    public static final C8207c1<Object> f15968d;

    /* renamed from: b */
    public E[] f15969b;

    /* renamed from: c */
    public int f15970c;

    static {
        C8207c1<Object> c8207c1 = new C8207c1<>(new Object[0], 0);
        f15968d = c8207c1;
        c8207c1.f15955a = false;
    }

    public C8207c1(E[] eArr, int i) {
        this.f15969b = eArr;
        this.f15970c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        m3923a();
        if (i >= 0 && i <= (i2 = this.f15970c)) {
            E[] eArr = this.f15969b;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[C1169e.m11131a(i2, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f15969b, i, eArr2, i + 1, this.f15970c - i);
                this.f15969b = eArr2;
            }
            this.f15969b[i] = e;
            this.f15970c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f15970c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        m3923a();
        int i = this.f15970c;
        E[] eArr = this.f15969b;
        if (i == eArr.length) {
            this.f15969b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f15969b;
        int i2 = this.f15970c;
        this.f15970c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m3920b(int i) {
        if (i >= 0 && i < this.f15970c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f15970c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: d */
    public final C8196a0.InterfaceC8199c mo3453d(int i) {
        if (i >= this.f15970c) {
            return new C8207c1(Arrays.copyOf(this.f15969b, i), this.f15970c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        m3920b(i);
        return this.f15969b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        m3923a();
        m3920b(i);
        E[] eArr = this.f15969b;
        E e = eArr[i];
        if (i < this.f15970c - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f15970c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        m3923a();
        m3920b(i);
        E[] eArr = this.f15969b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15970c;
    }
}
