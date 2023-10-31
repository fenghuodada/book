package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractC8007q;
import com.google.common.collect.C8000o0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p060j$.util.Map;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Function;

@GwtCompatible(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.u */
/* loaded from: classes3.dex */
public abstract class AbstractC8021u<K, V> implements Map<K, V>, Serializable, p060j$.util.Map {
    @LazyInit

    /* renamed from: a */
    public transient AbstractC8031x<Map.Entry<K, V>> f15826a;
    @RetainedWith
    @LazyInit

    /* renamed from: b */
    public transient AbstractC8031x<K> f15827b;
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    public transient AbstractC8007q<V> f15828c;

    /* renamed from: com.google.common.collect.u$a */
    /* loaded from: classes3.dex */
    public static class C8022a<K, V> {

        /* renamed from: a */
        public Object[] f15829a;

        /* renamed from: b */
        public int f15830b = 0;

        public C8022a(int i) {
            this.f15829a = new Object[i * 2];
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
            r5[r10] = r8;
            r2 = r2 + 1;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.common.collect.C8000o0 m4229a() {
            /*
                r13 = this;
                int r0 = r13.f15830b
                java.lang.Object[] r1 = r13.f15829a
                if (r0 != 0) goto La
                com.google.common.collect.o0 r0 = com.google.common.collect.C8000o0.f15789g
                goto L9b
            La:
                com.google.common.collect.o0 r2 = com.google.common.collect.C8000o0.f15789g
                r2 = 0
                r3 = 1
                r4 = 0
                if (r0 != r3) goto L1f
                r0 = r1[r2]
                r2 = r1[r3]
                com.google.common.collect.C7978h.m4266a(r0, r2)
                com.google.common.collect.o0 r0 = new com.google.common.collect.o0
                r0.<init>(r4, r1, r3)
                goto L9b
            L1f:
                int r5 = r1.length
                int r5 = r5 >> r3
                com.google.common.base.C7938g.m4287c(r0, r5)
                int r5 = com.google.common.collect.AbstractC8031x.m4216o(r0)
                if (r0 != r3) goto L32
                r2 = r1[r2]
                r3 = r1[r3]
                com.google.common.collect.C7978h.m4266a(r2, r3)
                goto L95
            L32:
                int r4 = r5 + (-1)
                int[] r5 = new int[r5]
                r6 = -1
                java.util.Arrays.fill(r5, r6)
            L3a:
                if (r2 >= r0) goto L94
                int r7 = r2 * 2
                int r8 = r7 + 0
                r9 = r1[r8]
                int r7 = r7 + r3
                r7 = r1[r7]
                com.google.common.collect.C7978h.m4266a(r9, r7)
                int r10 = r9.hashCode()
                int r10 = com.google.common.collect.C8005p.m4251a(r10)
            L50:
                r10 = r10 & r4
                r11 = r5[r10]
                if (r11 != r6) goto L5a
                r5[r10] = r8
                int r2 = r2 + 1
                goto L3a
            L5a:
                r12 = r1[r11]
                boolean r12 = r12.equals(r9)
                if (r12 != 0) goto L65
                int r10 = r10 + 1
                goto L50
            L65:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r4 = "Multiple entries with same key: "
                r2.<init>(r4)
                r2.append(r9)
                java.lang.String r4 = "="
                r2.append(r4)
                r2.append(r7)
                java.lang.String r5 = " and "
                r2.append(r5)
                r5 = r1[r11]
                r2.append(r5)
                r2.append(r4)
                r3 = r3 ^ r11
                r1 = r1[r3]
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L94:
                r4 = r5
            L95:
                com.google.common.collect.o0 r2 = new com.google.common.collect.o0
                r2.<init>(r4, r1, r0)
                r0 = r2
            L9b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractC8021u.C8022a.m4229a():com.google.common.collect.o0");
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final void m4228b(Object obj, Object obj2) {
            int i = (this.f15830b + 1) * 2;
            Object[] objArr = this.f15829a;
            if (i > objArr.length) {
                this.f15829a = Arrays.copyOf(objArr, AbstractC8007q.AbstractC8009b.m4249a(objArr.length, i));
            }
            C7978h.m4266a(obj, obj2);
            Object[] objArr2 = this.f15829a;
            int i2 = this.f15830b;
            int i3 = i2 * 2;
            objArr2[i3] = obj;
            objArr2[i3 + 1] = obj2;
            this.f15830b = i2 + 1;
        }
    }

    /* renamed from: a */
    public abstract C8000o0.C8001a mo4233a();

    /* renamed from: b */
    public abstract C8000o0.C8003b mo4232b();

    /* renamed from: c */
    public abstract C8000o0.C8004c mo4231c();

    @Override // java.util.Map, p060j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        C8000o0.C8004c c8004c = this.f15828c;
        if (c8004c == null) {
            c8004c = mo4231c();
            this.f15828c = c8004c;
        }
        return c8004c.contains(obj);
    }

    /* renamed from: d */
    public abstract void mo4230d();

    @Override // java.util.Map, p060j$.util.Map
    public final Set entrySet() {
        AbstractC8031x<Map.Entry<K, V>> abstractC8031x = this.f15826a;
        if (abstractC8031x == null) {
            C8000o0.C8001a mo4233a = mo4233a();
            this.f15826a = mo4233a;
            return mo4233a;
        }
        return abstractC8031x;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p060j$.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map, p060j$.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final int hashCode() {
        C8000o0.C8001a c8001a = this.f15826a;
        if (c8001a == null) {
            c8001a = mo4233a();
            this.f15826a = c8001a;
        }
        return C8023u0.m4227a(c8001a);
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Set keySet() {
        AbstractC8031x<K> abstractC8031x = this.f15827b;
        if (abstractC8031x == null) {
            C8000o0.C8003b mo4232b = mo4232b();
            this.f15827b = mo4232b;
            return mo4232b;
        }
        return abstractC8031x;
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p060j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p060j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p060j$.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p060j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p060j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p060j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final String toString() {
        int size = size();
        C7978h.m4265b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Collection values() {
        AbstractC8007q<V> abstractC8007q = this.f15828c;
        if (abstractC8007q == null) {
            C8000o0.C8004c mo4231c = mo4231c();
            this.f15828c = mo4231c;
            return mo4231c;
        }
        return abstractC8007q;
    }
}
