package androidx.datastore.preferences.protobuf;

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

/* renamed from: androidx.datastore.preferences.protobuf.k1 */
/* loaded from: classes.dex */
public class C1203k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    public static final /* synthetic */ int f3017g = 0;

    /* renamed from: a */
    public final int f3018a;

    /* renamed from: d */
    public boolean f3021d;

    /* renamed from: e */
    public volatile C1203k1<K, V>.C1209d f3022e;

    /* renamed from: b */
    public List<C1203k1<K, V>.C1207b> f3019b = Collections.emptyList();

    /* renamed from: c */
    public Map<K, V> f3020c = Collections.emptyMap();

    /* renamed from: f */
    public Map<K, V> f3023f = Collections.emptyMap();

    /* renamed from: androidx.datastore.preferences.protobuf.k1$a */
    /* loaded from: classes.dex */
    public static class C1204a {

        /* renamed from: a */
        public static final C1205a f3024a = new C1205a();

        /* renamed from: b */
        public static final C1206b f3025b = new C1206b();

        /* renamed from: androidx.datastore.preferences.protobuf.k1$a$a */
        /* loaded from: classes.dex */
        public static class C1205a implements Iterator<Object>, p060j$.util.Iterator {
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

        /* renamed from: androidx.datastore.preferences.protobuf.k1$a$b */
        /* loaded from: classes.dex */
        public static class C1206b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final java.util.Iterator<Object> iterator() {
                return C1204a.f3024a;
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k1$b */
    /* loaded from: classes.dex */
    public class C1207b implements Map.Entry<K, V>, Comparable<C1203k1<K, V>.C1207b> {

        /* renamed from: a */
        public final K f3026a;

        /* renamed from: b */
        public V f3027b;

        public C1207b() {
            throw null;
        }

        public C1207b(K k, V v) {
            this.f3026a = k;
            this.f3027b = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f3026a.compareTo(((C1207b) obj).f3026a);
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
            K k = this.f3026a;
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
                V v = this.f3027b;
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
            return this.f3026a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f3027b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f3026a;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f3027b;
            return (v != null ? v.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = C1203k1.f3017g;
            C1203k1.this.m11014b();
            V v2 = this.f3027b;
            this.f3027b = v;
            return v2;
        }

        public final String toString() {
            return this.f3026a + "=" + this.f3027b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k1$c */
    /* loaded from: classes.dex */
    public class C1208c implements java.util.Iterator<Map.Entry<K, V>>, p060j$.util.Iterator {

        /* renamed from: a */
        public int f3029a = -1;

        /* renamed from: b */
        public boolean f3030b;

        /* renamed from: c */
        public java.util.Iterator<Map.Entry<K, V>> f3031c;

        public C1208c() {
        }

        /* renamed from: a */
        public final java.util.Iterator<Map.Entry<K, V>> m11006a() {
            if (this.f3031c == null) {
                this.f3031c = C1203k1.this.f3020c.entrySet().iterator();
            }
            return this.f3031c;
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
            int i = this.f3029a + 1;
            C1203k1 c1203k1 = C1203k1.this;
            if (i < c1203k1.f3019b.size()) {
                return true;
            }
            if (!c1203k1.f3020c.isEmpty() && m11006a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final Object next() {
            Map.Entry<K, V> next;
            this.f3030b = true;
            int i = this.f3029a + 1;
            this.f3029a = i;
            C1203k1 c1203k1 = C1203k1.this;
            if (i < c1203k1.f3019b.size()) {
                next = c1203k1.f3019b.get(this.f3029a);
            } else {
                next = m11006a().next();
            }
            return next;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            if (this.f3030b) {
                this.f3030b = false;
                int i = C1203k1.f3017g;
                C1203k1 c1203k1 = C1203k1.this;
                c1203k1.m11014b();
                if (this.f3029a < c1203k1.f3019b.size()) {
                    int i2 = this.f3029a;
                    this.f3029a = i2 - 1;
                    c1203k1.m11007i(i2);
                    return;
                }
                m11006a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k1$d */
    /* loaded from: classes.dex */
    public class C1209d extends AbstractSet<Map.Entry<K, V>> {
        public C1209d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                Object value = entry.getValue();
                C1203k1.this.put((Comparable) entry.getKey(), value);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C1203k1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C1203k1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C1208c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C1203k1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C1203k1.this.size();
        }
    }

    public C1203k1(int i) {
        this.f3018a = i;
    }

    /* renamed from: a */
    public final int m11015a(K k) {
        int size = this.f3019b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f3019b.get(size).f3026a);
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
            int compareTo2 = k.compareTo(this.f3019b.get(i2).f3026a);
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
    public final void m11014b() {
        if (this.f3021d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Map.Entry<K, V> m11013c(int i) {
        return this.f3019b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m11014b();
        if (!this.f3019b.isEmpty()) {
            this.f3019b.clear();
        }
        if (this.f3020c.isEmpty()) {
            return;
        }
        this.f3020c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m11015a(comparable) >= 0 || this.f3020c.containsKey(comparable);
    }

    /* renamed from: d */
    public final int m11012d() {
        return this.f3019b.size();
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> m11011e() {
        return this.f3020c.isEmpty() ? C1204a.f3025b : this.f3020c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f3022e == null) {
            this.f3022e = new C1209d();
        }
        return this.f3022e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1203k1) {
            C1203k1 c1203k1 = (C1203k1) obj;
            int size = size();
            if (size != c1203k1.size()) {
                return false;
            }
            int m11012d = m11012d();
            if (m11012d != c1203k1.m11012d()) {
                return entrySet().equals(c1203k1.entrySet());
            }
            for (int i = 0; i < m11012d; i++) {
                if (!m11013c(i).equals(c1203k1.m11013c(i))) {
                    return false;
                }
            }
            if (m11012d != size) {
                return this.f3020c.equals(c1203k1.f3020c);
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final SortedMap<K, V> m11010f() {
        m11014b();
        if (this.f3020c.isEmpty() && !(this.f3020c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3020c = treeMap;
            this.f3023f = treeMap.descendingMap();
        }
        return (SortedMap) this.f3020c;
    }

    /* renamed from: g */
    public void mo11009g() {
        if (this.f3021d) {
            return;
        }
        this.f3020c = this.f3020c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3020c);
        this.f3023f = this.f3023f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3023f);
        this.f3021d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m11015a = m11015a(comparable);
        if (m11015a >= 0) {
            return this.f3019b.get(m11015a).f3027b;
        }
        return this.f3020c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h */
    public final V put(K k, V v) {
        m11014b();
        int m11015a = m11015a(k);
        if (m11015a >= 0) {
            return this.f3019b.get(m11015a).setValue(v);
        }
        m11014b();
        boolean isEmpty = this.f3019b.isEmpty();
        int i = this.f3018a;
        if (isEmpty && !(this.f3019b instanceof ArrayList)) {
            this.f3019b = new ArrayList(i);
        }
        int i2 = -(m11015a + 1);
        if (i2 >= i) {
            return m11010f().put(k, v);
        }
        if (this.f3019b.size() == i) {
            C1203k1<K, V>.C1207b remove = this.f3019b.remove(i - 1);
            m11010f().put(remove.f3026a, remove.f3027b);
        }
        this.f3019b.add(i2, new C1207b(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m11012d = m11012d();
        int i = 0;
        for (int i2 = 0; i2 < m11012d; i2++) {
            i += this.f3019b.get(i2).hashCode();
        }
        if (this.f3020c.size() > 0) {
            return i + this.f3020c.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final V m11007i(int i) {
        m11014b();
        V v = this.f3019b.remove(i).f3027b;
        if (!this.f3020c.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = m11010f().entrySet().iterator();
            List<C1203k1<K, V>.C1207b> list = this.f3019b;
            Map.Entry<K, V> next = it.next();
            list.add(new C1207b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m11014b();
        Comparable comparable = (Comparable) obj;
        int m11015a = m11015a(comparable);
        if (m11015a >= 0) {
            return (V) m11007i(m11015a);
        }
        if (this.f3020c.isEmpty()) {
            return null;
        }
        return this.f3020c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3020c.size() + this.f3019b.size();
    }
}
