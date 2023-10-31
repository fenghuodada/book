package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Uh */
/* loaded from: assets/audience_network.dex */
public class C5753Uh implements InterfaceC5554RT {
    public static byte[] A02;
    public final /* synthetic */ C5952Xx A00;
    public final /* synthetic */ InterfaceC5552RR A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C5753Uh(InterfaceC5552RR interfaceC5552RR, C5952Xx c5952Xx) {
        this.A01 = interfaceC5552RR;
        this.A00 = c5952Xx;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5554RT
    public final void A3u() {
        try {
            C5064JR.A0O(this.A00).A2F(this.A01.A6J().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e) {
            this.A00.A06().A3R(e);
        }
    }
}
