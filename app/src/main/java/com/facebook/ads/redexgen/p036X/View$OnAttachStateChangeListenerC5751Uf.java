package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Uf */
/* loaded from: assets/audience_network.dex */
public final class View$OnAttachStateChangeListenerC5751Uf extends AbstractC6347eS implements View.OnAttachStateChangeListener {
    public final View A00;

    public View$OnAttachStateChangeListenerC5751Uf(View view) {
        this.A00 = view;
        this.A00.addOnAttachStateChangeListener(this);
        if (A04()) {
            A00();
        }
    }

    public final void A03() {
        A00();
    }

    public final boolean A04() {
        return C409838.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        A00();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        A01();
    }
}
