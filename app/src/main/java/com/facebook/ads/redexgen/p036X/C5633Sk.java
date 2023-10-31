package com.facebook.ads.redexgen.p036X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Sk */
/* loaded from: assets/audience_network.dex */
public class C5633Sk implements InterfaceC5355OF {
    public final WeakReference<AbstractC4510A3> A00;

    public C5633Sk(AbstractC4510A3 abstractC4510A3) {
        this.A00 = new WeakReference<>(abstractC4510A3);
    }

    public /* synthetic */ C5633Sk(AbstractC4510A3 abstractC4510A3, C4515A8 c4515a8) {
        this(abstractC4510A3);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5355OF
    public final void AAx(boolean z) {
        AbstractC4510A3 abstractC4510A3 = this.A00.get();
        if (abstractC4510A3 != null) {
            abstractC4510A3.A06 = z;
            abstractC4510A3.A01();
        }
    }
}
