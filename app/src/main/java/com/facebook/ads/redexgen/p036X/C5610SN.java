package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.SN */
/* loaded from: assets/audience_network.dex */
public class C5610SN extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C44599D A00;

    public C5610SN(C44599D c44599d) {
        this.A00 = c44599d;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        AbstractC5381Of abstractC5381Of;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC5381Of abstractC5381Of2;
        abstractC5381Of = this.A00.A00;
        if (abstractC5381Of != null) {
            abstractC5381Of2 = this.A00.A00;
            abstractC5381Of2.A0Z();
        }
        AbstractC5268Mp abstractC5268Mp = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC5268Mp.setToolbarActionMode(closeButtonStyle);
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
