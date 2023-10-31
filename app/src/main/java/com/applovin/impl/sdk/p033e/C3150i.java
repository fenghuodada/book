package com.applovin.impl.sdk.p033e;

import android.app.ActivityManager;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.C3199j;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3267o;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.i */
/* loaded from: classes.dex */
public class C3150i extends AbstractRunnableC3131a {

    /* renamed from: a */
    private static final AtomicBoolean f8224a = new AtomicBoolean();

    /* renamed from: c */
    private final int f8225c;

    /* renamed from: d */
    private final Object f8226d;

    /* renamed from: e */
    private InterfaceC3152a f8227e;

    /* renamed from: com.applovin.impl.sdk.e.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3152a {
        /* renamed from: a */
        void mo7385a(JSONObject jSONObject);
    }

    /* renamed from: com.applovin.impl.sdk.e.i$b */
    /* loaded from: classes.dex */
    public class C3153b extends AbstractRunnableC3131a {
        public C3153b(C3214m c3214m) {
            super("TaskTimeoutFetchBasicSettings", c3214m, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C3150i.this.f8226d) {
                if (C3150i.this.f8227e != null) {
                    if (C3349v.m6862a()) {
                        m7700d("Timing out fetch basic settings...");
                    }
                    C3150i.this.m7639a(new JSONObject());
                }
            }
        }
    }

    public C3150i(int i, C3214m c3214m, InterfaceC3152a interfaceC3152a) {
        super("TaskFetchBasicSettings", c3214m, true);
        this.f8226d = new Object();
        this.f8225c = i;
        this.f8227e = interfaceC3152a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7639a(JSONObject jSONObject) {
        synchronized (this.f8226d) {
            InterfaceC3152a interfaceC3152a = this.f8227e;
            if (interfaceC3152a != null) {
                interfaceC3152a.mo7385a(jSONObject);
                this.f8227e = null;
            }
        }
    }

    /* renamed from: c */
    private String m7636c() {
        return C3295h.m7009a((String) this.f8192b.m7456a(C3109b.f7811aP), "5.0/i", m7701d());
    }

    /* renamed from: h */
    private String m7635h() {
        return C3295h.m7009a((String) this.f8192b.m7456a(C3109b.f7812aQ), "5.0/i", m7701d());
    }

    /* renamed from: a */
    public Map<String, String> m7642a() {
        HashMap hashMap = new HashMap();
        hashMap.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f8192b.m7456a(C3109b.f8044ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8192b.m7386z());
        }
        Boolean m7515a = C3199j.m7520b().m7515a(m7698f());
        if (m7515a != null) {
            hashMap.put("huc", m7515a.toString());
        }
        Boolean m7515a2 = C3199j.m7525a().m7515a(m7698f());
        if (m7515a2 != null) {
            hashMap.put("aru", m7515a2.toString());
        }
        Boolean m7515a3 = C3199j.m7518c().m7515a(m7698f());
        if (m7515a3 != null) {
            hashMap.put("dns", m7515a3.toString());
        }
        return hashMap;
    }

    /* renamed from: b */
    public JSONObject m7638b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            jSONObject.put("is_cross_promo", this.f8192b.m7409e());
            jSONObject.put("init_count", this.f8225c);
            jSONObject.put("server_installed_at", this.f8192b.m7456a(C3109b.f7827af));
            String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
            if (StringUtils.isValidString(userEngagementSdkVersion)) {
                jSONObject.put("ue_sdk_version", userEngagementSdkVersion);
            }
            if (this.f8192b.m7472P()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f8192b.m7471Q()) {
                jSONObject.put("first_install_v2", true);
            }
            String str = (String) this.f8192b.m7456a(C3109b.f8004dz);
            if (StringUtils.isValidString(str)) {
                jSONObject.put("plugin_version", str);
            }
            String m7392t = this.f8192b.m7392t();
            if (StringUtils.isValidString(m7392t)) {
                jSONObject.put("mediation_provider", m7392t);
            }
            jSONObject.put("installed_mediation_adapters", C2895c.m8458a(this.f8192b));
            Map<String, Object> m7132h = this.f8192b.m7466V().m7132h();
            jSONObject.put("package_name", m7132h.get("package_name"));
            jSONObject.put("app_version", m7132h.get("app_version"));
            jSONObject.put("test_ads", m7132h.get("test_ads"));
            jSONObject.put("debug", m7132h.get("debug"));
            jSONObject.put("tg", m7132h.get("tg"));
            jSONObject.put("target_sdk", m7132h.get("target_sdk"));
            List<String> initializationAdUnitIds = this.f8192b.m7396p().getInitializationAdUnitIds();
            if (initializationAdUnitIds != null && initializationAdUnitIds.size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(initializationAdUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", m7132h.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_TCString", m7132h.get("IABTCF_gdprApplies"));
            Map<String, Object> m7141b = this.f8192b.m7466V().m7141b();
            jSONObject.put("platform", m7141b.get("platform"));
            jSONObject.put("os", m7141b.get("os"));
            jSONObject.put("locale", m7141b.get("locale"));
            jSONObject.put("brand", m7141b.get("brand"));
            jSONObject.put("brand_name", m7141b.get("brand_name"));
            jSONObject.put("hardware", m7141b.get("hardware"));
            jSONObject.put("model", m7141b.get("model"));
            jSONObject.put("revision", m7141b.get("revision"));
            jSONObject.put("is_tablet", m7141b.get("is_tablet"));
            jSONObject.put("screen_size_in", m7141b.get("screen_size_in"));
            if (((Boolean) this.f8192b.m7456a(C3109b.f7961dI)).booleanValue()) {
                jSONObject.put("mtl", this.f8192b.m7436ad().m6834b());
            }
            try {
                ActivityManager activityManager = (ActivityManager) this.f8192b.m7476L().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            Map<String, String> allData = this.f8192b.m7394r().getAllData();
            if (!allData.isEmpty()) {
                jSONObject.put("targeting_data", new JSONObject(allData));
            }
            C3267o.C3273a m7129k = this.f8192b.m7466V().m7129k();
            jSONObject.put("dnt", m7129k.f8636a);
            if (((Boolean) this.f8192b.m7456a(C3109b.f8002dx)).booleanValue() && StringUtils.isValidString(m7129k.f8637b)) {
                jSONObject.put("idfa", m7129k.f8637b);
            }
            C3267o.C3274b m7128l = this.f8192b.m7466V().m7128l();
            if (((Boolean) this.f8192b.m7456a(C3109b.f7995dq)).booleanValue() && m7128l != null) {
                jSONObject.put("idfv", m7128l.f8638a);
                jSONObject.put("idfv_scope", m7128l.f8639b);
            }
            String name = this.f8192b.m7395q().getName();
            if (StringUtils.isValidString(name)) {
                jSONObject.put("user_segment_name", StringUtils.encodeUriString(name, this.f8192b));
            }
            if (((Boolean) this.f8192b.m7456a(C3109b.f7998dt)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f8192b.m7398n());
            }
            if (((Boolean) this.f8192b.m7456a(C3109b.f8000dv)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f8192b.m7397o());
            }
            if (this.f8192b.m7478J().m8198a()) {
                jSONObject.put("test_mode", true);
            }
            String m8192c = this.f8192b.m7478J().m8192c();
            if (StringUtils.isValidString(m8192c)) {
                jSONObject.put("test_mode_network", m8192c);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f8192b.m7396p().getExtraParameters()));
        } catch (JSONException e) {
            if (C3349v.m6862a()) {
                m7704a("Failed to construct JSON body", e);
            }
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!C3294g.m7018i() && f8224a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(this.f8192b.m7476L());
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    m7704a("Cannot update security provider", th);
                }
            }
        }
        Map<String, String> m7642a = m7642a();
        C3245c.C3246a mo7176c = C3245c.m7323a(this.f8192b).mo7186a(m7636c()).mo7175c(m7635h()).mo7185a(m7642a).mo7184a(m7638b()).mo7169d(((Boolean) this.f8192b.m7456a(C3109b.f8050ev)).booleanValue()).mo7179b("POST").mo7187a((C3245c.C3246a) new JSONObject()).mo7189a(((Integer) this.f8192b.m7456a(C3109b.f7925cY)).intValue()).mo7176c(((Integer) this.f8192b.m7456a(C3109b.f7980db)).intValue());
        C3214m c3214m = this.f8192b;
        C3109b<Integer> c3109b = C3109b.f7924cX;
        C3245c mo7190a = mo7176c.mo7182b(((Integer) c3214m.m7456a(c3109b)).intValue()).mo7190a();
        this.f8192b.m7469S().m7619a(new C3153b(this.f8192b), C3163o.EnumC3165a.TIMEOUT, ((Integer) this.f8192b.m7456a(c3109b)).intValue() + 250);
        AbstractC3180u<JSONObject> abstractC3180u = new AbstractC3180u<JSONObject>(mo7190a, this.f8192b, m7697g()) { // from class: com.applovin.impl.sdk.e.i.1
            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7327a(int i, String str, JSONObject jSONObject) {
                if (C3349v.m6862a()) {
                    m7700d("Unable to fetch basic SDK settings: server returned " + i);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                C3150i.this.m7639a(jSONObject);
            }

            @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
            /* renamed from: a */
            public void mo7326a(JSONObject jSONObject, int i) {
                C3150i.this.m7639a(jSONObject);
            }
        };
        abstractC3180u.m7589a(C3109b.f7811aP);
        abstractC3180u.m7585b(C3109b.f7812aQ);
        this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) abstractC3180u);
    }
}
