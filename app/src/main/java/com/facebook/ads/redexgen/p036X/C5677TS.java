package com.facebook.ads.redexgen.p036X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.TS */
/* loaded from: assets/audience_network.dex */
public class C5677TS implements InterfaceC5267Mo {
    public static String[] A01 = {"h2gmCgzeOSwPpQadyubORmPME", "FUsicmE", "hn4NyL1W4e9kqLwlHKvUfsHZQMREJpya", "eHNPFabCzKzaRImgdDwbhByrCj67ZmIn", "6elmdBIgNV", "KYWsfvA8UKVAEYMYl", "OScpkLbA9Akq1WCCJj9B2P18mljyrRf1", "CLPqh0UltEqIAscKXF8yE5GQF7q0sxf27"};
    public final /* synthetic */ C5673TO A00;

    public C5677TS(C5673TO c5673to) {
        this.A00 = c5673to;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5267Mo
    public final void AAK() {
        boolean A0Z;
        boolean z;
        C5088Jp c5088Jp;
        InterfaceC5269Mq interfaceC5269Mq;
        InterfaceC5296NI interfaceC5296NI;
        AtomicBoolean atomicBoolean;
        boolean A0Y;
        AtomicBoolean atomicBoolean2;
        C5370OU c5370ou;
        A0Z = this.A00.A0Z();
        if (A0Z) {
            C5673TO c5673to = this.A00;
            if (A01[5].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "BQfapZ2cL00AEaaE3FSFtmiC2NvNVd8B";
            strArr[7] = "2Eilcj8Fw7KGtRQsL0qtkyDrsBY20NGQL";
            atomicBoolean2 = c5673to.A0Q;
            if (!atomicBoolean2.get()) {
                c5370ou = this.A00.A0O;
                c5370ou.A07(this.A00);
                return;
            }
        }
        z = this.A00.A0S;
        if (z) {
            atomicBoolean = this.A00.A0Q;
            boolean z2 = atomicBoolean.get();
            String[] strArr2 = A01;
            if (strArr2[1].length() == strArr2[4].length()) {
                throw new RuntimeException();
            }
            A01[5] = "H8RzDb7PgK43jKvxQ";
            if (!z2) {
                A0Y = this.A00.A0Y();
                if (A0Y) {
                    this.A00.A0V.setToolbarActionMode(0);
                    C5673TO c5673to2 = this.A00;
                    String[] strArr3 = A01;
                    if (strArr3[1].length() != strArr3[4].length()) {
                        A01[3] = "HnGIws8hCrqNeUOcBeXjDBOXn0GrcMNy";
                        c5673to2.A0M();
                        return;
                    }
                    c5673to2.A0M();
                    return;
                }
            }
        }
        c5088Jp = this.A00.A0I;
        c5088Jp.A02(EnumC5087Jo.A07, null);
        interfaceC5269Mq = this.A00.A0L;
        interfaceC5296NI = this.A00.A0M;
        interfaceC5269Mq.A3s(interfaceC5296NI.A6U());
    }
}
