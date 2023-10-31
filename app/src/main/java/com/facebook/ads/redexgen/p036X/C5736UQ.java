package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.UQ */
/* loaded from: assets/audience_network.dex */
public class C5736UQ implements InterfaceC5355OF {
    public static String[] A01 = {"PnhhxO44eyGR", "6RYeLXmAClA1SiGKn201px", "WqNcg2MFF", "kFMGwY5yNNV", "mQRpAL1oxGJgw", "Eqf6jMIzeI3tCjJb", "9imsVe3tjkVzhTosgYrmf1lKW7QE2MSM", "NRYl8cTHkwcGHXULnCD2cakkWnkUWd4e"};
    public final /* synthetic */ C5733UN A00;

    public C5736UQ(C5733UN c5733un) {
        this.A00 = c5733un;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5355OF
    public final void AAx(boolean z) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC5097Jy interfaceC5097Jy;
        InterfaceC5097Jy interfaceC5097Jy2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            interfaceC5097Jy = this.A00.A02;
            if (interfaceC5097Jy != null) {
                C5733UN c5733un = this.A00;
                String[] strArr = A01;
                if (strArr[5].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A01[2] = "moHDWw2Q1";
                interfaceC5097Jy2 = c5733un.A02;
                interfaceC5097Jy2.ABk(z);
            }
        }
    }
}
