package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractC7973f;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@GwtCompatible
/* renamed from: com.google.common.collect.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7953d<K, V> extends AbstractC7973f<K, V> implements Serializable {

    /* renamed from: d */
    public final transient Map<K, Collection<V>> f15712d;

    /* renamed from: e */
    public transient int f15713e;

    /* renamed from: com.google.common.collect.d$a */
    /* loaded from: classes3.dex */
    public class C7954a extends AbstractC7953d<K, V>.AbstractC7958c<V> {
        public C7954a(AbstractC7953d abstractC7953d) {
            super();
        }
    }

    /* renamed from: com.google.common.collect.d$b */
    /* loaded from: classes3.dex */
    public class C7955b extends AbstractC7975f0<K, Collection<V>> {

        /* renamed from: c */
        public final transient Map<K, Collection<V>> f15714c;

        /* renamed from: com.google.common.collect.d$b$a */
        /* loaded from: classes3.dex */
        public class C7956a extends AbstractC7952c0<K, Collection<V>> {
            public C7956a() {
            }

            @Override // com.google.common.collect.AbstractC7952c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = C7955b.this.f15714c.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C7957b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                AbstractC7953d abstractC7953d = AbstractC7953d.this;
                Object key = ((Map.Entry) obj).getKey();
                Map<K, Collection<V>> map = abstractC7953d.f15712d;
                map.getClass();
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection<V> collection2 = collection;
                if (collection2 != null) {
                    int size = collection2.size();
                    collection2.clear();
                    abstractC7953d.f15713e -= size;
                    return true;
                }
                return true;
            }
        }

        /* renamed from: com.google.common.collect.d$b$b */
        /* loaded from: classes3.dex */
        public class C7957b implements Iterator<Map.Entry<K, Collection<V>>>, p060j$.util.Iterator {

            /* renamed from: a */
            public final Iterator<Map.Entry<K, Collection<V>>> f15717a;
            @NullableDecl

            /* renamed from: b */
            public Collection<V> f15718b;

            public C7957b() {
                this.f15717a = C7955b.this.f15714c.entrySet().iterator();
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
                return this.f15717a.hasNext();
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f15717a.next();
                this.f15718b = next.getValue();
                return C7955b.this.m4279a(next);
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final void remove() {
                boolean z;
                if (this.f15718b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f15717a.remove();
                    AbstractC7953d.this.f15713e -= this.f15718b.size();
                    this.f15718b.clear();
                    this.f15718b = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        public C7955b(Map<K, Collection<V>> map) {
            this.f15714c = map;
        }

        /* renamed from: a */
        public final C8011r m4279a(Map.Entry entry) {
            List c7968k;
            Object key = entry.getKey();
            AbstractC7951c abstractC7951c = (AbstractC7951c) AbstractC7953d.this;
            abstractC7951c.getClass();
            List list = (List) ((Collection) entry.getValue());
            if (list instanceof RandomAccess) {
                c7968k = new C7963g(abstractC7951c, key, list, null);
            } else {
                c7968k = new C7968k(key, list, null);
            }
            return new C8011r(key, c7968k);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            boolean z;
            AbstractC7953d abstractC7953d = AbstractC7953d.this;
            Map<K, Collection<V>> map = abstractC7953d.f15712d;
            Map<K, Collection<V>> map2 = this.f15714c;
            if (map2 == map) {
                abstractC7953d.clear();
                return;
            }
            java.util.Iterator<Map.Entry<K, Collection<V>>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> value = next.getValue();
                m4279a(next);
                if (value != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    it.remove();
                    abstractC7953d.f15713e -= value.size();
                    value.clear();
                } else {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f15714c;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f15714c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Object c7968k;
            Map<K, Collection<V>> map = this.f15714c;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            AbstractC7951c abstractC7951c = (AbstractC7951c) AbstractC7953d.this;
            abstractC7951c.getClass();
            List list = (List) collection2;
            if (list instanceof RandomAccess) {
                c7968k = new C7963g(abstractC7951c, obj, list, null);
            } else {
                c7968k = new C7968k(obj, list, null);
            }
            return c7968k;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f15714c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            AbstractC7953d abstractC7953d = AbstractC7953d.this;
            Set<K> set = abstractC7953d.f15746a;
            if (set == null) {
                Set<K> mo4219d = abstractC7953d.mo4219d();
                abstractC7953d.f15746a = mo4219d;
                return mo4219d;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> remove = this.f15714c.remove(obj);
            if (remove == null) {
                return null;
            }
            AbstractC7953d abstractC7953d = AbstractC7953d.this;
            List<V> list = ((C7981i0) abstractC7953d).f15754f.get();
            list.addAll(remove);
            abstractC7953d.f15713e -= remove.size();
            remove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f15714c.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f15714c.toString();
        }
    }

    /* renamed from: com.google.common.collect.d$c */
    /* loaded from: classes3.dex */
    public abstract class AbstractC7958c<T> implements java.util.Iterator<T>, p060j$.util.Iterator {

        /* renamed from: a */
        public final java.util.Iterator<Map.Entry<K, Collection<V>>> f15720a;
        @NullableDecl

        /* renamed from: b */
        public K f15721b = null;
        @MonotonicNonNullDecl

        /* renamed from: c */
        public Collection<V> f15722c = null;

        /* renamed from: d */
        public java.util.Iterator<V> f15723d = EnumC7948a0.f15708a;

        public AbstractC7958c() {
            this.f15720a = AbstractC7953d.this.f15712d.entrySet().iterator();
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
            return this.f15720a.hasNext() || this.f15723d.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator, p060j$.util.Iterator
        public final T next() {
            if (!this.f15723d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f15720a.next();
                this.f15721b = next.getKey();
                Collection<V> value = next.getValue();
                this.f15722c = value;
                this.f15723d = value.iterator();
            }
            return this.f15723d.next();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            this.f15723d.remove();
            if (this.f15722c.isEmpty()) {
                this.f15720a.remove();
            }
            AbstractC7953d abstractC7953d = AbstractC7953d.this;
            abstractC7953d.f15713e--;
        }
    }

    /* renamed from: com.google.common.collect.d$d */
    /* loaded from: classes3.dex */
    public class C7959d extends C7970d0<K, Collection<V>> {

        /* renamed from: com.google.common.collect.d$d$a */
        /* loaded from: classes3.dex */
        public class C7960a implements java.util.Iterator<K>, p060j$.util.Iterator {
            @NullableDecl

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> f15726a;

            /* renamed from: b */
            public final /* synthetic */ java.util.Iterator f15727b;

            public C7960a(java.util.Iterator it) {
                this.f15727b = it;
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
                return this.f15727b.hasNext();
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f15727b.next();
                this.f15726a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final void remove() {
                boolean z;
                Map.Entry<K, Collection<V>> entry = this.f15726a;
                if (entry != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Collection<V> value = entry.getValue();
                    this.f15727b.remove();
                    AbstractC7953d.this.f15713e -= value.size();
                    value.clear();
                    this.f15726a = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        public C7959d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            java.util.Iterator<K> it = iterator();
            while (true) {
                C7960a c7960a = (C7960a) it;
                if (c7960a.hasNext()) {
                    c7960a.next();
                    c7960a.remove();
                } else {
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f15744a.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f15744a.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f15744a.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new C7960a(this.f15744a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) this.f15744a.remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractC7953d.this.f15713e -= i;
            } else {
                i = 0;
            }
            if (i <= 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.collect.d$e */
    /* loaded from: classes3.dex */
    public class C7961e extends AbstractC7953d<K, V>.C7964h implements NavigableMap<K, Collection<V>> {
        public C7961e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractC7953d.C7964h
        /* renamed from: b */
        public final SortedSet mo4275b() {
            return new C7962f(mo4273d());
        }

        @Override // com.google.common.collect.AbstractC7953d.C7964h
        /* renamed from: c */
        public final SortedSet mo4274c() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo4273d().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return m4279a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return mo4273d().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((C7961e) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C7961e(mo4273d().descendingMap());
        }

        /* renamed from: e */
        public final C8011r m4278e(java.util.Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            List<V> list = ((C7981i0) AbstractC7953d.this).f15754f.get();
            list.addAll((Collection) entry.getValue());
            it.remove();
            return new C8011r(entry.getKey(), Collections.unmodifiableList(list));
        }

        @Override // com.google.common.collect.AbstractC7953d.C7964h
        /* renamed from: f */
        public final NavigableMap<K, Collection<V>> mo4273d() {
            return (NavigableMap) ((SortedMap) this.f15714c);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo4273d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m4279a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> floorEntry = mo4273d().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return m4279a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return mo4273d().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C7961e(mo4273d().headMap(k, z));
        }

        @Override // com.google.common.collect.AbstractC7953d.C7964h, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> higherEntry = mo4273d().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return m4279a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return mo4273d().higherKey(k);
        }

        @Override // com.google.common.collect.AbstractC7953d.C7964h, com.google.common.collect.AbstractC7953d.C7955b, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo4273d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m4279a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> lowerEntry = mo4273d().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return m4279a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return mo4273d().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m4278e(((C7955b.C7956a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return m4278e(((C7955b.C7956a) ((AbstractC7975f0) descendingMap()).entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C7961e(mo4273d().subMap(k, z, k2, z2));
        }

        @Override // com.google.common.collect.AbstractC7953d.C7964h, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C7961e(mo4273d().tailMap(k, z));
        }

        @Override // com.google.common.collect.AbstractC7953d.C7964h, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* renamed from: com.google.common.collect.d$f */
    /* loaded from: classes3.dex */
    public class C7962f extends AbstractC7953d<K, V>.C7965i implements NavigableSet<K> {
        public C7962f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractC7953d.C7965i
        /* renamed from: b */
        public final NavigableMap<K, Collection<V>> mo4272a() {
            return (NavigableMap) ((SortedMap) this.f15744a);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return mo4272a().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final java.util.Iterator<K> descendingIterator() {
            return ((C7959d) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new C7962f(mo4272a().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return mo4272a().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new C7962f(mo4272a().headMap(k, z));
        }

        @Override // com.google.common.collect.AbstractC7953d.C7965i, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return mo4272a().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return mo4272a().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            C7959d.C7960a c7960a = (C7959d.C7960a) iterator();
            if (c7960a.hasNext()) {
                K k = (K) c7960a.next();
                c7960a.remove();
                return k;
            }
            return null;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            java.util.Iterator<K> descendingIterator = descendingIterator();
            if (descendingIterator.hasNext()) {
                K next = descendingIterator.next();
                descendingIterator.remove();
                return next;
            }
            return null;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C7962f(mo4272a().subMap(k, z, k2, z2));
        }

        @Override // com.google.common.collect.AbstractC7953d.C7965i, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new C7962f(mo4272a().tailMap(k, z));
        }

        @Override // com.google.common.collect.AbstractC7953d.C7965i, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    /* renamed from: com.google.common.collect.d$g */
    /* loaded from: classes3.dex */
    public class C7963g extends AbstractC7953d<K, V>.C7968k implements RandomAccess {
        public C7963g(@NullableDecl AbstractC7953d abstractC7953d, K k, @NullableDecl List<V> list, AbstractC7953d<K, V>.C7966j c7966j) {
            super(k, list, c7966j);
        }
    }

    /* renamed from: com.google.common.collect.d$h */
    /* loaded from: classes3.dex */
    public class C7964h extends AbstractC7953d<K, V>.C7955b implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl

        /* renamed from: e */
        public SortedSet<K> f15731e;

        public C7964h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: b */
        public SortedSet<K> mo4275b() {
            return new C7965i(mo4273d());
        }

        @Override // com.google.common.collect.AbstractC7953d.C7955b, java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f15731e;
            if (sortedSet == null) {
                SortedSet<K> mo4275b = mo4275b();
                this.f15731e = mo4275b;
                return mo4275b;
            }
            return sortedSet;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return mo4273d().comparator();
        }

        /* renamed from: d */
        public SortedMap<K, Collection<V>> mo4273d() {
            return (SortedMap) this.f15714c;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return mo4273d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C7964h(mo4273d().headMap(k));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return mo4273d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C7964h(mo4273d().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C7964h(mo4273d().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.d$i */
    /* loaded from: classes3.dex */
    public class C7965i extends AbstractC7953d<K, V>.C7959d implements SortedSet<K> {
        public C7965i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: a */
        public SortedMap<K, Collection<V>> mo4272a() {
            return (SortedMap) this.f15744a;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return mo4272a().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return mo4272a().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C7965i(mo4272a().headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return mo4272a().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C7965i(mo4272a().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C7965i(mo4272a().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.d$j */
    /* loaded from: classes3.dex */
    public class C7966j extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: a */
        public final K f15734a;

        /* renamed from: b */
        public Collection<V> f15735b;
        @NullableDecl

        /* renamed from: c */
        public final AbstractC7953d<K, V>.C7966j f15736c;
        @NullableDecl

        /* renamed from: d */
        public final Collection<V> f15737d;

        /* renamed from: com.google.common.collect.d$j$a */
        /* loaded from: classes3.dex */
        public class C7967a implements java.util.Iterator<V>, p060j$.util.Iterator {

            /* renamed from: a */
            public final java.util.Iterator<V> f15739a;

            /* renamed from: b */
            public final Collection<V> f15740b;

            public C7967a() {
                Collection<V> collection = C7966j.this.f15735b;
                this.f15740b = collection;
                this.f15739a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public C7967a(ListIterator listIterator) {
                this.f15740b = C7966j.this.f15735b;
                this.f15739a = listIterator;
            }

            /* renamed from: a */
            public final void m4268a() {
                C7966j c7966j = C7966j.this;
                c7966j.m4270b();
                if (c7966j.f15735b != this.f15740b) {
                    throw new ConcurrentModificationException();
                }
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
                m4268a();
                return this.f15739a.hasNext();
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final V next() {
                m4268a();
                return this.f15739a.next();
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final void remove() {
                this.f15739a.remove();
                C7966j c7966j = C7966j.this;
                AbstractC7953d abstractC7953d = AbstractC7953d.this;
                abstractC7953d.f15713e--;
                c7966j.m4269i();
            }
        }

        public C7966j(@NullableDecl K k, Collection<V> collection, @NullableDecl AbstractC7953d<K, V>.C7966j c7966j) {
            Collection<V> collection2;
            this.f15734a = k;
            this.f15735b = collection;
            this.f15736c = c7966j;
            if (c7966j == null) {
                collection2 = null;
            } else {
                collection2 = c7966j.f15735b;
            }
            this.f15737d = collection2;
        }

        /* renamed from: a */
        public final void m4271a() {
            AbstractC7953d<K, V>.C7966j c7966j = this.f15736c;
            if (c7966j != null) {
                c7966j.m4271a();
            } else {
                AbstractC7953d.this.f15712d.put(this.f15734a, this.f15735b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            m4270b();
            boolean isEmpty = this.f15735b.isEmpty();
            boolean add = this.f15735b.add(v);
            if (add) {
                AbstractC7953d.this.f15713e++;
                if (isEmpty) {
                    m4271a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f15735b.addAll(collection);
            if (addAll) {
                int size2 = this.f15735b.size();
                AbstractC7953d abstractC7953d = AbstractC7953d.this;
                abstractC7953d.f15713e = (size2 - size) + abstractC7953d.f15713e;
                if (size == 0) {
                    m4271a();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        public final void m4270b() {
            Collection<V> collection;
            AbstractC7953d<K, V>.C7966j c7966j = this.f15736c;
            if (c7966j != null) {
                c7966j.m4270b();
                if (c7966j.f15735b != this.f15737d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f15735b.isEmpty() && (collection = AbstractC7953d.this.f15712d.get(this.f15734a)) != null) {
                this.f15735b = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f15735b.clear();
            AbstractC7953d.this.f15713e -= size;
            m4269i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            m4270b();
            return this.f15735b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            m4270b();
            return this.f15735b.containsAll(collection);
        }

        @Override // java.util.Collection
        public final boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            m4270b();
            return this.f15735b.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            m4270b();
            return this.f15735b.hashCode();
        }

        /* renamed from: i */
        public final void m4269i() {
            AbstractC7953d<K, V>.C7966j c7966j = this.f15736c;
            if (c7966j != null) {
                c7966j.m4269i();
            } else if (this.f15735b.isEmpty()) {
                AbstractC7953d.this.f15712d.remove(this.f15734a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            m4270b();
            return new C7967a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            m4270b();
            boolean remove = this.f15735b.remove(obj);
            if (remove) {
                AbstractC7953d abstractC7953d = AbstractC7953d.this;
                abstractC7953d.f15713e--;
                m4269i();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f15735b.removeAll(collection);
            if (removeAll) {
                int size2 = this.f15735b.size();
                AbstractC7953d abstractC7953d = AbstractC7953d.this;
                abstractC7953d.f15713e = (size2 - size) + abstractC7953d.f15713e;
                m4269i();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f15735b.retainAll(collection);
            if (retainAll) {
                int size2 = this.f15735b.size();
                AbstractC7953d abstractC7953d = AbstractC7953d.this;
                abstractC7953d.f15713e = (size2 - size) + abstractC7953d.f15713e;
                m4269i();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            m4270b();
            return this.f15735b.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            m4270b();
            return this.f15735b.toString();
        }
    }

    /* renamed from: com.google.common.collect.d$k */
    /* loaded from: classes3.dex */
    public class C7968k extends AbstractC7953d<K, V>.C7966j implements List<V> {

        /* renamed from: com.google.common.collect.d$k$a */
        /* loaded from: classes3.dex */
        public class C7969a extends AbstractC7953d<K, V>.C7966j.C7967a implements ListIterator<V> {
            public C7969a() {
                super();
            }

            public C7969a(int i) {
                super(((List) C7968k.this.f15735b).listIterator(i));
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                C7968k c7968k = C7968k.this;
                boolean isEmpty = c7968k.isEmpty();
                m4267b().add(v);
                AbstractC7953d.this.f15713e++;
                if (isEmpty) {
                    c7968k.m4271a();
                }
            }

            /* renamed from: b */
            public final ListIterator<V> m4267b() {
                m4268a();
                return (ListIterator) this.f15739a;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return m4267b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return m4267b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return m4267b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return m4267b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                m4267b().set(v);
            }
        }

        public C7968k(@NullableDecl K k, List<V> list, @NullableDecl AbstractC7953d<K, V>.C7966j c7966j) {
            super(k, list, c7966j);
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            m4270b();
            boolean isEmpty = this.f15735b.isEmpty();
            ((List) this.f15735b).add(i, v);
            AbstractC7953d.this.f15713e++;
            if (isEmpty) {
                m4271a();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f15735b).addAll(i, collection);
            if (addAll) {
                int size2 = this.f15735b.size();
                AbstractC7953d abstractC7953d = AbstractC7953d.this;
                abstractC7953d.f15713e = (size2 - size) + abstractC7953d.f15713e;
                if (size == 0) {
                    m4271a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public final V get(int i) {
            m4270b();
            return (V) ((List) this.f15735b).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            m4270b();
            return ((List) this.f15735b).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            m4270b();
            return ((List) this.f15735b).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            m4270b();
            return new C7969a();
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            m4270b();
            return new C7969a(i);
        }

        @Override // java.util.List
        public final V remove(int i) {
            m4270b();
            V v = (V) ((List) this.f15735b).remove(i);
            AbstractC7953d abstractC7953d = AbstractC7953d.this;
            abstractC7953d.f15713e--;
            m4269i();
            return v;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            m4270b();
            return (V) ((List) this.f15735b).set(i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            m4270b();
            List subList = ((List) this.f15735b).subList(i, i2);
            AbstractC7953d<K, V>.C7966j c7966j = this.f15736c;
            if (c7966j == null) {
                c7966j = this;
            }
            AbstractC7953d abstractC7953d = AbstractC7953d.this;
            abstractC7953d.getClass();
            boolean z = subList instanceof RandomAccess;
            K k = this.f15734a;
            if (z) {
                return new C7963g(abstractC7953d, k, subList, c7966j);
            }
            return new C7968k(k, subList, c7966j);
        }
    }

    public AbstractC7953d(TreeMap treeMap) {
        if (treeMap.isEmpty()) {
            this.f15712d = treeMap;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.common.collect.InterfaceC7977g0
    public final void clear() {
        Map<K, Collection<V>> map = this.f15712d;
        for (Collection<V> collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f15713e = 0;
    }

    @Override // com.google.common.collect.AbstractC7973f
    /* renamed from: e */
    public final java.util.Iterator<V> mo4218e() {
        return new C7954a(this);
    }

    /* renamed from: f */
    public final Collection<V> m4281f() {
        return new AbstractC7973f.C7974a();
    }

    /* renamed from: g */
    public final Collection<V> m4280g() {
        Collection<V> collection = this.f15747b;
        if (collection == null) {
            Collection<V> m4281f = m4281f();
            this.f15747b = m4281f;
            return m4281f;
        }
        return collection;
    }

    @Override // com.google.common.collect.InterfaceC7977g0
    public final int size() {
        return this.f15713e;
    }
}
