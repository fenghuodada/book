package com.facebook.ads.redexgen.p036X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Zf */
/* loaded from: assets/audience_network.dex */
public class C6058Zf implements InterfaceC433772<String> {
    public final String A00;
    public final boolean A01;

    public C6058Zf(String str) {
        this.A00 = str;
        this.A01 = C6057Ze.A01().hasSystemFeature(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC433772
    /* renamed from: A00 */
    public final JSONObject AFB(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC433772
    public final boolean A8S(Object obj) {
        C6058Zf c6058Zf = (C6058Zf) obj;
        return this.A00.equals(c6058Zf.A00) && this.A01 == c6058Zf.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC433772
    public final int AEp() {
        return this.A00.getBytes().length + 8;
    }
}
