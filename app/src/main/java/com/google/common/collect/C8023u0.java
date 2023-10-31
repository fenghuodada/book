package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible(emulated = true)
/* renamed from: com.google.common.collect.u0 */
/* loaded from: classes3.dex */
public final class C8023u0 {

    /* renamed from: com.google.common.collect.u0$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8024a<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof InterfaceC7983j0) {
                collection = ((InterfaceC7983j0) collection).m4264l();
            }
            boolean z = false;
            if ((collection instanceof Set) && collection.size() > size()) {
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            } else {
                Iterator<?> it2 = collection.iterator();
                while (it2.hasNext()) {
                    z |= remove(it2.next());
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* renamed from: com.google.common.collect.u0$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8025b<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static int m4227a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: b */
    public static C8020t0 m4226b(AbstractC8031x abstractC8031x, AbstractC8031x abstractC8031x2) {
        if (abstractC8031x != null) {
            if (abstractC8031x2 != null) {
                return new C8020t0(abstractC8031x, abstractC8031x2);
            }
            throw new NullPointerException("set2");
        }
        throw new NullPointerException("set1");
    }
}
