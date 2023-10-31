package com.facebook.ads.redexgen.p036X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Rv */
/* loaded from: assets/audience_network.dex */
public final class C5582Rv extends AbstractC41674H<C5580Rt> {
    public final int A00;
    public final C5953Xy A01;
    public final List<String> A02;

    public C5582Rv(C5953Xy c5953Xy, List<String> screenshotUrls, int i) {
        this.A02 = screenshotUrls;
        this.A00 = i;
        this.A01 = c5953Xy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A01 */
    public final C5580Rt A06(ViewGroup viewGroup, int i) {
        return new C5580Rt(new C5581Ru(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A02 */
    public final void A0E(C5580Rt c5580Rt, int leftMargin) {
        int i;
        String str = this.A02.get(leftMargin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A00;
        int startSpacing = i2 * 4;
        if (leftMargin == 0) {
            i2 = startSpacing;
        }
        int startSpacing2 = A0D();
        if (leftMargin >= startSpacing2 - 1) {
            int startSpacing3 = this.A00;
            i = startSpacing3 * 4;
        } else {
            i = this.A00;
        }
        marginLayoutParams.setMargins(i2, 0, i, 0);
        c5580Rt.A0l().setLayoutParams(marginLayoutParams);
        c5580Rt.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    public final int A0D() {
        return this.A02.size();
    }
}
