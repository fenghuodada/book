package com.google.android.exoplayer2.audio;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.k0 */
/* loaded from: classes.dex */
public final class C6708k0 {

    /* renamed from: a */
    public final int f10756a;

    /* renamed from: b */
    public final int f10757b;

    /* renamed from: c */
    public final float f10758c;

    /* renamed from: d */
    public final float f10759d;

    /* renamed from: e */
    public final float f10760e;

    /* renamed from: f */
    public final int f10761f;

    /* renamed from: g */
    public final int f10762g;

    /* renamed from: h */
    public final int f10763h;

    /* renamed from: i */
    public final short[] f10764i;

    /* renamed from: j */
    public short[] f10765j;

    /* renamed from: k */
    public int f10766k;

    /* renamed from: l */
    public short[] f10767l;

    /* renamed from: m */
    public int f10768m;

    /* renamed from: n */
    public short[] f10769n;

    /* renamed from: o */
    public int f10770o;

    /* renamed from: p */
    public int f10771p;

    /* renamed from: q */
    public int f10772q;

    /* renamed from: r */
    public int f10773r;

    /* renamed from: s */
    public int f10774s;

    /* renamed from: t */
    public int f10775t;

    /* renamed from: u */
    public int f10776u;

    /* renamed from: v */
    public int f10777v;

    public C6708k0(int i, int i2, float f, float f2, int i3) {
        this.f10756a = i;
        this.f10757b = i2;
        this.f10758c = f;
        this.f10759d = f2;
        this.f10760e = i / i3;
        this.f10761f = i / 400;
        int i4 = i / 65;
        this.f10762g = i4;
        int i5 = i4 * 2;
        this.f10763h = i5;
        this.f10764i = new short[i5];
        this.f10765j = new short[i5 * i2];
        this.f10767l = new short[i5 * i2];
        this.f10769n = new short[i5 * i2];
    }

    /* renamed from: d */
    public static void m6053d(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void m6056a(short[] sArr, int i, int i2) {
        int i3 = this.f10763h / i2;
        int i4 = this.f10757b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f10764i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: b */
    public final short[] m6055b(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f10757b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: c */
    public final int m6054c(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f10757b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f10776u = i6 / i7;
        this.f10777v = i8 / i5;
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6052e() {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C6708k0.m6052e():void");
    }
}
