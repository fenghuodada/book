package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.BO */
/* loaded from: assets/audience_network.dex */
public class RunnableC4592BO implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C4596BS A01;

    public RunnableC4592BO(C4596BS c4596bs, Format format) {
        this.A01 = c4596bs;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4597BT interfaceC4597BT;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC4597BT = this.A01.A01;
            interfaceC4597BT.AA7(this.A00);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
