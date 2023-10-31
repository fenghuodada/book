package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3240b;
import com.applovin.impl.sdk.p030b.C3105c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.ab */
/* loaded from: classes.dex */
public abstract class AbstractC3134ab extends AbstractC3187y {
    public AbstractC3134ab(String str, C3214m c3214m) {
        super(str, c3214m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7692b(JSONObject jSONObject) {
        C3105c m7691c = m7691c(jSONObject);
        if (m7691c == null) {
            return;
        }
        mo7695a(m7691c);
        if (C3349v.m6862a()) {
            m7705a("Pending reward handled: " + m7691c);
        }
    }

    /* renamed from: c */
    private C3105c m7691c(JSONObject jSONObject) {
        String str;
        try {
            JSONObject m7008a = C3295h.m7008a(jSONObject);
            C3295h.m7003d(m7008a, this.f8192b);
            C3295h.m7004c(jSONObject, this.f8192b);
            C3295h.m7001e(jSONObject, this.f8192b);
            Map<String, String> stringMap = JsonUtils.toStringMap((JSONObject) m7008a.get("params"));
            try {
                str = m7008a.getString("result");
            } catch (Throwable unused) {
                str = "network_timeout";
            }
            return C3105c.m7822a(str, stringMap);
        } catch (JSONException e) {
            if (C3349v.m6862a()) {
                m7704a("Unable to parse API response", e);
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo7695a(C3105c c3105c);

    /* renamed from: b */
    public abstract boolean mo7693b();

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: h */
    public int mo7564h() {
        return ((Integer) this.f8192b.m7456a(C3109b.f7893bs)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        m7565a(m7563i(), new C3240b.InterfaceC3244c<JSONObject>() { // from class: com.applovin.impl.sdk.e.ab.1
            @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, JSONObject jSONObject) {
                if (AbstractC3134ab.this.mo7693b()) {
                    if (C3349v.m6862a()) {
                        AbstractC3134ab abstractC3134ab = AbstractC3134ab.this;
                        abstractC3134ab.m7700d("Reward validation failed with error code " + i + " but task was cancelled already");
                        return;
                    }
                    return;
                }
                if (C3349v.m6862a()) {
                    AbstractC3134ab abstractC3134ab2 = AbstractC3134ab.this;
                    abstractC3134ab2.m7700d("Reward validation failed with code " + i + " and error: " + str);
                }
                AbstractC3134ab.this.mo7567a(i);
            }

            @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(JSONObject jSONObject, int i) {
                if (!AbstractC3134ab.this.mo7693b()) {
                    if (C3349v.m6862a()) {
                        AbstractC3134ab abstractC3134ab = AbstractC3134ab.this;
                        abstractC3134ab.m7705a("Reward validation succeeded with code " + i + " and response: " + jSONObject);
                    }
                    AbstractC3134ab.this.m7692b(jSONObject);
                } else if (C3349v.m6862a()) {
                    AbstractC3134ab abstractC3134ab2 = AbstractC3134ab.this;
                    abstractC3134ab2.m7700d("Reward validation succeeded with code " + i + " but task was cancelled already");
                    AbstractC3134ab abstractC3134ab3 = AbstractC3134ab.this;
                    abstractC3134ab3.m7700d("Response: " + jSONObject);
                }
            }
        });
    }
}
