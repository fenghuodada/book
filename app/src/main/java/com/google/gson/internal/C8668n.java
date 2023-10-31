package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: com.google.gson.internal.n */
/* loaded from: classes3.dex */
public final class C8668n<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h */
    public static final C8669a f16459h = new C8669a();

    /* renamed from: a */
    public final Comparator<? super K> f16460a;

    /* renamed from: b */
    public C8675e<K, V> f16461b;

    /* renamed from: c */
    public int f16462c;

    /* renamed from: d */
    public int f16463d;

    /* renamed from: e */
    public final C8675e<K, V> f16464e;

    /* renamed from: f */
    public C8668n<K, V>.C8670b f16465f;

    /* renamed from: g */
    public C8668n<K, V>.C8672c f16466g;

    /* renamed from: com.google.gson.internal.n$a */
    /* loaded from: classes3.dex */
    public class C8669a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.n$b */
    /* loaded from: classes3.dex */
    public class C8670b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.n$b$a */
        /* loaded from: classes3.dex */
        public class C8671a extends C8668n<K, V>.AbstractC8674d<Map.Entry<K, V>> {
            public C8671a(C8670b c8670b) {
                super();
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final Object next() {
                return m3243a();
            }
        }

        public C8670b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C8668n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C8668n.this.m3249b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C8671a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C8668n c8668n;
            C8675e<K, V> m3249b;
            if ((obj instanceof Map.Entry) && (m3249b = (c8668n = C8668n.this).m3249b((Map.Entry) obj)) != null) {
                c8668n.m3247d(m3249b, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C8668n.this.f16462c;
        }
    }

    /* renamed from: com.google.gson.internal.n$c */
    /* loaded from: classes3.dex */
    public final class C8672c extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.n$c$a */
        /* loaded from: classes3.dex */
        public class C8673a extends C8668n<K, V>.AbstractC8674d<K> {
            public C8673a(C8672c c8672c) {
                super();
            }

            @Override // java.util.Iterator, p060j$.util.Iterator
            public final K next() {
                return m3243a().f16478f;
            }
        }

        public C8672c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C8668n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return C8668n.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new C8673a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                com.google.gson.internal.n r0 = com.google.gson.internal.C8668n.this
                r0.getClass()
                r1 = 0
                if (r4 == 0) goto Ld
                com.google.gson.internal.n$e r4 = r0.m3250a(r4, r1)     // Catch: java.lang.ClassCastException -> Ld
                goto Le
            Ld:
                r4 = 0
            Le:
                r2 = 1
                if (r4 == 0) goto L14
                r0.m3247d(r4, r2)
            L14:
                if (r4 == 0) goto L17
                r1 = r2
            L17:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C8668n.C8672c.remove(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C8668n.this.f16462c;
        }
    }

    /* renamed from: com.google.gson.internal.n$d */
    /* loaded from: classes3.dex */
    public abstract class AbstractC8674d<T> implements Iterator<T>, p060j$.util.Iterator {

        /* renamed from: a */
        public C8675e<K, V> f16469a;

        /* renamed from: b */
        public C8675e<K, V> f16470b = null;

        /* renamed from: c */
        public int f16471c;

        public AbstractC8674d() {
            this.f16469a = C8668n.this.f16464e.f16476d;
            this.f16471c = C8668n.this.f16463d;
        }

        /* renamed from: a */
        public final C8675e<K, V> m3243a() {
            C8675e<K, V> c8675e = this.f16469a;
            C8668n c8668n = C8668n.this;
            if (c8675e != c8668n.f16464e) {
                if (c8668n.f16463d == this.f16471c) {
                    this.f16469a = c8675e.f16476d;
                    this.f16470b = c8675e;
                    return c8675e;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
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
            return this.f16469a != C8668n.this.f16464e;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            C8675e<K, V> c8675e = this.f16470b;
            if (c8675e == null) {
                throw new IllegalStateException();
            }
            C8668n c8668n = C8668n.this;
            c8668n.m3247d(c8675e, true);
            this.f16470b = null;
            this.f16471c = c8668n.f16463d;
        }
    }

    /* renamed from: com.google.gson.internal.n$e */
    /* loaded from: classes3.dex */
    public static final class C8675e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public C8675e<K, V> f16473a;

        /* renamed from: b */
        public C8675e<K, V> f16474b;

        /* renamed from: c */
        public C8675e<K, V> f16475c;

        /* renamed from: d */
        public C8675e<K, V> f16476d;

        /* renamed from: e */
        public C8675e<K, V> f16477e;

        /* renamed from: f */
        public final K f16478f;

        /* renamed from: g */
        public V f16479g;

        /* renamed from: h */
        public int f16480h;

        public C8675e() {
            this.f16478f = null;
            this.f16477e = this;
            this.f16476d = this;
        }

        public C8675e(C8675e<K, V> c8675e, K k, C8675e<K, V> c8675e2, C8675e<K, V> c8675e3) {
            this.f16473a = c8675e;
            this.f16478f = k;
            this.f16480h = 1;
            this.f16476d = c8675e2;
            this.f16477e = c8675e3;
            c8675e3.f16476d = this;
            c8675e2.f16477e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f16478f;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.f16479g;
                Object value = entry.getValue();
                if (v == null) {
                    if (value != null) {
                        return false;
                    }
                } else if (!v.equals(value)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f16478f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f16479g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f16478f;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f16479g;
            return (v != null ? v.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.f16479g;
            this.f16479g = v;
            return v2;
        }

        public final String toString() {
            return this.f16478f + "=" + this.f16479g;
        }
    }

    public C8668n() {
        C8669a c8669a = f16459h;
        this.f16462c = 0;
        this.f16463d = 0;
        this.f16464e = new C8675e<>();
        this.f16460a = c8669a;
    }

    /* renamed from: a */
    public final C8675e<K, V> m3250a(K k, boolean z) {
        int i;
        C8675e<K, V> c8675e;
        C8675e<K, V> c8675e2 = this.f16461b;
        C8669a c8669a = f16459h;
        Comparator<? super K> comparator = this.f16460a;
        if (c8675e2 != null) {
            Comparable comparable = comparator == c8669a ? (Comparable) k : null;
            while (true) {
                Object obj = (K) c8675e2.f16478f;
                i = comparable != null ? comparable.compareTo(obj) : comparator.compare(k, obj);
                if (i == 0) {
                    return c8675e2;
                }
                C8675e<K, V> c8675e3 = i < 0 ? c8675e2.f16474b : c8675e2.f16475c;
                if (c8675e3 == null) {
                    break;
                }
                c8675e2 = c8675e3;
            }
        } else {
            i = 0;
        }
        if (z) {
            C8675e<K, V> c8675e4 = this.f16464e;
            if (c8675e2 != null) {
                c8675e = new C8675e<>(c8675e2, k, c8675e4, c8675e4.f16477e);
                if (i < 0) {
                    c8675e2.f16474b = c8675e;
                } else {
                    c8675e2.f16475c = c8675e;
                }
                m3248c(c8675e2, true);
            } else if (comparator == c8669a && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            } else {
                c8675e = new C8675e<>(c8675e2, k, c8675e4, c8675e4.f16477e);
                this.f16461b = c8675e;
            }
            this.f16462c++;
            this.f16463d++;
            return c8675e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.internal.C8668n.C8675e<K, V> m3249b(java.util.Map.Entry<?, ?> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            com.google.gson.internal.n$e r0 = r5.m3250a(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L28
            V r3 = r0.f16479g
            java.lang.Object r6 = r6.getValue()
            r4 = 1
            if (r3 == r6) goto L24
            if (r3 == 0) goto L22
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = r1
            goto L25
        L24:
            r6 = r4
        L25:
            if (r6 == 0) goto L28
            r1 = r4
        L28:
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C8668n.m3249b(java.util.Map$Entry):com.google.gson.internal.n$e");
    }

    /* renamed from: c */
    public final void m3248c(C8675e<K, V> c8675e, boolean z) {
        while (c8675e != null) {
            C8675e<K, V> c8675e2 = c8675e.f16474b;
            C8675e<K, V> c8675e3 = c8675e.f16475c;
            int i = c8675e2 != null ? c8675e2.f16480h : 0;
            int i2 = c8675e3 != null ? c8675e3.f16480h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C8675e<K, V> c8675e4 = c8675e3.f16474b;
                C8675e<K, V> c8675e5 = c8675e3.f16475c;
                int i4 = (c8675e4 != null ? c8675e4.f16480h : 0) - (c8675e5 != null ? c8675e5.f16480h : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m3244g(c8675e3);
                }
                m3245f(c8675e);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C8675e<K, V> c8675e6 = c8675e2.f16474b;
                C8675e<K, V> c8675e7 = c8675e2.f16475c;
                int i5 = (c8675e6 != null ? c8675e6.f16480h : 0) - (c8675e7 != null ? c8675e7.f16480h : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m3245f(c8675e2);
                }
                m3244g(c8675e);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c8675e.f16480h = i + 1;
                if (z) {
                    return;
                }
            } else {
                c8675e.f16480h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c8675e = c8675e.f16473a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f16461b = null;
        this.f16462c = 0;
        this.f16463d++;
        C8675e<K, V> c8675e = this.f16464e;
        c8675e.f16477e = c8675e;
        c8675e.f16476d = c8675e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[ORIG_RETURN, RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            com.google.gson.internal.n$e r2 = r1.m3250a(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C8668n.containsKey(java.lang.Object):boolean");
    }

    /* renamed from: d */
    public final void m3247d(C8675e<K, V> c8675e, boolean z) {
        C8675e<K, V> c8675e2;
        C8675e<K, V> c8675e3;
        int i;
        if (z) {
            C8675e<K, V> c8675e4 = c8675e.f16477e;
            c8675e4.f16476d = c8675e.f16476d;
            c8675e.f16476d.f16477e = c8675e4;
        }
        C8675e<K, V> c8675e5 = c8675e.f16474b;
        C8675e<K, V> c8675e6 = c8675e.f16475c;
        C8675e<K, V> c8675e7 = c8675e.f16473a;
        int i2 = 0;
        if (c8675e5 != null && c8675e6 != null) {
            if (c8675e5.f16480h > c8675e6.f16480h) {
                do {
                    c8675e3 = c8675e5;
                    c8675e5 = c8675e5.f16475c;
                } while (c8675e5 != null);
            } else {
                do {
                    c8675e2 = c8675e6;
                    c8675e6 = c8675e6.f16474b;
                } while (c8675e6 != null);
                c8675e3 = c8675e2;
            }
            m3247d(c8675e3, false);
            C8675e<K, V> c8675e8 = c8675e.f16474b;
            if (c8675e8 != null) {
                i = c8675e8.f16480h;
                c8675e3.f16474b = c8675e8;
                c8675e8.f16473a = c8675e3;
                c8675e.f16474b = null;
            } else {
                i = 0;
            }
            C8675e<K, V> c8675e9 = c8675e.f16475c;
            if (c8675e9 != null) {
                i2 = c8675e9.f16480h;
                c8675e3.f16475c = c8675e9;
                c8675e9.f16473a = c8675e3;
                c8675e.f16475c = null;
            }
            c8675e3.f16480h = Math.max(i, i2) + 1;
            m3246e(c8675e, c8675e3);
            return;
        }
        if (c8675e5 != null) {
            m3246e(c8675e, c8675e5);
            c8675e.f16474b = null;
        } else if (c8675e6 != null) {
            m3246e(c8675e, c8675e6);
            c8675e.f16475c = null;
        } else {
            m3246e(c8675e, null);
        }
        m3248c(c8675e7, false);
        this.f16462c--;
        this.f16463d++;
    }

    /* renamed from: e */
    public final void m3246e(C8675e<K, V> c8675e, C8675e<K, V> c8675e2) {
        C8675e<K, V> c8675e3 = c8675e.f16473a;
        c8675e.f16473a = null;
        if (c8675e2 != null) {
            c8675e2.f16473a = c8675e3;
        }
        if (c8675e3 == null) {
            this.f16461b = c8675e2;
        } else if (c8675e3.f16474b == c8675e) {
            c8675e3.f16474b = c8675e2;
        } else {
            c8675e3.f16475c = c8675e2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C8668n<K, V>.C8670b c8670b = this.f16465f;
        if (c8670b != null) {
            return c8670b;
        }
        C8668n<K, V>.C8670b c8670b2 = new C8670b();
        this.f16465f = c8670b2;
        return c8670b2;
    }

    /* renamed from: f */
    public final void m3245f(C8675e<K, V> c8675e) {
        C8675e<K, V> c8675e2 = c8675e.f16474b;
        C8675e<K, V> c8675e3 = c8675e.f16475c;
        C8675e<K, V> c8675e4 = c8675e3.f16474b;
        C8675e<K, V> c8675e5 = c8675e3.f16475c;
        c8675e.f16475c = c8675e4;
        if (c8675e4 != null) {
            c8675e4.f16473a = c8675e;
        }
        m3246e(c8675e, c8675e3);
        c8675e3.f16474b = c8675e;
        c8675e.f16473a = c8675e3;
        int max = Math.max(c8675e2 != null ? c8675e2.f16480h : 0, c8675e4 != null ? c8675e4.f16480h : 0) + 1;
        c8675e.f16480h = max;
        c8675e3.f16480h = Math.max(max, c8675e5 != null ? c8675e5.f16480h : 0) + 1;
    }

    /* renamed from: g */
    public final void m3244g(C8675e<K, V> c8675e) {
        C8675e<K, V> c8675e2 = c8675e.f16474b;
        C8675e<K, V> c8675e3 = c8675e.f16475c;
        C8675e<K, V> c8675e4 = c8675e2.f16474b;
        C8675e<K, V> c8675e5 = c8675e2.f16475c;
        c8675e.f16474b = c8675e5;
        if (c8675e5 != null) {
            c8675e5.f16473a = c8675e;
        }
        m3246e(c8675e, c8675e2);
        c8675e2.f16475c = c8675e;
        c8675e.f16473a = c8675e2;
        int max = Math.max(c8675e3 != null ? c8675e3.f16480h : 0, c8675e5 != null ? c8675e5.f16480h : 0) + 1;
        c8675e.f16480h = max;
        c8675e2.f16480h = Math.max(max, c8675e4 != null ? c8675e4.f16480h : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.n$e r3 = r2.m3250a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            V r0 = r3.f16479g
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C8668n.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C8668n<K, V>.C8672c c8672c = this.f16466g;
        if (c8672c != null) {
            return c8672c;
        }
        C8668n<K, V>.C8672c c8672c2 = new C8672c();
        this.f16466g = c8672c2;
        return c8672c2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k != null) {
            C8675e<K, V> m3250a = m3250a(k, true);
            V v2 = m3250a.f16479g;
            m3250a.f16479g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.n$e r3 = r2.m3250a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.m3247d(r3, r1)
        L10:
            if (r3 == 0) goto L14
            V r0 = r3.f16479g
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C8668n.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16462c;
    }
}
