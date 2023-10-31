package io.reactivex.rxjava3.internal.util;

/* renamed from: io.reactivex.rxjava3.internal.util.b */
/* loaded from: classes3.dex */
public final class C10233b<T> {

    /* renamed from: a */
    public int f20564a;

    /* renamed from: b */
    public int f20565b;

    /* renamed from: c */
    public int f20566c;

    /* renamed from: d */
    public T[] f20567d;

    public C10233b() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.f20564a = numberOfLeadingZeros - 1;
        this.f20566c = (int) (numberOfLeadingZeros * 0.75f);
        this.f20567d = (T[]) new Object[numberOfLeadingZeros];
    }

    /* renamed from: a */
    public final void m1190a(Object obj) {
        T t;
        Object obj2;
        Object[] objArr = this.f20567d;
        int i = this.f20564a;
        int hashCode = obj.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        Object obj3 = objArr[i2];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj2 = objArr[i2];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return;
        }
        objArr[i2] = obj;
        int i3 = this.f20565b + 1;
        this.f20565b = i3;
        if (i3 >= this.f20566c) {
            T[] tArr = this.f20567d;
            int length = tArr.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            T[] tArr2 = (T[]) new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 != 0) {
                    do {
                        length--;
                        t = tArr[length];
                    } while (t == null);
                    int hashCode2 = t.hashCode() * (-1640531527);
                    int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                    if (tArr2[i7] != null) {
                        do {
                            i7 = (i7 + 1) & i5;
                        } while (tArr2[i7] != null);
                    }
                    tArr2[i7] = tArr[length];
                    i3 = i6;
                } else {
                    this.f20564a = i5;
                    this.f20566c = (int) (i4 * 0.75f);
                    this.f20567d = tArr2;
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1189b(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.f20565b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i > i3) {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < i5 && i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
