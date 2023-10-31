package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.bU */
/* loaded from: assets/audience_network.dex */
public class C6171bU extends AbstractRunnableC5165L8 {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C42425U A01;
    public final /* synthetic */ C5721UB A02;

    public C6171bU(C42425U c42425u, C5721UB c5721ub, Drawable drawable) {
        this.A01 = c42425u;
        this.A02 = c5721ub;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        this.A02.A1J(this.A00);
    }
}
