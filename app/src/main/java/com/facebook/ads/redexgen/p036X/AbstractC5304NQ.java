package com.facebook.ads.redexgen.p036X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.NQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5304NQ extends RelativeLayout implements InterfaceC5470Q7 {
    @Nullable
    public C5483QK A00;

    public AbstractC5304NQ(C5953Xy c5953Xy) {
        super(c5953Xy);
    }

    public AbstractC5304NQ(C5953Xy c5953Xy, AttributeSet attributeSet, int i) {
        super(c5953Xy, attributeSet, i);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void A8o(C5483QK c5483qk) {
        this.A00 = c5483qk;
        A07();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5470Q7
    public final void AFG(C5483QK c5483qk) {
        A08();
        this.A00 = null;
    }

    @Nullable
    public C5483QK getVideoView() {
        return this.A00;
    }
}
