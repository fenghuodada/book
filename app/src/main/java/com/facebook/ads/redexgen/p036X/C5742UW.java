package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.UW */
/* loaded from: assets/audience_network.dex */
public final class C5742UW implements InterfaceC5078Jf {
    public static byte[] A02;
    public static String[] A03 = {"4VJF", "NMiFc9mQHDdEdTYDts8ebbMyjIljV2c0", "gJxI4lQggzgG7l1t48TOLBAVsZm4smpW", "RC", "7emK", "VnvWTQ3PSRLSSOUq71E5D", "jZ42e8scbVg896gjqaujwC7", "gj"};
    public static final String A04;
    public C5952Xx A00;
    public InterfaceC5921XS A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6iaNxoAqzoeupDn53l2Cm";
            strArr2[6] = "N7vye13Dqewush4C3JTfsv4";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
            i4++;
        }
    }

    public static void A05() {
        A02 = new byte[]{21, 83, 90, 71, 21, 80, 67, 80, 91, 65, 124, 81, 21, 60, 111, 105, Byte.MAX_VALUE, Byte.MAX_VALUE, 121, 111, 111, 122, 105, 112, 112, 101, 50, 110, 101, 68, 77, 68, 85, 68, 69, 1, 68, 87, 68, 79, 85, 82, 1, 68, 89, 66, 68, 68, 69, 68, 69, 1, 83, 68, 85, 83, 88, 1, 77, 72, 76, 72, 85, 15, 1, 98, 78, 84, 79, 85, 27, 1, 72, 123, 104, 99, 121, 45, 121, 116, 125, 104, 45, 125, Byte.MAX_VALUE, 98, 110, 104, 126, 126, 104, 105, 45, 111, 116, 45, 121, 101, 104, 45, 126, 104, Byte.MAX_VALUE, 123, 104, Byte.MAX_VALUE, 55, 45, 84, 115, 123, 126, 119, 118, 50, 102, 125, 50, 98, 115, 96, 97, 119, 50, 115, 124, 50, 119, 100, 119, 124, 102, 50, 123, 124, 50, 119, 100, 119, 124, 102, 97, 50, 115, 96, 96, 115, 107, 50, 116, 125, 96, 50, 118, 123, 97, 98, 115, 102, 113, 122, 50, 116, 115, 123, 126, 103, 96, 119, 60, 65, 119, 96, 100, 119, 96, 50, 98, 96, 125, 113, 119, 97, 97, 119, 118, 50, 119, 100, 119, 124, 102, 91, 118, 50, 50, 4, 19, 23, 4, 19, 65, 19, 4, 21, 20, 19, 15, 4, 5, 65, 15, 14, 15, 76, 19, 4, 21, 19, 24, 0, 3, 13, 4, 65, 4, 19, 19, 14, 19, 65, 2, 14, 5, 4, 65, 42, 28, 11, 15, 28, 11, 89, 11, 28, 13, 12, 11, 23, 28, 29, 89, 11, 28, 13, 11, 0, 24, 27, 21, 28, 89, 28, 11, 11, 22, 11, 89, 26, 22, 29, 28, 89, 86, 109, 98, 97, 111, 102, 35, 119, 108, 35, 115, 98, 113, 112, 102, 35, 103, 102, 97, 118, 100, 79, 108, 100, 70, 117, 102, 109, 119, 35, 98, 119, 35, 6, 61, 50, 49, Utf8.REPLACEMENT_BYTE, 54, 115, 39, 60, 115, 35, 50, 33, 32, 54, 115, 54, 37, 54, 61, 39, 115, 50, 39, 115, 111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 73, 95, 72, 76, 95, 72, 26, 72, 95, 73, 74, 85, 84, 73, 95, 26, 91, 78, 26, 74, 85, 73, 83, 78, 83, 85, 84, 26, 80, 92, 87, 86, 104, 109, 120, 109, 110, 109, Byte.MAX_VALUE, 105, 17, 2, 17, 26, 0, 7, 6, 5, 1, 20, 21, 18, 5, 77, 3, 15, 14, 6, 9, 7, 77, 5, 22, 5, 14, 20, 77, 13, 1, 7, 9, 3, 33, 34, 38, 51, 50, 53, 34, 24, 36, 40, 41, 33, 46, 32, 44, 33, 71, 90, 94, 86, 60, 39, 35, 45, 38, 59};
    }

    static {
        A05();
        A04 = C5742UW.class.getSimpleName();
    }

    public C5742UW(C5952Xx c5952Xx, InterfaceC5921XS interfaceC5921XS) {
        this.A00 = c5952Xx;
        this.A01 = interfaceC5921XS;
    }

    public static JSONArray A01(C5952Xx c5952Xx, JSONArray jSONArray, JSONArray jSONArray2) {
        int length = jSONArray != null ? 0 + jSONArray.length() : 0;
        if (jSONArray2 != null) {
            length += jSONArray2.length();
        }
        return A02(c5952Xx, jSONArray, jSONArray2, length);
    }

    public static JSONArray A02(C5952Xx c5952Xx, JSONArray jSONArray, JSONArray totalEvents, int debugLength) {
        if (jSONArray == null) {
            return totalEvents;
        }
        if (totalEvents == null) {
            return jSONArray;
        }
        int debugIdx = jSONArray.length();
        int eventsIdx = totalEvents.length();
        JSONArray jSONArray2 = new JSONArray();
        int i = 0;
        int i2 = 0;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        while (true) {
            if ((i < debugIdx || i2 < eventsIdx) && debugLength > 0) {
                String[] strArr = A03;
                if (strArr[0].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "aN";
                strArr2[3] = "P5";
                String A00 = A00(435, 4, 91);
                if (i < debugIdx && jSONObject == null) {
                    try {
                        jSONObject = jSONArray.getJSONObject(i);
                        d = jSONObject.getDouble(A00);
                    } catch (JSONException e) {
                        if (c5952Xx.A03().A8P()) {
                            Log.e(A04, A00(273, 33, 107) + i, e);
                        }
                        jSONObject = null;
                        d = Double.MAX_VALUE;
                    }
                    i++;
                }
                if (i2 < eventsIdx && jSONObject2 == null) {
                    try {
                        jSONObject2 = totalEvents.getJSONObject(i2);
                        d2 = jSONObject2.getDouble(A00);
                    } catch (JSONException e2) {
                        if (c5952Xx.A03().A8P()) {
                            Log.e(A04, A00(306, 25, 59) + i2, e2);
                        }
                        jSONObject2 = null;
                        d2 = Double.MAX_VALUE;
                    }
                    i2++;
                }
                if (jSONObject != null || jSONObject2 != null) {
                    if (jSONObject == null || d2 < d) {
                        jSONArray2.put(jSONObject2);
                        jSONObject2 = null;
                        d2 = Double.MAX_VALUE;
                    } else {
                        jSONArray2.put(jSONObject);
                        jSONObject = null;
                        d = Double.MAX_VALUE;
                    }
                    debugLength--;
                }
            }
        }
        if (debugLength > 0) {
            if (jSONObject != null) {
                jSONArray2.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray2.put(jSONObject2);
            }
        }
        return jSONArray2;
    }

    private JSONObject A03() {
        JSONArray A032;
        JSONObject payload = this.A01.A5g();
        JSONArray A5f = this.A01.A5f();
        if (C5066JT.A0P(this.A00) && (A032 = C444791.A03(this.A00)) != null && A032.length() > 0) {
            C5952Xx c5952Xx = this.A00;
            String[] strArr = A03;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "DqeH9SIpXFi3b8zfs8mhzwqF8zVFhPmm";
            strArr2[2] = "TV1z9woSYeZeWz7dxNs9KlrMFeTbS55S";
            A5f = A01(c5952Xx, A032, A5f);
        }
        JSONObject jSONObject = null;
        if (A5f != null) {
            try {
                jSONObject = new JSONObject();
                if (payload != null) {
                    jSONObject.put(A00(439, 6, 32), payload);
                }
                jSONObject.put(A00(387, 6, 28), A5f);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    private JSONObject A04(int i) {
        int A08;
        JSONArray A042;
        Pair<JSONObject, JSONArray> A7f = this.A01.A7f(i);
        JSONObject jSONObject = (JSONObject) A7f.first;
        JSONArray jSONArray = (JSONArray) A7f.second;
        if (C5066JT.A0P(this.A00) && (A042 = C444791.A04(this.A00, (A08 = C5066JT.A08(this.A00)))) != null) {
            int debugEventLimit = A042.length();
            if (debugEventLimit > 0) {
                jSONArray = A02(this.A00, A042, jSONArray, i + A08);
            }
        }
        JSONObject jSONObject2 = null;
        if (jSONArray != null) {
            try {
                jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    jSONObject2.put(A00(439, 6, 32), jSONObject);
                }
                jSONObject2.put(A00(387, 6, 28), jSONArray);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject2;
    }

    private void A06(String str) {
        if (C444791.A0I(str)) {
            C444791.A0B(this.A00, str);
        } else {
            this.A01.A8G(str);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5078Jf
    public final JSONObject A4H() {
        int A0F = C5066JT.A0F(this.A00);
        return A0F > 0 ? A04(A0F) : A03();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5078Jf
    public final boolean A8a() {
        int A0F = C5066JT.A0F(this.A00);
        return A0F >= 1 && this.A01.A6a() + C444791.A00(this.A00) > A0F;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5078Jf
    public final void A9y() {
        int A3z = this.A01.A3z(C5066JT.A0G(this.A00));
        if (A3z > 0) {
            InterfaceC44448y A06 = this.A00.A06();
            int i = C44458z.A10;
            A06.A8y(A00(379, 8, 100), i, new C444690(A00(28, 44, 73) + A3z));
        }
        C5952Xx c5952Xx = this.A00;
        String[] strArr = A03;
        String str = strArr[5];
        String str2 = strArr[6];
        int length = str.length();
        int attemptsExceededEventsCount = str2.length();
        if (length == attemptsExceededEventsCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "bzDkK7DGlCk2AgYUikBmx";
        strArr2[6] = "oAHu9PBino36rPxONmBwiLk";
        C444791.A0F(c5952Xx);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5078Jf
    public final void AAU(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                A06(jSONArray.getJSONObject(i).getString(A00(433, 2, 45)));
            } catch (JSONException e) {
                if (this.A00.A03().A8P()) {
                    String str = A04;
                    String[] strArr = A03;
                    if (strArr[5].length() == strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[1] = "UiT9WvgcUGvh4UJIWCcVV8uUv9KhPAuj";
                    strArr2[2] = "iCLGRVxWINjUDSHIa5c9b6YKh720uR79";
                    Log.e(str, A00(108, 62, 122), e);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5078Jf
    public final boolean AAW(JSONArray jSONArray) {
        String eventId = A00(27, 1, 40);
        boolean z = true;
        boolean A0P = C5066JT.A0P(this.A00);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString(A00(433, 2, 45));
                if (A00(393, 26, 8).equals(string)) {
                    C5064JR.A0O(this.A00).A2E(jSONObject.getString(A00(419, 14, 47)));
                    this.A00.A02().A9W();
                } else {
                    int i2 = jSONObject.getInt(A00(375, 4, 91));
                    if (i2 == 1) {
                        if (this.A00.A03().A8P()) {
                            String str = A00(170, 25, 122) + string + A00(13, 14, 116);
                            String A6d = this.A01.A6d(string);
                            if (A6d != null) {
                                StringBuilder sb = new StringBuilder();
                                String eventType = A00(72, 36, 101);
                                sb.append(eventType);
                                sb.append(A6d);
                                sb.toString();
                            }
                        }
                        if (!this.A01.A4j(string) && A0P) {
                            C444791.A0D(string);
                        }
                    } else {
                        String A00 = A00(0, 13, 93);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (this.A00.A03().A8P()) {
                                Log.e(A04, A00(236, 37, 17) + i2 + A00 + string + eventId);
                            }
                            A06(string);
                            z = false;
                        } else if (i2 >= 2000) {
                            String[] strArr = A03;
                            String str2 = strArr[5];
                            String str3 = strArr[6];
                            int i3 = str2.length();
                            if (i3 == str3.length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A03;
                            strArr2[0] = "6SiN";
                            strArr2[4] = "roGm";
                            if (i2 < 3000) {
                                if (this.A00.A03().A8P()) {
                                    Log.e(A04, A00(195, 41, 9) + i2 + A00 + string + eventId);
                                }
                                if (!this.A01.A4j(string) && A0P) {
                                    C444791.A0D(string);
                                }
                            }
                        }
                    }
                    this.A00.A01().A8s(this.A00, jSONObject.toString());
                }
            } catch (JSONException e) {
                if (this.A00.A03().A8P()) {
                    Log.e(A04, A00(331, 44, 82) + i + eventId, e);
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5078Jf
    public final void AC2() {
        this.A01.A40();
        C444791.A07(this.A00);
    }
}
