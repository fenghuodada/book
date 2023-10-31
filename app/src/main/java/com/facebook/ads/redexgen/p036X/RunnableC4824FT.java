package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.FT */
/* loaded from: assets/audience_network.dex */
public class RunnableC4824FT implements Runnable {
    public final /* synthetic */ C4644CE A00;

    public RunnableC4824FT(C4644CE c4644ce) {
        this.A00 = c4644ce;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC5805VX interfaceC5805VX;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0G;
            if (!z) {
                interfaceC5805VX = this.A00.A08;
                interfaceC5805VX.AAP(this.A00);
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
