package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractC8013s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* renamed from: com.google.common.collect.q */
/* loaded from: classes3.dex */
public abstract class AbstractC8007q<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    public static final Object[] f15809a = new Object[0];

    /* renamed from: com.google.common.collect.q$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8008a<E> extends AbstractC8009b<E> {

        /* renamed from: a */
        public Object[] f15810a;

        /* renamed from: b */
        public int f15811b;

        /* renamed from: c */
        public boolean f15812c;

        public AbstractC8008a() {
            C7978h.m4265b(4, "initialCapacity");
            this.f15810a = new Object[4];
            this.f15811b = 0;
        }
    }

    /* renamed from: com.google.common.collect.q$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8009b<E> {
        /* renamed from: a */
        public static int m4249a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    /* renamed from: a */
    public AbstractC8013s<E> mo4217a() {
        if (isEmpty()) {
            AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
            return C7998n0.f15785e;
        }
        Object[] array = toArray();
        AbstractC8013s.C8015b c8015b2 = AbstractC8013s.f15817b;
        return AbstractC8013s.m4247o(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public int mo4225b(int i, Object[] objArr) {
        AbstractC8032x0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    /* renamed from: i */
    public Object[] mo4240i() {
        return null;
    }

    /* renamed from: j */
    public int mo4239j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public int mo4238k() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public abstract boolean mo4224m();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public abstract AbstractC8032x0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f15809a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] mo4240i = mo4240i();
            if (mo4240i != null) {
                return (T[]) Arrays.copyOfRange(mo4240i, mo4238k(), mo4239j(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo4225b(0, tArr);
        return tArr;
    }
}
