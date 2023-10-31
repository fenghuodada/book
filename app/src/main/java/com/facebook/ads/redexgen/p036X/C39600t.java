package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.adapters.datamodels.FrequencyCappingData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0t */
/* loaded from: assets/audience_network.dex */
public final class C39600t {
    public static byte[] A03;
    public final LinkedHashSet<String> A01 = new LinkedHashSet<>();
    public JSONObject A00 = new JSONObject();
    public final AtomicReference<String> A02 = new AtomicReference<>(A01(0, 2, 25));

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{13, 11, 56, 58, 43, 74, 65, 76, 93, 86, 95, 91, 74, 75, 112, 78, 75, 112, 70, 75, 112, 64, 93, 70, 72, 70, 65, 78, 67, 94, 85, 88, 73, 66, 75, 79, 94, 95, 100, 82, 95, 114, 126, 103, 64, 124, 126, 111, 111, 122, 123, 64, 126, 109, 109, 126, 102, 64, 115, 122, 113, 120, 107, 119, 12, 0, 0, 22, 17, 17, 6, 13, 0, 6, 16, 30, 11, 28, 7, 1, 10, 97, 118, 108, 109, 70, 118, 122, 122, 108, 107, 107, 124, 119, 122, 124, 70, 106, 124, 122, 106, 108, 123, 97, 96, 75, 100, 113, 102, 125, 123, 112};
    }

    private final synchronized C39911O A00(String str, JSONObject jSONObject) throws JSONException, C444690 {
        C39911O c39911o;
        if (str.equals(jSONObject.optString(A01(29, 12, 116), null))) {
            c39911o = new C39911O(str);
            A03(c39911o, jSONObject);
        } else {
            C444690 c444690 = new C444690(new IllegalArgumentException());
            jSONObject.put(A01(5, 24, 96), str);
            c444690.A05(jSONObject);
            c444690.A03(1);
            throw c444690;
        }
        return c39911o;
    }

    private void A03(C39911O c39911o, JSONObject jSONObject) throws JSONException {
        int xoutTimeSecs = jSONObject.optInt(A01(75, 6, 33));
        int optInt = jSONObject.optInt(A01(101, 11, 91));
        int optInt2 = jSONObject.optInt(A01(41, 23, 80), 50);
        long optLong = jSONObject.optLong(A01(2, 3, 20));
        String A01 = A01(64, 11, 44);
        if (jSONObject.has(A01)) {
            c39911o.A06((JSONArray) jSONObject.get(A01));
        }
        String A012 = A01(81, 20, 86);
        if (jSONObject.has(A012)) {
            c39911o.A04(jSONObject.optInt(A012));
        }
        c39911o.A05(xoutTimeSecs, optInt, optLong, optInt2);
    }

    public final String A04() {
        String str = this.A02.get();
        return str == null ? A01(0, 2, 25) : str;
    }

    public final synchronized JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.A01.iterator();
        while (it.hasNext()) {
            String encryptedAdId = it.next();
            jSONArray.put(encryptedAdId);
        }
        AtomicReference<String> atomicReference = this.A02;
        String encryptedAdId2 = jSONArray.toString();
        atomicReference.set(encryptedAdId2);
    }

    public final synchronized void A07(String str) {
        if (this.A01.size() >= C39911O.A00()) {
            Iterator<String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        C428067.A03();
    }

    public final synchronized void A08(String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length() && i < C39911O.A00(); i++) {
                    this.A01.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A01.remove(str);
        C428067.A03();
    }

    public final synchronized void A0A(String str) throws JSONException, C444690 {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new JSONObject(str);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = this.A00.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.A00.get(next) instanceof String) {
                        C39911O frequencyCappingData = A00(next, new JSONObject((String) this.A00.get(next)));
                        hashMap.put(next, frequencyCappingData);
                    }
                }
                for (Map.Entry<String, FrequencyCappingData> e : hashMap.entrySet()) {
                    this.A00.put(e.getKey(), e.getValue());
                }
            }
        }
    }

    public final synchronized void A0B(JSONObject jSONObject) throws JSONException {
        C39911O c39911o;
        String optString = jSONObject.optString(A01(29, 12, 116), null);
        if (optString == null) {
            return;
        }
        if (this.A00.has(optString) && (this.A00.get(optString) instanceof C39911O)) {
            c39911o = (C39911O) this.A00.get(optString);
        } else {
            c39911o = new C39911O(optString);
        }
        A03(c39911o, jSONObject);
        this.A00.put(optString, c39911o);
    }
}
