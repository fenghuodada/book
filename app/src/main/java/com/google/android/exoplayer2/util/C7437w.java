package com.google.android.exoplayer2.util;

/* renamed from: com.google.android.exoplayer2.util.w */
/* loaded from: classes.dex */
public final class C7437w {

    /* renamed from: a */
    public byte[] f13981a;

    /* renamed from: b */
    public int f13982b;

    /* renamed from: c */
    public int f13983c;

    /* renamed from: d */
    public int f13984d = 0;

    public C7437w(byte[] bArr, int i, int i2) {
        this.f13981a = bArr;
        this.f13983c = i;
        this.f13982b = i2;
        m4991a();
    }

    /* renamed from: a */
    public final void m4991a() {
        int i;
        int i2 = this.f13983c;
        C7394a.m5131d(i2 >= 0 && (i2 < (i = this.f13982b) || (i2 == i && this.f13984d == 0)));
    }

    /* renamed from: b */
    public final boolean m4990b(int i) {
        int i2 = this.f13983c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f13984d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f13982b) {
                break;
            } else if (m4984h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f13982b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m4989c() {
        int i = this.f13983c;
        int i2 = this.f13984d;
        int i3 = 0;
        while (this.f13983c < this.f13982b && !m4988d()) {
            i3++;
        }
        boolean z = this.f13983c == this.f13982b;
        this.f13983c = i;
        this.f13984d = i2;
        return !z && m4990b((i3 * 2) + 1);
    }

    /* renamed from: d */
    public final boolean m4988d() {
        boolean z = (this.f13981a[this.f13983c] & (128 >> this.f13984d)) != 0;
        m4983i();
        return z;
    }

    /* renamed from: e */
    public final int m4987e(int i) {
        int i2;
        this.f13984d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f13984d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f13984d = i4;
            byte[] bArr = this.f13981a;
            int i5 = this.f13983c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!m4984h(i5 + 1)) {
                r3 = 1;
            }
            this.f13983c = i5 + r3;
        }
        byte[] bArr2 = this.f13981a;
        int i6 = this.f13983c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13984d = 0;
            this.f13983c = i6 + (m4984h(i6 + 1) ? 2 : 1);
        }
        m4991a();
        return i7;
    }

    /* renamed from: f */
    public final int m4986f() {
        int i = 0;
        while (!m4988d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m4987e(i) : 0);
    }

    /* renamed from: g */
    public final int m4985g() {
        int m4986f = m4986f();
        return ((m4986f + 1) / 2) * (m4986f % 2 == 0 ? -1 : 1);
    }

    /* renamed from: h */
    public final boolean m4984h(int i) {
        if (2 <= i && i < this.f13982b) {
            byte[] bArr = this.f13981a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m4983i() {
        int i = this.f13984d + 1;
        this.f13984d = i;
        if (i == 8) {
            this.f13984d = 0;
            int i2 = this.f13983c;
            this.f13983c = i2 + (m4984h(i2 + 1) ? 2 : 1);
        }
        m4991a();
    }

    /* renamed from: j */
    public final void m4982j(int i) {
        int i2 = this.f13983c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f13983c = i4;
        int i5 = (i - (i3 * 8)) + this.f13984d;
        this.f13984d = i5;
        if (i5 > 7) {
            this.f13983c = i4 + 1;
            this.f13984d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f13983c) {
                m4991a();
                return;
            } else if (m4984h(i2)) {
                this.f13983c++;
                i2 += 2;
            }
        }
    }
}
