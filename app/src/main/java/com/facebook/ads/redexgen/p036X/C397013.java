package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import okhttp3.internal.http.StatusLine;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.13 */
/* loaded from: assets/audience_network.dex */
public final class C397013 {
    public static byte[] A00;
    public static String[] A01 = {"qHmRz", "buvn2cesYrN8zmkoMAJdpkbnyQRY3iAF", "x7vS8I9TWcDRkC3QyQGWlMzhObF4g2wW", "AIjy2jeTbkREqnWnmOA9dVfWABJZ", "IfUpOWHYsX9n2UOxpamTmBNI3XVXxi7a", "s9Ktc", "3piv7SWQV7vtTtwTZRFeo4G9v1NaSSob", "iW7v8IxehIW1LC67DBoujqNPrB3dw9pM"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, 50, 33, 38, 34, 43, 32, 34, -35, 11, 34, 49, 52, 44, 47, 40, -35, 9, 44, 30, 33, 34, 33, -9, 16, 3, 4, 14, 7, -62, 22, 17, -62, 18, 3, 20, 21, 7, -62, 5, 3, 20, 17, 23, 21, 7, 14, -62, 6, 3, 22, 3, -48, -41, -38, -43, -39, -34, -27, -33, -39, -37, -23, -43, -33, -39, -27, -28, -30, -27, -32, -28, -23, -16, -22, -28, -26, -12, -32, -19, -22, -17, -20, -32, -10, -13, -19, -5, -2, -7, 14, 12, -5, 8, 13, 6, -5, 14, 3, 9, 8, 68, 71, 89, 72, 85, 87, 76, 86, 72, 85, 66, 81, 68, 80, 72, 26, 39, 24, 37, 40, 32, 40, 24, 45, 50, 41, 30, -19, -6, -17, 4, -23, -25, -14, -14, -27, -6, -11, -27, -25, -23, -6, -17, -11, -12, -45, -47, -30, -33, -27, -29, -43, -36, 65, 77, 76, 82, Utf8.REPLACEMENT_BYTE, 71, 76, 67, 80, 61, 84, 71, 67, 85, Utf8.REPLACEMENT_BYTE, 64, 71, 74, 71, 82, 87, 61, 65, 70, 67, 65, 73, 61, 71, 76, 82, 67, 80, 84, Utf8.REPLACEMENT_BYTE, 74, 27, 39, 38, 44, 25, 33, 38, 29, 42, 23, 46, 33, 29, 47, 25, 26, 33, 36, 33, 44, 49, 23, 29, 38, 25, 26, 36, 29, 28, -23, -22, -7, -22, -24, -7, -18, -12, -13, -28, -8, -7, -9, -18, -13, -20, -8, -37, -28, -41, -40, -30, -37, -43, -23, -28, -41, -26, -23, -34, -27, -22, -43, -30, -27, -35, 41, 50, 37, 38, 48, 41, 35, 58, 45, 41, 59, 35, 48, 51, 43, 74, 83, 72, 87, 94, 85, 89, 74, 73, 68, 72, 85, 82, -23, -27, -28, -25, -30, -26, -14, -16, -16, -28, -15, -25, 24, 21, 17, 20, 28, 25, 30, 21, 54, 48, 60, 59, 77, 81, 69, 75, 73, 52, 57, 65, 44, 55, 52, 47, 44, Utf8.REPLACEMENT_BYTE, 52, 58, 57, 42, 45, 48, 51, 44, 65, 52, 58, 61, 62, 59, 64, 61, 49, 54, 55, 69, 53, 68, 59, 66, 70, 59, 65, 64, 38, 23, 40, 41, 31, 36, 29, 45, 30, 50, 48, 34, 28, 49, 47, 30, 43, 48, 41, 30, 49, 38, 44, 43, 52, 48, 37, 61, 35, 56, 54, 37, 50, 55, 48, 37, 56, 45, 51, 50, 80, 82, 79, 77, 79, 84, 69, 68, Utf8.REPLACEMENT_BYTE, 84, 82, 65, 78, 83, 76, 65, 84, 73, 79, 78, -9, -22, -10, -6, -22, -8, -7, -28, -18, -23, 9, 4, -9, 6, 9, -2, 5, 10, -11, -7, 5, 3, 6, 8, -5, 9, 9, -11, 7, 11, -9, 2, -1, 10, 15, 64, 59, 46, 61, 64, 53, 60, 65, 44, 57, 60, 52, 44, 49, 50, 57, 46, 70, 44, 64, 50, 48, 60, 59, 49, 96, 92, 80, 86, 78, 89, 76, 80, 92, 91, 97, 82, 101, 97, -24, -27, -28, -29, -24, -28, -25, -38, -39, -44, -23, -25, -42, -29, -24, -31, -42, -23, -34, -28, -29, 64, 65, 46, Utf8.REPLACEMENT_BYTE, 44, Utf8.REPLACEMENT_BYTE, 46, 65, 54, 59, 52, 55, 57, 38, 56, 45, 56, 48, 41, 33, 22, 33, 25, 18, 50, 48, 34, 33, 28, 47, 34, 45, 44, 47, 49, 28, 50, 47, 41, 69, 56, 51, 52, 62, 46, 48, 68, 67, 62, Utf8.REPLACEMENT_BYTE, 59, 48, 72, 46, 52, 61, 48, 49, 59, 52, 51, 30, 17, 12, 13, 23, 7, 21, 24, 12, 4, -9, -14, -13, -3, -19, -2, 0, -13, -6, -3, -17, -14, -19, 1, -9, 8, -13, -19, -16, 7, 2, -13, 1, 82, 69, 64, 65, 75, 59, 81, 78, 72, 76, Utf8.REPLACEMENT_BYTE, 59, 77, 55, 56, Utf8.REPLACEMENT_BYTE, 66, Utf8.REPLACEMENT_BYTE, 74, 79, 53, 57, 62, 59, 57, 65, 53, Utf8.REPLACEMENT_BYTE, 68, Utf8.REPLACEMENT_BYTE, 74, Utf8.REPLACEMENT_BYTE, 55, 66, 53, 58, 59, 66, 55, 79, 41, 28, 24, 42, 20, 21, 28, 31, 28, 39, 44, 18, 22, 27, 24, 22, 30, 18, 28, 33, 39, 24, 37, 41, 20, 31};
        String[] strArr = A01;
        if (strArr[1].charAt(29) != strArr[4].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aYUm7";
        strArr2[5] = "aSssW";
    }

