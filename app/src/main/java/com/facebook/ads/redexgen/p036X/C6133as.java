package com.facebook.ads.redexgen.p036X;

import android.content.pm.ApplicationInfo;

/* renamed from: com.facebook.ads.redexgen.X.as */
/* loaded from: assets/audience_network.dex */
public class C6133as implements InterfaceC43306v {
    public static String[] A01 = {"273FKnw5fEMMMPHYpDWr2uCxLH", "MURfYE", "2MrWxfjycJYz8CRz8nVEoUtgAppiNGkb", "dgs6GO1Bgwq7bEpFzLz1V7Vq3FkVRsxg", "uUhMN1Ac0a0MVvdzsNpT9rjxKSsemVru", "HLxj17LMU0ZLExoNf0E99eYx3QTlHuEl", "3ccBwYNuPT2bbHKd70up9vlieZX79PEX", "FpcSlILO2LyEt0C9jtDQqRZtHAa4Q2N9"};
    public final /* synthetic */ C6113aY A00;

    public C6133as(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C6113aY c6113aY = this.A00;
            applicationInfo2 = c6113aY.A01;
            if (A01[1].length() != 3) {
                A01[3] = "Yec9tINwCXE8zEgRYPM9thJfbPEs0Pqz";
                return c6113aY.A08(applicationInfo2.taskAffinity);
            }
            throw new RuntimeException();
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
