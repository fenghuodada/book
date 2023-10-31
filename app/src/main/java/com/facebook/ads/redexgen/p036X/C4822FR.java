package com.facebook.ads.redexgen.p036X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.FR */
/* loaded from: assets/audience_network.dex */
public final class C4822FR extends AbstractC6285dN {
    public final C5953Xy A00;

    public C4822FR(C39771A c39771a, List<C5721UB> list, C5953Xy c5953Xy) {
        super(c39771a, list, c5953Xy);
        this.A00 = c5953Xy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A01 */
    public final C5686Tc A06(ViewGroup viewGroup, int i) {
        return new C5686Tc(new C5275Mw(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6285dN, com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A0H */
    public final void A0E(C5686Tc c5686Tc, int i) {
        super.A0E(c5686Tc, i);
        C5275Mw c5275Mw = (C5275Mw) c5686Tc.A0l();
        C5287N8 c5287n8 = (C5287N8) c5275Mw.getImageCardView();
        c5287n8.setImageDrawable(null);
        A0F(c5287n8, i);
        C5721UB c5721ub = ((AbstractC6285dN) this).A01.get(i);
        c5721ub.A11().A0F(this.A00);
        c5721ub.A1N(c5275Mw, c5275Mw);
    }
}
