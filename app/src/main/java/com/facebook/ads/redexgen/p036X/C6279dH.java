package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dH */
/* loaded from: assets/audience_network.dex */
public final class C6279dH extends AbstractC397518 {
    public static byte[] A00 = null;
    public static String[] A01 = {"jMc", "F9KJU5nWCxEJfH1MtrJPQ98rlg2xhqhb", "7jNlYgKw34wypv3TsOCVRM97qni1IFkS", "W5gvHzH3tQhCbbf1Q7sr07NWbFeRHxz0", "QDsxhdyObZs2LD8uuSUlwesP8VUImdt4", "RqkZZA1TQwwc7Sj8gFRGBwQRvCLKOG1p", "3", "FXFS7BhAGvbRYPXLgdilxhgSLH2Ol13Z"};
    public static final long serialVersionUID = 5751287062553772012L;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[0].length() == 16) {
                throw new RuntimeException();
            }
            A01[0] = "basKOcZiobbMvO07tra14WeVIAzrAzDF";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A04() {
        A00 = new byte[]{5, -8, 11, 0, 13, -4};
    }

    static {
        A04();
    }

    public C6279dH(List<C39781B> list) {
        super(list);
    }

    public static C6279dH A01(JSONObject jSONObject, C5953Xy c5953Xy) {
        C6279dH c6279dH = new C6279dH(AbstractC397518.A02(jSONObject, c5953Xy, new C6280dI()));
        c6279dH.A0l(jSONObject);
        c6279dH.A0j(A03(0, 6, 46));
        return c6279dH;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC397518
    public final int A0J() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC397518
    public final int A0K() {
        return 0;
    }
}
