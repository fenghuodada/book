package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.c8 */
/* loaded from: assets/audience_network.dex */
public class C6210c8 extends AbstractC41634D {
    public C6210c8(AbstractC41794T abstractC41794T) {
        super(abstractC41794T, null);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C41804U) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A0D(View view) {
        C41804U c41804u = (C41804U) view.getLayoutParams();
        return this.A02.A0l(view) + c41804u.topMargin + c41804u.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A0E(View view) {
        C41804U c41804u = (C41804U) view.getLayoutParams();
        return this.A02.A0m(view) + c41804u.leftMargin + c41804u.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C41804U) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41634D
    public final void A0J(int i) {
        this.A02.A10(i);
    }
}
