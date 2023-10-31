package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.C7937f;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@GwtIncompatible
/* renamed from: com.google.common.collect.l */
/* loaded from: classes3.dex */
public final class C7986l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: l */
    public static final /* synthetic */ int f15758l = 0;
    @MonotonicNonNullDecl

    /* renamed from: a */
    public transient int[] f15759a;
    @VisibleForTesting
    @MonotonicNonNullDecl

    /* renamed from: b */
    public transient long[] f15760b;
    @VisibleForTesting
    @MonotonicNonNullDecl

    /* renamed from: c */
    public transient Object[] f15761c;
    @VisibleForTesting
    @MonotonicNonNullDecl

    /* renamed from: d */
    public transient Object[] f15762d;

    /* renamed from: e */
    public transient float f15763e;

    /* renamed from: f */
    public transient int f15764f;

    /* renamed from: g */
    public transient int f15765g;

    /* renamed from: h */
    public transient int f15766h;
    @MonotonicNonNullDecl

    /* renamed from: i */
    public transient C7989c f15767i;
    @MonotonicNonNullDecl

    /* renamed from: j */
    public transient C7987a f15768j;
    @MonotonicNonNullDecl

    /* renamed from: k */
    public transient C7991e f15769k;

    /* renamed from: com.google.common.collect.l$a */
    /* loaded from: classes3.dex */
    public class C7987a extends AbstractSet<Map.Entry<K, V>> {
        public C7987a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C7986l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C7986l c7986l = C7986l.this;
            int m4262b = c7986l.m4262b(key);
            if (m4262b == -1 || !C7937f.m4290a(c7986l.f15762d[m4262b], entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            C7986l c7986l = C7986l.this;
            c7986l.getClass();
            return new C7982j(c7986l);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C7986l c7986l = C7986l.this;
                int m4262b = c7986l.m4262b(key);
                if (m4262b != -1 && C7937f.m4290a(c7986l.f15762d[m4262b], entry.getValue())) {
                    C7986l.m4263a(c7986l, m4262b);
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C7986l.this.f15766h;
        }
    }

    /* renamed from: com.google.common.collect.l$b */
    /* loaded from: classes3.dex */
    public abstract class AbstractC7988b<T> implements Iterator<T>, p060j$.util.Iterator {

        /* renamed from: a */
        public int f15771a;

        /* renamed from: b */
        public int f15772b;

        /* renamed from: c */
        public int f15773c;

        public AbstractC7988b() {
            int i;
            this.f15771a = C7986l.this.f15764f;
            if (C7986l.this.isEmpty()) {
                i = -1;
            } else {
                i = 0;
            }
            this.f15772b = i;
            this.f15773c = -1;
        }

        /* renamed from: a */
        public abstract T mo4260a(int i);

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
            return this.f15772b >= 0;
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final T next() {
            C7986l c7986l = C7986l.this;
            if (c7986l.f15764f == this.f15771a) {
                if (hasNext()) {
                    int i = this.f15772b;
                    this.f15773c = i;
                    T mo4260a = mo4260a(i);
                    int i2 = this.f15772b + 1;
                    if (i2 >= c7986l.f15766h) {
                        i2 = -1;
                    }
                    this.f15772b = i2;
                    return mo4260a;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            boolean z;
            C7986l c7986l = C7986l.this;
            int i = c7986l.f15764f;
            int i2 = this.f15771a;
            if (i == i2) {
                int i3 = this.f15773c;
                if (i3 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f15771a = i2 + 1;
                    C7986l.m4263a(c7986l, i3);
                    this.f15772b--;
                    this.f15773c = -1;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: com.google.common.collect.l$c */
    /* loaded from: classes3.dex */
    public class C7989c extends AbstractSet<K> {
        public C7989c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C7986l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return C7986l.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            C7986l c7986l = C7986l.this;
            c7986l.getClass();
            return new C7980i(c7986l);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@NullableDecl Object obj) {
            C7986l c7986l = C7986l.this;
            int m4262b = c7986l.m4262b(obj);
            if (m4262b == -1) {
                return false;
            }
            C7986l.m4263a(c7986l, m4262b);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C7986l.this.f15766h;
        }
    }

    /* renamed from: com.google.common.collect.l$d */
    /* loaded from: classes3.dex */
    public final class C7990d extends AbstractC7971e<K, V> {
        @NullableDecl

        /* renamed from: a */
        public final K f15776a;

        /* renamed from: b */
        public int f15777b;

        public C7990d(int i) {
            this.f15776a = (K) C7986l.this.f15761c[i];
            this.f15777b = i;
        }

        /* renamed from: a */
        public final void m4259a() {
            int i = this.f15777b;
            K k = this.f15776a;
            C7986l c7986l = C7986l.this;
            if (i == -1 || i >= c7986l.f15766h || !C7937f.m4290a(k, c7986l.f15761c[i])) {
                int i2 = C7986l.f15758l;
                this.f15777b = c7986l.m4262b(k);
            }
        }

        @Override // com.google.common.collect.AbstractC7971e, java.util.Map.Entry
        public final K getKey() {
            return this.f15776a;
        }

        @Override // com.google.common.collect.AbstractC7971e, java.util.Map.Entry
        public final V getValue() {
            m4259a();
            int i = this.f15777b;
            if (i == -1) {
                return null;
            }
            return (V) C7986l.this.f15762d[i];
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            m4259a();
            int i = this.f15777b;
            C7986l c7986l = C7986l.this;
            if (i == -1) {
                c7986l.put(this.f15776a, v);
                return null;
            }
            Object[] objArr = c7986l.f15762d;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.l$e */
    /* loaded from: classes3.dex */
    public class C7991e extends AbstractCollection<V> {
        public C7991e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            C7986l.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<V> iterator() {
            C7986l c7986l = C7986l.this;
            c7986l.getClass();
            return new C7984k(c7986l);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return C7986l.this.f15766h;
        }
    }

    public C7986l() {
        int max = Math.max(3, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0f * highestOneBit))) {
            int i = highestOneBit << 1;
            highestOneBit = i <= 0 ? 1073741824 : i;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.f15759a = iArr;
        this.f15763e = 1.0f;
        this.f15761c = new Object[3];
        this.f15762d = new Object[3];
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        this.f15760b = jArr;
        this.f15765g = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    /* renamed from: a */
    public static void m4263a(C7986l c7986l, int i) {
        c7986l.m4261c((int) (c7986l.f15760b[i] >>> 32), c7986l.f15761c[i]);
    }

    /* renamed from: b */
    public final int m4262b(@NullableDecl Object obj) {
        int m4250b = C8005p.m4250b(obj);
        int[] iArr = this.f15759a;
        int i = iArr[(iArr.length - 1) & m4250b];
        while (i != -1) {
            long j = this.f15760b[i];
            if (((int) (j >>> 32)) == m4250b && C7937f.m4290a(obj, this.f15761c[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    @NullableDecl
    /* renamed from: c */
    public final Object m4261c(int i, @NullableDecl Object obj) {
        int[] iArr;
        Object obj2;
        long[] jArr;
        long j;
        int length = (iArr.length - 1) & i;
        int i2 = this.f15759a[length];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f15760b[i2] >>> 32)) == i && C7937f.m4290a(obj, this.f15761c[i2])) {
                Object[] objArr = this.f15762d;
                Object obj3 = objArr[i2];
                if (i3 == -1) {
                    this.f15759a[length] = (int) this.f15760b[i2];
                    obj2 = obj3;
                } else {
                    long[] jArr2 = this.f15760b;
                    obj2 = obj3;
                    jArr2[i3] = (((int) jArr2[i2]) & 4294967295L) | (jArr2[i3] & (-4294967296L));
                }
                int i4 = this.f15766h - 1;
                if (i2 < i4) {
                    Object[] objArr2 = this.f15761c;
                    objArr2[i2] = objArr2[i4];
                    objArr[i2] = objArr[i4];
                    objArr2[i4] = null;
                    objArr[i4] = null;
                    long[] jArr3 = this.f15760b;
                    long j2 = jArr3[i4];
                    jArr3[i2] = j2;
                    jArr3[i4] = -1;
                    int[] iArr2 = this.f15759a;
                    int length2 = ((int) (j2 >>> 32)) & (iArr2.length - 1);
                    int i5 = iArr2[length2];
                    if (i5 == i4) {
                        iArr2[length2] = i2;
                    } else {
                        while (true) {
                            jArr = this.f15760b;
                            j = jArr[i5];
                            int i6 = (int) j;
                            if (i6 == i4) {
                                break;
                            }
                            i5 = i6;
                        }
                        jArr[i5] = (i2 & 4294967295L) | (j & (-4294967296L));
                    }
                } else {
                    this.f15761c[i2] = null;
                    objArr[i2] = null;
                    this.f15760b[i2] = -1;
                }
                this.f15766h--;
                this.f15764f++;
                return obj2;
            }
            int i7 = (int) this.f15760b[i2];
            if (i7 == -1) {
                return null;
            }
            i3 = i2;
            i2 = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f15764f++;
        Arrays.fill(this.f15761c, 0, this.f15766h, (Object) null);
        Arrays.fill(this.f15762d, 0, this.f15766h, (Object) null);
        Arrays.fill(this.f15759a, -1);
        Arrays.fill(this.f15760b, -1L);
        this.f15766h = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return m4262b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.f15766h; i++) {
            if (C7937f.m4290a(obj, this.f15762d[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C7987a c7987a = this.f15768j;
        if (c7987a == null) {
            C7987a c7987a2 = new C7987a();
            this.f15768j = c7987a2;
            return c7987a2;
        }
        return c7987a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        int m4262b = m4262b(obj);
        if (m4262b == -1) {
            return null;
        }
        return (V) this.f15762d[m4262b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.f15766h == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C7989c c7989c = this.f15767i;
        if (c7989c == null) {
            C7989c c7989c2 = new C7989c();
            this.f15767i = c7989c2;
            return c7989c2;
        }
        return c7989c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.f15760b;
        Object[] objArr = this.f15761c;
        Object[] objArr2 = this.f15762d;
        int m4250b = C8005p.m4250b(k);
        int[] iArr = this.f15759a;
        int length = (iArr.length - 1) & m4250b;
        int i = this.f15766h;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) == m4250b && C7937f.m4290a(k, objArr[i2])) {
                    V v2 = (V) objArr2[i2];
                    objArr2[i2] = v;
                    return v2;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = ((-4294967296L) & j) | (i & 4294967295L);
                    break;
                }
                i2 = i3;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i4 = i + 1;
            int length2 = this.f15760b.length;
            if (i4 > length2) {
                int max = Math.max(1, length2 >>> 1) + length2;
                if (max < 0) {
                    max = Integer.MAX_VALUE;
                }
                if (max != length2) {
                    this.f15761c = Arrays.copyOf(this.f15761c, max);
                    this.f15762d = Arrays.copyOf(this.f15762d, max);
                    long[] jArr2 = this.f15760b;
                    int length3 = jArr2.length;
                    long[] copyOf = Arrays.copyOf(jArr2, max);
                    if (max > length3) {
                        Arrays.fill(copyOf, length3, max, -1L);
                    }
                    this.f15760b = copyOf;
                }
            }
            this.f15760b[i] = (m4250b << 32) | 4294967295L;
            this.f15761c[i] = k;
            this.f15762d[i] = v;
            this.f15766h = i4;
            if (i >= this.f15765g) {
                int[] iArr2 = this.f15759a;
                int length4 = iArr2.length * 2;
                if (iArr2.length >= 1073741824) {
                    this.f15765g = Integer.MAX_VALUE;
                } else {
                    int i5 = ((int) (length4 * this.f15763e)) + 1;
                    int[] iArr3 = new int[length4];
                    Arrays.fill(iArr3, -1);
                    long[] jArr3 = this.f15760b;
                    int i6 = length4 - 1;
                    for (int i7 = 0; i7 < this.f15766h; i7++) {
                        int i8 = (int) (jArr3[i7] >>> 32);
                        int i9 = i8 & i6;
                        int i10 = iArr3[i9];
                        iArr3[i9] = i7;
                        jArr3[i7] = (i8 << 32) | (i10 & 4294967295L);
                    }
                    this.f15765g = i5;
                    this.f15759a = iArr3;
                }
            }
            this.f15764f++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        return (V) m4261c(C8005p.m4250b(obj), obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15766h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C7991e c7991e = this.f15769k;
        if (c7991e == null) {
            C7991e c7991e2 = new C7991e();
            this.f15769k = c7991e2;
            return c7991e2;
        }
        return c7991e;
    }
}
