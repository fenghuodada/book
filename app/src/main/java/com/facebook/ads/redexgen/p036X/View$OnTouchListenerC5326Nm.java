package com.facebook.ads.redexgen.p036X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nm */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC5326Nm implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            i = C5332Ns.A0D;
            C5245MS.A0M(view, i);
        } else if (action == 1) {
            C5245MS.A0M(view, 0);
        }
        return false;
    }
}
