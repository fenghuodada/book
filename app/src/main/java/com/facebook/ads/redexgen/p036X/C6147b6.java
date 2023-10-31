package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b6 */
/* loaded from: assets/audience_network.dex */
public final class C6147b6 extends AbstractC43176i {
    public final List<C43276s> A00;

    public C6147b6(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A00 = new ArrayList();
    }

    public final List<C43276s> A02() {
        return Collections.unmodifiableList(this.A00);
    }

    public final void A03(C43276s c43276s) {
        if (c43276s.A03().contains(EnumC43346z.A0B)) {
            this.A00.add(c43276s);
        }
    }

    public final void A04(EnumC43316w enumC43316w) {
        A01(enumC43316w, this.A00);
    }
}
