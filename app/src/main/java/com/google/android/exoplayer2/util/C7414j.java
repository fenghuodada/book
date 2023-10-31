package com.google.android.exoplayer2.util;

/* renamed from: com.google.android.exoplayer2.util.j */
/* loaded from: classes.dex */
public final class C7414j {

    /* renamed from: a */
    public int f13919a = 0;

    /* renamed from: b */
    public int f13920b = -1;

    /* renamed from: c */
    public int f13921c = 0;

    /* renamed from: d */
    public int[] f13922d;

    /* renamed from: e */
    public int f13923e;

    public C7414j() {
        int[] iArr = new int[16];
        this.f13922d = iArr;
        this.f13923e = iArr.length - 1;
    }

    /* renamed from: a */
    public final void m5062a(int i) {
        int i2 = this.f13921c;
        int[] iArr = this.f13922d;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i3 = this.f13919a;
                int i4 = length2 - i3;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                System.arraycopy(this.f13922d, 0, iArr2, i4, i3);
                this.f13919a = 0;
                this.f13920b = this.f13921c - 1;
                this.f13922d = iArr2;
                this.f13923e = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.f13920b + 1) & this.f13923e;
        this.f13920b = i5;
        this.f13922d[i5] = i;
        this.f13921c++;
    }
}
