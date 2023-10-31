package com.facebook.ads.redexgen.p036X;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xb */
/* loaded from: assets/audience_network.dex */
public final class C5930Xb implements InterfaceC39340S {
    public static byte[] A01;
    public static String[] A02 = {"EcOoOPxvgIM5VM8gU5MNIX90mja3CaI7", "nhJ", "HCYDUCxXnFbS3htlRPDiG7BoiyzyMxIV", "Fv3YAwH75PiBj9X6AN971g", "yIx", "", "9xkhFmOksAfwag3lVFNPfz", "xjMRz"};
    public final C44148U A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "mKsg4hxQhHaV0fiKABuoeRg1A6SJU8YP";
        strArr2[2] = "TgUrCFxQKf96ICwhyLjRHk1rYV6JKdAm";
        A01 = new byte[]{-91, -111, -94, -120, -18, 29, 22, 22, 13, 20, -12, 35, 28, 28, 19, 26, -24, -50, -3, 12, 34, -16, 33, 16, 25, 31, 10, -37, -22, -29, -29, -38, -31, 57, 72, 65, 65, 56, Utf8.REPLACEMENT_BYTE, 50, Utf8.REPLACEMENT_BYTE, 66, 58, 58, 56, 55};
    }

    static {
        A01();
    }

    public C5930Xb(C44148U c44148u) {
        this.A00 = c44148u;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z) {
        C444690 c444690 = new C444690(A00(4, 6, 78));
        c444690.A05(jSONObject);
        c444690.A03(1);
        c444690.A07(z);
        try {
            jSONObject.put(A00(33, 13, 121), C44398t.A0H(this.A00));
        } catch (JSONException unused) {
        }
        this.A00.A06().A8z(A00(27, 6, 27), i + 4000, c444690);
        if (this.A00.A03().A8P()) {
            String str2 = A00(10, 8, 84) + str + A00(0, 1, 35) + i + A00(1, 3, 14) + jSONObject.toString();
        }
    }

    @VisibleForTesting
    public static boolean A03(EnumC39350T enumC39350T) {
        for (EnumC39350T enumC39350T2 : C5922XT.A09) {
            if (enumC39350T2.equals(enumC39350T)) {
                String[] strArr = A02;
                if (strArr[5].length() != strArr[7].length()) {
                    String[] strArr2 = A02;
                    strArr2[0] = "Wnbl1SxbPUMoFXuq6aB18pNeXqZWWzDi";
                    strArr2[2] = "Lc0ARXxjXBXBpMD71LOao0gY4EKFysHu";
                    return true;
                }
                throw new RuntimeException();
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39340S
    public final void A90(EnumC39350T enumC39350T, JSONObject jSONObject) {
        A02(enumC39350T.A02(), enumC39350T.toString(), jSONObject, A03(enumC39350T));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39340S
    public final void A9D(int i, JSONObject jSONObject) {
        A02(i, A00(18, 9, 81) + i, jSONObject, false);
    }
}
