package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0501c;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.constraintlayout.core.g */
/* loaded from: classes.dex */
public final class C0507g extends C0501c {

    /* renamed from: f */
    public C0512j[] f1595f;

    /* renamed from: g */
    public C0512j[] f1596g;

    /* renamed from: h */
    public int f1597h;

    /* renamed from: i */
    public final C0509b f1598i;

    /* renamed from: androidx.constraintlayout.core.g$a */
    /* loaded from: classes.dex */
    public class C0508a implements Comparator<C0512j> {
        @Override // java.util.Comparator
        public final int compare(C0512j c0512j, C0512j c0512j2) {
            return c0512j.f1603b - c0512j2.f1603b;
        }
    }

    /* renamed from: androidx.constraintlayout.core.g$b */
    /* loaded from: classes.dex */
    public class C0509b {

        /* renamed from: a */
        public C0512j f1599a;

        public C0509b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f1599a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder m12383b = C0499a.m12383b(str);
                    m12383b.append(this.f1599a.f1609h[i]);
                    m12383b.append(" ");
                    str = m12383b.toString();
                }
            }
            StringBuilder m12339b = C0510h.m12339b(str, "] ");
            m12339b.append(this.f1599a);
            return m12339b.toString();
        }
    }

    public C0507g(C0503d c0503d) {
        super(c0503d);
        this.f1595f = new C0512j[128];
        this.f1596g = new C0512j[128];
        this.f1597h = 0;
        this.f1598i = new C0509b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r9 < r8) goto L32;
     */
    @Override // androidx.constraintlayout.core.C0501c, androidx.constraintlayout.core.C0504e.InterfaceC0505a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.constraintlayout.core.C0512j mo12345a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f1597h
            if (r2 >= r4) goto L57
            androidx.constraintlayout.core.j[] r4 = r11.f1595f
            r5 = r4[r2]
            int r6 = r5.f1603b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            androidx.constraintlayout.core.g$b r6 = r11.f1598i
            r6.f1599a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L36
        L1c:
            if (r7 < 0) goto L32
            androidx.constraintlayout.core.j r4 = r6.f1599a
            float[] r4 = r4.f1609h
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r7 = r7 + (-1)
            goto L1c
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r7 < 0) goto L50
            float[] r8 = r4.f1609h
            r8 = r8[r7]
            androidx.constraintlayout.core.j r9 = r6.f1599a
            float[] r9 = r9.f1609h
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r7 = r7 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r5 = r1
        L51:
            if (r5 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r12 = 0
            return r12
        L5b:
            androidx.constraintlayout.core.j[] r12 = r11.f1595f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0507g.mo12345a(boolean[]):androidx.constraintlayout.core.j");
    }

    @Override // androidx.constraintlayout.core.C0501c
    /* renamed from: e */
    public final boolean mo12344e() {
        return this.f1597h == 0;
    }

    @Override // androidx.constraintlayout.core.C0501c
    /* renamed from: i */
    public final void mo12343i(C0504e c0504e, C0501c c0501c, boolean z) {
        boolean z2;
        C0512j c0512j = c0501c.f1568a;
        if (c0512j == null) {
            return;
        }
        C0501c.InterfaceC0502a interfaceC0502a = c0501c.f1571d;
        int mo12376a = interfaceC0502a.mo12376a();
        for (int i = 0; i < mo12376a; i++) {
            C0512j mo12372e = interfaceC0502a.mo12372e(i);
            float mo12369h = interfaceC0502a.mo12369h(i);
            C0509b c0509b = this.f1598i;
            c0509b.f1599a = mo12372e;
            boolean z3 = mo12372e.f1602a;
            float[] fArr = c0512j.f1609h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c0509b.f1599a.f1609h;
                    float f = (fArr[i2] * mo12369h) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c0509b.f1599a.f1609h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    C0507g.this.m12341k(c0509b.f1599a);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * mo12369h;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c0509b.f1599a.f1609h[i3] = f3;
                    } else {
                        c0509b.f1599a.f1609h[i3] = 0.0f;
                    }
                }
                z2 = true;
            }
            if (z2) {
                m12342j(mo12372e);
            }
            this.f1569b = (c0501c.f1569b * mo12369h) + this.f1569b;
        }
        m12341k(c0512j);
    }

    /* renamed from: j */
    public final void m12342j(C0512j c0512j) {
        int i;
        int i2 = this.f1597h + 1;
        C0512j[] c0512jArr = this.f1595f;
        if (i2 > c0512jArr.length) {
            C0512j[] c0512jArr2 = (C0512j[]) Arrays.copyOf(c0512jArr, c0512jArr.length * 2);
            this.f1595f = c0512jArr2;
            this.f1596g = (C0512j[]) Arrays.copyOf(c0512jArr2, c0512jArr2.length * 2);
        }
        C0512j[] c0512jArr3 = this.f1595f;
        int i3 = this.f1597h;
        c0512jArr3[i3] = c0512j;
        int i4 = i3 + 1;
        this.f1597h = i4;
        if (i4 > 1 && c0512jArr3[i4 - 1].f1603b > c0512j.f1603b) {
            int i5 = 0;
            while (true) {
                i = this.f1597h;
                if (i5 >= i) {
                    break;
                }
                this.f1596g[i5] = this.f1595f[i5];
                i5++;
            }
            Arrays.sort(this.f1596g, 0, i, new C0508a());
            for (int i6 = 0; i6 < this.f1597h; i6++) {
                this.f1595f[i6] = this.f1596g[i6];
            }
        }
        c0512j.f1602a = true;
        c0512j.m12335a(this);
    }

    /* renamed from: k */
    public final void m12341k(C0512j c0512j) {
        int i = 0;
        while (i < this.f1597h) {
            if (this.f1595f[i] == c0512j) {
                while (true) {
                    int i2 = this.f1597h;
                    if (i >= i2 - 1) {
                        this.f1597h = i2 - 1;
                        c0512j.f1602a = false;
                        return;
                    }
                    C0512j[] c0512jArr = this.f1595f;
                    int i3 = i + 1;
                    c0512jArr[i] = c0512jArr[i3];
                    i = i3;
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.C0501c
    public final String toString() {
        String str = " goal -> (" + this.f1569b + ") : ";
        for (int i = 0; i < this.f1597h; i++) {
            C0512j c0512j = this.f1595f[i];
            C0509b c0509b = this.f1598i;
            c0509b.f1599a = c0512j;
            str = str + c0509b + " ";
        }
        return str;
    }
}
