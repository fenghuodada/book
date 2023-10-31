package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3240b;
import com.applovin.impl.sdk.p030b.C3105c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.w */
/* loaded from: classes.dex */
public abstract class AbstractC3183w extends AbstractC3187y {
    public AbstractC3183w(String str, C3214m c3214m) {
        super(str, c3214m);
    }

    /* renamed from: a */
    private JSONObject m7580a(C3105c c3105c) {
        JSONObject m7563i = m7563i();
        JsonUtils.putString(m7563i, "result", c3105c.m7821b());
        Map<String, String> m7824a = c3105c.m7824a();
        if (m7824a != null) {
            JsonUtils.putJSONObject(m7563i, "params", new JSONObject(m7824a));
        }
        return m7563i;
    }

    /* renamed from: b */
    public abstract C3105c mo7579b();

    /* renamed from: b */
    public abstract void mo7578b(JSONObject jSONObject);

    /* renamed from: c */
    public abstract void mo7577c();

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: h */
    public int mo7564h() {
        return ((Integer) this.f8192b.m7456a(C3109b.f7894bt)).intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        C3105c mo7579b = mo7579b();
        if (mo7579b == null) {
            if (C3349v.m6862a()) {
                m7700d("Pending reward not found");
            }
            mo7577c();
            return;
        }
        if (C3349v.m6862a()) {
            m7705a("Reporting pending reward: " + mo7579b + "...");
        }
        m7565a(m7580a(mo7579b), new C3240b.InterfaceC3244c<JSONObject>() { // from class: com.applovin.impl.sdk.e.w.1
            @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, JSONObject jSONObject) {
                AbstractC3183w.this.mo7567a(i);
            }

            @Override // com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(JSONObject jSONObject, int i) {
                AbstractC3183w.this.mo7578b(jSONObject);
            }
        });
    }
}
