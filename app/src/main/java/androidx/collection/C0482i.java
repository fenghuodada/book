package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: androidx.collection.i */
/* loaded from: classes.dex */
public class C0482i<K, V> {
    @Nullable

    /* renamed from: d */
    public static Object[] f1525d;

    /* renamed from: e */
    public static int f1526e;
    @Nullable

    /* renamed from: f */
    public static Object[] f1527f;

    /* renamed from: g */
    public static int f1528g;

    /* renamed from: a */
    public int[] f1529a;

    /* renamed from: b */
    public Object[] f1530b;

    /* renamed from: c */
    public int f1531c;

    public C0482i() {
        this.f1529a = C0473e.f1502a;
        this.f1530b = C0473e.f1503b;
        this.f1531c = 0;
    }

    public C0482i(int i) {
        if (i == 0) {
            this.f1529a = C0473e.f1502a;
            this.f1530b = C0473e.f1503b;
        } else {
            m12405a(i);
        }
        this.f1531c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0482i(C0482i<K, V> c0482i) {
        this();
        if (c0482i != 0) {
            mo6417i(c0482i);
        }
    }

    /* renamed from: a */
    private void m12405a(int i) {
        if (i == 8) {
            synchronized (C0482i.class) {
                Object[] objArr = f1527f;
                if (objArr != null) {
                    this.f1530b = objArr;
                    f1527f = (Object[]) objArr[0];
                    this.f1529a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1528g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0482i.class) {
                Object[] objArr2 = f1525d;
                if (objArr2 != null) {
                    this.f1530b = objArr2;
                    f1525d = (Object[]) objArr2[0];
                    this.f1529a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1526e--;
                    return;
                }
            }
        }
        this.f1529a = new int[i];
        this.f1530b = new Object[i << 1];
    }

    /* renamed from: c */
    public static void m12403c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0482i.class) {
                if (f1528g < 10) {
                    objArr[0] = f1527f;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1527f = objArr;
                    f1528g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0482i.class) {
                if (f1526e < 10) {
                    objArr[0] = f1525d;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1525d = objArr;
                    f1526e++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m12404b(int i) {
        int i2 = this.f1531c;
        int[] iArr = this.f1529a;
        if (iArr.length < i) {
            Object[] objArr = this.f1530b;
            m12405a(i);
            if (this.f1531c > 0) {
                System.arraycopy(iArr, 0, this.f1529a, 0, i2);
                System.arraycopy(objArr, 0, this.f1530b, 0, i2 << 1);
            }
            m12403c(iArr, objArr, i2);
        }
        if (this.f1531c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f1531c;
        if (i > 0) {
            int[] iArr = this.f1529a;
            Object[] objArr = this.f1530b;
            this.f1529a = C0473e.f1502a;
            this.f1530b = C0473e.f1503b;
            this.f1531c = 0;
            m12403c(iArr, objArr, i);
        }
        if (this.f1531c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(@Nullable Object obj) {
        return m12401e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m12399g(obj) >= 0;
    }

    /* renamed from: d */
    public final int m12402d(int i, Object obj) {
        int i2 = this.f1531c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int m12426a = C0473e.m12426a(i2, i, this.f1529a);
            if (m12426a < 0) {
                return m12426a;
            }
            if (obj.equals(this.f1530b[m12426a << 1])) {
                return m12426a;
            }
            int i3 = m12426a + 1;
            while (i3 < i2 && this.f1529a[i3] == i) {
                if (obj.equals(this.f1530b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m12426a - 1; i4 >= 0 && this.f1529a[i4] == i; i4--) {
                if (obj.equals(this.f1530b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int m12401e(@Nullable Object obj) {
        return obj == null ? m12400f() : m12402d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0482i) {
            C0482i c0482i = (C0482i) obj;
            if (this.f1531c != c0482i.f1531c) {
                return false;
            }
            for (int i = 0; i < this.f1531c; i++) {
                try {
                    K m12398h = m12398h(i);
                    V m12397l = m12397l(i);
                    Object orDefault = c0482i.getOrDefault(m12398h, null);
                    if (m12397l == null) {
                        if (orDefault != null || !c0482i.containsKey(m12398h)) {
                            return false;
                        }
                    } else if (!m12397l.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f1531c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1531c; i2++) {
                try {
                    K m12398h2 = m12398h(i2);
                    V m12397l2 = m12397l(i2);
                    Object obj2 = map.get(m12398h2);
                    if (m12397l2 == null) {
                        if (obj2 != null || !map.containsKey(m12398h2)) {
                            return false;
                        }
                    } else if (!m12397l2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m12400f() {
        int i = this.f1531c;
        if (i == 0) {
            return -1;
        }
        try {
            int m12426a = C0473e.m12426a(i, 0, this.f1529a);
            if (m12426a < 0) {
                return m12426a;
            }
            if (this.f1530b[m12426a << 1] == null) {
                return m12426a;
            }
            int i2 = m12426a + 1;
            while (i2 < i && this.f1529a[i2] == 0) {
                if (this.f1530b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m12426a - 1; i3 >= 0 && this.f1529a[i3] == 0; i3--) {
                if (this.f1530b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final int m12399g(Object obj) {
        int i = this.f1531c * 2;
        Object[] objArr = this.f1530b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    @Nullable
    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v) {
        int m12401e = m12401e(obj);
        return m12401e >= 0 ? (V) this.f1530b[(m12401e << 1) + 1] : v;
    }

    /* renamed from: h */
    public final K m12398h(int i) {
        return (K) this.f1530b[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f1529a;
        Object[] objArr = this.f1530b;
        int i = this.f1531c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public void mo6417i(@NonNull C0482i<? extends K, ? extends V> c0482i) {
        int i = c0482i.f1531c;
        m12404b(this.f1531c + i);
        if (this.f1531c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0482i.m12398h(i2), c0482i.m12397l(i2));
            }
        } else if (i > 0) {
            System.arraycopy(c0482i.f1529a, 0, this.f1529a, 0, i);
            System.arraycopy(c0482i.f1530b, 0, this.f1530b, 0, i << 1);
            this.f1531c = i;
        }
    }

    public final boolean isEmpty() {
        return this.f1531c <= 0;
    }

    /* renamed from: j */
    public V mo6416j(int i) {
        Object[] objArr = this.f1530b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f1531c;
        int i4 = 0;
        if (i3 <= 1) {
            m12403c(this.f1529a, objArr, i3);
            this.f1529a = C0473e.f1502a;
            this.f1530b = C0473e.f1503b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f1529a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f1530b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f1530b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m12405a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f1531c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f1529a, 0, i);
                    System.arraycopy(objArr, 0, this.f1530b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f1529a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f1530b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f1531c) {
            this.f1531c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: k */
    public V mo6415k(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1530b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: l */
    public final V m12397l(int i) {
        return (V) this.f1530b[(i << 1) + 1];
    }

    @Nullable
    public V put(K k, V v) {
        int i;
        int m12402d;
        int i2 = this.f1531c;
        if (k == null) {
            m12402d = m12400f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m12402d = m12402d(hashCode, k);
        }
        if (m12402d >= 0) {
            int i3 = (m12402d << 1) + 1;
            Object[] objArr = this.f1530b;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~m12402d;
        int[] iArr = this.f1529a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f1530b;
            m12405a(i5);
            if (i2 != this.f1531c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1529a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1530b, 0, objArr2.length);
            }
            m12403c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f1529a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f1530b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f1531c - i4) << 1);
        }
        int i7 = this.f1531c;
        if (i2 == i7) {
            int[] iArr4 = this.f1529a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f1530b;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f1531c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        if (orDefault == null) {
            return put(k, v);
        }
        return orDefault;
    }

    @Nullable
    public final V remove(Object obj) {
        int m12401e = m12401e(obj);
        if (m12401e >= 0) {
            return mo6416j(m12401e);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int m12401e = m12401e(obj);
        if (m12401e >= 0) {
            V m12397l = m12397l(m12401e);
            if (obj2 == m12397l || (obj2 != null && obj2.equals(m12397l))) {
                mo6416j(m12401e);
                return true;
            }
            return false;
        }
        return false;
    }

    @Nullable
    public final V replace(K k, V v) {
        int m12401e = m12401e(k);
        if (m12401e >= 0) {
            return mo6415k(m12401e, v);
        }
        return null;
    }

    public final boolean replace(K k, V v, V v2) {
        int m12401e = m12401e(k);
        if (m12401e >= 0) {
            V m12397l = m12397l(m12401e);
            if (m12397l == v || (v != null && v.equals(m12397l))) {
                mo6415k(m12401e, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public final int size() {
        return this.f1531c;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f1531c * 28);
        sb.append('{');
        for (int i = 0; i < this.f1531c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m12398h = m12398h(i);
            if (m12398h != this) {
                sb.append(m12398h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m12397l = m12397l(i);
            if (m12397l != this) {
                sb.append(m12397l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
