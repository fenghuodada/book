package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;

/* renamed from: androidx.collection.j */
/* loaded from: classes.dex */
public final class C0483j<E> implements Cloneable {

    /* renamed from: d */
    public static final Object f1532d = new Object();

    /* renamed from: a */
    public int[] f1533a;

    /* renamed from: b */
    public Object[] f1534b;

    /* renamed from: c */
    public int f1535c;

    public C0483j() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f1533a = new int[i4];
        this.f1534b = new Object[i4];
    }

    /* renamed from: a */
    public final void m12396a(int i, E e) {
        int i2 = this.f1535c;
        if (i2 != 0 && i <= this.f1533a[i2 - 1]) {
            m12393d(i, e);
            return;
        }
        if (i2 >= this.f1533a.length) {
            int i3 = (i2 + 1) * 4;
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
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.f1533a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1534b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1533a = iArr;
            this.f1534b = objArr;
        }
        this.f1533a[i2] = i;
        this.f1534b[i2] = e;
        this.f1535c = i2 + 1;
    }

    /* renamed from: b */
    public final C0483j<E> clone() {
        try {
            C0483j<E> c0483j = (C0483j) super.clone();
            c0483j.f1533a = (int[]) this.f1533a.clone();
            c0483j.f1534b = (Object[]) this.f1534b.clone();
            return c0483j;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final Object m12394c(int i, Integer num) {
        Object obj;
        int m12426a = C0473e.m12426a(this.f1535c, i, this.f1533a);
        return (m12426a < 0 || (obj = this.f1534b[m12426a]) == f1532d) ? num : obj;
    }

    /* renamed from: d */
    public final void m12393d(int i, E e) {
        int m12426a = C0473e.m12426a(this.f1535c, i, this.f1533a);
        if (m12426a >= 0) {
            this.f1534b[m12426a] = e;
            return;
        }
        int i2 = ~m12426a;
        int i3 = this.f1535c;
        if (i2 < i3) {
            Object[] objArr = this.f1534b;
            if (objArr[i2] == f1532d) {
                this.f1533a[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (i3 >= this.f1533a.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f1533a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1534b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1533a = iArr;
            this.f1534b = objArr2;
        }
        int i8 = this.f1535c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f1533a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f1534b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f1535c - i2);
        }
        this.f1533a[i2] = i;
        this.f1534b[i2] = e;
        this.f1535c++;
    }

    public final String toString() {
        int i = this.f1535c;
        if (i <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1535c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f1533a[i2]);
            sb.append('=');
            Object obj = this.f1534b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
