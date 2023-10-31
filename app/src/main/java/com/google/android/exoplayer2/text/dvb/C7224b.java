package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7435u;

/* renamed from: com.google.android.exoplayer2.text.dvb.b */
/* loaded from: classes.dex */
public final class C7224b {

    /* renamed from: h */
    public static final byte[] f13100h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f13101i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f13102j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f13103a;

    /* renamed from: b */
    public final Paint f13104b;

    /* renamed from: c */
    public final Canvas f13105c;

    /* renamed from: d */
    public final C7226b f13106d;

    /* renamed from: e */
    public final C7225a f13107e;

    /* renamed from: f */
    public final C7232h f13108f;

    /* renamed from: g */
    public Bitmap f13109g;

    /* renamed from: com.google.android.exoplayer2.text.dvb.b$a */
    /* loaded from: classes.dex */
    public static final class C7225a {

        /* renamed from: a */
        public final int f13110a;

        /* renamed from: b */
        public final int[] f13111b;

        /* renamed from: c */
        public final int[] f13112c;

        /* renamed from: d */
        public final int[] f13113d;

        public C7225a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f13110a = i;
            this.f13111b = iArr;
            this.f13112c = iArr2;
            this.f13113d = iArr3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.dvb.b$b */
    /* loaded from: classes.dex */
    public static final class C7226b {

        /* renamed from: a */
        public final int f13114a;

        /* renamed from: b */
        public final int f13115b;

        /* renamed from: c */
        public final int f13116c;

        /* renamed from: d */
        public final int f13117d;

        /* renamed from: e */
        public final int f13118e;

        /* renamed from: f */
        public final int f13119f;

        public C7226b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f13114a = i;
            this.f13115b = i2;
            this.f13116c = i3;
            this.f13117d = i4;
            this.f13118e = i5;
            this.f13119f = i6;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.dvb.b$c */
    /* loaded from: classes.dex */
    public static final class C7227c {

        /* renamed from: a */
        public final int f13120a;

        /* renamed from: b */
        public final boolean f13121b;

        /* renamed from: c */
        public final byte[] f13122c;

        /* renamed from: d */
        public final byte[] f13123d;

        public C7227c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f13120a = i;
            this.f13121b = z;
            this.f13122c = bArr;
            this.f13123d = bArr2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.dvb.b$d */
    /* loaded from: classes.dex */
    public static final class C7228d {

        /* renamed from: a */
        public final int f13124a;

        /* renamed from: b */
        public final int f13125b;

        /* renamed from: c */
        public final SparseArray<C7229e> f13126c;

