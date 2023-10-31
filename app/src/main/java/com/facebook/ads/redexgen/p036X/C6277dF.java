package com.facebook.ads.redexgen.p036X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dF */
/* loaded from: assets/audience_network.dex */
public final class C6277dF extends AbstractC397518 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 2751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{123, 108, 126, 104, 123, 109, 108, 109, 86, Byte.MAX_VALUE, 96, 109, 108, 102};
    }

    public C6277dF(List<C39781B> list) {
        super(list);
    }

    public static C6277dF A01(JSONObject jSONObject, C5953Xy c5953Xy) {
        C6277dF c6277dF = new C6277dF(AbstractC397518.A02(jSONObject, c5953Xy, new C6278dG()));
        c6277dF.A0l(jSONObject);
        c6277dF.A0j(A03(0, 14, 8));
        return c6277dF;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC397518
    public final int A0J() {
        if (A0O().A0D().A06() != null) {
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC397518
    public final int A0K() {
        return A0O().A0D().A04();
    }
}
