package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Kl */
/* loaded from: assets/audience_network.dex */
public final class C5144Kl {
    public static C5144Kl A00;
    public static byte[] A01;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, 61, 23, 24, 41, 0, 23, 26, 31, 18, 23, 2, 31, 25, 24, 41, 3, 3, 31, 18, 96, 108, 103, 102, 16, 21, 0, 21, 103, 98, 119, 98, 76, 97, 105, 102, 96, 119, 35, 106, 112, 35, 109, 118, 111, 111, 65, 68, 81, 68, 122, 72, 74, 65, 64, 73, 122, 81, 92, 85, 64, 44, 45, 46, 33, 38, 33, 60, 33, 39, 38, 69, 82, 82, 79, 82, 87, 84, 80, 69, 68, 67, 84, 110, 82, 94, 95, 87, 88, 86, 66, 74, 92, 92, 78, 72, 74, 21, 9, 4, 6, 0, 8, 0, 11, 17, 22, 22, 16, 3, 1, 9, 7, 16, 17, 77, 64, 73, 92};
    }

    static {
        A05();
        A00 = new C5144Kl();
    }

    public static synchronized C5144Kl A00() {
        C5144Kl c5144Kl;
        synchronized (C5144Kl.class) {
            c5144Kl = A00;
        }
        return c5144Kl;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x005d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.p036X.C5708Ty A01(com.facebook.ads.redexgen.p036X.C5953Xy r11, org.json.JSONObject r12, long r13) throws org.json.JSONException {
        /*
            r10 = this;
            r2 = 124(0x7c, float:1.74E-43)
            r1 = 10
            r0 = 18
            java.lang.String r0 = A04(r2, r1, r0)
            org.json.JSONArray r1 = r12.getJSONArray(r0)
            r0 = 0
            org.json.JSONObject r4 = r1.getJSONObject(r0)
            r2 = 88
            r1 = 10
            r0 = 63
            java.lang.String r0 = A04(r2, r1, r0)
            org.json.JSONObject r0 = r4.getJSONObject(r0)
            com.facebook.ads.redexgen.X.9I r6 = com.facebook.ads.redexgen.p036X.C44649I.A00(r0)
            r2 = 103(0x67, float:1.44E-43)
            r1 = 14
            r0 = 70
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r3 = r4.optString(r0)
            r2 = 0
            r1 = 19
            r0 = 98
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r0 = r4.optString(r0)
            com.facebook.ads.redexgen.X.9H r5 = new com.facebook.ads.redexgen.X.9H
            r5.<init>(r6, r3, r0)
            r2 = 26
            r1 = 3
            r0 = 57
            java.lang.String r1 = A04(r2, r1, r0)
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto Lc1
            org.json.JSONArray r7 = r4.getJSONArray(r1)
            r6 = 0
        L59:
            int r0 = r7.length()
            if (r6 >= r0) goto Lc1
            org.json.JSONObject r9 = r7.getJSONObject(r6)
            r0 = 0
            com.facebook.ads.redexgen.p036X.C5090Jr.A06(r11, r9, r13, r0)
            r2 = 19
            r1 = 7
            r0 = 39
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r8 = r9.optString(r0)
            r2 = 73
            r1 = 15
            r0 = 82
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r4 = r9.optString(r0)
            r2 = 51
            r1 = 4
            r0 = 3
            java.lang.String r0 = A04(r2, r1, r0)
            org.json.JSONObject r3 = r9.optJSONObject(r0)
            r2 = 134(0x86, float:1.88E-43)
            r1 = 8
            r0 = 21
            java.lang.String r0 = A04(r2, r1, r0)
            org.json.JSONArray r1 = r9.optJSONArray(r0)
            if (r3 == 0) goto La9
            com.facebook.ads.redexgen.X.9F r0 = new com.facebook.ads.redexgen.X.9F
            r0.<init>(r8, r4, r3, r1)
            r5.A09(r0)
        La6:
            int r6 = r6 + 1
            goto L59
        La9:
            com.facebook.ads.redexgen.X.0R r4 = r11.A0D()
            com.facebook.ads.internal.protocol.AdErrorType r0 = com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR
            int r3 = r0.getErrorCode()
            r2 = 55
            r1 = 18
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A04(r2, r1, r0)
            r4.A4Z(r3, r0)
            goto La6
        Lc1:
            r2 = 29
            r1 = 18
            r0 = 1
            java.lang.String r0 = A04(r2, r1, r0)
            java.lang.String r1 = r12.optString(r0)
            com.facebook.ads.redexgen.X.Ty r0 = new com.facebook.ads.redexgen.X.Ty
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5144Kl.A01(com.facebook.ads.redexgen.X.Xy, org.json.JSONObject, long):com.facebook.ads.redexgen.X.Ty");
    }

    private C5707Tx A02(JSONObject jSONObject) {
        return new C5707Tx(jSONObject.optString(A04(117, 7, 88), A04(0, 0, 87)), jSONObject.optInt(A04(47, 4, 116), 0), null);
    }

    private C5707Tx A03(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray(A04(124, 10, 18)).getJSONObject(0);
            C44649I A002 = C44649I.A00(jSONObject2.getJSONObject(A04(88, 10, 63)));
            String optString = jSONObject2.optString(A04(103, 14, 70));
            String featureConfig = A04(0, 19, 98);
            String optString2 = jSONObject2.optString(featureConfig);
            String A04 = A04(117, 7, 88);
            String adReportingConfig = A04(0, 0, 87);
            String optString3 = jSONObject.optString(A04, adReportingConfig);
            String adReportingConfig2 = A04(47, 4, 116);
            return new C5707Tx(optString3, jSONObject.optInt(adReportingConfig2, 0), new C44639H(A002, optString, optString2));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    public final C5146Kn A06(C5953Xy c5953Xy, String str, long j) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(A04(142, 4, 78));
            char c = 65535;
            int hashCode = optString.hashCode();
            String A04 = A04(98, 5, 87);
            if (hashCode != 96432) {
                if (hashCode == 96784904 && optString.equals(A04)) {
                    c = 1;
                }
            } else if (optString.equals(A04(26, 3, 57))) {
                c = 0;
            }
            if (c == 0) {
                return A01(c5953Xy, jSONObject, j);
            }
            if (c != 1) {
                JSONObject optJSONObject = jSONObject.optJSONObject(A04);
                if (optJSONObject != null) {
                    return A02(optJSONObject);
                }
            } else {
                return A03(jSONObject);
            }
        }
        return new C5146Kn(EnumC5145Km.A04);
    }
}
