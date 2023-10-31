package com.facebook.ads.redexgen.p036X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.eM */
/* loaded from: assets/audience_network.dex */
public class RunnableC6341eM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C6340eL A01;

    public RunnableC6341eM(C6340eL c6340eL, int i) {
        this.A01 = c6340eL;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC5597SA interfaceC5597SA;
        Handler handler;
        Runnable runnable;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            z = this.A01.A01;
            if (z) {
                C6340eL c6340eL = this.A01;
                interfaceC5597SA = this.A01.A05;
                c6340eL.A06(interfaceC5597SA.A9j());
                handler = this.A01.A04;
                runnable = this.A01.A09;
                handler.postDelayed(runnable, this.A00);
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
