package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.C0526j;
import androidx.constraintlayout.core.widgets.analyzer.C0532p;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.k */
/* loaded from: classes.dex */
public class C0546k extends C0540f implements InterfaceC0545j {

    /* renamed from: s0 */
    public C0540f[] f1855s0 = new C0540f[4];

    /* renamed from: t0 */
    public int f1856t0 = 0;

    /* renamed from: Q */
    public final void m12208Q(int i, C0532p c0532p, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f1856t0; i2++) {
            C0540f c0540f = this.f1855s0[i2];
            ArrayList<C0540f> arrayList2 = c0532p.f1663a;
            if (!arrayList2.contains(c0540f)) {
                arrayList2.add(c0540f);
            }
        }
        for (int i3 = 0; i3 < this.f1856t0; i3++) {
            C0526j.m12304a(this.f1855s0[i3], i, arrayList, c0532p);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.InterfaceC0545j
    /* renamed from: a */
    public void mo12199a() {
    }
}
