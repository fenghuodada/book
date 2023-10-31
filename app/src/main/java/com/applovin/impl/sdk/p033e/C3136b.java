package com.applovin.impl.sdk.p033e;

import android.text.TextUtils;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3267o;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.e.b */
/* loaded from: classes.dex */
public class C3136b extends AbstractRunnableC3131a {
    public C3136b(C3214m c3214m) {
        super("TaskApiSubmitData", c3214m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7687a(JSONObject jSONObject) {
        try {
            JSONObject m7008a = C3295h.m7008a(jSONObject);
            this.f8192b.m7477K().m7805a(C3109b.f7792X, m7008a.getString("device_id"));
            this.f8192b.m7477K().m7805a(C3109b.f7794Z, m7008a.getString("device_token"));
            this.f8192b.m7477K().m7805a(C3109b.f7822aa, Long.valueOf(m7008a.getLong("publisher_id")));
            C3295h.m7003d(m7008a, this.f8192b);
            C3295h.m7001e(m7008a, this.f8192b);
            String string = JsonUtils.getString(m7008a, "latest_version", "");
            if (!TextUtils.isEmpty(string)) {
                String str = AppLovinSdk.VERSION;
                if (!str.equals(string) && C3349v.m6862a()) {
                    String str2 = "Current SDK version (" + str + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                    if (JsonUtils.valueExists(m7008a, "sdk_update_message")) {
                        str2 = JsonUtils.getString(m7008a, "sdk_update_message", str2);
                    }
                    C3349v.m6847h("AppLovinSdk", str2);
                }
            }
            this.f8192b.m7468T().m7717b();
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                m7704a("Unable to parse API response", th);
            }
        }
    }

    /* renamed from: b */
    private void m7686b(JSONObject jSONObject) throws JSONException {
        C3267o m7466V = this.f8192b.m7466V();
        Map<String, Object> m7136d = m7466V.m7136d();
        Utils.renameKeyInObjectMap("platform", "type", m7136d);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", m7136d);
        jSONObject.put("device_info", new JSONObject(m7136d));
        Map<String, Object> m7132h = m7466V.m7132h();
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", m7132h);
        Utils.renameKeyInObjectMap("ia", "installed_at", m7132h);
        jSONObject.put("app_info", new JSONObject(m7132h));
    }

    /* renamed from: c */
    private void m7685c(JSONObject jSONObject) {
        AbstractC3180u<JSONObject> abstractC3180u = new AbstractC3180u<JSONObject>(C3245c.m7323a(this.f8192b).mo7186a(C3295h.m7010a("2.0/device", this.f8192b)).mo7175c(C3295h.m7005b("2.0/device", this.f8192b)).mo7185a(C3295h.m7002e(this.f8192b)).mo7179b("POST").mo7184a(jSONObject).mo7169d(((Boolean) this.f8192b.m7456a(C3109b.f8051ew)).booleanValue()).mo7187a((C3245c.C3246a) new JSONObject()).mo7189a(((Integer) this.f8192b.m7456a(C3109b.f7922cV)).intValue()).mo7190a(), this.f8192b) { // from class: com.applovin.impl.sdk.e.b.1
            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, JSONObject jSONObject2) {
                C3295h.m7015a(i, this.f8192b);
            }

            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(JSONObject jSONObject2, int i) {
                C3136b.this.m7687a(jSONObject2);
            }
        };
        abstractC3180u.m7589a(C3109b.f7815aT);
        abstractC3180u.m7585b(C3109b.f7816aU);
        this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) abstractC3180u);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (C3349v.m6862a()) {
                m7703b("Submitting user data...");
            }
            JSONObject jSONObject = new JSONObject();
            m7686b(jSONObject);
            m7685c(jSONObject);
        } catch (JSONException e) {
            if (C3349v.m6862a()) {
                m7704a("Unable to build JSON message with collected data", e);
            }
        }
    }
}
