package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.JH */
/* loaded from: assets/audience_network.dex */
public class RunnableC5054JH implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C5059JM A01;

    public RunnableC5054JH(C5059JM c5059jm, Format format) {
        this.A01 = c5059jm;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5060JN interfaceC5060JN;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5060JN = this.A01.A01;
            interfaceC5060JN.ACl(this.A00);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
