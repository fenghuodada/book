package com.facebook.ads.redexgen.p036X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.BG */
/* loaded from: assets/audience_network.dex */
public class C4584BG extends C6212cA {
    public final /* synthetic */ C4583BF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4584BG(C4583BF c4583bf, C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A00 = c4583bf;
    }

    @Override // com.facebook.ads.redexgen.p036X.C6212cA
    public final float A0J(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.p036X.C6212cA
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.p036X.C6212cA
    public final int A0O(View view, int left) {
        int i;
        AbstractC41794T A08 = A08();
        if (!A08.A24()) {
            return 0;
        }
        C41804U c41804u = (C41804U) view.getLayoutParams();
        int start = A08.A0k(view) - c41804u.leftMargin;
        int end = A08.A0n(view) + c41804u.rightMargin;
        int A0N = A0N(start, end, A08.A0e(), A08.A0h() - A08.A0f(), left);
        i = this.A00.A02;
        return A0N + i;
    }

    @Override // com.facebook.ads.redexgen.p036X.C6212cA
    public final PointF A0P(int i) {
        return this.A00.A45(i);
    }
}
