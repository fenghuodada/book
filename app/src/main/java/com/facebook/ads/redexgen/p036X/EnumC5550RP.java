package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A03 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.RP */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC5550RP {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC5550RP[] A02;
    public static final EnumC5550RP A03;
    public static final EnumC5550RP A04;
    public static final EnumC5550RP A05;
    public static final EnumC5550RP A06;
    public static final EnumC5550RP A07;
    public static final EnumC5550RP A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Byte.MAX_VALUE, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 105);
        A03 = new EnumC5550RP(A022, 0) { // from class: com.facebook.ads.redexgen.X.HF
            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optJSONArray(i) != null;
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return C5551RQ.A01(jSONArray.optJSONArray(i), jSONArray2.optJSONArray(i));
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return C5551RQ.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        final String A023 = A02(5, 7, 40);
        A04 = new EnumC5550RP(A023, 1) { // from class: com.facebook.ads.redexgen.X.H5
            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optBoolean(i, true) == jSONArray.optBoolean(i, false);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optBoolean(i) == jSONArray2.optBoolean(i);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        final String A024 = A02(12, 6, 81);
        A05 = new EnumC5550RP(A024, 2) { // from class: com.facebook.ads.redexgen.X.H4
            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optInt(i, 0) == jSONArray.optInt(i, 1) && jSONArray.optDouble(i, 0.0d) == jSONArray.optDouble(i, 1.0d) && ((double) jSONArray.optInt(i, 0)) != jSONArray.optDouble(i, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optDouble(i) == jSONArray2.optDouble(i);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        final String A025 = A02(18, 3, 50);
        A06 = new EnumC5550RP(A025, 3) { // from class: com.facebook.ads.redexgen.X.H3
            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optInt(i, 0) == jSONArray.optInt(i, 1) && jSONArray.optDouble(i, 0.0d) == jSONArray.optDouble(i, 1.0d) && ((double) jSONArray.optInt(i, 0)) == jSONArray.optDouble(i, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optInt(i) == jSONArray2.optInt(i);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final String A026 = A02(21, 6, 18);
        A07 = new EnumC5550RP(A026, 4) { // from class: com.facebook.ads.redexgen.X.H0
            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optJSONObject(i) != null;
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return C5551RQ.A02(jSONArray.optJSONObject(i), jSONArray2.optJSONObject(i));
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return C5551RQ.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        final String A027 = A02(27, 6, 36);
        A08 = new EnumC5550RP(A027, 5) { // from class: com.facebook.ads.redexgen.X.Gz
            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A04(JSONArray jSONArray, int i) {
                return jSONArray.optString(i) != null;
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i) {
                return jSONArray.optString(i).equals(jSONArray2.optString(i));
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.p036X.EnumC5550RP
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = new EnumC5550RP[]{A03, A04, A05, A06, A07, A08};
    }

    public EnumC5550RP(String str, int i) {
    }

    public static EnumC5550RP A00(JSONArray jSONArray, int i) {
        EnumC5550RP[] values;
        for (EnumC5550RP enumC5550RP : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (enumC5550RP.A04(jSONArray, i)) {
                return enumC5550RP;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC5550RP A01(JSONObject jSONObject, String str) {
        EnumC5550RP[] values;
        for (EnumC5550RP enumC5550RP : values()) {
            boolean A062 = enumC5550RP.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A062) {
                return enumC5550RP;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC5550RP valueOf(String str) {
        return (EnumC5550RP) Enum.valueOf(EnumC5550RP.class, str);
    }

    public static EnumC5550RP[] values() {
        return (EnumC5550RP[]) A02.clone();
    }
}
