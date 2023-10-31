package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jr */
/* loaded from: assets/audience_network.dex */
public final class C5090Jr {
    public static byte[] A00;
    public static final Map<String, String> A01;
    public static final Map<String, List<String>> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-68, -51, -49, -52, -33, -52, -42, -27, -34, -34, -43, -36, -3, 0, -14, -11, -16, 5, -6, -2, -10, -16, -2, 4, -68, -81, -69, -65, -81, -67, -66, -87, -66, -77, -73, -81, -87, -73, -67, -111, -108, 123, -126, -111, -118, -118, -127, -120, 123, -120, -117, -125, -125, -123, -118, -125};
    }

    static {
        A03();
        A02 = new HashMap();
        A01 = new HashMap();
    }

    @Nullable
    public static String A01(String str) {
        return A01.get(str);
    }

    public static List<String> A02(C5953Xy c5953Xy, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException e) {
                c5953Xy.A06().A8y(A00(39, 17, 1), C44458z.A1C, new C444690(e));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C5088Jp c5088Jp, EnumC5087Jo enumC5087Jo) {
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC5089Jq(c5088Jp, enumC5087Jo));
    }

    public static void A05(C5953Xy c5953Xy, String str, long j) {
        C5088Jp c5088Jp = new C5088Jp(str, c5953Xy.A08());
        HashMap hashMap = new HashMap();
        hashMap.put(A00(24, 15, 47), C5236MJ.A06(j));
        hashMap.put(A00(12, 12, 118), C5236MJ.A04(j));
        c5088Jp.A02(EnumC5087Jo.A0D, hashMap);
    }

    public static void A06(C5953Xy c5953Xy, JSONObject jSONObject, long j, @Nullable String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A00(2, 4, 80));
        if (optJSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(6, 6, 85));
        if (TextUtils.isEmpty(str) && optJSONArray != null) {
            A07(c5953Xy, optJSONObject, A02(c5953Xy, optJSONArray), j, null);
        } else if (TextUtils.isEmpty(str) || !A02.containsKey(str)) {
        } else {
            A07(c5953Xy, optJSONObject, A02.get(str), j, str);
        }
    }

    public static void A07(C5953Xy c5953Xy, JSONObject jSONObject, List<String> list, long j, @Nullable String str) {
        String A002 = A00(0, 2, 62);
        if (jSONObject.has(A002)) {
            String optString = jSONObject.optString(A002);
            A08(optString, str);
            A09(optString, list);
            A05(c5953Xy, optString, j);
        }
    }

    public static void A08(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A01.put(str, str2);
    }

    public static void A09(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        A02.put(str, list);
    }

    public static boolean A0A(String str, EnumC5087Jo enumC5087Jo) {
        return A0B(str, enumC5087Jo.A02());
    }

    public static boolean A0B(String str, String str2) {
        return A02.containsKey(str) && A02.get(str).contains(str2);
    }
}
