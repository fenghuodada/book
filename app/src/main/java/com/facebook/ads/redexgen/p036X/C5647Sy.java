package com.facebook.ads.redexgen.p036X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Sy */
/* loaded from: assets/audience_network.dex */
public class C5647Sy implements InterfaceC5355OF {
    public final WeakReference<C4518AB> A00;

    public C5647Sy(C4518AB c4518ab) {
        this.A00 = new WeakReference<>(c4518ab);
    }

    public /* synthetic */ C5647Sy(C4518AB c4518ab, C4524AH c4524ah) {
        this(c4518ab);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5355OF
    public final void AAx(boolean z) {
        C4518AB c4518ab = this.A00.get();
        if (c4518ab != null) {
            c4518ab.A04 = z;
            c4518ab.A02();
        }
    }
}
