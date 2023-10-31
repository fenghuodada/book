package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.internal.b */
/* loaded from: classes.dex */
public class C0450b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    public C0453c<K, V> f1445a;

    /* renamed from: b */
    public C0453c<K, V> f1446b;

    /* renamed from: c */
    public final WeakHashMap<AbstractC0456f<K, V>, Boolean> f1447c = new WeakHashMap<>();

    /* renamed from: d */
    public int f1448d = 0;

    /* renamed from: androidx.arch.core.internal.b$a */
    /* loaded from: classes.dex */
    public static class C0451a<K, V> extends AbstractC0455e<K, V> {
        public C0451a(C0453c<K, V> c0453c, C0453c<K, V> c0453c2) {
            super(c0453c, c0453c2);
        }

        @Override // androidx.arch.core.internal.C0450b.AbstractC0455e
        /* renamed from: b */
        public final C0453c<K, V> mo12443b(C0453c<K, V> c0453c) {
            return c0453c.f1452d;
        }

        @Override // androidx.arch.core.internal.C0450b.AbstractC0455e
        /* renamed from: c */
        public final C0453c<K, V> mo12442c(C0453c<K, V> c0453c) {
            return c0453c.f1451c;
        }
    }

    /* renamed from: androidx.arch.core.internal.b$b */
    /* loaded from: classes.dex */
    public static class C0452b<K, V> extends AbstractC0455e<K, V> {
        public C0452b(C0453c<K, V> c0453c, C0453c<K, V> c0453c2) {
            super(c0453c, c0453c2);
        }

        @Override // androidx.arch.core.internal.C0450b.AbstractC0455e
        /* renamed from: b */
        public final C0453c<K, V> mo12443b(C0453c<K, V> c0453c) {
            return c0453c.f1451c;
        }

        @Override // androidx.arch.core.internal.C0450b.AbstractC0455e
        /* renamed from: c */
        public final C0453c<K, V> mo12442c(C0453c<K, V> c0453c) {
            return c0453c.f1452d;
        }
    }

    /* renamed from: androidx.arch.core.internal.b$c */
    /* loaded from: classes.dex */
    public static class C0453c<K, V> implements Map.Entry<K, V> {
        @NonNull

        /* renamed from: a */
        public final K f1449a;
        @NonNull

        /* renamed from: b */
        public final V f1450b;

        /* renamed from: c */
        public C0453c<K, V> f1451c;

        /* renamed from: d */
        public C0453c<K, V> f1452d;

        public C0453c(@NonNull K k, @NonNull V v) {
            this.f1449a = k;
            this.f1450b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0453c) {
                C0453c c0453c = (C0453c) obj;
                return this.f1449a.equals(c0453c.f1449a) && this.f1450b.equals(c0453c.f1450b);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final K getKey() {
            return this.f1449a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final V getValue() {
            return this.f1450b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f1449a.hashCode() ^ this.f1450b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f1449a + "=" + this.f1450b;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.arch.core.internal.b$d */
    /* loaded from: classes.dex */
    public class C0454d extends AbstractC0456f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public C0453c<K, V> f1453a;

        /* renamed from: b */
        public boolean f1454b = true;

        public C0454d() {
        }

        @Override // androidx.arch.core.internal.C0450b.AbstractC0456f
        /* renamed from: a */
        public final void mo12441a(@NonNull C0453c<K, V> c0453c) {
            C0453c<K, V> c0453c2 = this.f1453a;
            if (c0453c == c0453c2) {
                C0453c<K, V> c0453c3 = c0453c2.f1452d;
                this.f1453a = c0453c3;
                this.f1454b = c0453c3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f1454b) {
                return C0450b.this.f1445a != null;
            }
            C0453c<K, V> c0453c = this.f1453a;
            return (c0453c == null || c0453c.f1451c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            C0453c<K, V> c0453c;
            if (this.f1454b) {
                this.f1454b = false;
                c0453c = C0450b.this.f1445a;
            } else {
                C0453c<K, V> c0453c2 = this.f1453a;
                c0453c = c0453c2 != null ? c0453c2.f1451c : null;
            }
            this.f1453a = c0453c;
            return c0453c;
        }
    }

    /* renamed from: androidx.arch.core.internal.b$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0455e<K, V> extends AbstractC0456f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public C0453c<K, V> f1456a;

        /* renamed from: b */
        public C0453c<K, V> f1457b;

        public AbstractC0455e(C0453c<K, V> c0453c, C0453c<K, V> c0453c2) {
            this.f1456a = c0453c2;
            this.f1457b = c0453c;
        }

        @Override // androidx.arch.core.internal.C0450b.AbstractC0456f
        /* renamed from: a */
        public final void mo12441a(@NonNull C0453c<K, V> c0453c) {
            C0453c<K, V> c0453c2 = null;
            if (this.f1456a == c0453c && c0453c == this.f1457b) {
                this.f1457b = null;
                this.f1456a = null;
            }
            C0453c<K, V> c0453c3 = this.f1456a;
            if (c0453c3 == c0453c) {
                this.f1456a = mo12443b(c0453c3);
            }
            C0453c<K, V> c0453c4 = this.f1457b;
            if (c0453c4 == c0453c) {
                C0453c<K, V> c0453c5 = this.f1456a;
                if (c0453c4 != c0453c5 && c0453c5 != null) {
                    c0453c2 = mo12442c(c0453c4);
                }
                this.f1457b = c0453c2;
            }
        }

        /* renamed from: b */
        public abstract C0453c<K, V> mo12443b(C0453c<K, V> c0453c);

        /* renamed from: c */
        public abstract C0453c<K, V> mo12442c(C0453c<K, V> c0453c);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1457b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            C0453c<K, V> c0453c;
            C0453c<K, V> c0453c2 = this.f1457b;
            C0453c<K, V> c0453c3 = this.f1456a;
            if (c0453c2 != c0453c3 && c0453c3 != null) {
                c0453c = mo12442c(c0453c2);
            } else {
                c0453c = null;
            }
            this.f1457b = c0453c;
            return c0453c2;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.arch.core.internal.b$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0456f<K, V> {
        /* renamed from: a */
        public abstract void mo12441a(@NonNull C0453c<K, V> c0453c);
    }

    @Nullable
    /* renamed from: a */
    public C0453c<K, V> mo12446a(K k) {
        C0453c<K, V> c0453c = this.f1445a;
        while (c0453c != null && !c0453c.f1449a.equals(k)) {
            c0453c = c0453c.f1451c;
        }
        return c0453c;
    }

    /* renamed from: b */
    public V mo12445b(@NonNull K k, @NonNull V v) {
        C0453c<K, V> mo12446a = mo12446a(k);
        if (mo12446a != null) {
            return mo12446a.f1450b;
        }
        C0453c<K, V> c0453c = new C0453c<>(k, v);
        this.f1448d++;
        C0453c<K, V> c0453c2 = this.f1446b;
        if (c0453c2 == null) {
            this.f1445a = c0453c;
        } else {
            c0453c2.f1451c = c0453c;
            c0453c.f1452d = c0453c2;
        }
        this.f1446b = c0453c;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((androidx.arch.core.internal.C0450b.AbstractC0455e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof androidx.arch.core.internal.C0450b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.arch.core.internal.b r7 = (androidx.arch.core.internal.C0450b) r7
            int r1 = r6.f1448d
            int r3 = r7.f1448d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            androidx.arch.core.internal.b$e r3 = (androidx.arch.core.internal.C0450b.AbstractC0455e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            androidx.arch.core.internal.b$e r4 = (androidx.arch.core.internal.C0450b.AbstractC0455e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            androidx.arch.core.internal.b$e r7 = (androidx.arch.core.internal.C0450b.AbstractC0455e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.arch.core.internal.C0450b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            AbstractC0455e abstractC0455e = (AbstractC0455e) it;
            if (!abstractC0455e.hasNext()) {
                return i;
            }
            i += ((Map.Entry) abstractC0455e.next()).hashCode();
        }
    }

    /* renamed from: i */
    public V mo12444i(@NonNull K k) {
        C0453c<K, V> mo12446a = mo12446a(k);
        if (mo12446a == null) {
            return null;
        }
        this.f1448d--;
        WeakHashMap<AbstractC0456f<K, V>, Boolean> weakHashMap = this.f1447c;
        if (!weakHashMap.isEmpty()) {
            for (AbstractC0456f<K, V> abstractC0456f : weakHashMap.keySet()) {
                abstractC0456f.mo12441a(mo12446a);
            }
        }
        C0453c<K, V> c0453c = mo12446a.f1452d;
        C0453c<K, V> c0453c2 = mo12446a.f1451c;
        if (c0453c != null) {
            c0453c.f1451c = c0453c2;
        } else {
            this.f1445a = c0453c2;
        }
        C0453c<K, V> c0453c3 = mo12446a.f1451c;
        if (c0453c3 != null) {
            c0453c3.f1452d = c0453c;
        } else {
            this.f1446b = c0453c;
        }
        mo12446a.f1451c = null;
        mo12446a.f1452d = null;
        return mo12446a.f1450b;
    }

    @Override // java.lang.Iterable
    @NonNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        C0451a c0451a = new C0451a(this.f1445a, this.f1446b);
        this.f1447c.put(c0451a, Boolean.FALSE);
        return c0451a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            AbstractC0455e abstractC0455e = (AbstractC0455e) it;
            if (!abstractC0455e.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) abstractC0455e.next()).toString());
            if (abstractC0455e.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
