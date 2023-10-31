package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.c2 */
/* loaded from: assets/audience_network.dex */
public class C6204c2 implements InterfaceC42004o {
    public final /* synthetic */ AbstractC41794T A00;

    public C6204c2(AbstractC41794T abstractC41794T) {
        this.A00 = abstractC41794T;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final View A5z(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final int A61(View view) {
        return this.A00.A0j(view) + ((C41804U) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final int A62(View view) {
        return this.A00.A0o(view) - ((C41804U) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final int A77() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42004o
    public final int A78() {
        return this.A00.A0g();
    }
}
