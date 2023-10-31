package androidx.constraintlayout.core;

import androidx.activity.result.C0063d;
import androidx.constraintlayout.core.C0501c;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.b */
/* loaded from: classes.dex */
public final class C0500b implements C0501c.InterfaceC0502a {

    /* renamed from: b */
    public final C0501c f1559b;

    /* renamed from: c */
    public final C0503d f1560c;

    /* renamed from: a */
    public int f1558a = 0;

    /* renamed from: d */
    public int f1561d = 8;

    /* renamed from: e */
    public int[] f1562e = new int[8];

    /* renamed from: f */
    public int[] f1563f = new int[8];

    /* renamed from: g */
    public float[] f1564g = new float[8];

    /* renamed from: h */
    public int f1565h = -1;

    /* renamed from: i */
    public int f1566i = -1;

    /* renamed from: j */
    public boolean f1567j = false;

    public C0500b(C0501c c0501c, C0503d c0503d) {
        this.f1559b = c0501c;
        this.f1560c = c0503d;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: a */
    public final int mo12376a() {
        return this.f1558a;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: b */
    public final boolean mo12375b(C0512j c0512j) {
        int i = this.f1565h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f1558a; i2++) {
            if (this.f1562e[i] == c0512j.f1603b) {
                return true;
            }
            i = this.f1563f[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: c */
    public final float mo12374c(C0501c c0501c, boolean z) {
        float mo12367j = mo12367j(c0501c.f1568a);
        mo12368i(c0501c.f1568a, z);
        C0501c.InterfaceC0502a interfaceC0502a = c0501c.f1571d;
        int mo12376a = interfaceC0502a.mo12376a();
        for (int i = 0; i < mo12376a; i++) {
            C0512j mo12372e = interfaceC0502a.mo12372e(i);
            mo12371f(mo12372e, interfaceC0502a.mo12367j(mo12372e) * mo12367j, z);
        }
        return mo12367j;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    public final void clear() {
        int i = this.f1565h;
        for (int i2 = 0; i != -1 && i2 < this.f1558a; i2++) {
            C0512j c0512j = this.f1560c.f1575c[this.f1562e[i]];
            if (c0512j != null) {
                c0512j.m12334b(this.f1559b);
            }
            i = this.f1563f[i];
        }
        this.f1565h = -1;
        this.f1566i = -1;
        this.f1567j = false;
        this.f1558a = 0;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: d */
    public final void mo12373d(C0512j c0512j, float f) {
        if (f == 0.0f) {
            mo12368i(c0512j, true);
            return;
        }
        int i = this.f1565h;
        C0501c c0501c = this.f1559b;
        if (i == -1) {
            this.f1565h = 0;
            this.f1564g[0] = f;
            this.f1562e[0] = c0512j.f1603b;
            this.f1563f[0] = -1;
            c0512j.f1613l++;
            c0512j.m12335a(c0501c);
            this.f1558a++;
            if (this.f1567j) {
                return;
            }
            int i2 = this.f1566i + 1;
            this.f1566i = i2;
            int[] iArr = this.f1562e;
            if (i2 >= iArr.length) {
                this.f1567j = true;
                this.f1566i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f1558a; i4++) {
            int i5 = this.f1562e[i];
            int i6 = c0512j.f1603b;
            if (i5 == i6) {
                this.f1564g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f1563f[i];
        }
        int i7 = this.f1566i;
        int i8 = i7 + 1;
        if (this.f1567j) {
            int[] iArr2 = this.f1562e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f1562e;
        if (i7 >= iArr3.length && this.f1558a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f1562e;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f1562e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f1561d * 2;
            this.f1561d = i10;
            this.f1567j = false;
            this.f1566i = i7 - 1;
            this.f1564g = Arrays.copyOf(this.f1564g, i10);
            this.f1562e = Arrays.copyOf(this.f1562e, this.f1561d);
            this.f1563f = Arrays.copyOf(this.f1563f, this.f1561d);
        }
        this.f1562e[i7] = c0512j.f1603b;
        this.f1564g[i7] = f;
        int[] iArr6 = this.f1563f;
        if (i3 != -1) {
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            iArr6[i7] = this.f1565h;
            this.f1565h = i7;
        }
        c0512j.f1613l++;
        c0512j.m12335a(c0501c);
        int i11 = this.f1558a + 1;
        this.f1558a = i11;
        if (!this.f1567j) {
            this.f1566i++;
        }
        int[] iArr7 = this.f1562e;
        if (i11 >= iArr7.length) {
            this.f1567j = true;
        }
        if (this.f1566i >= iArr7.length) {
            this.f1567j = true;
            this.f1566i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: e */
    public final C0512j mo12372e(int i) {
        int i2 = this.f1565h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1558a; i3++) {
            if (i3 == i) {
                return this.f1560c.f1575c[this.f1562e[i2]];
            }
            i2 = this.f1563f[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: f */
    public final void mo12371f(C0512j c0512j, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f1565h;
            C0501c c0501c = this.f1559b;
            if (i == -1) {
                this.f1565h = 0;
                this.f1564g[0] = f;
                this.f1562e[0] = c0512j.f1603b;
                this.f1563f[0] = -1;
                c0512j.f1613l++;
                c0512j.m12335a(c0501c);
                this.f1558a++;
                if (this.f1567j) {
                    return;
                }
                int i2 = this.f1566i + 1;
                this.f1566i = i2;
                int[] iArr = this.f1562e;
                if (i2 >= iArr.length) {
                    this.f1567j = true;
                    this.f1566i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f1558a; i4++) {
                int i5 = this.f1562e[i];
                int i6 = c0512j.f1603b;
                if (i5 == i6) {
                    float[] fArr = this.f1564g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f1565h) {
                            this.f1565h = this.f1563f[i];
                        } else {
                            int[] iArr2 = this.f1563f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c0512j.m12334b(c0501c);
                        }
                        if (this.f1567j) {
                            this.f1566i = i;
                        }
                        c0512j.f1613l--;
                        this.f1558a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f1563f[i];
            }
            int i7 = this.f1566i;
            int i8 = i7 + 1;
            if (this.f1567j) {
                int[] iArr3 = this.f1562e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f1562e;
            if (i7 >= iArr4.length && this.f1558a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f1562e;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f1562e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f1561d * 2;
                this.f1561d = i10;
                this.f1567j = false;
                this.f1566i = i7 - 1;
                this.f1564g = Arrays.copyOf(this.f1564g, i10);
                this.f1562e = Arrays.copyOf(this.f1562e, this.f1561d);
                this.f1563f = Arrays.copyOf(this.f1563f, this.f1561d);
            }
            this.f1562e[i7] = c0512j.f1603b;
            this.f1564g[i7] = f;
            int[] iArr7 = this.f1563f;
            if (i3 != -1) {
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                iArr7[i7] = this.f1565h;
                this.f1565h = i7;
            }
            c0512j.f1613l++;
            c0512j.m12335a(c0501c);
            this.f1558a++;
            if (!this.f1567j) {
                this.f1566i++;
            }
            int i11 = this.f1566i;
            int[] iArr8 = this.f1562e;
            if (i11 >= iArr8.length) {
                this.f1567j = true;
                this.f1566i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: g */
    public final void mo12370g() {
        int i = this.f1565h;
        for (int i2 = 0; i != -1 && i2 < this.f1558a; i2++) {
            float[] fArr = this.f1564g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f1563f[i];
        }
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: h */
    public final float mo12369h(int i) {
        int i2 = this.f1565h;
        for (int i3 = 0; i2 != -1 && i3 < this.f1558a; i3++) {
            if (i3 == i) {
                return this.f1564g[i2];
            }
            i2 = this.f1563f[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: i */
    public final float mo12368i(C0512j c0512j, boolean z) {
        int i = this.f1565h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1558a) {
            if (this.f1562e[i] == c0512j.f1603b) {
                if (i == this.f1565h) {
                    this.f1565h = this.f1563f[i];
                } else {
                    int[] iArr = this.f1563f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0512j.m12334b(this.f1559b);
                }
                c0512j.f1613l--;
                this.f1558a--;
                this.f1562e[i] = -1;
                if (this.f1567j) {
                    this.f1566i = i;
                }
                return this.f1564g[i];
            }
            i2++;
            i3 = i;
            i = this.f1563f[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: j */
    public final float mo12367j(C0512j c0512j) {
        int i = this.f1565h;
        for (int i2 = 0; i != -1 && i2 < this.f1558a; i2++) {
            if (this.f1562e[i] == c0512j.f1603b) {
                return this.f1564g[i];
            }
            i = this.f1563f[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.C0501c.InterfaceC0502a
    /* renamed from: k */
    public final void mo12366k(float f) {
        int i = this.f1565h;
        for (int i2 = 0; i != -1 && i2 < this.f1558a; i2++) {
            float[] fArr = this.f1564g;
            fArr[i] = fArr[i] / f;
            i = this.f1563f[i];
        }
    }

    public final String toString() {
        int i = this.f1565h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f1558a; i2++) {
            StringBuilder m12383b = C0499a.m12383b(C0063d.m13053a(str, " -> "));
            m12383b.append(this.f1564g[i]);
            m12383b.append(" : ");
            StringBuilder m12383b2 = C0499a.m12383b(m12383b.toString());
            m12383b2.append(this.f1560c.f1575c[this.f1562e[i]]);
            str = m12383b2.toString();
            i = this.f1563f[i];
        }
        return str;
    }
}
