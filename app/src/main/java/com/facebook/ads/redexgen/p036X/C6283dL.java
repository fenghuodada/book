package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dL */
/* loaded from: assets/audience_network.dex */
public final class C6283dL extends AbstractC397518 {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public C6283dL(List<C39781B> list) {
        super(list);
    }

    public static C6283dL A01(JSONObject jSONObject, C5953Xy c5953Xy) {
        C6283dL c6283dL = new C6283dL(AbstractC397518.A02(jSONObject, c5953Xy, new C6284dM()));
        c6283dL.A0l(jSONObject);
        c6283dL.A0j(A03(0, 6, 27));
        return c6283dL;
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
