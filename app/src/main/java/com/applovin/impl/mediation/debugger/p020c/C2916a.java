package com.applovin.impl.mediation.debugger.p020c;

import com.applovin.impl.mediation.p015d.C2894b;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.network.C3240b;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.AbstractC3180u;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.c.a */
/* loaded from: classes.dex */
public class C2916a extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final C3240b.InterfaceC3244c<JSONObject> f7123a;

    public C2916a(C3240b.InterfaceC3244c<JSONObject> interfaceC3244c, C3214m c3214m) {
        super("TaskFetchMediationDebuggerInfo", c3214m, true);
        this.f7123a = interfaceC3244c;
    }

    /* renamed from: a */
    private JSONObject m8357a(C3214m c3214m) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", C2895c.m8458a(c3214m));
        } catch (JSONException e) {
            m7704a("Failed to create mediation debugger request post body", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private JSONObject m8356b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", C2895c.m8458a(this.f8192b));
        } catch (JSONException e) {
            m7704a("Failed to construct JSON body", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public Map<String, String> m8359a() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f8192b.m7456a(C3109b.f8044ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8192b.m7386z());
        }
        Map<String, Object> m7132h = this.f8192b.m7466V().m7132h();
        hashMap.put("package_name", String.valueOf(m7132h.get("package_name")));
        hashMap.put("app_version", String.valueOf(m7132h.get("app_version")));
        Map<String, Object> m7141b = this.f8192b.m7466V().m7141b();
        hashMap.put("platform", String.valueOf(m7141b.get("platform")));
        hashMap.put("os", String.valueOf(m7141b.get("os")));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC3180u<JSONObject> abstractC3180u = new AbstractC3180u<JSONObject>(C3245c.m7323a(this.f8192b).mo7179b("POST").mo7186a(C2894b.m8463c(this.f8192b)).mo7175c(C2894b.m8461d(this.f8192b)).mo7185a(m8359a()).mo7184a(m8357a(this.f8192b)).mo7187a((C3245c.C3246a) new JSONObject()).mo7182b(((Long) this.f8192b.m7456a(C3108a.f7771g)).intValue()).mo7184a(m8356b()).mo7190a(), this.f8192b, m7697g()) { // from class: com.applovin.impl.mediation.debugger.c.a.1
            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, JSONObject jSONObject) {
                C2916a.this.f7123a.mo7327a(i, str, jSONObject);
            }

            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(JSONObject jSONObject, int i) {
                C2916a.this.f7123a.mo7326a(jSONObject, i);
            }
        };
        abstractC3180u.m7589a(C3108a.f7767c);
        abstractC3180u.m7585b(C3108a.f7768d);
        this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) abstractC3180u);
    }
}
