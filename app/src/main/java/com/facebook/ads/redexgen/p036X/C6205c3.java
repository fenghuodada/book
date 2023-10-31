package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.c3 */
/* loaded from: assets/audience_network.dex */
public class C6205c3 implements InterfaceC42004o {
    public final /* synthetic */ AbstractC41794T A00;

    public C6205c3(AbstractC41794T abstractC41794T) {
        this.A00 = abstractC41794T;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final View A5z(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final int A61(View view) {
        return this.A00.A0n(view) + ((C41804U) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final int A62(View view) {
        return this.A00.A0k(view) - ((C41804U) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final int A77() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final int A78() {
        return this.A00.A0e();
    }
}
