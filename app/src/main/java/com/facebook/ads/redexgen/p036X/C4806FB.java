package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.FB */
/* loaded from: assets/audience_network.dex */
public class C4806FB extends C6212cA {
    public final /* synthetic */ C4805FA A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4806FB(C4805FA c4805fa, Context context) {
        super(context);
        this.A00 = c4805fa;
    }

    @Override // com.facebook.ads.redexgen.p036X.C6212cA, com.facebook.ads.redexgen.p036X.AbstractC41924g
    public final void A0I(View view, C41944i c41944i, C41904e c41904e) {
        C4805FA c4805fa = this.A00;
        int[] A0H = c4805fa.A0H(((AbstractC6198bv) c4805fa).A00.getLayoutManager(), view);
        int i = A0H[0];
        int i2 = A0H[1];
        int A0M = A0M(Math.max(Math.abs(i), Math.abs(i2)));
        if (A0M > 0) {
            c41904e.A04(i, i2, A0M, ((C6212cA) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C6212cA
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.p036X.C6212cA
    public final int A0L(int i) {
        return Math.min(100, super.A0L(i));
    }
}
