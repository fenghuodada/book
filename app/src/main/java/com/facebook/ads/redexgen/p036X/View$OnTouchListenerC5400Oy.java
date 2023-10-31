package com.facebook.ads.redexgen.p036X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oy */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC5400Oy implements View.OnTouchListener {
    public final /* synthetic */ C4509A2 A00;

    public View$OnTouchListenerC5400Oy(C4509A2 c4509a2) {
        this.A00 = c4509a2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C5404P2 c5404p2;
        c5404p2 = this.A00.A0E;
        c5404p2.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
