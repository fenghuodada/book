package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Fh */
/* loaded from: assets/audience_network.dex */
public class RunnableC4838Fh implements Runnable {
    public final /* synthetic */ C4842Fl A00;
    public final /* synthetic */ InterfaceC4845Fo A01;

    public RunnableC4838Fh(C4842Fl c4842Fl, InterfaceC4845Fo interfaceC4845Fo) {
        this.A00 = c4842Fl;
        this.A01 = interfaceC4845Fo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A01.AC3(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
