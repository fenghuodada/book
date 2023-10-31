package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import com.google.common.base.C7935d;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.google.android.exoplayer2.util.v */
/* loaded from: classes.dex */
public final class C7436v {

    /* renamed from: a */
    public byte[] f13978a;

    /* renamed from: b */
    public int f13979b;

    /* renamed from: c */
    public int f13980c;

    public C7436v() {
        this.f13978a = C7408g0.f13910f;
    }

    public C7436v(int i) {
        this.f13978a = new byte[i];
        this.f13980c = i;
    }

    public C7436v(byte[] bArr) {
        this.f13978a = bArr;
        this.f13980c = bArr.length;
    }

    public C7436v(byte[] bArr, int i) {
        this.f13978a = bArr;
        this.f13980c = i;
    }

    /* renamed from: A */
    public final void m5018A(int i) {
        m4992z(this.f13979b + i);
    }

    /* renamed from: a */
    public final void m5017a(int i) {
        byte[] bArr = this.f13978a;
        if (i > bArr.length) {
            this.f13978a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: b */
    public final void m5016b(int i, byte[] bArr, int i2) {
        System.arraycopy(this.f13978a, this.f13979b, bArr, i, i2);
        this.f13979b += i2;
    }

    /* renamed from: c */
    public final int m5015c() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f13979b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    @Nullable
    /* renamed from: d */
    public final String m5014d() {
        boolean z;
        int i = this.f13980c;
        int i2 = this.f13979b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f13980c) {
            byte b = this.f13978a[i2];
            int i3 = C7408g0.f13905a;
            if (b != 10 && b != 13) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            i2++;
        }
        int i4 = this.f13979b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f13978a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f13979b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f13978a;
        int i5 = this.f13979b;
        String m5095k = C7408g0.m5095k(i5, bArr2, i2 - i5);
        this.f13979b = i2;
        int i6 = this.f13980c;
        if (i2 == i6) {
            return m5095k;
        }
        byte[] bArr3 = this.f13978a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.f13979b = i7;
            if (i7 == i6) {
                return m5095k;
            }
        }
        int i8 = this.f13979b;
        if (bArr3[i8] == 10) {
            this.f13979b = i8 + 1;
        }
        return m5095k;
    }

    /* renamed from: e */
    public final int m5013e() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.f13979b = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    /* renamed from: f */
    public final short m5012f() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        this.f13979b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: g */
    public final long m5011g() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f13979b = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    /* renamed from: h */
    public final int m5010h() {
        int m5013e = m5013e();
        if (m5013e >= 0) {
            return m5013e;
        }
        throw new IllegalStateException(C0510h.m12340a(29, "Top bit not zero: ", m5013e));
    }

    /* renamed from: i */
    public final int m5009i() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        this.f13979b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: j */
    public final long m5008j() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f13979b = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
    }

    @Nullable
    /* renamed from: k */
    public final String m5007k() {
        int i = this.f13980c;
        int i2 = this.f13979b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f13980c && this.f13978a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f13978a;
        int i3 = this.f13979b;
        String m5095k = C7408g0.m5095k(i3, bArr, i2 - i3);
        this.f13979b = i2;
        if (i2 < this.f13980c) {
            this.f13979b = i2 + 1;
            return m5095k;
        }
        return m5095k;
    }

    /* renamed from: l */
    public final String m5006l(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f13979b;
        int i3 = (i2 + i) - 1;
        String m5095k = C7408g0.m5095k(i2, this.f13978a, (i3 >= this.f13980c || this.f13978a[i3] != 0) ? i : i - 1);
        this.f13979b += i;
        return m5095k;
    }

    /* renamed from: m */
    public final String m5005m(int i) {
        return m5004n(i, C7935d.f15693c);
    }

    /* renamed from: n */
    public final String m5004n(int i, Charset charset) {
        String str = new String(this.f13978a, this.f13979b, i, charset);
        this.f13979b += i;
        return str;
    }

    /* renamed from: o */
    public final int m5003o() {
        return (m5002p() << 21) | (m5002p() << 14) | (m5002p() << 7) | m5002p();
    }

    /* renamed from: p */
    public final int m5002p() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        this.f13979b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: q */
    public final long m5001q() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f13979b = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
    }

    /* renamed from: r */
    public final int m5000r() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f13979b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: s */
    public final int m4999s() {
        int m5015c = m5015c();
        if (m5015c >= 0) {
            return m5015c;
        }
        throw new IllegalStateException(C0510h.m12340a(29, "Top bit not zero: ", m5015c));
    }

    /* renamed from: t */
    public final long m4998t() {
        long m5008j = m5008j();
        if (m5008j >= 0) {
            return m5008j;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(m5008j);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: u */
    public final int m4997u() {
        byte[] bArr = this.f13978a;
        int i = this.f13979b;
        int i2 = i + 1;
        this.f13979b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: v */
    public final long m4996v() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.f13978a[this.f13979b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        for (i = 1; i < i2; i++) {
            if ((this.f13978a[this.f13979b + i] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | (b & Utf8.REPLACEMENT_BYTE);
        }
        this.f13979b += i2;
        return j;
    }

    /* renamed from: w */
    public final void m4995w(int i) {
        byte[] bArr = this.f13978a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m4994x(i, bArr);
    }

    /* renamed from: x */
    public final void m4994x(int i, byte[] bArr) {
        this.f13978a = bArr;
        this.f13980c = i;
        this.f13979b = 0;
    }

    /* renamed from: y */
    public final void m4993y(int i) {
        C7394a.m5134a(i >= 0 && i <= this.f13978a.length);
        this.f13980c = i;
    }

    /* renamed from: z */
    public final void m4992z(int i) {
        C7394a.m5134a(i >= 0 && i <= this.f13980c);
        this.f13979b = i;
    }
}
