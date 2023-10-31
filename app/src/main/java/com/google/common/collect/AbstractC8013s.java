package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.C7937f;
import com.google.common.base.C7938g;
import com.google.common.collect.AbstractC8007q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.s */
/* loaded from: classes3.dex */
public abstract class AbstractC8013s<E> extends AbstractC8007q<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    public static final C8015b f15817b = new C8015b(C7998n0.f15785e, 0);

    /* renamed from: com.google.common.collect.s$a */
    /* loaded from: classes3.dex */
    public static final class C8014a<E> extends AbstractC8007q.AbstractC8008a<E> {
        @CanIgnoreReturnValue
        /* renamed from: b */
        public final void m4242b(Object obj) {
            obj.getClass();
            int i = this.f15811b + 1;
            Object[] objArr = this.f15810a;
            if (objArr.length < i) {
                this.f15810a = Arrays.copyOf(objArr, AbstractC8007q.AbstractC8009b.m4249a(objArr.length, i));
            } else {
                if (this.f15812c) {
                    this.f15810a = (Object[]) objArr.clone();
                }
                Object[] objArr2 = this.f15810a;
                int i2 = this.f15811b;
                this.f15811b = i2 + 1;
                objArr2[i2] = obj;
            }
            this.f15812c = false;
            Object[] objArr22 = this.f15810a;
            int i22 = this.f15811b;
            this.f15811b = i22 + 1;
            objArr22[i22] = obj;
        }

        /* renamed from: c */
        public final C7998n0 m4241c() {
            this.f15812c = true;
            return AbstractC8013s.m4247o(this.f15811b, this.f15810a);
        }
    }

    /* renamed from: com.google.common.collect.s$b */
    /* loaded from: classes3.dex */
    public static class C8015b<E> extends AbstractC7947a<E> {

        /* renamed from: c */
        public final AbstractC8013s<E> f15818c;

        public C8015b(AbstractC8013s<E> abstractC8013s, int i) {
            super(abstractC8013s.size(), i);
            this.f15818c = abstractC8013s;
        }

        @Override // com.google.common.collect.AbstractC7947a
        /* renamed from: b */
        public final E mo4212b(int i) {
            return this.f15818c.get(i);
        }
    }

    /* renamed from: com.google.common.collect.s$c */
    /* loaded from: classes3.dex */
    public class C8016c extends AbstractC8013s<E> {

        /* renamed from: c */
        public final transient int f15819c;

        /* renamed from: d */
        public final transient int f15820d;

        public C8016c(int i, int i2) {
            this.f15819c = i;
            this.f15820d = i2;
        }

        @Override // java.util.List
        public final E get(int i) {
            C7938g.m4288b(i, this.f15820d);
            return AbstractC8013s.this.get(i + this.f15819c);
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: i */
        public final Object[] mo4240i() {
            return AbstractC8013s.this.mo4240i();
        }

        @Override // com.google.common.collect.AbstractC8013s, com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: j */
        public final int mo4239j() {
            return AbstractC8013s.this.mo4238k() + this.f15819c + this.f15820d;
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: k */
        public final int mo4238k() {
            return AbstractC8013s.this.mo4238k() + this.f15819c;
        }

        @Override // com.google.common.collect.AbstractC8013s, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.AbstractC8013s, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: m */
        public final boolean mo4224m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f15820d;
        }

        @Override // com.google.common.collect.AbstractC8013s, java.util.List
        /* renamed from: u */
        public final AbstractC8013s<E> subList(int i, int i2) {
            C7938g.m4286d(i, i2, this.f15820d);
            int i3 = this.f15819c;
            return AbstractC8013s.this.subList(i + i3, i2 + i3);
        }
    }

    /* renamed from: o */
    public static C7998n0 m4247o(int i, Object[] objArr) {
        if (i == 0) {
            return C7998n0.f15785e;
        }
        return new C7998n0(objArr, i);
    }

    /* renamed from: p */
    public static <E> AbstractC8013s<E> m4246p(Collection<? extends E> collection) {
        if (collection instanceof AbstractC8007q) {
            AbstractC8013s<E> mo4217a = ((AbstractC8007q) collection).mo4217a();
            if (mo4217a.mo4224m()) {
                Object[] array = mo4217a.toArray();
                return m4247o(array.length, array);
            }
            return mo4217a;
        }
        Object[] array2 = collection.toArray();
        C7992l0.m4258a(array2);
        return m4247o(array2.length, array2);
    }

    /* renamed from: s */
    public static C7998n0 m4244s(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        C7992l0.m4258a(objArr);
        return m4247o(5, objArr);
    }

    /* renamed from: t */
    public static C7998n0 m4243t(Object obj) {
        Object[] objArr = {obj};
        C7992l0.m4258a(objArr);
        return m4247o(1, objArr);
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: a */
    public final AbstractC8013s<E> mo4217a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: b */
    public int mo4225b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C7937f.m4290a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = list.iterator();
                for (E e : this) {
                    if (it.hasNext()) {
                        if (!C7937f.m4290a(e, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.AbstractC8007q
    /* renamed from: n */
    public final AbstractC8032x0<E> mo4223n() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r */
    public final C8015b listIterator(int i) {
        C7938g.m4287c(i, size());
        return isEmpty() ? f15817b : new C8015b(this, i);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u */
    public AbstractC8013s<E> subList(int i, int i2) {
        C7938g.m4286d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C7998n0.f15785e;
        }
        return new C8016c(i, i3);
    }
}
