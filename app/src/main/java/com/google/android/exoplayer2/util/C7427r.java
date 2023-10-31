package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.util.r */
/* loaded from: classes.dex */
public final class C7427r {

    /* renamed from: a */
    public static final byte[] f13945a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f13946b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f13947c = new Object();

    /* renamed from: d */
    public static int[] f13948d = new int[10];

    /* renamed from: com.google.android.exoplayer2.util.r$a */
    /* loaded from: classes.dex */
    public static final class C7428a {

        /* renamed from: a */
        public final int f13949a;

        /* renamed from: b */
        public final int f13950b;

        /* renamed from: c */
        public final boolean f13951c;

        public C7428a(int i, int i2, boolean z) {
            this.f13949a = i;
            this.f13950b = i2;
            this.f13951c = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.util.r$b */
    /* loaded from: classes.dex */
    public static final class C7429b {

        /* renamed from: a */
        public final int f13952a;

        /* renamed from: b */
        public final int f13953b;

        /* renamed from: c */
        public final int f13954c;

        /* renamed from: d */
        public final int f13955d;

        /* renamed from: e */
        public final int f13956e;

        /* renamed from: f */
        public final int f13957f;

        /* renamed from: g */
        public final float f13958g;

        /* renamed from: h */
        public final boolean f13959h;

        /* renamed from: i */
        public final boolean f13960i;

        /* renamed from: j */
        public final int f13961j;

        /* renamed from: k */
        public final int f13962k;

        /* renamed from: l */
        public final int f13963l;

        /* renamed from: m */
        public final boolean f13964m;

        public C7429b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f13952a = i;
            this.f13953b = i2;
            this.f13954c = i3;
            this.f13955d = i4;
            this.f13956e = i5;
            this.f13957f = i6;
            this.f13958g = f;
            this.f13959h = z;
            this.f13960i = z2;
            this.f13961j = i7;
            this.f13962k = i8;
            this.f13963l = i9;
            this.f13964m = z3;
        }
    }

    /* renamed from: a */
    public static void m5039a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static int m5038b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        C7394a.m5131d(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m5039a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m5039a(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m5039a(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m5039a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
            zArr[2] = bArr[i4] == 0;
            return i2;
        }
    }

    /* renamed from: c */
    public static C7428a m5037c(byte[] bArr, int i) {
        C7437w c7437w = new C7437w(bArr, 3, i);
        c7437w.m4982j(8);
        int m4986f = c7437w.m4986f();
        int m4986f2 = c7437w.m4986f();
        c7437w.m4983i();
        return new C7428a(m4986f, m4986f2, c7437w.m4988d());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.util.C7427r.C7429b m5036d(int r19, byte[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.C7427r.m5036d(int, byte[], int):com.google.android.exoplayer2.util.r$b");
    }

    /* renamed from: e */
    public static int m5035e(int i, byte[] bArr) {
        int i2;
        synchronized (f13947c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f13948d;
                    if (iArr.length <= i4) {
                        f13948d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f13948d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f13948d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
