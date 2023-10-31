package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0504e;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.c */
/* loaded from: classes.dex */
public class C0501c implements C0504e.InterfaceC0505a {

    /* renamed from: d */
    public InterfaceC0502a f1571d;

    /* renamed from: a */
    public C0512j f1568a = null;

    /* renamed from: b */
    public float f1569b = 0.0f;

    /* renamed from: c */
    public final ArrayList<C0512j> f1570c = new ArrayList<>();

    /* renamed from: e */
    public boolean f1572e = false;

    /* renamed from: androidx.constraintlayout.core.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0502a {
        /* renamed from: a */
        int mo12376a();

        /* renamed from: b */
        boolean mo12375b(C0512j c0512j);

        /* renamed from: c */
        float mo12374c(C0501c c0501c, boolean z);

        void clear();

        /* renamed from: d */
        void mo12373d(C0512j c0512j, float f);

        /* renamed from: e */
        C0512j mo12372e(int i);

        /* renamed from: f */
        void mo12371f(C0512j c0512j, float f, boolean z);

        /* renamed from: g */
        void mo12370g();

        /* renamed from: h */
        float mo12369h(int i);

        /* renamed from: i */
        float mo12368i(C0512j c0512j, boolean z);

        /* renamed from: j */
        float mo12367j(C0512j c0512j);

        /* renamed from: k */
        void mo12366k(float f);
    }

    public C0501c() {
    }

    public C0501c(C0503d c0503d) {
        this.f1571d = new C0500b(this, c0503d);
    }

    @Override // androidx.constraintlayout.core.C0504e.InterfaceC0505a
    /* renamed from: a */
    public C0512j mo12345a(boolean[] zArr) {
        return m12379f(zArr, null);
    }

    /* renamed from: b */
    public final void m12382b(C0504e c0504e, int i) {
        this.f1571d.mo12373d(c0504e.m12355k(i), 1.0f);
        this.f1571d.mo12373d(c0504e.m12355k(i), -1.0f);
    }

    /* renamed from: c */
    public final void m12381c(C0512j c0512j, C0512j c0512j2, C0512j c0512j3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1569b = i;
        }
        if (z) {
            this.f1571d.mo12373d(c0512j, 1.0f);
            this.f1571d.mo12373d(c0512j2, -1.0f);
            this.f1571d.mo12373d(c0512j3, -1.0f);
            return;
        }
        this.f1571d.mo12373d(c0512j, -1.0f);
        this.f1571d.mo12373d(c0512j2, 1.0f);
        this.f1571d.mo12373d(c0512j3, 1.0f);
    }

    /* renamed from: d */
    public final void m12380d(C0512j c0512j, C0512j c0512j2, C0512j c0512j3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1569b = i;
        }
        if (z) {
            this.f1571d.mo12373d(c0512j, 1.0f);
            this.f1571d.mo12373d(c0512j2, -1.0f);
            this.f1571d.mo12373d(c0512j3, 1.0f);
            return;
        }
        this.f1571d.mo12373d(c0512j, -1.0f);
        this.f1571d.mo12373d(c0512j2, 1.0f);
        this.f1571d.mo12373d(c0512j3, -1.0f);
    }

    /* renamed from: e */
    public boolean mo12344e() {
        return this.f1568a == null && this.f1569b == 0.0f && this.f1571d.mo12376a() == 0;
    }

    /* renamed from: f */
    public final C0512j m12379f(boolean[] zArr, C0512j c0512j) {
        int i;
        int mo12376a = this.f1571d.mo12376a();
        C0512j c0512j2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < mo12376a; i2++) {
            float mo12369h = this.f1571d.mo12369h(i2);
            if (mo12369h < 0.0f) {
                C0512j mo12372e = this.f1571d.mo12372e(i2);
                if ((zArr == null || !zArr[mo12372e.f1603b]) && mo12372e != c0512j && (((i = mo12372e.f1610i) == 3 || i == 4) && mo12369h < f)) {
                    f = mo12369h;
                    c0512j2 = mo12372e;
                }
            }
        }
        return c0512j2;
    }

    /* renamed from: g */
    public final void m12378g(C0512j c0512j) {
        C0512j c0512j2 = this.f1568a;
        if (c0512j2 != null) {
            this.f1571d.mo12373d(c0512j2, -1.0f);
            this.f1568a.f1604c = -1;
            this.f1568a = null;
        }
        float mo12368i = this.f1571d.mo12368i(c0512j, true) * (-1.0f);
        this.f1568a = c0512j;
        if (mo12368i == 1.0f) {
            return;
        }
        this.f1569b /= mo12368i;
        this.f1571d.mo12366k(mo12368i);
    }

    /* renamed from: h */
    public final void m12377h(C0504e c0504e, C0512j c0512j, boolean z) {
        if (c0512j == null || !c0512j.f1607f) {
            return;
        }
        float mo12367j = this.f1571d.mo12367j(c0512j);
        this.f1569b = (c0512j.f1606e * mo12367j) + this.f1569b;
        this.f1571d.mo12368i(c0512j, z);
        if (z) {
            c0512j.m12334b(this);
        }
        if (this.f1571d.mo12376a() == 0) {
            this.f1572e = true;
            c0504e.f1578a = true;
        }
    }

    /* renamed from: i */
    public void mo12343i(C0504e c0504e, C0501c c0501c, boolean z) {
        float mo12374c = this.f1571d.mo12374c(c0501c, z);
        this.f1569b = (c0501c.f1569b * mo12374c) + this.f1569b;
        if (z) {
            c0501c.f1568a.m12334b(this);
        }
        if (this.f1568a == null || this.f1571d.mo12376a() != 0) {
            return;
        }
        this.f1572e = true;
        c0504e.f1578a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            androidx.constraintlayout.core.j r0 = r9.f1568a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.core.j r1 = r9.f1568a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = androidx.activity.result.C0063d.m13053a(r0, r1)
            float r1 = r9.f1569b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = androidx.constraintlayout.core.C0499a.m12383b(r0)
            float r1 = r9.f1569b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            androidx.constraintlayout.core.c$a r5 = r9.f1571d
            int r5 = r5.mo12376a()
        L3c:
            if (r4 >= r5) goto La0
            androidx.constraintlayout.core.c$a r6 = r9.f1571d
            androidx.constraintlayout.core.j r6 = r6.mo12372e(r4)
            if (r6 != 0) goto L47
            goto L9d
        L47:
            androidx.constraintlayout.core.c$a r7 = r9.f1571d
            float r7 = r7.mo12369h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L9d
        L52:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L63
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7f
            java.lang.StringBuilder r0 = androidx.constraintlayout.core.C0499a.m12383b(r0)
            java.lang.String r1 = "- "
            goto L75
        L63:
            java.lang.StringBuilder r0 = androidx.constraintlayout.core.C0499a.m12383b(r0)
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7f
        L73:
            java.lang.String r1 = " - "
        L75:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L7f:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L8b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L98
        L8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L98:
            java.lang.String r0 = androidx.concurrent.futures.C0484a.m12392a(r1, r0, r6)
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L3c
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = androidx.activity.result.C0063d.m13053a(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0501c.toString():java.lang.String");
    }
}
