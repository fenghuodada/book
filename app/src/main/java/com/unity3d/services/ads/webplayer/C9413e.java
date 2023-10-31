package com.unity3d.services.ads.webplayer;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.ads.webplayer.e */
/* loaded from: classes3.dex */
public class C9413e {

    /* renamed from: a */
    private static C9413e f18432a;

    /* renamed from: b */
    private HashMap<String, JSONObject> f18433b = new HashMap<>();

    /* renamed from: c */
    private HashMap<String, JSONObject> f18434c = new HashMap<>();

    /* renamed from: d */
    private HashMap<String, JSONObject> f18435d = new HashMap<>();

    /* renamed from: a */
    public static C9413e m2354a() {
        if (f18432a == null) {
            f18432a = new C9413e();
        }
        return f18432a;
    }

    /* renamed from: a */
    public synchronized JSONObject m2353a(String str) {
        if (this.f18435d.containsKey(str)) {
            return this.f18435d.get(str);
        }
        return new JSONObject();
    }

    /* renamed from: a */
    public synchronized void m2352a(String str, JSONObject jSONObject) {
        this.f18435d.put(str, jSONObject);
    }

    /* renamed from: b */
    public synchronized JSONObject m2351b(String str) {
        if (this.f18434c.containsKey(str)) {
            return this.f18434c.get(str);
        }
        return new JSONObject();
    }

    /* renamed from: b */
    public synchronized void m2350b(String str, JSONObject jSONObject) {
        this.f18434c.put(str, jSONObject);
    }

    /* renamed from: c */
    public synchronized JSONObject m2349c(String str) {
        if (this.f18433b.containsKey(str)) {
            return this.f18433b.get(str);
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public synchronized void m2348c(String str, JSONObject jSONObject) {
        this.f18433b.put(str, jSONObject);
    }

    /* renamed from: d */
    public synchronized void m2347d(String str) {
        if (this.f18435d.containsKey(str)) {
            this.f18435d.remove(str);
        }
    }

    /* renamed from: e */
    public synchronized void m2346e(String str) {
        if (this.f18434c.containsKey(str)) {
            this.f18434c.remove(str);
        }
    }

    /* renamed from: f */
    public synchronized void m2345f(String str) {
        if (this.f18433b.containsKey(str)) {
            this.f18433b.remove(str);
        }
    }
}
