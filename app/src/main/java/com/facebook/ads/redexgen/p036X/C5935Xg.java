package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Xg */
/* loaded from: assets/audience_network.dex */
public final class C5935Xg implements InterfaceC5525R0 {
    public static byte[] A01;
    public final C5952Xx A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, 21, 21, 18, -45, -8, 21, 27, 26, 15, 20, 13, -45, -6, 21, 17, 11, 20, 102, 100, 86, 99, 30, 82, 88, 86, 95, 101};
    }

    public C5935Xg(C5952Xx c5952Xx) {
        this.A00 = c5952Xx;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5525R0
    public final Map<String, String> A5W(boolean z) {
        HashMap hashMap = new HashMap();
        if (!C42665s.A00().A04()) {
            hashMap.put(A00(0, 23, 39), C44759U.A00().A01(this.A00, true).A7Y());
        }
        hashMap.put(A00(23, 10, 114), C44799Y.A06(new C445599(this.A00), this.A00, z));
        return hashMap;
    }
}
