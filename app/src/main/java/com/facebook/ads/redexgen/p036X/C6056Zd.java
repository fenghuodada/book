package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Zd */
/* loaded from: assets/audience_network.dex */
public class C6056Zd implements InterfaceC43306v {
    public final /* synthetic */ C6051ZY A00;

    public C6056Zd(C6051ZY c6051zy) {
        this.A00 = c6051zy;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        return this.A00.A0C(new HashMap<String, Integer>() { // from class: com.facebook.ads.redexgen.X.6o
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{123, -13};
            }

            {
                put(A00(1, 1, 109), Integer.valueOf(C6056Zd.this.A00.A01.widthPixels));
                put(A00(0, 1, 4), Integer.valueOf(C6056Zd.this.A00.A01.heightPixels));
            }
        });
    }
}
