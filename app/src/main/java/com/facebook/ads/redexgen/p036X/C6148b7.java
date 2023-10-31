package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.b7 */
/* loaded from: assets/audience_network.dex */
public final class C6148b7 extends AbstractC43176i implements InterfaceC43126d {
    public C43016S A00;
    public final C42856C A01;
    public final Map<Integer, C43276s> A02;

    @SuppressLint({"UseSparseArrays"})
    public C6148b7(Context context, C42856C c42856c) {
        super(context, c42856c);
        this.A02 = new HashMap();
        this.A01 = c42856c;
    }

    public final void A02(C43276s c43276s) {
        this.A02.put(Integer.valueOf(c43276s.A00()), c43276s);
    }

    public final void A03(EnumC43316w enumC43316w, Context context) {
        this.A00 = C43016S.A00(context, this.A01);
        this.A00.A04(this.A02, enumC43316w);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43126d
    public final void AD6() {
        C43016S c43016s = this.A00;
        if (c43016s != null) {
            c43016s.A03();
        }
    }
}
