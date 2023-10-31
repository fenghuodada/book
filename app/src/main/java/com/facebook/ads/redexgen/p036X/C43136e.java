package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6e */
/* loaded from: assets/audience_network.dex */
public final class C43136e {
    public static byte[] A01;
    public static String[] A02 = {"GyiBUCkC", "sqowKkdsw23oOctujh4JS", "WS", "sGW2HqLA0299cVeMoAEL9ZXgIk1rlANi", "Ioat5RRD6XPbEJm7hsBEOKFMb", "Zw1v1TMFRqO", "eQUvG0dkOz1", "pYpbsacuB19XJGtGbFCxjlIFedam8DTp"};
    public static final String[] A03;
    public final float[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{21, -63, 7, -23, -33};
    }

    static {
        A01();
        A03 = new String[]{A00(2, 1, 93), A00(3, 1, 62), A00(4, 1, 51), A00(1, 1, 24)};
    }

    public C43136e(float[] fArr) {
        this.A00 = fArr;
    }

    private final float[] A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A00.length * 4;
    }

    public final JSONObject A04(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        int i = 0;
        while (true) {
            float[] fArr = this.A00;
            if (i >= fArr.length) {
                break;
            }
            String[] strArr = A03;
            if (i < strArr.length) {
                jSONObject2.put(strArr[i], fArr[i]);
            }
            i++;
        }
        if (A02[4].length() != 24) {
            A02[5] = "3DgDBkbuSJHHMnWd9lbj3dg5obl1cN";
            jSONObject.put(A00(0, 1, 109), jSONObject2);
            return jSONObject;
        }
        throw new RuntimeException();
    }

    public final boolean A05(C43136e c43136e) {
        float[] A022 = c43136e.A02();
        if (A022.length != this.A00.length) {
            return false;
        }
        for (int i = 0; i < A022.length; i++) {
            if (Math.abs(A02()[i] - A022[i]) > C42856C.A01()) {
                return false;
            }
        }
        return true;
    }
}
