package com.facebook.ads.redexgen.p036X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.FX */
/* loaded from: assets/audience_network.dex */
public final class C4828FX extends AbstractC6285dN {
    public final C5953Xy A00;
    public final C5106K7 A01;

    public C4828FX(C5953Xy c5953Xy, C39771A c39771a, List<C5721UB> list, @Nullable C5106K7 c5106k7) {
        super(c39771a, list, c5953Xy);
        this.A00 = c5953Xy;
        this.A01 = c5106k7 == null ? new C5106K7() : c5106k7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A01 */
    public final C5686Tc A06(ViewGroup viewGroup, int i) {
        return new C5686Tc(new C5271Ms(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6285dN, com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A0H */
    public final void A0E(C5686Tc c5686Tc, int i) {
        super.A0E(c5686Tc, i);
        C5271Ms c5271Ms = (C5271Ms) c5686Tc.A0l();
        A0F(c5271Ms.getImageCardView(), i);
        if (((AbstractC6285dN) this).A01.get(i) != null) {
            c5271Ms.setTitle(((AbstractC6285dN) this).A01.get(i).getAdHeadline());
            c5271Ms.setSubtitle(((AbstractC6285dN) this).A01.get(i).getAdLinkDescription());
            c5271Ms.setButtonText(((AbstractC6285dN) this).A01.get(i).getAdCallToAction());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c5271Ms);
        ((AbstractC6285dN) this).A01.get(i).A1O(c5271Ms, c5271Ms, arrayList);
    }
}
