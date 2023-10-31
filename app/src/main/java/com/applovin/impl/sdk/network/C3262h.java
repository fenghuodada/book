package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p060j$.util.DesugarCollections;

/* renamed from: com.applovin.impl.sdk.network.h */
/* loaded from: classes.dex */
public class C3262h {

    /* renamed from: a */
    private String f8595a;

    /* renamed from: b */
    private String f8596b;

    /* renamed from: c */
    private String f8597c;

    /* renamed from: d */
    private String f8598d;

    /* renamed from: e */
    private Map<String, String> f8599e;

    /* renamed from: f */
    private Map<String, String> f8600f;

    /* renamed from: g */
    private Map<String, Object> f8601g;

    /* renamed from: h */
    private boolean f8602h;

    /* renamed from: i */
    private boolean f8603i;

    /* renamed from: j */
    private boolean f8604j;

    /* renamed from: k */
    private String f8605k;

    /* renamed from: l */
    private int f8606l;

    /* renamed from: com.applovin.impl.sdk.network.h$a */
    /* loaded from: classes.dex */
    public static class C3264a {

        /* renamed from: a */
        private String f8607a;

        /* renamed from: b */
        private String f8608b;

        /* renamed from: c */
        private String f8609c;

        /* renamed from: d */
        private String f8610d;

        /* renamed from: e */
        private Map<String, String> f8611e;

        /* renamed from: f */
        private Map<String, String> f8612f;

        /* renamed from: g */
        private Map<String, Object> f8613g;

        /* renamed from: h */
        private boolean f8614h;

        /* renamed from: i */
        private boolean f8615i;

        /* renamed from: j */
        private boolean f8616j;

        /* renamed from: a */
        public C3264a m7213a(String str) {
            this.f8607a = str;
            return this;
        }

        /* renamed from: a */
        public C3264a m7212a(Map<String, String> map) {
            this.f8611e = map;
            return this;
        }

        /* renamed from: a */
        public C3264a m7211a(boolean z) {
            this.f8614h = z;
            return this;
        }

        /* renamed from: a */
        public C3262h m7215a() {
            return new C3262h(this);
        }

        /* renamed from: b */
        public C3264a m7209b(String str) {
            this.f8608b = str;
            return this;
        }

        /* renamed from: b */
        public C3264a m7208b(Map<String, String> map) {
            this.f8612f = map;
            return this;
        }

        /* renamed from: b */
        public C3264a m7207b(boolean z) {
            this.f8615i = z;
            return this;
        }

        /* renamed from: c */
        public C3264a m7205c(String str) {
            this.f8609c = str;
            return this;
        }

        /* renamed from: c */
        public C3264a m7204c(Map<String, Object> map) {
            this.f8613g = map;
            return this;
        }

        /* renamed from: c */
        public C3264a m7203c(boolean z) {
            this.f8616j = z;
            return this;
        }

        /* renamed from: d */
        public C3264a m7201d(String str) {
            this.f8610d = str;
            return this;
        }
    }

    private C3262h(C3264a c3264a) {
        this.f8595a = UUID.randomUUID().toString();
        this.f8596b = c3264a.f8608b;
        this.f8597c = c3264a.f8609c;
        this.f8598d = c3264a.f8610d;
        this.f8599e = c3264a.f8611e;
        this.f8600f = c3264a.f8612f;
        this.f8601g = c3264a.f8613g;
        this.f8602h = c3264a.f8614h;
        this.f8603i = c3264a.f8615i;
        this.f8604j = c3264a.f8616j;
        this.f8605k = c3264a.f8607a;
        this.f8606l = 0;
    }

    public C3262h(JSONObject jSONObject, C3214m c3214m) throws Exception {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        JsonUtils.getString(jSONObject, "httpMethod", "");
        String string3 = jSONObject.getString("targetUrl");
        String string4 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        Map<String, String> synchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? DesugarCollections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap<>(0);
        Map<String, String> synchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? DesugarCollections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap<>(0);
        Map<String, Object> synchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? DesugarCollections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap<>(0);
        this.f8595a = string;
        this.f8605k = string2;
        this.f8597c = string3;
        this.f8598d = string4;
        this.f8599e = synchronizedMap;
        this.f8600f = synchronizedMap2;
        this.f8601g = synchronizedMap3;
        this.f8602h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f8603i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f8604j = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f8606l = i;
    }

    /* renamed from: o */
    public static C3264a m7216o() {
        return new C3264a();
    }

    /* renamed from: a */
    public String m7230a() {
        return this.f8596b;
    }

    /* renamed from: b */
    public String m7229b() {
        return this.f8597c;
    }

    /* renamed from: c */
    public String m7228c() {
        return this.f8598d;
    }

    /* renamed from: d */
    public Map<String, String> m7227d() {
        return this.f8599e;
    }

    /* renamed from: e */
    public Map<String, String> m7226e() {
        return this.f8600f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8595a.equals(((C3262h) obj).f8595a);
    }

    /* renamed from: f */
    public Map<String, Object> m7225f() {
        return this.f8601g;
    }

    /* renamed from: g */
    public boolean m7224g() {
        return this.f8602h;
    }

    /* renamed from: h */
    public boolean m7223h() {
        return this.f8603i;
    }

    public int hashCode() {
        return this.f8595a.hashCode();
    }

    /* renamed from: i */
    public boolean m7222i() {
        return this.f8604j;
    }

    /* renamed from: j */
    public String m7221j() {
        return this.f8605k;
    }

    /* renamed from: k */
    public int m7220k() {
        return this.f8606l;
    }

    /* renamed from: l */
    public void m7219l() {
        this.f8606l++;
    }

    /* renamed from: m */
    public void m7218m() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.f8599e;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f8599e = hashMap;
    }

    /* renamed from: n */
    public JSONObject m7217n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f8595a);
        jSONObject.put("communicatorRequestId", this.f8605k);
        jSONObject.put("httpMethod", this.f8596b);
        jSONObject.put("targetUrl", this.f8597c);
        jSONObject.put("backupUrl", this.f8598d);
        jSONObject.put("isEncodingEnabled", this.f8602h);
        jSONObject.put("gzipBodyEncoding", this.f8603i);
        jSONObject.put("attemptNumber", this.f8606l);
        if (this.f8599e != null) {
            jSONObject.put("parameters", new JSONObject(this.f8599e));
        }
        if (this.f8600f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f8600f));
        }
        if (this.f8601g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f8601g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f8595a + "', communicatorRequestId='" + this.f8605k + "', httpMethod='" + this.f8596b + "', targetUrl='" + this.f8597c + "', backupUrl='" + this.f8598d + "', attemptNumber=" + this.f8606l + ", isEncodingEnabled=" + this.f8602h + ", isGzipBodyEncoding=" + this.f8603i + '}';
    }
}
