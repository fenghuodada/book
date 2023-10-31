package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pk */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC5447Pk implements View.OnTouchListener {
    public final /* synthetic */ C5448Pl A00;

    public View$OnTouchListenerC5447Pk(C5448Pl c5448Pl) {
        this.A00 = c5448Pl;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC5080Jh interfaceC5080Jh;
        AbstractC397518 abstractC397518;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C5448Pl.A00(this.A00);
            interfaceC5080Jh = this.A00.A06;
            abstractC397518 = this.A00.A03;
            interfaceC5080Jh.A99(abstractC397518.A0U(), new C5356OG().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
