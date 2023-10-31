package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.AbstractC0476h;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.collection.d */
/* loaded from: classes.dex */
public final class C0472d<E> implements Collection<E>, Set<E> {

    /* renamed from: e */
    public static final int[] f1492e = new int[0];

    /* renamed from: f */
    public static final Object[] f1493f = new Object[0];
    @Nullable

    /* renamed from: g */
    public static Object[] f1494g;

    /* renamed from: h */
    public static int f1495h;
    @Nullable

    /* renamed from: i */
    public static Object[] f1496i;

    /* renamed from: j */
    public static int f1497j;

    /* renamed from: a */
    public int[] f1498a;

    /* renamed from: b */
    public Object[] f1499b;

    /* renamed from: c */
    public int f1500c;

    /* renamed from: d */
    public C0471c f1501d;

    public C0472d() {
        this(0);
    }

    public C0472d(int i) {
        if (i == 0) {
            this.f1498a = f1492e;
            this.f1499b = f1493f;
        } else {
            m12431a(i);
        }
        this.f1500c = 0;
    }

    /* renamed from: b */
    public static void m12430b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0472d.class) {
                if (f1497j < 10) {
                    objArr[0] = f1496i;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1496i = objArr;
                    f1497j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0472d.class) {
                if (f1495h < 10) {
                    objArr[0] = f1494g;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1494g = objArr;
                    f1495h++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m12431a(int i) {
        if (i == 8) {
            synchronized (C0472d.class) {
                Object[] objArr = f1496i;
                if (objArr != null) {
                    this.f1499b = objArr;
                    f1496i = (Object[]) objArr[0];
                    this.f1498a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1497j--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0472d.class) {
                Object[] objArr2 = f1494g;
                if (objArr2 != null) {
                    this.f1499b = objArr2;
                    f1494g = (Object[]) objArr2[0];
                    this.f1498a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1495h--;
                    return;
                }
            }
        }
        this.f1498a = new int[i];
        this.f1499b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(@Nullable E e) {
        int i;
        int m12429i;
        if (e == null) {
            m12429i = m12428j();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m12429i = m12429i(hashCode, e);
        }
        if (m12429i >= 0) {
            return false;
        }
        int i2 = ~m12429i;
        int i3 = this.f1500c;
        int[] iArr = this.f1498a;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f1499b;
            m12431a(i4);
            int[] iArr2 = this.f1498a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1499b, 0, objArr.length);
            }
            m12430b(iArr, objArr, this.f1500c);
        }
        int i5 = this.f1500c;
        if (i2 < i5) {
            int[] iArr3 = this.f1498a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f1499b;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f1500c - i2);
        }
        this.f1498a[i2] = i;
        this.f1499b[i2] = e;
        this.f1500c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        int size = collection.size() + this.f1500c;
        int[] iArr = this.f1498a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1499b;
            m12431a(size);
            int i = this.f1500c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f1498a, 0, i);
                System.arraycopy(objArr, 0, this.f1499b, 0, this.f1500c);
            }
            m12430b(iArr, objArr, this.f1500c);
        }
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f1500c;
        if (i != 0) {
            m12430b(this.f1498a, this.f1499b, i);
            this.f1498a = f1492e;
            this.f1499b = f1493f;
            this.f1500c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(@Nullable Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1500c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f1500c; i++) {
                try {
                    if (!set.contains(this.f1499b[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1498a;
        int i = this.f1500c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public final int m12429i(int i, Object obj) {
        int i2 = this.f1500c;
        if (i2 == 0) {
            return -1;
        }
        int m12426a = C0473e.m12426a(i2, i, this.f1498a);
        if (m12426a >= 0 && !obj.equals(this.f1499b[m12426a])) {
            int i3 = m12426a + 1;
            while (i3 < i2 && this.f1498a[i3] == i) {
                if (obj.equals(this.f1499b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m12426a - 1; i4 >= 0 && this.f1498a[i4] == i; i4--) {
                if (obj.equals(this.f1499b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return m12426a;
    }

    public final int indexOf(@Nullable Object obj) {
        return obj == null ? m12428j() : m12429i(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1500c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f1501d == null) {
            this.f1501d = new C0471c(this);
        }
        C0471c c0471c = this.f1501d;
        if (c0471c.f1511b == null) {
            c0471c.f1511b = new AbstractC0476h.C0479c();
        }
        return (Iterator<E>) c0471c.f1511b.iterator();
    }

    /* renamed from: j */
    public final int m12428j() {
        int i = this.f1500c;
        if (i == 0) {
            return -1;
        }
        int m12426a = C0473e.m12426a(i, 0, this.f1498a);
        if (m12426a >= 0 && this.f1499b[m12426a] != null) {
            int i2 = m12426a + 1;
            while (i2 < i && this.f1498a[i2] == 0) {
                if (this.f1499b[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m12426a - 1; i3 >= 0 && this.f1498a[i3] == 0; i3--) {
                if (this.f1499b[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return m12426a;
    }

    /* renamed from: k */
    public final void m12427k(int i) {
        Object[] objArr = this.f1499b;
        Object obj = objArr[i];
        int i2 = this.f1500c;
        if (i2 <= 1) {
            m12430b(this.f1498a, objArr, i2);
            this.f1498a = f1492e;
            this.f1499b = f1493f;
            this.f1500c = 0;
            return;
        }
        int[] iArr = this.f1498a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f1500c = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f1499b;
                System.arraycopy(objArr2, i4, objArr2, i, this.f1500c - i);
            }
            this.f1499b[this.f1500c] = null;
            return;
        }
        m12431a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f1500c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f1498a, 0, i);
            System.arraycopy(objArr, 0, this.f1499b, 0, i);
        }
        int i5 = this.f1500c;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f1498a, i, i5 - i);
            System.arraycopy(objArr, i6, this.f1499b, i, this.f1500c - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(@Nullable Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m12427k(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1500c - 1; i >= 0; i--) {
            if (!collection.contains(this.f1499b[i])) {
                m12427k(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1500c;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public final Object[] toArray() {
        int i = this.f1500c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1499b, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public final <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f1500c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1500c));
        }
        System.arraycopy(this.f1499b, 0, tArr, 0, this.f1500c);
        int length = tArr.length;
        int i = this.f1500c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f1500c * 14);
        sb.append('{');
        for (int i = 0; i < this.f1500c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f1499b[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
