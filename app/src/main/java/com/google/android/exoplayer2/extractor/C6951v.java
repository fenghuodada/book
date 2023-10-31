package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.C7394a;

/* renamed from: com.google.android.exoplayer2.extractor.v */
/* loaded from: classes.dex */
public final class C6951v {

    /* renamed from: a */
    public final byte[] f11977a;

    /* renamed from: b */
    public final int f11978b;

    /* renamed from: c */
    public int f11979c;

    /* renamed from: d */
    public int f11980d;

    public C6951v(byte[] bArr) {
        this.f11977a = bArr;
        this.f11978b = bArr.length;
    }

    /* renamed from: a */
    public final boolean m5812a() {
        boolean z = (((this.f11977a[this.f11979c] & 255) >> this.f11980d) & 1) == 1;
        m5810c(1);
        return z;
    }

    /* renamed from: b */
    public final int m5811b(int i) {
        int i2 = this.f11979c;
        int min = Math.min(i, 8 - this.f11980d);
        int i3 = i2 + 1;
        byte[] bArr = this.f11977a;
        int i4 = ((bArr[i2] & 255) >> this.f11980d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (bArr[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m5810c(i);
        return i5;
    }

    /* renamed from: c */
    public final void m5810c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f11979c + i3;
        this.f11979c = i4;
        int i5 = (i - (i3 * 8)) + this.f11980d;
        this.f11980d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f11979c = i4 + 1;
            this.f11980d = i5 - 8;
        }
        int i6 = this.f11979c;
        if (i6 < 0 || (i6 >= (i2 = this.f11978b) && (i6 != i2 || this.f11980d != 0))) {
            z = false;
        }
        C7394a.m5131d(z);
    }
}
