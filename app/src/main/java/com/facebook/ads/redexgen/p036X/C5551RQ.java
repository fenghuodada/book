package com.facebook.ads.redexgen.p036X;

import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.RQ */
/* loaded from: assets/audience_network.dex */
public final class C5551RQ {
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            EnumC5550RP A00 = EnumC5550RP.A00(jSONArray, i);
            EnumC5550RP t2 = EnumC5550RP.A00(jSONArray2, i);
            if (A00 != t2 || !A00.A05(jSONArray, jSONArray2, i)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean A01(JSONArray jSONArray, JSONArray jSONArray2) {
        return A00(jSONArray, jSONArray2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(org.json.JSONObject r5, org.json.JSONObject r6) {
        /*
            int r1 = r5.length()
            int r0 = r6.length()
            r4 = 0
            if (r1 == r0) goto Lc
            return r4
        Lc:
            java.util.Iterator r3 = r5.keys()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r6.has(r2)
            if (r0 != 0) goto L23
            return r4
        L23:
            com.facebook.ads.redexgen.X.RP r1 = com.facebook.ads.redexgen.p036X.EnumC5550RP.A01(r5, r2)
            com.facebook.ads.redexgen.X.RP r0 = com.facebook.ads.redexgen.p036X.EnumC5550RP.A01(r6, r2)
            if (r1 == r0) goto L2e
            return r4
        L2e:
            boolean r0 = r1.A07(r5, r6, r2)
            if (r0 != 0) goto L10
            return r4
        L35:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5551RQ.A02(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
