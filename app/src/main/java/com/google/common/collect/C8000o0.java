package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.C7938g;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.o0 */
/* loaded from: classes3.dex */
public final class C8000o0<K, V> extends AbstractC8021u<K, V> {

    /* renamed from: g */
    public static final C8000o0 f15789g = new C8000o0(null, new Object[0], 0);

    /* renamed from: d */
    public final transient int[] f15790d;
    @VisibleForTesting

    /* renamed from: e */
    public final transient Object[] f15791e;

    /* renamed from: f */
    public final transient int f15792f;

    /* renamed from: com.google.common.collect.o0$a */
    /* loaded from: classes3.dex */
    public static class C8001a<K, V> extends AbstractC8031x<Map.Entry<K, V>> {

        /* renamed from: d */
        public final transient AbstractC8021u<K, V> f15793d;

        /* renamed from: e */
        public final transient Object[] f15794e;

        /* renamed from: f */
        public final transient int f15795f = 0;

        /* renamed from: g */
        public final transient int f15796g;

        /* renamed from: com.google.common.collect.o0$a$a */
        /* loaded from: classes3.dex */
        public class C8002a extends AbstractC8013s<Map.Entry<K, V>> {
            public C8002a() {
            }

            @Override // java.util.List
            public final Object get(int i) {
                C8001a c8001a = C8001a.this;
                C7938g.m4288b(i, c8001a.f15796g);
                int i2 = i * 2;
                int i3 = c8001a.f15795f;
                Object[] objArr = c8001a.f15794e;
                return new AbstractMap.SimpleImmutableEntry(objArr[i2 + i3], objArr[i2 + (i3 ^ 1)]);
            }

            @Override // com.google.common.collect.AbstractC8007q
            /* renamed from: m */
            public final boolean mo4224m() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return C8001a.this.f15796g;
            }
        }

        public C8001a(AbstractC8021u abstractC8021u, Object[] objArr, int i) {
            this.f15793d = abstractC8021u;
            this.f15794e = objArr;
            this.f15796g = i;
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: b */
        public final int mo4225b(int i, Object[] objArr) {
            return mo4217a().mo4225b(i, objArr);
        }

        @Override // com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f15793d.get(key));
            }
            return false;
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: m */
        public final boolean mo4224m() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC8031x, com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: n */
        public final AbstractC8032x0<Map.Entry<K, V>> iterator() {
            return mo4217a().listIterator(0);
        }

        @Override // com.google.common.collect.AbstractC8031x
        /* renamed from: r */
        public final AbstractC8013s<Map.Entry<K, V>> mo4214r() {
            return new C8002a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f15796g;
        }
    }

    /* renamed from: com.google.common.collect.o0$b */
    /* loaded from: classes3.dex */
    public static final class C8003b<K> extends AbstractC8031x<K> {

        /* renamed from: d */
        public final transient AbstractC8021u<K, ?> f15798d;

        /* renamed from: e */
        public final transient AbstractC8013s<K> f15799e;

        public C8003b(AbstractC8021u abstractC8021u, C8004c c8004c) {
            this.f15798d = abstractC8021u;
            this.f15799e = c8004c;
        }

        @Override // com.google.common.collect.AbstractC8031x, com.google.common.collect.AbstractC8007q
        /* renamed from: a */
        public final AbstractC8013s<K> mo4217a() {
            return this.f15799e;
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: b */
        public final int mo4225b(int i, Object[] objArr) {
            return this.f15799e.mo4225b(i, objArr);
        }

        @Override // com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@NullableDecl Object obj) {
            return this.f15798d.get(obj) != null;
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: m */
        public final boolean mo4224m() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC8031x, com.google.common.collect.AbstractC8007q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: n */
        public final AbstractC8032x0<K> iterator() {
            return this.f15799e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f15798d.size();
        }
    }

    /* renamed from: com.google.common.collect.o0$c */
    /* loaded from: classes3.dex */
    public static final class C8004c extends AbstractC8013s<Object> {

        /* renamed from: c */
        public final transient Object[] f15800c;

        /* renamed from: d */
        public final transient int f15801d;

        /* renamed from: e */
        public final transient int f15802e;

        public C8004c(Object[] objArr, int i, int i2) {
            this.f15800c = objArr;
            this.f15801d = i;
            this.f15802e = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            C7938g.m4288b(i, this.f15802e);
            return this.f15800c[(i * 2) + this.f15801d];
        }

        @Override // com.google.common.collect.AbstractC8007q
        /* renamed from: m */
        public final boolean mo4224m() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f15802e;
        }
    }

    public C8000o0(int[] iArr, Object[] objArr, int i) {
        this.f15790d = iArr;
        this.f15791e = objArr;
        this.f15792f = i;
    }

    @Override // com.google.common.collect.AbstractC8021u
    /* renamed from: a */
    public final C8001a mo4233a() {
        return new C8001a(this, this.f15791e, this.f15792f);
    }

    @Override // com.google.common.collect.AbstractC8021u
    /* renamed from: b */
    public final C8003b mo4232b() {
        return new C8003b(this, new C8004c(this.f15791e, 0, this.f15792f));
    }

    @Override // com.google.common.collect.AbstractC8021u
    /* renamed from: c */
    public final C8004c mo4231c() {
        return new C8004c(this.f15791e, 1, this.f15792f);
    }

    @Override // com.google.common.collect.AbstractC8021u
    /* renamed from: d */
    public final void mo4230d() {
    }

    @Override // com.google.common.collect.AbstractC8021u, java.util.Map, p060j$.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        Object[] objArr = this.f15791e;
        if (this.f15792f == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        int[] iArr = this.f15790d;
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int m4251a = C8005p.m4251a(obj.hashCode());
        while (true) {
            int i = m4251a & length;
            int i2 = iArr[i];
            if (i2 == -1) {
                return null;
            }
            if (objArr[i2].equals(obj)) {
                return (V) objArr[i2 ^ 1];
            }
            m4251a = i + 1;
        }
    }

    @Override // java.util.Map, p060j$.util.Map
    public final int size() {
        return this.f15792f;
    }
}