        public C7228d(int i, int i2, SparseArray sparseArray) {
            this.f13124a = i;
            this.f13125b = i2;
            this.f13126c = sparseArray;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.dvb.b$e */
    /* loaded from: classes.dex */
    public static final class C7229e {

        /* renamed from: a */
        public final int f13127a;

        /* renamed from: b */
        public final int f13128b;

        public C7229e(int i, int i2) {
            this.f13127a = i;
            this.f13128b = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.dvb.b$f */
    /* loaded from: classes.dex */
    public static final class C7230f {

        /* renamed from: a */
        public final int f13129a;

        /* renamed from: b */
        public final boolean f13130b;

        /* renamed from: c */
        public final int f13131c;

        /* renamed from: d */
        public final int f13132d;

        /* renamed from: e */
        public final int f13133e;

        /* renamed from: f */
        public final int f13134f;

        /* renamed from: g */
        public final int f13135g;

        /* renamed from: h */
        public final int f13136h;

        /* renamed from: i */
        public final int f13137i;

        /* renamed from: j */
        public final SparseArray<C7231g> f13138j;

        public C7230f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.f13129a = i;
            this.f13130b = z;
            this.f13131c = i2;
            this.f13132d = i3;
            this.f13133e = i4;
            this.f13134f = i5;
            this.f13135g = i6;
            this.f13136h = i7;
            this.f13137i = i8;
            this.f13138j = sparseArray;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.dvb.b$g */
    /* loaded from: classes.dex */
    public static final class C7231g {

        /* renamed from: a */
        public final int f13139a;

        /* renamed from: b */
        public final int f13140b;

        public C7231g(int i, int i2) {
            this.f13139a = i;
            this.f13140b = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.dvb.b$h */
    /* loaded from: classes.dex */
    public static final class C7232h {

        /* renamed from: a */
        public final int f13141a;

        /* renamed from: b */
        public final int f13142b;

        /* renamed from: c */
        public final SparseArray<C7230f> f13143c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C7225a> f13144d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C7227c> f13145e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C7225a> f13146f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C7227c> f13147g = new SparseArray<>();
        @Nullable

        /* renamed from: h */
        public C7226b f13148h;
        @Nullable

        /* renamed from: i */
        public C7228d f13149i;

        public C7232h(int i, int i2) {
            this.f13141a = i;
            this.f13142b = i2;
        }
    }

    public C7224b(int i, int i2) {
        Paint paint = new Paint();
        this.f13103a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f13104b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f13105c = new Canvas();
        this.f13106d = new C7226b(719, 575, 0, 719, 0, 575);
        this.f13107e = new C7225a(0, new int[]{0, -1, -16777216, -8421505}, m5343a(), m5342b());
        this.f13108f = new C7232h(i, i2);
    }

    /* renamed from: a */
    public static int[] m5343a() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m5341c(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m5341c(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: b */
    public static int[] m5342b() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m5341c(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m5341c(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m5341c(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m5341c(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m5341c(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: c */
    public static int m5341c(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d3 A[LOOP:3: B:85:0x0155->B:117:0x01d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0130 A[LOOP:2: B:38:0x009d->B:72:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5340d(byte[] r23, int[] r24, int r25, int r26, int r27, @androidx.annotation.Nullable android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.dvb.C7224b.m5340d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public static C7225a m5339e(C7435u c7435u, int i) {
        int[] iArr;
        int m5026f;
        int i2;
        int m5026f2;
        int i3;
        int i4 = 8;
        int m5026f3 = c7435u.m5026f(8);
        c7435u.m5020l(8);
        int i5 = i - 2;
        int i6 = 4;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] m5343a = m5343a();
        int[] m5342b = m5342b();
        while (i5 > 0) {
            int m5026f4 = c7435u.m5026f(i4);
            int m5026f5 = c7435u.m5026f(i4);
            int i7 = i5 - 2;
            if ((m5026f5 & 128) != 0) {
                iArr = iArr2;
            } else if ((m5026f5 & 64) != 0) {
                iArr = m5343a;
            } else {
                iArr = m5342b;
            }
            if ((m5026f5 & 1) != 0) {
                m5026f2 = c7435u.m5026f(i4);
                i3 = c7435u.m5026f(i4);
                m5026f = c7435u.m5026f(i4);
                i2 = c7435u.m5026f(i4);
                i5 = i7 - 4;
            } else {
                int m5026f6 = c7435u.m5026f(i6) << i6;
                int m5026f7 = c7435u.m5026f(2) << 6;
                i5 = i7 - 2;
                m5026f = c7435u.m5026f(i6) << i6;
                i2 = m5026f7;
                m5026f2 = c7435u.m5026f(6) << 2;
                i3 = m5026f6;
            }
            if (m5026f2 == 0) {
                i2 = 255;
                i3 = 0;
                m5026f = 0;
            }
            double d = m5026f2;
            double d2 = i3 - 128;
            double d3 = m5026f - 128;
            iArr[m5026f4] = m5341c((byte) (255 - (i2 & 255)), C7408g0.m5099g((int) ((1.402d * d2) + d), 0, 255), C7408g0.m5099g((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), C7408g0.m5099g((int) ((d3 * 1.772d) + d), 0, 255));
            iArr2 = iArr2;
            m5026f3 = m5026f3;
            i4 = 8;
            i6 = 4;
        }
        return new C7225a(m5026f3, iArr2, m5343a, m5342b);
    }

    /* renamed from: f */
    public static C7227c m5338f(C7435u c7435u) {
        byte[] bArr;
        int m5026f = c7435u.m5026f(16);
        c7435u.m5020l(4);
        int m5026f2 = c7435u.m5026f(2);
        boolean m5027e = c7435u.m5027e();
        c7435u.m5020l(1);
        byte[] bArr2 = C7408g0.f13910f;
        if (m5026f2 == 1) {
            c7435u.m5020l(c7435u.m5026f(8) * 16);
        } else if (m5026f2 == 0) {
            int m5026f3 = c7435u.m5026f(16);
            int m5026f4 = c7435u.m5026f(16);
            if (m5026f3 > 0) {
                bArr2 = new byte[m5026f3];
                c7435u.m5024h(bArr2, m5026f3);
            }
            if (m5026f4 > 0) {
                bArr = new byte[m5026f4];
                c7435u.m5024h(bArr, m5026f4);
                return new C7227c(m5026f, m5027e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C7227c(m5026f, m5027e, bArr2, bArr);
    }
}
