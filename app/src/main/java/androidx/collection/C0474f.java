package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* renamed from: androidx.collection.f */
/* loaded from: classes.dex */
public final class C0474f<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f1505e = new Object();

    /* renamed from: a */
    public boolean f1506a = false;

    /* renamed from: b */
    public long[] f1507b;

    /* renamed from: c */
    public Object[] f1508c;

    /* renamed from: d */
    public int f1509d;

    public C0474f() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f1507b = new long[i4];
        this.f1508c = new Object[i4];
    }

    /* renamed from: a */
    public final void m12424a(long j, Long l) {
        int i = this.f1509d;
        if (i != 0 && j <= this.f1507b[i - 1]) {
            m12419g(j, l);
            return;
        }
        if (this.f1506a && i >= this.f1507b.length) {
            m12421d();
        }
        int i2 = this.f1509d;
        if (i2 >= this.f1507b.length) {
            int i3 = (i2 + 1) * 8;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.f1507b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1508c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1507b = jArr;
            this.f1508c = objArr;
        }
        this.f1507b[i2] = j;
        this.f1508c[i2] = l;
        this.f1509d = i2 + 1;
    }

    /* renamed from: b */
    public final void m12423b() {
        int i = this.f1509d;
        Object[] objArr = this.f1508c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1509d = 0;
        this.f1506a = false;
    }

    /* renamed from: c */
    public final C0474f<E> clone() {
        try {
            C0474f<E> c0474f = (C0474f) super.clone();
            c0474f.f1507b = (long[]) this.f1507b.clone();
            c0474f.f1508c = (Object[]) this.f1508c.clone();
            return c0474f;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void m12421d() {
        int i = this.f1509d;
        long[] jArr = this.f1507b;
        Object[] objArr = this.f1508c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1505e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1506a = false;
        this.f1509d = i2;
    }

    /* renamed from: f */
    public final Object m12420f(long j, Long l) {
        Object obj;
        int m12425b = C0473e.m12425b(this.f1507b, this.f1509d, j);
        return (m12425b < 0 || (obj = this.f1508c[m12425b]) == f1505e) ? l : obj;
    }

    /* renamed from: g */
    public final void m12419g(long j, E e) {
        int m12425b = C0473e.m12425b(this.f1507b, this.f1509d, j);
        if (m12425b >= 0) {
            this.f1508c[m12425b] = e;
            return;
        }
        int i = ~m12425b;
        int i2 = this.f1509d;
        if (i < i2) {
            Object[] objArr = this.f1508c;
            if (objArr[i] == f1505e) {
                this.f1507b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f1506a && i2 >= this.f1507b.length) {
            m12421d();
            i = ~C0473e.m12425b(this.f1507b, this.f1509d, j);
        }
        int i3 = this.f1509d;
        if (i3 >= this.f1507b.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f1507b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1508c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1507b = jArr;
            this.f1508c = objArr2;
        }
        int i8 = this.f1509d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f1507b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f1508c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f1509d - i);
        }
        this.f1507b[i] = j;
        this.f1508c[i] = e;
        this.f1509d++;
    }

    /* renamed from: h */
    public final E m12418h(int i) {
        if (this.f1506a) {
            m12421d();
        }
        return (E) this.f1508c[i];
    }

    public final String toString() {
        if (this.f1506a) {
            m12421d();
        }
        int i = this.f1509d;
        if (i <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1509d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f1506a) {
                m12421d();
            }
            sb.append(this.f1507b[i2]);
            sb.append('=');
            E m12418h = m12418h(i2);
            if (m12418h != this) {
                sb.append(m12418h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
