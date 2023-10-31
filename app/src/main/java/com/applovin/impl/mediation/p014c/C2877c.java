package com.applovin.impl.mediation.p014c;

import android.content.Context;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p015d.C2894b;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.C3190f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.p032d.C3126g;
import com.applovin.impl.sdk.p033e.AbstractC3180u;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.c */
/* loaded from: classes.dex */
public class C2877c extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final String f6958a;

    /* renamed from: c */
    private final MaxAdFormat f6959c;

    /* renamed from: d */
    private final Map<String, Object> f6960d;

    /* renamed from: e */
    private final Map<String, Object> f6961e;

    /* renamed from: f */
    private final JSONArray f6962f;

    /* renamed from: g */
    private final Context f6963g;

    /* renamed from: h */
    private final AbstractC2854a.InterfaceC2855a f6964h;

    public C2877c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, JSONArray jSONArray, Context context, C3214m c3214m, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        super(C0552c.m12192b("TaskFetchMediatedAd ", str), c3214m);
        this.f6958a = str;
        this.f6959c = maxAdFormat;
        this.f6960d = map;
        this.f6961e = map2;
        this.f6962f = jSONArray;
        this.f6963g = context;
        this.f6964h = interfaceC2855a;
    }

    /* renamed from: a */
    private String m8536a() {
        return C2894b.m8469a(this.f8192b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8535a(int i, String str) {
        if (C3349v.m6862a()) {
            m7700d("Unable to fetch " + this.f6958a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f8192b.m7468T().m7719a(C3125f.f8175o);
        }
        C3298j.m6978a(this.f6964h, this.f6958a, i == -1009 ? new MaxErrorImpl(-1009, str) : i == -1001 ? new MaxErrorImpl(-1001, str) : StringUtils.isValidString(str) ? new MaxErrorImpl(MaxErrorCode.NETWORK_ERROR, str) : new MaxErrorImpl(-1));
    }

    /* renamed from: a */
    private void m8532a(C3126g c3126g) {
        C3125f c3125f = C3125f.f8163c;
        long m7716b = c3126g.m7716b(c3125f);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - m7716b > TimeUnit.MINUTES.toMillis(((Integer) this.f8192b.m7456a(C3109b.f7989dk)).intValue())) {
            c3126g.m7715b(c3125f, currentTimeMillis);
            c3126g.m7714c(C3125f.f8164d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8531a(JSONObject jSONObject) {
        try {
            C3295h.m7003d(jSONObject, this.f8192b);
            C3295h.m7004c(jSONObject, this.f8192b);
            C3295h.m7001e(jSONObject, this.f8192b);
            C3295h.m6999f(jSONObject, this.f8192b);
            C2894b.m8468a(jSONObject, this.f8192b);
            C2894b.m8465b(jSONObject, this.f8192b);
            C3190f.m7557a(this.f8192b);
            if (this.f6959c != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, null)) && C3349v.m6862a()) {
                C3349v.m6846i(m7699e(), "Ad format requested does not match ad unit id's format.");
            }
            this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) m8529b(jSONObject));
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                m7704a("Unable to process mediated ad response", th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    /* renamed from: b */
    private C2881e m8529b(JSONObject jSONObject) {
        return new C2881e(this.f6958a, this.f6959c, this.f6960d, jSONObject, this.f6963g, this.f8192b, this.f6964h);
    }

    /* renamed from: b */
    private String m8530b() {
        return C2894b.m8466b(this.f8192b);
    }

    /* renamed from: c */
    private Map<String, String> m8528c() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f6958a);
        hashMap.put("AppLovin-Ad-Format", this.f6959c.getLabel());
        return hashMap;
    }

    /* renamed from: c */
    private void m8527c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray((Collection) this.f8192b.m7485C().m8173c()));
            jSONObject2.put("installed", C2895c.m8458a(this.f8192b));
            jSONObject2.put("initialized", this.f8192b.m7484D().m8181c());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f8192b.m7484D().m8182b()));
            jSONObject2.put("loaded_classnames", new JSONArray((Collection) this.f8192b.m7485C().m8180a()));
            jSONObject2.put("failed_classnames", new JSONArray((Collection) this.f8192b.m7485C().m8174b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (C3349v.m6862a()) {
                m7704a("Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    /* renamed from: d */
    private void m8526d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f6962f;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* renamed from: e */
    private void m8525e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f6958a);
        jSONObject2.put(FirebaseAnalytics.Param.AD_FORMAT, this.f6959c.getLabel());
        HashMap hashMap = new HashMap(this.f6961e);
        AbstractC2823a m6843a = this.f8192b.m7482F().m6843a(this.f6958a);
        if (m6843a != null) {
            hashMap.put("previous_winning_network", m6843a.m8743L());
            hashMap.put("previous_winning_network_name", m6843a.getNetworkName());
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(hashMap));
        jSONObject.put("ad_info", jSONObject2);
    }

    /* renamed from: f */
    private void m8524f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f8192b.m7483E().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !Utils.isDspDemoApp(this.f8192b.m7476L())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    /* renamed from: g */
    private void m8523g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f8192b.m7396p().getExtraParameters()));
    }

    /* renamed from: h */
    private JSONObject m8522h() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f8192b.m7466V().m7143a(null, false, true));
        m8525e(jSONObject);
        m8526d(jSONObject);
        m8527c(jSONObject);
        m8524f(jSONObject);
        m8523g(jSONObject);
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3349v.m6862a()) {
            m7705a("Fetching next ad for ad unit id: " + this.f6958a + " and format: " + this.f6959c);
        }
        if (((Boolean) this.f8192b.m7456a(C3109b.f7958dF)).booleanValue() && Utils.isVPNConnected() && C3349v.m6862a()) {
            m7705a("User is connected to a VPN");
        }
        C3126g m7468T = this.f8192b.m7468T();
        m7468T.m7719a(C3125f.f8174n);
        C3125f c3125f = C3125f.f8163c;
        if (m7468T.m7716b(c3125f) == 0) {
            m7468T.m7715b(c3125f, System.currentTimeMillis());
        }
        try {
            JSONObject m8522h = m8522h();
            HashMap hashMap = new HashMap();
            hashMap.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f8192b.m7456a(C3109b.f8044ep)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8192b.m7386z());
            }
            if (this.f8192b.m7478J().m8198a()) {
                hashMap.put("test_mode", "1");
            }
            String m8192c = this.f8192b.m7478J().m8192c();
            if (StringUtils.isValidString(m8192c)) {
                hashMap.put("filter_ad_network", m8192c);
                if (!this.f8192b.m7478J().m8198a()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.f8192b.m7478J().m8194b()) {
                    hashMap.put("force_ad_network", m8192c);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(m8528c());
            m8532a(m7468T);
            AbstractC3180u<JSONObject> abstractC3180u = new AbstractC3180u<JSONObject>(C3245c.m7323a(this.f8192b).mo7179b("POST").mo7178b(hashMap2).mo7186a(m8536a()).mo7175c(m8530b()).mo7185a((Map<String, String>) hashMap).mo7184a(m8522h).mo7169d(((Boolean) this.f8192b.m7456a(C3108a.f7763U)).booleanValue()).mo7187a((C3245c.C3246a) new JSONObject()).mo7182b(((Long) this.f8192b.m7456a(C3108a.f7770f)).intValue()).mo7189a(((Integer) this.f8192b.m7456a(C3109b.f7919cS)).intValue()).mo7176c(((Long) this.f8192b.m7456a(C3108a.f7769e)).intValue()).mo7190a(), this.f8192b) { // from class: com.applovin.impl.mediation.c.c.1
                @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
                /* renamed from: a */
                public void mo7327a(int i, String str, JSONObject jSONObject) {
                    C2877c.this.m8535a(i, str);
                }

                @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
                /* renamed from: a */
                public void mo7326a(JSONObject jSONObject, int i) {
                    if (i != 200) {
                        C2877c.this.m8535a(i, (String) null);
                        return;
                    }
                    JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", ((AbstractC3180u) this).f8297d.m7334a());
                    JsonUtils.putLong(jSONObject, "ad_fetch_response_size", ((AbstractC3180u) this).f8297d.m7331b());
                    C2877c.this.m8531a(jSONObject);
                }
            };
            abstractC3180u.m7589a(C3108a.f7767c);
            abstractC3180u.m7585b(C3108a.f7768d);
            this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) abstractC3180u);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                m7704a("Unable to fetch ad " + this.f6958a, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
