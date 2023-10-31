package com.facebook.ads.redexgen.p036X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.T7 */
/* loaded from: assets/audience_network.dex */
public class C5656T7 extends AbstractRunnableC5165L8 {
    public final WeakReference<C5521Qw> A00;

    public C5656T7(C5521Qw c5521Qw) {
        this.A00 = new WeakReference<>(c5521Qw);
    }

    public C5656T7(WeakReference<C5521Qw> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5521Qw c5521Qw = this.A00.get();
        if (c5521Qw != null) {
            c5521Qw.A0U();
        }
    }
}
