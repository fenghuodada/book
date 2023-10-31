package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0503d;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.n */
/* loaded from: classes.dex */
public class C0549n extends C0540f {

    /* renamed from: s0 */
    public ArrayList<C0540f> f1870s0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: C */
    public void mo12198C() {
        this.f1870s0.clear();
        super.mo12198C();
    }

    @Override // androidx.constraintlayout.core.widgets.C0540f
    /* renamed from: F */
    public final void mo12197F(C0503d c0503d) {
        super.mo12197F(c0503d);
        int size = this.f1870s0.size();
        for (int i = 0; i < size; i++) {
            this.f1870s0.get(i).mo12197F(c0503d);
        }
    }

    /* renamed from: Q */
    public void mo12196Q() {
        ArrayList<C0540f> arrayList = this.f1870s0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0540f c0540f = this.f1870s0.get(i);
            if (c0540f instanceof C0549n) {
                ((C0549n) c0540f).mo12196Q();
            }
        }
    }
}