    static {
        A03();
    }

    public static C396811 A00(C5953Xy c5953Xy, JSONObject jSONObject, String str) {
        return A01(c5953Xy, jSONObject, str, false, -1, 0);
    }

    public static C396811 A01(C5953Xy c5953Xy, JSONObject jSONObject, String str, boolean z, int i, int i2) {
        EnumC5109KA enumC5109KA;
        ArrayList arrayList;
        String A02 = A02(349, 7, 70);
        if (jSONObject == null) {
            return new C396811();
        }
        C5197Lg.A02(c5953Xy, A02(0, 23, 77));
        String optString = jSONObject.optString(A02(409, 10, 21));
        int optInt = jSONObject.optInt(A02(116, 12, 73), 0);
        String optString2 = jSONObject.optString(A02(270, 13, 117));
        String encryptedCPM = C5214Lx.A02(jSONObject, A02(283, 12, 19));
        Uri A002 = TextUtils.isEmpty(encryptedCPM) ? null : C5191La.A00(encryptedCPM);
        String A022 = C5214Lx.A02(jSONObject, A02(128, 4, 27));
        String A012 = C5229MC.A01(A022);
        String adUntrimmedBodyText = A02(101, 15, 115);
        String A023 = C5214Lx.A02(jSONObject, adUntrimmedBodyText);
        String adUntrimmedBodyText2 = A02(523, 5, 61);
        String requestId = C5214Lx.A02(jSONObject, adUntrimmedBodyText2);
        String adUntrimmedBodyText3 = A02(515, 8, 84);
        String adBodyText = C5214Lx.A02(jSONObject, adUntrimmedBodyText3);
        String adSubtitle = A02(295, 8, 64);
        String adSocialContext = C5214Lx.A02(jSONObject, adSubtitle);
        String adHeadline = A02(469, 14, 125);
        String adPlayTranslation = C5214Lx.A02(jSONObject, adHeadline);
        String adHeadline2 = A02(333, 16, 98);
        String A024 = C5214Lx.A02(jSONObject, adHeadline2);
        String adHeadline3 = A02(483, 21, 5);
        String A025 = C5214Lx.A02(jSONObject, adHeadline3);
        String adHeadline4 = A02(87, 14, 42);
        String A026 = C5214Lx.A02(jSONObject, adHeadline4);
        String adTranslation = A02(389, 20, 112);
        String videoUrl = C5214Lx.A02(jSONObject, adTranslation);
        String adPromotedTranslation = A02(373, 16, 84);
        String A027 = C5214Lx.A02(jSONObject, adPromotedTranslation);
        String adPromotedTranslation2 = A02(356, 17, 77);
        String A028 = C5214Lx.A02(jSONObject, adPromotedTranslation2);
        String adPromotedTranslation3 = A02(132, 14, 22);
        String A029 = C5214Lx.A02(jSONObject, adPromotedTranslation3);
        C6279dH A013 = C6279dH.A01(jSONObject, c5953Xy);
        C5104K5 A003 = C5104K5.A00(jSONObject.optJSONObject(A02(303, 4, 93)));
        C5104K5 A004 = C5104K5.A00(jSONObject.optJSONObject(A02(StatusLine.HTTP_TEMP_REDIRECT, 5, 116)));
        C5105K6 A005 = C5105K6.A00(jSONObject.optJSONObject(A02(504, 11, 93)));
        String A0210 = C5214Lx.A02(jSONObject, A02(528, 15, 77));
        boolean optBoolean = jSONObject.optBoolean(A02(255, 15, 84));
        boolean optBoolean2 = jSONObject.optBoolean(A02(236, 19, 6));
        int optInt2 = jSONObject.optInt(A02(444, 25, 93), 4);
        int optInt3 = jSONObject.optInt(A02(419, 25, 38), 0);
        int optInt4 = jSONObject.optInt(A02(607, 31, 102), 0);
        int optInt5 = jSONObject.optInt(A02(638, 26, 67), 1000);
        JSONObject adChoicesIconObject = jSONObject.optJSONObject(A02(53, 15, 6));
        C5104K5 c5104k5 = null;
        if (adChoicesIconObject != null) {
            c5104k5 = C5104K5.A00(adChoicesIconObject);
        }
        String A0211 = C5214Lx.A02(jSONObject, A02(68, 19, 17));
        EnumC39490h A006 = EnumC39490h.A00(jSONObject.optString(A02(312, 21, 91)));
        JSONArray jSONArray = null;
        try {
            jSONArray = new JSONArray(jSONObject.optString(A02(219, 17, 21)));
        } catch (JSONException e) {
            c5953Xy.A06().A8y(A02, C44458z.A2B, new C444690(e));
        }
        Collection<String> A014 = C39510j.A01(jSONArray);
        String A0212 = C5214Lx.A02(jSONObject, A02(598, 9, 108));
        long optLong = jSONObject.optLong(A02(574, 24, 30), -1L);
        String A0213 = C5214Lx.A02(jSONObject, A02(565, 9, 56));
        String videoMPD = A02(543, 22, 95);
        if (!jSONObject.has(videoMPD)) {
            enumC5109KA = EnumC5109KA.A03;
        } else if (jSONObject.optBoolean(videoMPD)) {
            enumC5109KA = EnumC5109KA.A05;
        } else {
            enumC5109KA = EnumC5109KA.A04;
        }
        String A0214 = A02(190, 29, 72);
        if (A01[7].charAt(29) != '9') {
            throw new RuntimeException();
        }
        A01[7] = "1dt4CnIt66xCnA4CbnpWbYAL0az2V9Kq";
        boolean optBoolean3 = jSONObject.optBoolean(A0214);
        int optInt6 = jSONObject.optInt(A02(154, 36, 110), 100);
        ArrayList arrayList2 = null;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(A02(146, 8, 0));
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                arrayList = new ArrayList(length);
                for (int cardIndex = 0; cardIndex < length; cardIndex++) {
                    try {
                        arrayList.add(A01(c5953Xy, optJSONArray.getJSONObject(cardIndex), str, true, cardIndex, length));
                    } catch (JSONException e2) {
                        e = e2;
                        arrayList2 = arrayList;
                        c5953Xy.A06().A8y(A02, C44458z.A29, new C444690(e));
                        Log.e(C6298da.A0C, A02(23, 30, 50), e);
                        return new C396811(A0211, A012, A022, A023, requestId, adBodyText, adSocialContext, adPlayTranslation, A024, A025, A026, videoUrl, A027, A028, A029, c5104k5, A013, A003, A004, A005, A0212, A0213, optLong, enumC5109KA, z, i, i2, arrayList2, str, optString, optInt, optString2, A002, A0210, optBoolean, optBoolean2, optInt3, optInt2, optInt4, optInt5, A006, A014, optInt6, optBoolean3);
                    }
                }
            } else {
                arrayList = null;
            }
            arrayList2 = arrayList;
        } catch (JSONException e3) {
            e = e3;
        }
        return new C396811(A0211, A012, A022, A023, requestId, adBodyText, adSocialContext, adPlayTranslation, A024, A025, A026, videoUrl, A027, A028, A029, c5104k5, A013, A003, A004, A005, A0212, A0213, optLong, enumC5109KA, z, i, i2, arrayList2, str, optString, optInt, optString2, A002, A0210, optBoolean, optBoolean2, optInt3, optInt2, optInt4, optInt5, A006, A014, optInt6, optBoolean3);
    }
}
