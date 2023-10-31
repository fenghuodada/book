package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0W */
/* loaded from: assets/audience_network.dex */
public final class C39380W {
    public static byte[] A02;
    public final InterfaceC39390X A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -41, -48, -48, -57, -50, -63};
    }

    public C39380W(InterfaceC39390X interfaceC39390X, String str) {
        this.A00 = interfaceC39390X;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 21) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
