package com.applovin.impl.sdk.network;

import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p033e.AbstractC3180u;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.a */
/* loaded from: classes.dex */
public class C3238a extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final String f8495a;

    /* renamed from: c */
    private final C3245c<JSONObject> f8496c;

    public C3238a(String str, C3245c<JSONObject> c3245c, C3214m c3214m) {
        super(C0552c.m12192b("CommunicatorRequestTask:", str), c3214m);
        this.f8495a = str;
        this.f8496c = c3245c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) new AbstractC3180u<JSONObject>(this.f8496c, this.f8192b, m7697g()) { // from class: com.applovin.impl.sdk.network.a.1
            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, JSONObject jSONObject) {
                this.f8192b.m7433ag().m7529a(C3238a.this.f8495a, C3238a.this.f8496c.m7325a(), i, jSONObject, str, false);
            }

            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(JSONObject jSONObject, int i) {
                this.f8192b.m7433ag().m7529a(C3238a.this.f8495a, C3238a.this.f8496c.m7325a(), i, jSONObject, null, true);
            }
        });
    }
}
