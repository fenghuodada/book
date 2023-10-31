package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.C0516b;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.core.widgets.m */
/* loaded from: classes.dex */
public class C0548m extends C0546k {

    /* renamed from: u0 */
    public int f1864u0 = 0;

    /* renamed from: v0 */
    public int f1865v0 = 0;

    /* renamed from: w0 */
    public int f1866w0 = 0;

    /* renamed from: x0 */
    public int f1867x0 = 0;

    /* renamed from: y0 */
    public int f1868y0 = 0;

    /* renamed from: z0 */
    public int f1869z0 = 0;

    /* renamed from: A0 */
    public boolean f1859A0 = false;

    /* renamed from: B0 */
    public int f1860B0 = 0;

    /* renamed from: C0 */
    public int f1861C0 = 0;

    /* renamed from: D0 */
    public final C0516b.C0517a f1862D0 = new C0516b.C0517a();

    /* renamed from: E0 */
    public C0516b.InterfaceC0518b f1863E0 = null;

    /* renamed from: R */
    public void mo12201R(int i, int i2, int i3, int i4) {
    }

    /* renamed from: S */
    public final void m12200S(C0540f c0540f, int i, int i2, int i3, int i4) {
        C0516b.InterfaceC0518b interfaceC0518b;
        boolean z;
        C0540f c0540f2;
        while (true) {
            interfaceC0518b = this.f1863E0;
            if (interfaceC0518b != null || (c0540f2 = this.f1737W) == null) {
                break;
            }
            this.f1863E0 = ((C0541g) c0540f2).f1802w0;
        }
        C0516b.C0517a c0517a = this.f1862D0;
        c0517a.f1623a = i;
        c0517a.f1624b = i3;
        c0517a.f1625c = i2;
        c0517a.f1626d = i4;
        ((ConstraintLayout.C0564b) interfaceC0518b).m12167b(c0540f, c0517a);
        c0540f.m12252N(c0517a.f1627e);
        c0540f.m12255K(c0517a.f1628f);
        c0540f.f1720F = c0517a.f1630h;
        int i5 = c0517a.f1629g;
        c0540f.f1748d0 = i5;
        if (i5 > 0) {
            z = true;
        } else {
            z = false;
        }
        c0540f.f1720F = z;
    }

    @Override // androidx.constraintlayout.core.widgets.C0546k, androidx.constraintlayout.core.widgets.InterfaceC0545j
    /* renamed from: a */
    public final void mo12199a() {
        for (int i = 0; i < this.f1856t0; i++) {
            C0540f c0540f = this.f1855s0[i];
            if (c0540f != null) {
                c0540f.f1722H = true;
            }
        }
    }
}
