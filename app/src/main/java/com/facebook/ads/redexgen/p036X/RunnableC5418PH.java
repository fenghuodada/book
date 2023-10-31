package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.PH */
/* loaded from: assets/audience_network.dex */
public class RunnableC5418PH implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C5422PL A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{108, 64, 90, 67, 75, 15, 65, 64, 91, 15, 95, 78, 93, 92, 74, 15, 92, 74, 93, 89, 74, 93, 15, 66, 74, 92, 92, 78, 72, 74, 123, 76, 76, 81, 76, 30, 78, 95, 76, 77, 87, 80, 89, 30, 116, 109, 113, 112, 30, 87, 80, 30, 78, 81, 77, 74, 115, 91, 77, 77, 95, 89, 91, 30, 103, 115, 114, 110, 77, 99, Byte.MAX_VALUE, 32, 61, 49, 55, 36, 26, 33, 36, 49, 36, 108, 97, 104, 125, 28, 26};
    }

    public RunnableC5418PH(C5422PL c5422pl, String str) {
        this.A00 = c5422pl;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5399Ox c5399Ox;
        String str;
        C5399Ox c5399Ox2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 47)))) {
                    this.A00.A0C(EnumC5420PJ.A00(jSONObject.optString(A00(81, 4, 49))), jSONObject.optString(A00(71, 10, 108), A00(85, 2, 78)));
                    return;
                }
                c5399Ox2 = this.A00.A04;
                c5399Ox2.A04(C44458z.A11, A00(0, 30, 6));
            } catch (JSONException e) {
                c5399Ox = this.A00.A04;
                int i = C44458z.A15;
                c5399Ox.A04(i, A00(30, 34, 23) + e.getMessage());
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
