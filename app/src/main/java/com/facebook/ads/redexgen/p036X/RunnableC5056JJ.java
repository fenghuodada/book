package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.JJ */
/* loaded from: assets/audience_network.dex */
public class RunnableC5056JJ implements Runnable {
    public static String[] A05 = {"DJpTE", "hjmigejYKbOgwmfvV1nc5iE8IDOYmXil", "2YKNaj9Qlm", "qxfanbBXI2ZjoCTgG7w8KuDdJjLlXH62", "XtZaZ3wYkBKmpvCnemS2yQk1T2uyfDPG", "Gw99gcoZxN", "lvDFpJS29mpdODJdSJz5AdBwktpN", "hlGH8f80A3YyARPnHLcSnfRHIOI89tOr"};
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C5059JM A04;

    public RunnableC5056JJ(C5059JM c5059jm, int i, int i2, int i3, float f) {
        this.A04 = c5059jm;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5060JN interfaceC5060JN;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5060JN = this.A04.A01;
            interfaceC5060JN.ACq(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            if (A05[0].length() != 5) {
                throw new RuntimeException();
            }
            A05[3] = "OXxSdVemaS9DNqMoLNSyLFOeF9oFC1IL";
            C5158L0.A00(th, this);
        }
    }
}
