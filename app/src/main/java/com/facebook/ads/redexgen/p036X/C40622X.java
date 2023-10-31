package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2X */
/* loaded from: assets/audience_network.dex */
public final class C40622X<E> implements Cloneable {
    public static byte[] A04;
    public static final Object A05;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{19, 79, 83, 82, 72, 27, 118, 90, 75, 18, 91, 87, 51, 53};
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C40622X() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C40622X(int i) {
        this.A01 = false;
        if (i == 0) {
            this.A02 = C40612W.A01;
            this.A03 = C40612W.A02;
        } else {
            int A00 = C40612W.A00(i);
            this.A02 = new long[A00];
            this.A03 = new Object[A00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i) {
        if (this.A01) {
            A04();
        }
        return this.A02[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* renamed from: A01 */
    public final C40622X<E> clone() {
        C40622X<E> c40622x = null;
        try {
            c40622x = (C40622X) super.clone();
            c40622x.A02 = (long[]) this.A02.clone();
            c40622x.A03 = (Object[]) this.A03.clone();
            return c40622x;
        } catch (CloneNotSupportedException unused) {
            return c40622x;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final E A02(long j, E e) {
        int A03 = C40612W.A03(this.A02, this.A00, j);
        if (A03 >= 0) {
            Object[] objArr = this.A03;
            if (objArr[A03] != A05) {
                return (E) objArr[A03];
            }
        }
        return e;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int o = this.A00;
        int i = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < o; i2++) {
            Object obj = objArr[i2];
            if (obj != A05) {
                if (i2 != i) {
                    jArr[i] = jArr[i2];
                    objArr[i] = obj;
                    objArr[i2] = null;
                }
                i++;
            }
        }
        this.A01 = false;
        this.A00 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j) {
        return A02(j, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i) {
        Object[] objArr = this.A03;
        Object obj = objArr[i];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.A01 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0B(long j, E e) {
        int A03 = C40612W.A03(this.A02, this.A00, j);
        if (A03 >= 0) {
            this.A03[A03] = e;
            return;
        }
        int i = A03 ^ (-1);
        if (i < this.A00) {
            Object[] objArr = this.A03;
            if (objArr[i] == A05) {
                this.A02[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.A01 && this.A00 >= this.A02.length) {
            A04();
            i = C40612W.A03(this.A02, this.A00, j) ^ (-1);
        }
        int i2 = this.A00;
        if (i2 >= this.A02.length) {
            int A00 = C40612W.A00(i2 + 1);
            long[] jArr = new long[A00];
            Object[] objArr2 = new Object[A00];
            long[] jArr2 = this.A02;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr;
            this.A03 = objArr2;
        }
        int i3 = this.A00;
        if (i3 - i != 0) {
            long[] jArr3 = this.A02;
            System.arraycopy(jArr3, i, jArr3, i + 1, i3 - i);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i, objArr4, i + 1, this.A00 - i);
        }
        this.A02[i] = j;
        this.A03[i] = e;
        this.A00++;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2X != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.A06()
            if (r0 > 0) goto L10
            r2 = 12
            r1 = 2
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            return r0
        L10:
            int r0 = r5.A00
            int r0 = r0 * 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            r4 = 0
        L1f:
            int r0 = r5.A00
            if (r4 >= r0) goto L56
            if (r4 <= 0) goto L31
            r2 = 10
            r1 = 2
            r0 = 65
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
        L31:
            long r0 = r5.A00(r4)
            r3.append(r0)
            r0 = 61
            r3.append(r0)
            java.lang.Object r0 = r5.A07(r4)
            if (r0 == r5) goto L49
            r3.append(r0)
        L46:
            int r4 = r4 + 1
            goto L1f
        L49:
            r2 = 0
            r1 = 10
            r0 = 13
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            goto L46
        L56:
            r0 = 125(0x7d, float:1.75E-43)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C40622X.toString():java.lang.String");
    }
}
