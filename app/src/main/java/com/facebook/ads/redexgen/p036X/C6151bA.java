package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bA */
/* loaded from: assets/audience_network.dex */
public final class C6151bA implements InterfaceC42956M {
    public static byte[] A01;
    public static final String A02;
    public final C5952Xx A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 116, 111, 105, 124, 120, 101, 99, 98, 44, 110, 121, 101, 96, 104, 101, 98, 107, 44, 74, 77, 66, 44, 96, 99, 107, 107, 101, 98, 107, 44, 70, 95, 67, 66, 69, 87, 77, 64, 71, 65, 122, 65, 68, 81, 68, 122, 73, 74, 66, 66, 76, 75, 66, 72, 67, 78, 121, 110, 65, 71, 32, 54, 39, 9, 16, 30};
    }

    static {
        A01();
        A02 = C6151bA.class.getSimpleName();
    }

    public C6151bA(C5952Xx c5952Xx) {
        this.A00 = c5952Xx;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42956M
    public final void A9K(String str, String str2, int i, int i2, int i3, JSONObject jSONObject, EnumC433570 enumC433570) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(A00(35, 4, 20), str);
            jSONObject2.put(A00(54, 3, 26), str2);
            jSONObject2.put(A00(57, 2, 42), i);
            jSONObject2.put(A00(59, 2, 3), i2);
            jSONObject2.put(A00(61, 3, 99), i3);
            jSONObject2.put(A00(64, 3, 74), C43527H.A01(jSONObject.toString(), str2));
            C444690 c444690 = new C444690(jSONObject2.toString());
            c444690.A03(1);
            this.A00.A06().A8z(A00(39, 15, 21), 3201, c444690);
        } catch (JSONException e) {
            Log.e(A02, A00(0, 35, 60), e);
        }
    }
}
