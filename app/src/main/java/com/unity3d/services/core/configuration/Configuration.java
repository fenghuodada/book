package com.unity3d.services.core.configuration;

import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.C9517a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.request.C9583h;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Configuration {

    /* renamed from: A */
    private String f18639A;

    /* renamed from: B */
    private ConfigurationRequestFactory f18640B;

    /* renamed from: C */
    private Map<String, IModuleConfiguration> f18641C;

    /* renamed from: D */
    private String[] f18642D;

    /* renamed from: E */
    private Class[] f18643E;

    /* renamed from: a */
    private String f18644a;

    /* renamed from: b */
    private String f18645b;

    /* renamed from: c */
    private String f18646c;

    /* renamed from: d */
    private String f18647d;

    /* renamed from: e */
    private String f18648e;

    /* renamed from: f */
    private boolean f18649f;

    /* renamed from: g */
    private int f18650g;

    /* renamed from: h */
    private int f18651h;

    /* renamed from: i */
    private long f18652i;

    /* renamed from: j */
    private double f18653j;

    /* renamed from: k */
    private int f18654k;

    /* renamed from: l */
    private int f18655l;

    /* renamed from: m */
    private long f18656m;

    /* renamed from: n */
    private int f18657n;

    /* renamed from: o */
    private int f18658o;

    /* renamed from: p */
    private int f18659p;

    /* renamed from: q */
    private String f18660q;

    /* renamed from: r */
    private double f18661r;

    /* renamed from: s */
    private long f18662s;

    /* renamed from: t */
    private String f18663t;

    /* renamed from: u */
    private String f18664u;

    /* renamed from: v */
    private String f18665v;

    /* renamed from: w */
    private String f18666w;

    /* renamed from: x */
    private ExperimentsReader f18667x;

    /* renamed from: y */
    private int f18668y;

    /* renamed from: z */
    private int f18669z;

    public Configuration() {
        this.f18642D = new String[]{"com.unity3d.services.core.configuration.CoreModuleConfiguration", "com.unity3d.services.ads.configuration.AdsModuleConfiguration", "com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration", "com.unity3d.services.banners.configuration.BannersModuleConfiguration", "com.unity3d.services.store.core.configuration.StoreModuleConfiguration"};
        this.f18667x = new ExperimentsReader();
        m2223b(new JSONObject(), false);
    }

    public Configuration(String str) {
        this(str, new Experiments());
    }

    public Configuration(String str, Experiments experiments) {
        this();
        this.f18664u = str;
        this.f18640B = new ConfigurationRequestFactory(this, new C9517a(new ConfigurationReader(), PrivacyConfigStorage.getInstance()));
        this.f18667x.updateLocalExperiments(experiments);
    }

    public Configuration(String str, ExperimentsReader experimentsReader) {
        this(str, experimentsReader.getCurrentlyActiveExperiments());
        this.f18667x = experimentsReader;
    }

    public Configuration(JSONObject jSONObject) throws MalformedURLException, JSONException {
        this.f18642D = new String[]{"com.unity3d.services.core.configuration.CoreModuleConfiguration", "com.unity3d.services.ads.configuration.AdsModuleConfiguration", "com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration", "com.unity3d.services.banners.configuration.BannersModuleConfiguration", "com.unity3d.services.store.core.configuration.StoreModuleConfiguration"};
        this.f18667x = new ExperimentsReader();
        m2225a(jSONObject, false);
    }

    /* renamed from: a */
    private JSONObject m2226a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (!next.equals("tkn") && !next.equals("sid")) {
                jSONObject2.put(next, opt);
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private void m2227a() {
        ArrayList arrayList = new ArrayList();
        for (String str : getModuleConfigurationList()) {
            IModuleConfiguration moduleConfiguration = getModuleConfiguration(str);
            if (moduleConfiguration != null && moduleConfiguration.getWebAppApiClassList() != null) {
                arrayList.addAll(Arrays.asList(moduleConfiguration.getWebAppApiClassList()));
            }
        }
        this.f18643E = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    /* renamed from: b */
    private void m2223b(JSONObject jSONObject, boolean z) {
        this.f18646c = jSONObject.optString(MediationMetaData.KEY_VERSION, null);
        this.f18649f = jSONObject.optBoolean("dwu", false);
        this.f18650g = jSONObject.optInt("rwt", 10000);
        this.f18651h = jSONObject.optInt("mr", 6);
        this.f18652i = jSONObject.optLong("rd", 5000L);
        this.f18653j = jSONObject.optDouble("rcf", 2.0d);
        this.f18654k = jSONObject.optInt("cet", 10000);
        this.f18655l = jSONObject.optInt("mce", 500);
        this.f18656m = jSONObject.optLong("net", 60000L);
        this.f18648e = jSONObject.optString("sdkv", "");
        this.f18657n = jSONObject.optInt("sto", 10000);
        this.f18658o = jSONObject.optInt("lto", 30000);
        this.f18659p = jSONObject.optInt("wto", 5000);
        this.f18660q = jSONObject.optString("murl", "");
        this.f18661r = jSONObject.optDouble("msr", 100.0d);
        this.f18662s = jSONObject.optLong("wct", 60000L);
        this.f18668y = jSONObject.optInt("tto", 5000);
        this.f18669z = jSONObject.optInt("prwto", 3000);
        this.f18639A = jSONObject.optString("src", null);
        if (z) {
            this.f18667x.updateRemoteExperiments(new Experiments(jSONObject.optJSONObject("exp")));
        } else {
            this.f18667x.updateLocalExperiments(new Experiments(jSONObject.optJSONObject("exp")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2225a(org.json.JSONObject r5, boolean r6) throws java.net.MalformedURLException, org.json.JSONException {
        /*
            r4 = this;
            java.lang.String r0 = "hash"
            java.lang.String r1 = "url"
            r2 = 0
            boolean r3 = r5.isNull(r1)     // Catch: org.json.JSONException -> L10
            if (r3 != 0) goto L10
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L10
            goto L11
        L10:
            r1 = r2
        L11:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L56
            r4.f18644a = r1
            boolean r1 = r5.isNull(r0)     // Catch: org.json.JSONException -> L28
            if (r1 != 0) goto L24
            java.lang.String r0 = r5.getString(r0)     // Catch: org.json.JSONException -> L28
            goto L25
        L24:
            r0 = r2
        L25:
            r4.f18645b = r0     // Catch: org.json.JSONException -> L28
            goto L2a
        L28:
            r4.f18645b = r2
        L2a:
            java.lang.String r0 = "tkn"
            boolean r1 = r5.isNull(r0)
            if (r1 != 0) goto L37
            java.lang.String r0 = r5.optString(r0)
            goto L38
        L37:
            r0 = r2
        L38:
            r4.f18665v = r0
            java.lang.String r0 = "sid"
            boolean r1 = r5.isNull(r0)
            if (r1 != 0) goto L46
            java.lang.String r2 = r5.optString(r0)
        L46:
            r4.f18666w = r2
            r4.m2223b(r5, r6)
            org.json.JSONObject r5 = r4.m2226a(r5)
            java.lang.String r5 = r5.toString()
            r4.f18663t = r5
            return
        L56:
            java.net.MalformedURLException r5 = new java.net.MalformedURLException
            java.lang.String r6 = "WebView URL is null or empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.Configuration.m2225a(org.json.JSONObject, boolean):void");
    }

    /* renamed from: b */
    public void m2224b() throws Exception {
        if (this.f18664u == null) {
            throw new MalformedURLException("Base URL is null");
        }
        C9583h webRequest = this.f18640B.getWebRequest();
        InitializeEventsMetricSender.getInstance().didConfigRequestStart();
        try {
            m2225a(new JSONObject(webRequest.m1885n()), true);
            saveToDisk();
        } catch (Exception e) {
            throw e;
        }
    }

    public String getConfigUrl() {
        return this.f18664u;
    }

    public int getConnectedEventThreshold() {
        return this.f18654k;
    }

    public boolean getDelayWebViewUpdate() {
        return this.f18649f;
    }

    public Experiments getExperiments() {
        return this.f18667x.getCurrentlyActiveExperiments();
    }

    public ExperimentsReader getExperimentsReader() {
        return this.f18667x;
    }

    public String getJSONString() {
        return this.f18663t;
    }

    public int getLoadTimeout() {
        return this.f18658o;
    }

    public int getMaxRetries() {
        return this.f18651h;
    }

    public int getMaximumConnectedEvents() {
        return this.f18655l;
    }

    public double getMetricSampleRate() {
        return this.f18661r;
    }

    public String getMetricsUrl() {
        return this.f18660q;
    }

    public IModuleConfiguration getModuleConfiguration(String str) {
        Map<String, IModuleConfiguration> map = this.f18641C;
        if (map == null || !map.containsKey(str)) {
            try {
                IModuleConfiguration iModuleConfiguration = (IModuleConfiguration) Class.forName(str).newInstance();
                if (iModuleConfiguration != null) {
                    if (this.f18641C == null) {
                        HashMap hashMap = new HashMap();
                        this.f18641C = hashMap;
                        hashMap.put(str, iModuleConfiguration);
                    }
                    return iModuleConfiguration;
                }
            } catch (Exception unused) {
            }
            return null;
        }
        return this.f18641C.get(str);
    }

    public String[] getModuleConfigurationList() {
        return this.f18642D;
    }

    public long getNetworkErrorTimeout() {
        return this.f18656m;
    }

    public int getPrivacyRequestWaitTimeout() {
        return this.f18669z;
    }

    public int getResetWebappTimeout() {
        return this.f18650g;
    }

    public long getRetryDelay() {
        return this.f18652i;
    }

    public double getRetryScalingFactor() {
        return this.f18653j;
    }

    public String getSdkVersion() {
        return this.f18648e;
    }

    public int getShowTimeout() {
        return this.f18657n;
    }

    public String getSrc() {
        String str = this.f18639A;
        return str != null ? str : "";
    }

    public String getStateId() {
        String str = this.f18666w;
        return str != null ? str : "";
    }

    public int getTokenTimeout() {
        return this.f18668y;
    }

    public String getUnifiedAuctionToken() {
        return this.f18665v;
    }

    public Class[] getWebAppApiClassList() {
        if (this.f18643E == null) {
            m2227a();
        }
        return this.f18643E;
    }

    public long getWebViewAppCreateTimeout() {
        return this.f18662s;
    }

    public int getWebViewBridgeTimeout() {
        return this.f18659p;
    }

    public String getWebViewData() {
        return this.f18647d;
    }

    public String getWebViewHash() {
        return this.f18645b;
    }

    public String getWebViewUrl() {
        return this.f18644a;
    }

    public String getWebViewVersion() {
        return this.f18646c;
    }

    public void saveToDisk() {
        C9564j.m1993a(new File(C9572d.m1929k()), getJSONString());
    }

    public void setWebViewData(String str) {
        this.f18647d = str;
    }

    public void setWebViewHash(String str) {
        this.f18645b = str;
    }

    public void setWebViewUrl(String str) {
        this.f18644a = str;
    }
}
