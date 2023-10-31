package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http.StatusLine;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.18 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC397518 implements Serializable {
    public static JSONObject A0P = null;
    public static byte[] A0Q = null;
    public static String[] A0R = {"1gqRR9im7tmNjhPy8NnQpjCX4rd8Ielc", "ZkOx7RNEMabKvQ7fgN15WIbWDw11JZFu", "ifeh8sROmLFDdOYqa0sy0eFfj5RHH1gU", "fnDzwAhU6GMUs0cCq2fTQuWEzv5lBJki", "OVtNfYqIZ80xqW4zrHdkYxbTKYgYXHc", "chIpxbYwiAOd1RIHlv8aEwW7ihQHRwI", "GnSiEcQE", "uApEYGhuY9oy1RN675k2bDQ9FUD4oA7y"};
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public RewardData A05;
    public C397619 A06;
    public C39941R A07;
    public C39971U A08;
    public C40041b A09;
    public String A0A;
    public String A0B;
    @Nullable
    public String A0C;
    @Nullable
    public String A0D;
    public String A0E;
    public String A0G;
    public String A0H;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final int A0M;
    public final List<C39781B> A0N;
    public boolean A0I = false;
    public String A0F = A00(0, 0, 70);
    public int A02 = 200;
    public final Map<String, String> A0O = new HashMap();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Q, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        String[] strArr = A0R;
        if (strArr[2].charAt(14) == strArr[1].charAt(14)) {
            throw new RuntimeException();
        }
        A0R[5] = "bfB1pGz3pHLReaUGKuLSmGsyYLYBAtW";
        A0Q = new byte[]{40, 45, 22, 42, 33, 38, 32, 42, 44, 58, 22, 37, 32, 39, 34, 22, 60, 59, 37, 118, 121, 72, 123, 120, 112, 120, 72, 99, 110, 103, 114, 83, 81, 83, 88, 85, 111, 81, 67, 67, 85, 68, 67, 91, 89, 74, 87, 77, 75, 93, 84, 39, 44, 37, 45, 42, 27, 37, 32, 55, 27, 34, 54, 33, 53, 49, 33, 42, 39, 61, 0, 12, 14, 77, 5, 2, 0, 6, 1, 12, 12, 8, 77, 2, 7, 16, 77, 10, 13, 23, 6, 17, 16, 23, 10, 23, 10, 2, 15, 77, 0, 15, 10, 0, 8, 6, 7, 34, 46, 44, 111, 39, 32, 34, 36, 35, 46, 46, 42, 111, 32, 37, 50, 111, 40, 47, 53, 36, 51, 50, 53, 40, 53, 40, 32, 45, 111, 39, 40, 47, 40, 50, 41, 30, 32, 34, 53, 40, 55, 40, 53, 56, 9, 30, 97, 118, 105, 90, 100, 117, 117, 90, 103, 106, 112, 107, 97, 90, 112, 119, 105, 118, 86, 65, 94, 109, 90, 91, 86, 87, 109, 92, 83, 68, 91, 85, 83, 70, 91, 93, 92, 109, 87, 92, 83, 80, 94, 87, 86, 35, 52, 43, 24, 47, 52, 24, 34, 41, 38, 37, 43, 34, 35, 80, 71, 88, 107, 92, 77, 86, 70, 93, 80, 107, 81, 90, 85, 86, 88, 81, 80, 7, 26, 13, 2, 14, 10, 0, 60, 16, 7, 8, 60, 15, 2, 26, 6, 17, 60, 11, 23, 14, 15, 60, 22, 17, 15, 33, 42, 39, 54, 61, 52, 48, 33, 32, 27, 39, 52, 41, 91, 81, 93, 92, 75, 76, 86, 71, 80, 81, 86, 75, 86, 75, 67, 78, 73, 68, 75, 65, 86, 70, 68, 85, 64, 112, 125, 101, 115, 105, 104, 46, 33, 52, 41, 54, 37, 56, 39, 58, 60, 58, 41, 33, 60, 118, 97, 117, 113, 97, 119, 112, 91, 109, 96, 30, 9, 27, 13, 30, 8, 9, 8, 51, 26, 5, 8, 9, 3, 18, 15, 18, 10, 3, 111, 104, 118, 33, 62, 50, 32, 54, 53, 62, 59, 62, 35, 46, 8, 52, Utf8.REPLACEMENT_BYTE, 50, 52, 60, 8, 62, 57, 62, 35, 62, 54, 59, 8, 51, 50, 59, 54, 46, 48, 47, 35, 49, 39, 36, 47, 42, 47, 50, Utf8.REPLACEMENT_BYTE, 25, 37, 46, 35, 37, 45, 25, 47, 40, 50, 35, 52, 48, 39, 42};
    }

    public abstract int A0J();

    public abstract int A0K();

    static {
        A03();
    }

    public AbstractC397518(List<C39781B> list) {
        this.A0N = list;
    }

    private HashMap<String, String> A01(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A00(154, 18, 57));
        HashMap<String, String> hashMap = new HashMap<>();
        if (optJSONObject == null) {
            return hashMap;
        }
        Iterator<String> nameItr = optJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String name = nameItr.next();
                hashMap.put(name, optJSONObject.getString(name));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static List<C39781B> A02(JSONObject jSONObject, C5953Xy c5953Xy, InterfaceC39901N interfaceC39901N) {
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(43, 8, 4));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            return C39861J.A01(optJSONArray, jSONObject, c5953Xy, interfaceC39901N);
        }
        ArrayList arrayList = new ArrayList();
        C39781B A00 = C39781B.A00(jSONObject);
        interfaceC39901N.A3B(A00, jSONObject);
        arrayList.add(A00);
        return arrayList;
    }

    private void A04(int i) {
        this.A00 = i;
    }

    private void A05(int i) {
        this.A03 = i;
    }

    private final void A06(int i) {
        this.A01 = i;
    }

    private void A07(C397619 c397619) {
        this.A06 = c397619;
    }

    private void A08(C39941R c39941r) {
        this.A07 = c39941r;
    }

    private final void A09(C39971U c39971u) {
        this.A08 = c39971u;
    }

    private void A0A(C40041b c40041b) {
        this.A09 = c40041b;
    }

    private void A0B(String str) {
        this.A0B = str;
    }

    private void A0C(String str) {
        this.A0G = str;
    }

    private final void A0D(String str) {
        this.A0A = str;
    }

    private void A0E(JSONObject jSONObject) {
        this.A0F = jSONObject.toString();
    }

    public final int A0F() {
        return this.A00;
    }

    public final int A0G() {
        return this.A01;
    }

    public final int A0H() {
        return this.A03;
    }

    public final int A0I() {
        return this.A0M;
    }

    public final long A0L() {
        return this.A04;
    }

    @Nullable
    public final RewardData A0M() {
        return this.A05;
    }

    public final C397619 A0N() {
        return this.A06;
    }

    public final C39781B A0O() {
        return this.A0N.get(0);
    }

    @Nullable
    public final C39781B A0P(int i) {
        if (i < 0 || i >= this.A0N.size()) {
            return null;
        }
        return this.A0N.get(i);
    }

    public final C39941R A0Q() {
        return this.A07;
    }

    public final C39971U A0R() {
        return this.A08;
    }

    public final C40041b A0S() {
        return this.A09;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A0T() {
        /*
            r6 = this;
            java.lang.String r3 = r6.A0E
            int r1 = r3.hashCode()
            r0 = -1364000502(0xffffffffaeb3010a, float:-8.140162E-11)
            r5 = 2
            r4 = 1
            if (r1 == r0) goto L4a
            r0 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r1 == r0) goto L39
            r0 = 604727084(0x240b672c, float:3.022821E-17)
            if (r1 == r0) goto L27
        L17:
            r0 = -1
        L18:
            if (r0 == 0) goto L85
            if (r0 == r4) goto L7e
            if (r0 == r5) goto L77
            r2 = 0
            r1 = 0
            r0 = 70
            java.lang.String r0 = A00(r2, r1, r0)
            return r0
        L27:
            r2 = 274(0x112, float:3.84E-43)
            r1 = 12
            r0 = 30
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            r0 = 0
            goto L18
        L39:
            r2 = 301(0x12d, float:4.22E-43)
            r1 = 6
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            r0 = 2
            goto L18
        L4a:
            r2 = 325(0x145, float:4.55E-43)
            r1 = 14
            r0 = 80
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r3 = r3.equals(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC397518.A0R
            r0 = 2
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L90
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC397518.A0R
            java.lang.String r1 = "Jd5WF9li"
            r0 = 6
            r2[r0] = r1
            if (r3 == 0) goto L17
            r0 = 1
            goto L18
        L77:
            com.facebook.ads.redexgen.X.Q8 r0 = com.facebook.ads.redexgen.p036X.EnumC5471Q8.A03
            java.lang.String r0 = r0.A02()
            return r0
        L7e:
            com.facebook.ads.redexgen.X.Q9 r0 = com.facebook.ads.redexgen.p036X.EnumC5472Q9.A04
            java.lang.String r0 = r0.A02()
            return r0
        L85:
            r2 = 70
            r1 = 37
            r0 = 95
            java.lang.String r0 = A00(r2, r1, r0)
            return r0
        L90:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.AbstractC397518.A0T():java.lang.String");
    }

    public final String A0U() {
        return this.A0A;
    }

    public final String A0V() {
        return this.A0B;
    }

    @Nullable
    public final String A0W() {
        return this.A0C;
    }

    @Nullable
    public final String A0X() {
        return this.A0D;
    }

    public final String A0Y() {
        return this.A0E;
    }

    public final String A0Z() {
        return this.A0G;
    }

    public final String A0a() {
        return this.A0H;
    }

    @Nullable
    public final String A0b(String str) {
        return this.A0O.get(str);
    }

    public final List<C39781B> A0c() {
        return Collections.unmodifiableList(this.A0N);
    }

    public final JSONObject A0d() {
        try {
            return new JSONObject(this.A0F);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void A0e(int i) {
        this.A02 = i;
    }

    public final void A0f(long j) {
        this.A04 = j;
    }

    public final void A0g(RewardData rewardData) {
        this.A05 = rewardData;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0h(com.facebook.ads.redexgen.p036X.InterfaceC5269Mq r9) {
        /*
            r8 = this;
            java.lang.String r4 = r8.A0Y()
            int r1 = r4.hashCode()
            r0 = -1364000502(0xffffffffaeb3010a, float:-8.140162E-11)
            r3 = 1
            if (r1 == r0) goto L62
            r0 = 604727084(0x240b672c, float:3.022821E-17)
            if (r1 == r0) goto L30
        L13:
            r0 = -1
        L14:
            if (r0 == 0) goto L19
            if (r0 == r3) goto L26
        L18:
            return
        L19:
            r2 = 107(0x6b, float:1.5E-43)
            r1 = 45
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            r9.A3s(r0)
        L26:
            com.facebook.ads.redexgen.X.Q9 r0 = com.facebook.ads.redexgen.p036X.EnumC5472Q9.A08
            java.lang.String r0 = r0.A02()
            r9.A3s(r0)
            goto L18
        L30:
            r7 = 274(0x112, float:3.84E-43)
            r6 = 12
            r5 = 30
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC397518.A0R
            r0 = 2
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.AbstractC397518.A0R
            java.lang.String r1 = "ynfghRupyY8lJ5WDqUPqAC0JO3E4ojqs"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "OEwRxUcpVPGJQFz3LRrAkRkf0LWdVsmf"
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = A00(r7, r6, r5)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L13
            r0 = 0
            goto L14
        L62:
            r2 = 325(0x145, float:4.55E-43)
            r1 = 14
            r0 = 80
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L74:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.AbstractC397518.A0h(com.facebook.ads.redexgen.X.Mq):void");
    }

    public final void A0i(@Nullable String str) {
        this.A0D = str;
    }

    public final void A0j(String str) {
        this.A0E = str;
    }

    public final void A0k(String str) {
        this.A0H = str;
    }

    public final void A0l(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        A0P = jSONObject.optJSONObject(A00(31, 12, 12));
        C39961T A06 = new C39961T().A06(jSONObject.optString(A00(339, 5, 90)));
        String A00 = A00(270, 4, 14);
        JSONObject optJSONObject = jSONObject.optJSONObject(A00);
        String A002 = A00(0, 0, 70);
        if (optJSONObject != null) {
            str = jSONObject.optJSONObject(A00).optString(A00(344, 3, 38));
        } else {
            str = A002;
        }
        A09(A06.A05(str).A04(jSONObject.optString(A00(0, 19, 117))).A07(C39981V.A03(jSONObject)).A08());
        JSONObject optJSONObject2 = jSONObject.optJSONObject(A00(295, 6, 32));
        if (optJSONObject2 != null) {
            String A003 = A00(StatusLine.HTTP_TEMP_REDIRECT, 8, 116);
            if (A0R[5].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0R;
            strArr[2] = "L9OC0yGJthGch16tOTqUcqcE9MnsMaz6";
            strArr[1] = "n6CgIEssquLp46jPM2UWfBhL1rINMjIc";
            jSONObject2 = optJSONObject2.optJSONObject(A003);
        } else {
            jSONObject2 = null;
        }
        A07(new C397619(C39871K.A01(jSONObject2), C39871K.A01(optJSONObject2 != null ? optJSONObject2.optJSONObject(A00(286, 9, 25)) : null)));
        A0A(C39981V.A01(jSONObject));
        A08(C39981V.A00(jSONObject));
        A0D(jSONObject.optString(A00(152, 2, 86)));
        A0C(jSONObject.optString(A00(315, 10, 56), A002));
        A0B(jSONObject.optString(A00(231, 26, 95), A002));
        this.A0K = jSONObject.optBoolean(A00(199, 14, 123));
        this.A0L = jSONObject.optBoolean(A00(213, 18, 8));
        this.A0J = jSONObject.optBoolean(A00(172, 27, 14), true);
        A04(jSONObject.optInt(A00(19, 12, 43), 0));
        A0E(jSONObject);
        A05(jSONObject.optInt(A00(347, 31, 107), 0));
        A06(jSONObject.optInt(A00(51, 19, 120), -1));
        A0e(jSONObject.optInt(A00(378, 26, 122), 1000));
        this.A0O.putAll(A01(jSONObject));
        this.A0C = jSONObject.optString(A00(257, 13, 120));
    }

    public final void A0m(boolean z) {
        this.A0I = z;
    }

    public final boolean A0n() {
        return this.A0K;
    }

    public final boolean A0o() {
        return this.A0L;
    }

    public final boolean A0p() {
        return this.A0J;
    }

    public final boolean A0q() {
        return this.A0I;
    }

    public final boolean A0r() {
        if (Build.VERSION.SDK_INT >= 21) {
            String A0V = A0V();
            if (A0R[7].charAt(30) != '7') {
                throw new RuntimeException();
            }
            A0R[4] = "Ho9CziPGzu0GN5git9gLyxI3YsNmgO7";
            if (!TextUtils.isEmpty(A0V)) {
                return true;
            }
        }
        return false;
    }
}
