package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Fj */
/* loaded from: assets/audience_network.dex */
public class RunnableC4840Fj implements Runnable {
    public final /* synthetic */ C4842Fl A00;
    public final /* synthetic */ C4844Fn A01;
    public final /* synthetic */ InterfaceC4845Fo A02;

    public RunnableC4840Fj(C4842Fl c4842Fl, InterfaceC4845Fo interfaceC4845Fo, C4844Fn c4844Fn) {
        this.A00 = c4842Fl;
        this.A02 = interfaceC4845Fo;
        this.A01 = c4844Fn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A02.AAZ(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
