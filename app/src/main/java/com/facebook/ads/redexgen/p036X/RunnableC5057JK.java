package com.facebook.ads.redexgen.p036X;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.JK */
/* loaded from: assets/audience_network.dex */
public class RunnableC5057JK implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C5059JM A01;

    public RunnableC5057JK(C5059JM c5059jm, Surface surface) {
        this.A01 = c5059jm;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5060JN interfaceC5060JN;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5060JN = this.A01.A01;
            interfaceC5060JN.AC7(this.A00);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
