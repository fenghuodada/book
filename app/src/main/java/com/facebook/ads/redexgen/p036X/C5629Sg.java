package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Sg */
/* loaded from: assets/audience_network.dex */
public class C5629Sg implements InterfaceC5403P1 {
    public static byte[] A01;
    public final /* synthetic */ C4509A2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public C5629Sg(C4509A2 c4509a2) {
        this.A00 = c4509a2;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5403P1
    public final void ACj(String str, JSONObject jSONObject) {
        C5411PA c5411pa;
        C5953Xy c5953Xy;
        C5953Xy c5953Xy2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AF2();
            c5953Xy = this.A00.A07;
            if (C5064JR.A1I(c5953Xy)) {
                c5953Xy2 = this.A00.A07;
                c5953Xy2.A09().AAT();
            }
        }
        c5411pa = this.A00.A0F;
        c5411pa.A0h(str, jSONObject);
    }
}
