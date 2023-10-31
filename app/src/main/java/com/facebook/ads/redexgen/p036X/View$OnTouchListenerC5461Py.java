package com.facebook.ads.redexgen.p036X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Py */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC5461Py implements View.OnTouchListener {
    public final /* synthetic */ C5483QK A00;

    public View$OnTouchListenerC5461Py(C5483QK c5483qk) {
        this.A00 = c5483qk;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C44829b c44829b;
        c44829b = this.A00.A0B;
        c44829b.A02(new C5148Kp(view, motionEvent));
        return false;
    }
}
