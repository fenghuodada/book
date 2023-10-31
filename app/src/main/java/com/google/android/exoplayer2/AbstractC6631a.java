package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.source.InterfaceC7167g0;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.a */
/* loaded from: classes.dex */
public abstract class AbstractC6631a extends AbstractC6984j1 {

    /* renamed from: e */
    public static final /* synthetic */ int f10551e = 0;

    /* renamed from: b */
    public final int f10552b;

    /* renamed from: c */
    public final InterfaceC7167g0 f10553c;

    /* renamed from: d */
    public final boolean f10554d = false;

    public AbstractC6631a(InterfaceC7167g0 interfaceC7167g0) {
        this.f10553c = interfaceC7167g0;
        this.f10552b = interfaceC7167g0.getLength();
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: a */
    public final int mo5425a(boolean z) {
        if (this.f10552b == 0) {
            return -1;
        }
        int i = 0;
        if (this.f10554d) {
            z = false;
        }
        if (z) {
            i = this.f10553c.mo5432a();
        }
        do {
            C6737c1 c6737c1 = (C6737c1) this;
            AbstractC6984j1[] abstractC6984j1Arr = c6737c1.f10895j;
            if (abstractC6984j1Arr[i].m5685p()) {
                i = m6210q(i, z);
            } else {
                return abstractC6984j1Arr[i].mo5425a(z) + c6737c1.f10894i[i];
            }
        } while (i != -1);
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: b */
    public final int mo5414b(Object obj) {
        int intValue;
        int mo5414b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C6737c1 c6737c1 = (C6737c1) this;
        Integer num = c6737c1.f10897l.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (mo5414b = c6737c1.f10895j[intValue].mo5414b(obj3)) == -1) {
            return -1;
        }
        return c6737c1.f10893h[intValue] + mo5414b;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: c */
    public final int mo5424c(boolean z) {
        int i;
        int i2 = this.f10552b;
        if (i2 == 0) {
            return -1;
        }
        if (this.f10554d) {
            z = false;
        }
        InterfaceC7167g0 interfaceC7167g0 = this.f10553c;
        if (z) {
            i = interfaceC7167g0.mo5427f();
        } else {
            i = i2 - 1;
        }
        do {
            C6737c1 c6737c1 = (C6737c1) this;
            AbstractC6984j1[] abstractC6984j1Arr = c6737c1.f10895j;
            if (abstractC6984j1Arr[i].m5685p()) {
                if (z) {
                    i = interfaceC7167g0.mo5430c(i);
                    continue;
                } else if (i > 0) {
                    i--;
                    continue;
                } else {
                    i = -1;
                    continue;
                }
            } else {
                return abstractC6984j1Arr[i].mo5424c(z) + c6737c1.f10894i[i];
            }
        } while (i != -1);
        return -1;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: e */
    public final int mo5423e(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f10554d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        C6737c1 c6737c1 = (C6737c1) this;
        int[] iArr = c6737c1.f10894i;
        int m5102d = C7408g0.m5102d(iArr, i + 1);
        int i4 = iArr[m5102d];
        AbstractC6984j1[] abstractC6984j1Arr = c6737c1.f10895j;
        AbstractC6984j1 abstractC6984j1 = abstractC6984j1Arr[m5102d];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int mo5423e = abstractC6984j1.mo5423e(i5, i3, z);
        if (mo5423e != -1) {
            return i4 + mo5423e;
        }
        int m6210q = m6210q(m5102d, z);
        while (m6210q != -1 && abstractC6984j1Arr[m6210q].m5685p()) {
            m6210q = m6210q(m6210q, z);
        }
        if (m6210q != -1) {
            return abstractC6984j1Arr[m6210q].mo5425a(z) + iArr[m6210q];
        } else if (i2 != 2) {
            return -1;
        } else {
            return mo5425a(z);
        }
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: f */
    public final AbstractC6984j1.C6986b mo5413f(int i, AbstractC6984j1.C6986b c6986b, boolean z) {
        C6737c1 c6737c1 = (C6737c1) this;
        int[] iArr = c6737c1.f10893h;
        int m5102d = C7408g0.m5102d(iArr, i + 1);
        int i2 = c6737c1.f10894i[m5102d];
        c6737c1.f10895j[m5102d].mo5413f(i - iArr[m5102d], c6986b, z);
        c6986b.f12154c += i2;
        if (z) {
            Object obj = c6737c1.f10896k[m5102d];
            Object obj2 = c6986b.f12153b;
            obj2.getClass();
            c6986b.f12153b = Pair.create(obj, obj2);
        }
        return c6986b;
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: g */
    public final AbstractC6984j1.C6986b mo5689g(Object obj, AbstractC6984j1.C6986b c6986b) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C6737c1 c6737c1 = (C6737c1) this;
        Integer num = c6737c1.f10897l.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i = c6737c1.f10894i[intValue];
        c6737c1.f10895j[intValue].mo5689g(obj3, c6986b);
        c6986b.f12154c += i;
        c6986b.f12153b = obj;
        return c6986b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0037 -> B:22:0x0038). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0042 -> B:18:0x002e). Please submit an issue!!! */
    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5422k(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7.f10554d
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lb
            r10 = 1
            if (r9 != r10) goto La
            r9 = r2
        La:
            r10 = r1
        Lb:
            r0 = r7
            com.google.android.exoplayer2.c1 r0 = (com.google.android.exoplayer2.C6737c1) r0
            int r3 = r8 + 1
            int[] r4 = r0.f10894i
            int r3 = com.google.android.exoplayer2.util.C7408g0.m5102d(r4, r3)
            r5 = r4[r3]
            com.google.android.exoplayer2.j1[] r0 = r0.f10895j
            r6 = r0[r3]
            int r8 = r8 - r5
            if (r9 != r2) goto L20
            goto L21
        L20:
            r1 = r9
        L21:
            int r8 = r6.mo5422k(r8, r1, r10)
            r1 = -1
            if (r8 == r1) goto L2a
            int r5 = r5 + r8
            return r5
        L2a:
            com.google.android.exoplayer2.source.g0 r8 = r7.f10553c
            if (r10 == 0) goto L33
        L2e:
            int r3 = r8.mo5430c(r3)
            goto L38
        L33:
            if (r3 <= 0) goto L37
            int r3 = r3 + r1
            goto L38
        L37:
            r3 = r1
        L38:
            if (r3 == r1) goto L4a
            r5 = r0[r3]
            boolean r5 = r5.m5685p()
            if (r5 == 0) goto L4a
            if (r10 == 0) goto L45
            goto L2e
        L45:
            if (r3 <= 0) goto L37
            int r3 = r3 + (-1)
            goto L38
        L4a:
            if (r3 == r1) goto L56
            r8 = r4[r3]
            r9 = r0[r3]
            int r9 = r9.mo5424c(r10)
            int r9 = r9 + r8
            return r9
        L56:
            if (r9 != r2) goto L5d
            int r8 = r7.mo5424c(r10)
            return r8
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.AbstractC6631a.mo5422k(int, int, boolean):int");
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: l */
    public final Object mo5411l(int i) {
        C6737c1 c6737c1 = (C6737c1) this;
        int[] iArr = c6737c1.f10893h;
        int m5102d = C7408g0.m5102d(iArr, i + 1);
        return Pair.create(c6737c1.f10896k[m5102d], c6737c1.f10895j[m5102d].mo5411l(i - iArr[m5102d]));
    }

    @Override // com.google.android.exoplayer2.AbstractC6984j1
    /* renamed from: n */
    public final AbstractC6984j1.C6987c mo5410n(int i, AbstractC6984j1.C6987c c6987c, long j) {
        C6737c1 c6737c1 = (C6737c1) this;
        int[] iArr = c6737c1.f10894i;
        int m5102d = C7408g0.m5102d(iArr, i + 1);
        int i2 = iArr[m5102d];
        int i3 = c6737c1.f10893h[m5102d];
        c6737c1.f10895j[m5102d].mo5410n(i - i2, c6987c, j);
        Object obj = c6737c1.f10896k[m5102d];
        if (!AbstractC6984j1.C6987c.f12159r.equals(c6987c.f12161a)) {
            obj = Pair.create(obj, c6987c.f12161a);
        }
        c6987c.f12161a = obj;
        c6987c.f12175o += i3;
        c6987c.f12176p += i3;
        return c6987c;
    }

    /* renamed from: q */
    public final int m6210q(int i, boolean z) {
        if (z) {
            return this.f10553c.mo5429d(i);
        }
        if (i < this.f10552b - 1) {
            return i + 1;
        }
        return -1;
    }
}
