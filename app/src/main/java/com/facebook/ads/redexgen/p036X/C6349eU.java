package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.eU */
/* loaded from: assets/audience_network.dex */
public final class C6349eU<ModelType, StateType> {
    public static byte[] A05;
    public static final C6349eU A06;
    public final C6349eU A00;
    public final ModelType A01;
    public final StateType A02;
    public final String A03;
    public final List<InterfaceC6352eX<ModelType, StateType>> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{81, 89, 92, 96, 101};
    }

    static {
        A02();
        A06 = new C6349eU(null, null, A01(0, 5, 123), Collections.emptyList(), A06);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6349eU(com.facebook.ads.redexgen.p036X.C6350eV<ModelType, StateType> r7) {
        /*
            r6 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.p036X.C6350eV.A01(r7)
            java.lang.Object r2 = com.facebook.ads.redexgen.p036X.C6350eV.A02(r7)
            java.lang.String r3 = com.facebook.ads.redexgen.p036X.C6350eV.A03(r7)
            java.util.List r0 = com.facebook.ads.redexgen.p036X.C6350eV.A04(r7)
            if (r0 != 0) goto L1f
            java.util.List r4 = java.util.Collections.emptyList()
        L16:
            com.facebook.ads.redexgen.X.eU r5 = com.facebook.ads.redexgen.p036X.C6350eV.A00(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L1f:
            java.util.List r4 = com.facebook.ads.redexgen.p036X.C6350eV.A04(r7)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C6349eU.<init>(com.facebook.ads.redexgen.X.eV):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C6349eU(ModelType model, StateType state, String str, List<InterfaceC6352eX<ModelType, StateType>> list, C6349eU c6349eU) {
        this.A01 = model;
        this.A02 = state;
        this.A03 = str;
        this.A00 = c6349eU;
        this.A04 = list;
    }

    public static <ModelType, StateType> C6350eV<ModelType, StateType> A00(ModelType modeltype, StateType statetype, String str) {
        return new C6350eV<>(modeltype, statetype, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eX != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC6338eJ interfaceC6338eJ) {
        for (InterfaceC6352eX<ModelType, StateType> interfaceC6352eX : this.A04) {
            interfaceC6352eX.A5I(this, interfaceC6338eJ);
        }
    }
}
