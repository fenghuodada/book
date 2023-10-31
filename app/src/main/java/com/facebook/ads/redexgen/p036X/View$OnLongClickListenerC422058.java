package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.58 */
/* loaded from: assets/audience_network.dex */
public class View$OnLongClickListenerC422058 implements View.OnLongClickListener {
    public final /* synthetic */ C422159 A00;

    public View$OnLongClickListenerC422058(C422159 c422159) {
        this.A00 = c422159;
    }

    public /* synthetic */ View$OnLongClickListenerC422058(C422159 c422159, C421755 c421755) {
        this(c422159);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (C422159.A02(this.A00) != null && C422159.A00(this.A00) != null) {
            C422159.A02(this.A00).setBounds(0, 0, C422159.A00(this.A00).getWidth(), C422159.A00(this.A00).getHeight());
            C422159.A02(this.A00).A0D(!C422159.A02(this.A00).A0E());
        }
        return true;
    }
}
