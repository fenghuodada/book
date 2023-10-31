package androidx.collection;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p060j$.util.Iterator;
import p060j$.util.Map;
import p060j$.util.function.Consumer;

/* renamed from: androidx.collection.h */
/* loaded from: classes.dex */
public abstract class AbstractC0476h<K, V> {
    @Nullable

    /* renamed from: a */
    public AbstractC0476h<K, V>.C0478b f1510a;
    @Nullable

    /* renamed from: b */
    public AbstractC0476h<K, V>.C0479c f1511b;
    @Nullable

    /* renamed from: c */
    public AbstractC0476h<K, V>.C0481e f1512c;

    /* renamed from: androidx.collection.h$a */
    /* loaded from: classes.dex */
    public final class C0477a<T> implements Iterator<T>, p060j$.util.Iterator {

        /* renamed from: a */
        public final int f1513a;

        /* renamed from: b */
        public int f1514b;

        /* renamed from: c */
        public int f1515c;

        /* renamed from: d */
        public boolean f1516d = false;

        public C0477a(int i) {
            this.f1513a = i;
            this.f1514b = AbstractC0476h.this.mo12414d();
        }

        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final boolean hasNext() {
            return this.f1515c < this.f1514b;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t = (T) AbstractC0476h.this.mo12416b(this.f1515c, this.f1513a);
                this.f1515c++;
                this.f1516d = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            if (!this.f1516d) {
                throw new IllegalStateException();
            }
            int i = this.f1515c - 1;
            this.f1515c = i;
            this.f1514b--;
            this.f1516d = false;
            AbstractC0476h.this.mo12410h(i);
        }
    }

