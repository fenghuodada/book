package com.facebook.ads.redexgen.p036X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dJ */
/* loaded from: assets/audience_network.dex */
public final class C6281dJ extends AbstractC397518 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public C6281dJ(List<C39781B> list) {
        super(list);
    }

    public static C6281dJ A01(JSONObject jSONObject, C5953Xy c5953Xy) {
        C6281dJ c6281dJ = new C6281dJ(AbstractC397518.A02(jSONObject, c5953Xy, new C6282dK()));
        c6281dJ.A0l(jSONObject);
        c6281dJ.A0j(A03(0, 12, 67));
        return c6281dJ;
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
