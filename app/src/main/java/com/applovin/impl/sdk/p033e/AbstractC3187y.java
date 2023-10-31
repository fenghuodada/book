package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.network.C3240b;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.y */
/* loaded from: classes.dex */
public abstract class AbstractC3187y extends AbstractRunnableC3131a {
    public AbstractC3187y(String str, C3214m c3214m) {
        super(str, c3214m);
    }

    /* renamed from: a */
    public abstract String mo7568a();

    /* renamed from: a */
    public void mo7567a(int i) {
        C3295h.m7015a(i, this.f8192b);
    }

    /* renamed from: a */
    public abstract void mo7566a(JSONObject jSONObject);

    /* renamed from: a */
    public void m7565a(JSONObject jSONObject, final C3240b.InterfaceC3244c<JSONObject> interfaceC3244c) {
        AbstractC3180u<JSONObject> abstractC3180u = new AbstractC3180u<JSONObject>(C3245c.m7323a(this.f8192b).mo7186a(C3295h.m7010a(mo7568a(), this.f8192b)).mo7175c(C3295h.m7005b(mo7568a(), this.f8192b)).mo7185a(C3295h.m7002e(this.f8192b)).mo7179b("POST").mo7184a(jSONObject).mo7169d(((Boolean) this.f8192b.m7456a(C3109b.f8005eA)).booleanValue()).mo7187a((C3245c.C3246a) new JSONObject()).mo7189a(mo7564h()).mo7190a(), this.f8192b) { // from class: com.applovin.impl.sdk.e.y.1
            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, JSONObject jSONObject2) {
                interfaceC3244c.mo7327a(i, str, jSONObject2);
            }

            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(JSONObject jSONObject2, int i) {
                interfaceC3244c.mo7326a(jSONObject2, i);
            }
        };
        abstractC3180u.m7589a(C3109b.f7815aT);
        abstractC3180u.m7585b(C3109b.f7816aU);
        this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) abstractC3180u);
    }

    /* renamed from: h */
    public abstract int mo7564h();

    /* renamed from: i */
    public JSONObject m7563i() {
        JSONObject jSONObject = new JSONObject();
        String m7399m = this.f8192b.m7399m();
        if (((Boolean) this.f8192b.m7456a(C3109b.f7997ds)).booleanValue() && StringUtils.isValidString(m7399m)) {
            JsonUtils.putString(jSONObject, "cuid", m7399m);
        }
        if (((Boolean) this.f8192b.m7456a(C3109b.f7999du)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f8192b.m7398n());
        }
        if (((Boolean) this.f8192b.m7456a(C3109b.f8001dw)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f8192b.m7397o());
        }
        mo7566a(jSONObject);
        return jSONObject;
    }
}
