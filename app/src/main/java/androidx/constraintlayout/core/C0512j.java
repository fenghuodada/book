package androidx.constraintlayout.core;

import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.j */
/* loaded from: classes.dex */
public final class C0512j implements Comparable<C0512j> {

    /* renamed from: a */
    public boolean f1602a;

    /* renamed from: e */
    public float f1606e;

    /* renamed from: i */
    public int f1610i;

    /* renamed from: b */
    public int f1603b = -1;

    /* renamed from: c */
    public int f1604c = -1;

    /* renamed from: d */
    public int f1605d = 0;

    /* renamed from: f */
    public boolean f1607f = false;

    /* renamed from: g */
    public final float[] f1608g = new float[9];

    /* renamed from: h */
    public final float[] f1609h = new float[9];

    /* renamed from: j */
    public C0501c[] f1611j = new C0501c[16];

    /* renamed from: k */
    public int f1612k = 0;

    /* renamed from: l */
    public int f1613l = 0;

    public C0512j(int i) {
        this.f1610i = i;
    }

    /* renamed from: a */
    public final void m12335a(C0501c c0501c) {
        int i = 0;
        while (true) {
            int i2 = this.f1612k;
            if (i >= i2) {
                C0501c[] c0501cArr = this.f1611j;
                if (i2 >= c0501cArr.length) {
                    this.f1611j = (C0501c[]) Arrays.copyOf(c0501cArr, c0501cArr.length * 2);
                }
                C0501c[] c0501cArr2 = this.f1611j;
                int i3 = this.f1612k;
                c0501cArr2[i3] = c0501c;
                this.f1612k = i3 + 1;
                return;
            } else if (this.f1611j[i] == c0501c) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final void m12334b(C0501c c0501c) {
        int i = this.f1612k;
        int i2 = 0;
        while (i2 < i) {
            if (this.f1611j[i2] == c0501c) {
                while (i2 < i - 1) {
                    C0501c[] c0501cArr = this.f1611j;
                    int i3 = i2 + 1;
                    c0501cArr[i2] = c0501cArr[i3];
                    i2 = i3;
                }
                this.f1612k--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m12333c() {
        this.f1610i = 5;
        this.f1605d = 0;
        this.f1603b = -1;
        this.f1604c = -1;
        this.f1606e = 0.0f;
        this.f1607f = false;
        int i = this.f1612k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1611j[i2] = null;
        }
        this.f1612k = 0;
        this.f1613l = 0;
        this.f1602a = false;
        Arrays.fill(this.f1609h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0512j c0512j) {
        return this.f1603b - c0512j.f1603b;
    }

    /* renamed from: d */
    public final void m12332d(C0504e c0504e, float f) {
        this.f1606e = f;
        this.f1607f = true;
        int i = this.f1612k;
        this.f1604c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1611j[i2].m12377h(c0504e, this, false);
        }
        this.f1612k = 0;
    }

    /* renamed from: f */
    public final void m12331f(C0504e c0504e, C0501c c0501c) {
        int i = this.f1612k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1611j[i2].mo12343i(c0504e, c0501c, false);
        }
        this.f1612k = 0;
    }

    public final String toString() {
        return "" + this.f1603b;
    }
}
