package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1o */
/* loaded from: assets/audience_network.dex */
public final class C40171o {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{25, 95, 67, 90, 91, 124, 107, 121, 111, 124, 106, 107, 106, 81, 120, 103, 106, 107, 97};
    }

    public static void A02(C5953Xy c5953Xy, C43657U c43657u, C6277dF c6277dF) {
        c43657u.A0c(new C43637S(c6277dF.A0R().A01(), C5436PZ.A04, C5436PZ.A04, c6277dF.A0Z(), A00(5, 14, 28)));
        boolean A0r = c6277dF.A0r();
        if (A0r) {
            C43617Q c43617q = new C43617Q(c6277dF.A0V(), c6277dF.A0Z(), A00(5, 14, 28));
            c43617q.A04 = true;
            c43617q.A03 = A00(0, 5, 37);
            c43657u.A0X(c43617q);
        }
        boolean A27 = C5064JR.A27(c5953Xy, C5505Qg.A03());
        C43617Q c43617q2 = new C43617Q(c6277dF.A0O().A0D().A08(), c6277dF.A0Z(), A00(5, 14, 28), c6277dF.A0O().A0D().A05());
        if (A0r && !A27) {
            c43657u.A0X(c43617q2);
        } else {
            c43657u.A0a(c43617q2);
        }
        c43657u.A0c(new C43637S(c6277dF.A0O().A0D().A07(), C40121j.A00(c6277dF.A0O().A0D()), C40121j.A01(c6277dF.A0O().A0D()), c6277dF.A0Z(), A00(5, 14, 28)));
        for (String str : c6277dF.A0O().A0G().A00()) {
            c43657u.A0c(new C43637S(str, -1, -1, c6277dF.A0Z(), A00(5, 14, 28)));
        }
    }
}
