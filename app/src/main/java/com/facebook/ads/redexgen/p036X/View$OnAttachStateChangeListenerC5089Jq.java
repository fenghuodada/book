package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Jq */
/* loaded from: assets/audience_network.dex */
public class View$OnAttachStateChangeListenerC5089Jq implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC5087Jo A00;
    public final /* synthetic */ C5088Jp A01;

    public View$OnAttachStateChangeListenerC5089Jq(C5088Jp c5088Jp, EnumC5087Jo enumC5087Jo) {
        this.A01 = c5088Jp;
        this.A00 = enumC5087Jo;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A02(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
