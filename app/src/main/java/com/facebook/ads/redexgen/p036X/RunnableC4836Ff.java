package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Ff */
/* loaded from: assets/audience_network.dex */
public class RunnableC4836Ff implements Runnable {
    public final /* synthetic */ C4842Fl A00;
    public final /* synthetic */ C4843Fm A01;
    public final /* synthetic */ C4844Fn A02;
    public final /* synthetic */ InterfaceC4845Fo A03;

    public RunnableC4836Ff(C4842Fl c4842Fl, InterfaceC4845Fo interfaceC4845Fo, C4843Fm c4843Fm, C4844Fn c4844Fn) {
        this.A00 = c4842Fl;
        this.A03 = interfaceC4845Fo;
        this.A01 = c4843Fm;
        this.A02 = c4844Fn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A03.ABE(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
