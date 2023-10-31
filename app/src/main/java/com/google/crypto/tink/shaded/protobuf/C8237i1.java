package com.google.crypto.tink.shaded.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i1 */
/* loaded from: classes3.dex */
public class C8237i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    public static final /* synthetic */ int f16006g = 0;

    /* renamed from: a */
    public final int f16007a;

    /* renamed from: d */
    public boolean f16010d;

    /* renamed from: e */
    public volatile C8237i1<K, V>.C8243d f16011e;

    /* renamed from: b */
    public List<C8237i1<K, V>.C8241b> f16008b = Collections.emptyList();

    /* renamed from: c */
    public Map<K, V> f16009c = Collections.emptyMap();

    /* renamed from: f */
    public Map<K, V> f16012f = Collections.emptyMap();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i1$a */
    /* loaded from: classes3.dex */
    public static class C8238a {

        /* renamed from: a */
        public static final C8239a f16013a = new C8239a();

        /* renamed from: b */
        public static final C8240b f16014b = new C8240b();

        /* renamed from: com.google.crypto.tink.shaded.protobuf.i1$a$a */
        /* loaded from: classes3.dex */
        public class C8239a implements Iterator<Object>, p060j$.util.Iterator {
            @Override // p060j$.util.Iterator
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator
            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
                Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.i1$a$b */
        /* loaded from: classes3.dex */
        public class C8240b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final java.util.Iterator<Object> iterator() {
                return C8238a.f16013a;
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i1$b */
    /* loaded from: classes3.dex */
    public class C8241b implements Map.Entry<K, V>, Comparable<C8237i1<K, V>.C8241b> {

        /* renamed from: a */
        public final K f16015a;

        /* renamed from: b */
        public V f16016b;

        public C8241b() {
            throw null;
        }

        public C8241b(K k, V v) {
            this.f16015a = k;
            this.f16016b = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f16015a.compareTo(((C8241b) obj).f16015a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k = this.f16015a;
            if (k == null) {
                if (key == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = k.equals(key);
            }
            if (equals) {
                V v = this.f16016b;
                Object value = entry.getValue();
                if (v == null) {
                    if (value == null) {
                        equals2 = true;
                    } else {
                        equals2 = false;
                    }
                } else {
                    equals2 = v.equals(value);
                }
                if (equals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f16015a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f16016b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f16015a;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f16016b;
            return (v != null ? v.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = C8237i1.f16006g;
            C8237i1.this.m3805b();
            V v2 = this.f16016b;
            this.f16016b = v;
            return v2;
        }

        public final String toString() {
            return this.f16015a + "=" + this.f16016b;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i1$c */
    /* loaded from: classes3.dex */
    public class C8242c implements java.util.Iterator<Map.Entry<K, V>>, p060j$.util.Iterator {

        /* renamed from: a */
        public int f16018a = -1;

        /* renamed from: b */
        public boolean f16019b;

        /* renamed from: c */
        public java.util.Iterator<Map.Entry<K, V>> f16020c;

        public C8242c() {
        }

        /* renamed from: a */
        public final java.util.Iterator<Map.Entry<K, V>> m3797a() {
            if (this.f16020c == null) {
                this.f16020c = C8237i1.this.f16009c.entrySet().iterator();
            }
            return this.f16020c;
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
            int i = this.f16018a + 1;
            C8237i1 c8237i1 = C8237i1.this;
            if (i < c8237i1.f16008b.size()) {
                return true;
            }
            if (!c8237i1.f16009c.isEmpty() && m3797a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            Map.Entry<K, V> next;
            this.f16019b = true;
            int i = this.f16018a + 1;
            this.f16018a = i;
            C8237i1 c8237i1 = C8237i1.this;
            if (i < c8237i1.f16008b.size()) {
                next = c8237i1.f16008b.get(this.f16018a);
            } else {
                next = m3797a().next();
            }
            return next;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            if (this.f16019b) {
                this.f16019b = false;
                int i = C8237i1.f16006g;
                C8237i1 c8237i1 = C8237i1.this;
                c8237i1.m3805b();
                if (this.f16018a < c8237i1.f16008b.size()) {
                    int i2 = this.f16018a;
                    this.f16018a = i2 - 1;
                    c8237i1.m3798i(i2);
                    return;
                }
                m3797a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i1$d */
    /* loaded from: classes3.dex */
    public class C8243d extends AbstractSet<Map.Entry<K, V>> {
        public C8243d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                Object value = entry.getValue();
                C8237i1.this.put((Comparable) entry.getKey(), value);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C8237i1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C8237i1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C8242c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C8237i1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C8237i1.this.size();
        }
    }

    public C8237i1(int i) {
        this.f16007a = i;
    }

    /* renamed from: a */
    public final int m3806a(K k) {
        int size = this.f16008b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f16008b.get(size).f16015a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f16008b.get(i2).f16015a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    public final void m3805b() {
        if (this.f16010d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Map.Entry<K, V> m3804c(int i) {
        return this.f16008b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3805b();
        if (!this.f16008b.isEmpty()) {
            this.f16008b.clear();
        }
        if (this.f16009c.isEmpty()) {
            return;
        }
        this.f16009c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3806a(comparable) >= 0 || this.f16009c.containsKey(comparable);
    }

    /* renamed from: d */
    public final int m3803d() {
        return this.f16008b.size();
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> m3802e() {
        return this.f16009c.isEmpty() ? C8238a.f16014b : this.f16009c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f16011e == null) {
            this.f16011e = new C8243d();
        }
        return this.f16011e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8237i1) {
            C8237i1 c8237i1 = (C8237i1) obj;
            int size = size();
            if (size != c8237i1.size()) {
                return false;
            }
            int m3803d = m3803d();
            if (m3803d != c8237i1.m3803d()) {
                return entrySet().equals(c8237i1.entrySet());
            }
            for (int i = 0; i < m3803d; i++) {
                if (!m3804c(i).equals(c8237i1.m3804c(i))) {
                    return false;
                }
            }
            if (m3803d != size) {
                return this.f16009c.equals(c8237i1.f16009c);
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final SortedMap<K, V> m3801f() {
        m3805b();
        if (this.f16009c.isEmpty() && !(this.f16009c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16009c = treeMap;
            this.f16012f = treeMap.descendingMap();
        }
        return (SortedMap) this.f16009c;
    }

    /* renamed from: g */
    public void mo3800g() {
        if (this.f16010d) {
            return;
        }
        this.f16009c = this.f16009c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16009c);
        this.f16012f = this.f16012f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16012f);
        this.f16010d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m3806a = m3806a(comparable);
        if (m3806a >= 0) {
            return this.f16008b.get(m3806a).f16016b;
        }
        return this.f16009c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h */
    public final V put(K k, V v) {
        m3805b();
        int m3806a = m3806a(k);
        if (m3806a >= 0) {
            return this.f16008b.get(m3806a).setValue(v);
        }
        m3805b();
        boolean isEmpty = this.f16008b.isEmpty();
        int i = this.f16007a;
        if (isEmpty && !(this.f16008b instanceof ArrayList)) {
            this.f16008b = new ArrayList(i);
        }
        int i2 = -(m3806a + 1);
        if (i2 >= i) {
            return m3801f().put(k, v);
        }
        if (this.f16008b.size() == i) {
            C8237i1<K, V>.C8241b remove = this.f16008b.remove(i - 1);
            m3801f().put(remove.f16015a, remove.f16016b);
        }
        this.f16008b.add(i2, new C8241b(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m3803d = m3803d();
        int i = 0;
        for (int i2 = 0; i2 < m3803d; i2++) {
            i += this.f16008b.get(i2).hashCode();
        }
        if (this.f16009c.size() > 0) {
            return i + this.f16009c.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final V m3798i(int i) {
        m3805b();
        V v = this.f16008b.remove(i).f16016b;
        if (!this.f16009c.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = m3801f().entrySet().iterator();
            List<C8237i1<K, V>.C8241b> list = this.f16008b;
            Map.Entry<K, V> next = it.next();
            list.add(new C8241b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m3805b();
        Comparable comparable = (Comparable) obj;
        int m3806a = m3806a(comparable);
        if (m3806a >= 0) {
            return (V) m3798i(m3806a);
        }
        if (this.f16009c.isEmpty()) {
            return null;
        }
        return this.f16009c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16009c.size() + this.f16008b.size();
    }
}
