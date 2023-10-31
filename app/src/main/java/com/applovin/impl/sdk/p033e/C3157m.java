package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.m */
/* loaded from: classes.dex */
public class C3157m extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final InterfaceC3159a f8233a;

    /* renamed from: com.applovin.impl.sdk.e.m$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3159a {
        /* renamed from: a */
        void mo7626a();
    }

    public C3157m(C3214m c3214m, InterfaceC3159a interfaceC3159a) {
        super("TaskFetchVariables", c3214m);
        this.f8233a = interfaceC3159a;
    }

    /* renamed from: a */
    private Map<String, String> m7630a() {
        return Utils.stringifyObjectMap(this.f8192b.m7466V().m7143a(null, false, false));
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC3180u<JSONObject> abstractC3180u = new AbstractC3180u<JSONObject>(C3245c.m7323a(this.f8192b).mo7186a(C3295h.m6994k(this.f8192b)).mo7175c(C3295h.m6993l(this.f8192b)).mo7185a(m7630a()).mo7179b("GET").mo7187a((C3245c.C3246a) new JSONObject()).mo7182b(((Integer) this.f8192b.m7456a(C3109b.f7981dc)).intValue()).mo7190a(), this.f8192b) { // from class: com.applovin.impl.sdk.e.m.1
            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, JSONObject jSONObject) {
                if (C3349v.m6862a()) {
                    m7700d("Unable to fetch variables: server returned " + i);
                    C3349v.m6846i("AppLovinVariableService", "Failed to load variables.");
                }
                C3157m.this.f8233a.mo7626a();
            }

            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(JSONObject jSONObject, int i) {
                C3295h.m7003d(jSONObject, this.f8192b);
                C3295h.m7004c(jSONObject, this.f8192b);
                C3295h.m6999f(jSONObject, this.f8192b);
                C3295h.m7001e(jSONObject, this.f8192b);
                C3157m.this.f8233a.mo7626a();
            }
        };
        abstractC3180u.m7589a(C3109b.f7819aX);
        abstractC3180u.m7585b(C3109b.f7820aY);
        this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) abstractC3180u);
    }
}
