package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Fb */
/* loaded from: assets/audience_network.dex */
public class RunnableC4832Fb implements Runnable {
    public static String[] A02 = {"WoRssMEMKAHHv5eOYWv6bcyCNlOXOf", "pA2", "3fT7OOiQOTO0YPgLHZKt2Q997Hb2Xix9", "WvgPUzUWGb7Do3xsV3", "Ec3vTQmgAcMNirmUvkhwoL1JefVS29Et", "cLkVqjW9ihOrHUtkcRLXNZqcrrO72e", "NZCcSFELY0AlwKVNvcWKAmZ3Ywu7Rk3n", "YvU"};
    public final /* synthetic */ C4842Fl A00;
    public final /* synthetic */ InterfaceC4845Fo A01;

    public RunnableC4832Fb(C4842Fl c4842Fl, InterfaceC4845Fo interfaceC4845Fo) {
        this.A00 = c4842Fl;
        this.A01 = interfaceC4845Fo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A01.ABU(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            if (A02[4].charAt(31) != 't') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "YLN";
            strArr[1] = "t0z";
        }
    }
}
