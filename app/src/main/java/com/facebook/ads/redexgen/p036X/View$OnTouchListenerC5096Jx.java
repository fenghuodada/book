package com.facebook.ads.redexgen.p036X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Jx */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC5096Jx implements View.OnTouchListener {
    public static String[] A01 = {"Jj6DPCpvRav0Dl4Hzko1ZYQ46cJHU9e3", "aRIYRX895b825x5MQHViVQuTPsX5EcgU", "WsB7SnaDyHBw", "ElhXrOblYWeIXKV5fK", "0U38eQ8bNMWMKT3qwHCBhGirZFomfBRA", "KG5ePHom1Hb0a65hRE12sPtgaad7Jk0V", "yn6apVjnupr8JkU7fdbub5PEYmvdUytV", "Qv1reMq3fGwFA"};
    public final /* synthetic */ C5733UN A00;

    public View$OnTouchListenerC5096Jx(C5733UN c5733un) {
        this.A00 = c5733un;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C4553Al c4553Al;
        C4553Al c4553Al2;
        c4553Al = this.A00.A04;
        if (c4553Al != null) {
            int action = motionEvent.getAction();
            if (A01[6].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "gh2YpB8N5DvGnIVUwjzoCnzlhXQ6xZpi";
            strArr[4] = "c0aZKZ8jQy4nragOlR5MHbPn3w24MGfh";
            if (action == 1) {
                c4553Al2 = this.A00.A04;
                c4553Al2.A0n();
            }
        }
        return true;
    }
}
