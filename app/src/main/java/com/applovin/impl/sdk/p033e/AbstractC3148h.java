package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.p032d.C3126g;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.h */
/* loaded from: classes.dex */
public abstract class AbstractC3148h extends AbstractRunnableC3131a {

    /* renamed from: a */
    protected final C3079d f8222a;

    public AbstractC3148h(C3079d c3079d, String str, C3214m c3214m) {
        super(str, c3214m);
        this.f8222a = c3079d;
    }

    /* renamed from: a */
    private void m7647a(C3126g c3126g) {
        C3125f c3125f = C3125f.f8163c;
        long m7716b = c3126g.m7716b(c3125f);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - m7716b > TimeUnit.MINUTES.toMillis(((Integer) this.f8192b.m7456a(C3109b.f7989dk)).intValue())) {
            c3126g.m7715b(c3125f, currentTimeMillis);
            c3126g.m7714c(C3125f.f8164d);
        }
    }

    /* renamed from: i */
    private Map<String, String> m7645i() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f8222a.m7991a());
        if (this.f8222a.m7984c() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f8222a.m7984c().getLabel());
        }
        if (this.f8222a.m7983d() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f8222a.m7983d().getLabel());
        }
        return hashMap;
    }

    /* renamed from: a */
    public abstract AbstractRunnableC3131a mo7364a(JSONObject jSONObject);

    /* renamed from: a */
    public Map<String, String> mo7366a() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.f8222a.m7991a());
        if (this.f8222a.m7984c() != null) {
            hashMap.put("size", this.f8222a.m7984c().getLabel());
        }
        if (this.f8222a.m7983d() != null) {
            hashMap.put("require", this.f8222a.m7983d().getLabel());
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo7365a(int i) {
        if (C3349v.m6862a()) {
            m7700d("Unable to fetch " + this.f8222a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f8192b.m7468T().m7719a(C3125f.f8168h);
        }
    }

    /* renamed from: b */
    public abstract String mo7363b();

    /* renamed from: b */
    public void m7646b(JSONObject jSONObject) {
        C3295h.m7003d(jSONObject, this.f8192b);
        C3295h.m7004c(jSONObject, this.f8192b);
        C3295h.m7001e(jSONObject, this.f8192b);
        C3079d.m7987a(jSONObject);
        this.f8192b.m7469S().m7621a(mo7364a(jSONObject));
    }

    /* renamed from: c */
    public abstract String mo7362c();

    /* renamed from: h */
    public EnumC3076b mo7631h() {
        return this.f8222a.m7982e() ? EnumC3076b.APPLOVIN_PRIMARY_ZONE : EnumC3076b.APPLOVIN_CUSTOM_ZONE;
    }

    @Override // java.lang.Runnable
    public void run() {
        HashMap hashMap;
        if (C3349v.m6862a()) {
            m7705a("Fetching next ad of zone: " + this.f8222a);
        }
        if (((Boolean) this.f8192b.m7456a(C3109b.f7958dF)).booleanValue() && Utils.isVPNConnected() && C3349v.m6862a()) {
            m7705a("User is connected to a VPN");
        }
        C3126g m7468T = this.f8192b.m7468T();
        m7468T.m7719a(C3125f.f8161a);
        C3125f c3125f = C3125f.f8163c;
        if (m7468T.m7716b(c3125f) == 0) {
            m7468T.m7715b(c3125f, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f8192b.m7391u().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f8192b.m7456a(C3109b.f7983de)).booleanValue()) {
                JSONObject jSONObject = new JSONObject(this.f8192b.m7466V().m7143a(mo7366a(), false, true));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f8192b.m7456a(C3109b.f8044ep)).booleanValue()) {
                    hashMap2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8192b.m7386z());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
                andResetCustomPostBody = jSONObject;
                hashMap = hashMap2;
            } else {
                Map<String, String> stringifyObjectMap = Utils.stringifyObjectMap(this.f8192b.m7466V().m7143a(mo7366a(), false, false));
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = "GET";
                }
                hashMap = stringifyObjectMap;
            }
            if (Utils.isDspDemoApp(m7698f())) {
                hashMap.putAll(this.f8192b.m7391u().getAndResetCustomQueryParams());
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.putAll(m7645i());
            m7647a(m7468T);
            C3245c.C3246a mo7182b = C3245c.m7323a(this.f8192b).mo7186a(mo7363b()).mo7175c(mo7362c()).mo7185a(hashMap).mo7179b(str).mo7178b(hashMap3).mo7187a((C3245c.C3246a) new JSONObject()).mo7189a(((Integer) this.f8192b.m7456a(C3109b.f7919cS)).intValue()).m7306a(((Boolean) this.f8192b.m7456a(C3109b.f7920cT)).booleanValue()).m7305b(((Boolean) this.f8192b.m7456a(C3109b.f7921cU)).booleanValue()).mo7182b(((Integer) this.f8192b.m7456a(C3109b.f7918cR)).intValue());
            if (andResetCustomPostBody != null) {
                mo7182b.mo7184a(andResetCustomPostBody);
                mo7182b.mo7169d(((Boolean) this.f8192b.m7456a(C3109b.f8052ex)).booleanValue());
            }
            AbstractC3180u<JSONObject> abstractC3180u = new AbstractC3180u<JSONObject>(mo7182b.mo7190a(), this.f8192b) { // from class: com.applovin.impl.sdk.e.h.1
                @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
                /* renamed from: a */
                public void mo7327a(int i, String str2, JSONObject jSONObject2) {
                    AbstractC3148h.this.mo7365a(i);
                }

                @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
                /* renamed from: a */
                public void mo7326a(JSONObject jSONObject2, int i) {
                    if (i != 200) {
                        AbstractC3148h.this.mo7365a(i);
                        return;
                    }
                    JsonUtils.putLong(jSONObject2, "ad_fetch_latency_millis", ((AbstractC3180u) this).f8297d.m7334a());
                    JsonUtils.putLong(jSONObject2, "ad_fetch_response_size", ((AbstractC3180u) this).f8297d.m7331b());
                    AbstractC3148h.this.m7646b(jSONObject2);
                }
            };
            abstractC3180u.m7589a(C3109b.f7813aR);
            abstractC3180u.m7585b(C3109b.f7814aS);
            this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) abstractC3180u);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                m7704a("Unable to fetch ad " + this.f8222a, th);
            }
            mo7365a(0);
        }
    }
}