    /* renamed from: androidx.collection.h$b */
    /* loaded from: classes.dex */
    public final class C0478b implements Set<Map.Entry<K, V>> {
        public C0478b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int mo12414d = abstractC0476h.mo12414d();
            for (Map.Entry<K, V> entry : collection) {
                abstractC0476h.mo12411g(entry.getKey(), entry.getValue());
            }
            return mo12414d != abstractC0476h.mo12414d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC0476h.this.mo12417a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int mo12413e = abstractC0476h.mo12413e(key);
            if (mo12413e < 0) {
                return false;
            }
            Object mo12416b = abstractC0476h.mo12416b(mo12413e, 1);
            Object value = entry.getValue();
            if (mo12416b != value && (mo12416b == null || !mo12416b.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC0476h.m12408j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int i = 0;
            for (int mo12414d = abstractC0476h.mo12414d() - 1; mo12414d >= 0; mo12414d--) {
                Object mo12416b = abstractC0476h.mo12416b(mo12414d, 0);
                Object mo12416b2 = abstractC0476h.mo12416b(mo12414d, 1);
                i += (mo12416b == null ? 0 : mo12416b.hashCode()) ^ (mo12416b2 == null ? 0 : mo12416b2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0476h.this.mo12414d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C0480d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC0476h.this.mo12414d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.collection.h$c */
    /* loaded from: classes.dex */
    public final class C0479c implements Set<K> {
        public C0479c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC0476h.this.mo12417a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC0476h.this.mo12413e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> mo12415c = AbstractC0476h.this.mo12415c();
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mo12415c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC0476h.m12408j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int i = 0;
            for (int mo12414d = abstractC0476h.mo12414d() - 1; mo12414d >= 0; mo12414d--) {
                Object mo12416b = abstractC0476h.mo12416b(mo12414d, 0);
                i += mo12416b == null ? 0 : mo12416b.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0476h.this.mo12414d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<K> iterator() {
            return new C0477a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int mo12413e = abstractC0476h.mo12413e(obj);
            if (mo12413e >= 0) {
                abstractC0476h.mo12410h(mo12413e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mo12415c = AbstractC0476h.this.mo12415c();
            int size = mo12415c.size();
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mo12415c.remove(it.next());
            }
            if (size != mo12415c.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return AbstractC0476h.m12407k(AbstractC0476h.this.mo12415c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC0476h.this.mo12414d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int mo12414d = abstractC0476h.mo12414d();
            Object[] objArr = new Object[mo12414d];
            for (int i = 0; i < mo12414d; i++) {
                objArr[i] = abstractC0476h.mo12416b(i, 0);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0476h.this.m12406l(0, tArr);
        }
    }

    /* renamed from: androidx.collection.h$d */
    /* loaded from: classes.dex */
    public final class C0480d implements java.util.Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, p060j$.util.Iterator, Map.Entry {

        /* renamed from: a */
        public int f1520a;

        /* renamed from: c */
        public boolean f1522c = false;

        /* renamed from: b */
        public int f1521b = -1;

        public C0480d() {
            this.f1520a = AbstractC0476h.this.mo12414d() - 1;
        }

        @Override // java.util.Map.Entry, p060j$.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (this.f1522c) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.f1521b;
                AbstractC0476h abstractC0476h = AbstractC0476h.this;
                Object mo12416b = abstractC0476h.mo12416b(i, 0);
                if (key != mo12416b && (key == null || !key.equals(mo12416b))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                Object value = entry.getValue();
                Object mo12416b2 = abstractC0476h.mo12416b(this.f1521b, 1);
                if (value != mo12416b2 && (value == null || !value.equals(mo12416b2))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Map.Entry, p060j$.util.Map.Entry
        public final K getKey() {
            if (this.f1522c) {
                return (K) AbstractC0476h.this.mo12416b(this.f1521b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry, p060j$.util.Map.Entry
        public final V getValue() {
            if (this.f1522c) {
                return (V) AbstractC0476h.this.mo12416b(this.f1521b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final boolean hasNext() {
            return this.f1521b < this.f1520a;
        }

        @Override // java.util.Map.Entry, p060j$.util.Map.Entry
        public final int hashCode() {
            if (this.f1522c) {
                int i = this.f1521b;
                AbstractC0476h abstractC0476h = AbstractC0476h.this;
                Object mo12416b = abstractC0476h.mo12416b(i, 0);
                Object mo12416b2 = abstractC0476h.mo12416b(this.f1521b, 1);
                return (mo12416b == null ? 0 : mo12416b.hashCode()) ^ (mo12416b2 != null ? mo12416b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.f1521b++;
                this.f1522c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            if (!this.f1522c) {
                throw new IllegalStateException();
            }
            AbstractC0476h.this.mo12410h(this.f1521b);
            this.f1521b--;
            this.f1520a--;
            this.f1522c = false;
        }

        @Override // java.util.Map.Entry, p060j$.util.Map.Entry
        public final V setValue(V v) {
            if (this.f1522c) {
                return (V) AbstractC0476h.this.mo12409i(this.f1521b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: androidx.collection.h$e */
    /* loaded from: classes.dex */
    public final class C0481e implements Collection<V> {
        public C0481e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            AbstractC0476h.this.mo12417a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC0476h.this.mo12412f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0476h.this.mo12414d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            return new C0477a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int mo12412f = abstractC0476h.mo12412f(obj);
            if (mo12412f >= 0) {
                abstractC0476h.mo12410h(mo12412f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int mo12414d = abstractC0476h.mo12414d();
            int i = 0;
            boolean z = false;
            while (i < mo12414d) {
                if (collection.contains(abstractC0476h.mo12416b(i, 1))) {
                    abstractC0476h.mo12410h(i);
                    i--;
                    mo12414d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int mo12414d = abstractC0476h.mo12414d();
            int i = 0;
            boolean z = false;
            while (i < mo12414d) {
                if (!collection.contains(abstractC0476h.mo12416b(i, 1))) {
                    abstractC0476h.mo12410h(i);
                    i--;
                    mo12414d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return AbstractC0476h.this.mo12414d();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            AbstractC0476h abstractC0476h = AbstractC0476h.this;
            int mo12414d = abstractC0476h.mo12414d();
            Object[] objArr = new Object[mo12414d];
            for (int i = 0; i < mo12414d; i++) {
                objArr[i] = abstractC0476h.mo12416b(i, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0476h.this.m12406l(1, tArr);
        }
    }

    /* renamed from: j */
    public static <T> boolean m12408j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: k */
    public static <K, V> boolean m12407k(java.util.Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo12417a();

    /* renamed from: b */
    public abstract Object mo12416b(int i, int i2);

    /* renamed from: c */
    public abstract java.util.Map<K, V> mo12415c();

    /* renamed from: d */
    public abstract int mo12414d();

    /* renamed from: e */
    public abstract int mo12413e(Object obj);

    /* renamed from: f */
    public abstract int mo12412f(Object obj);

    /* renamed from: g */
    public abstract void mo12411g(K k, V v);

    /* renamed from: h */
    public abstract void mo12410h(int i);

    /* renamed from: i */
    public abstract V mo12409i(int i, V v);

    /* renamed from: l */
    public final Object[] m12406l(int i, Object[] objArr) {
        int mo12414d = mo12414d();
        if (objArr.length < mo12414d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), mo12414d);
        }
        for (int i2 = 0; i2 < mo12414d; i2++) {
            objArr[i2] = mo12416b(i2, i);
        }
        if (objArr.length > mo12414d) {
            objArr[mo12414d] = null;
        }
        return objArr;
    }
}
