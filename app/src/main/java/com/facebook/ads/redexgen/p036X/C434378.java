package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.78 */
/* loaded from: assets/audience_network.dex */
public final class C434378 {
    public static byte[] A01;
    public static String[] A02 = {"dNawujz5uV7FYgEDis7mqHiOYshviVT", "9zMPJcjBq2CUVbnUK8h7IqP7lj2y2mDE", "v9kwRPsjL9e79G", "Q5ai3781mryKatmpPHMLZ9OBEo", "39szp", "Eqic037VHIj9mkDB9Ac6oywo8OkpAY9", "EWNNEyX3tdVvHEmrYmgOIteMXnkg7nZP", "FOdMhgM8irk7XO"};
    public static final String A03;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "0af503L5MOYuQEPRhxTnmunHvI";
            strArr2[4] = "8ZzF9";
            copyOfRange[i4] = (byte) (i5 ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 9, 9, 20, 9, 91, 56, 9, 30, 26, 15, 18, 21, 28, 91, 49, 40, 52, 53, 50, Utf8.REPLACEMENT_BYTE};
    }

    static {
        A01();
        A03 = C434378.class.getSimpleName();
    }

    public C434378(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public final JSONObject A03() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 2, 21), this.A00);
        } catch (JSONException e) {
            Log.e(A03, A00(0, 19, 63), e);
        }
        return jSONObject;
    }
}
