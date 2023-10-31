package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.log.C9549a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.store.gpbl.bridges.c */
/* loaded from: classes3.dex */
public class C9679c extends AbstractC9663b {

    /* renamed from: f */
    private final Object f19219f;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.c$a */
    /* loaded from: classes3.dex */
    public class C9680a extends HashMap<String, Class<?>[]> {
        public C9680a() {
            put("getSignature", new Class[0]);
        }
    }

    public C9679c(Object obj) {
        super(obj, new C9680a());
        this.f19219f = obj;
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.android.billingclient.api.Purchase";
    }

    /* renamed from: j */
    public String m1695j() {
        return (String) m1917a("getSignature", this.f19219f, new Object[0]);
    }

    /* renamed from: k */
    public JSONObject m1694k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseData", m1713i());
            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, m1695j());
        } catch (JSONException e) {
            C9549a.m2016c("Could not build Purchase result Json: ", e.getMessage());
        }
        return jSONObject;
    }
}
