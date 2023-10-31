package com.adcolony.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.v1 */
/* loaded from: classes.dex */
public final class C2328v1 {

    /* renamed from: a */
    public final JSONArray f5642a;

    public C2328v1() {
        this.f5642a = new JSONArray();
    }

    public C2328v1(JSONArray jSONArray) throws NullPointerException {
        jSONArray.getClass();
        this.f5642a = jSONArray;
    }

    /* renamed from: a */
    public final void m9486a(C2367y1 c2367y1) {
        synchronized (this.f5642a) {
            this.f5642a.put(c2367y1.f5690a);
        }
    }

    /* renamed from: b */
    public final boolean m9485b(String str) {
        boolean z;
        synchronized (this.f5642a) {
            z = false;
            int i = 0;
            while (true) {
                if (i >= this.f5642a.length()) {
                    break;
                } else if (m9480g(i).equals(str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public final int m9484c() {
        return this.f5642a.length();
    }

    /* renamed from: d */
    public final void m9483d(String str) {
        synchronized (this.f5642a) {
            this.f5642a.put(str);
        }
    }

    /* renamed from: e */
    public final C2367y1 m9482e(int i) {
        C2367y1 c2367y1;
        synchronized (this.f5642a) {
            JSONObject optJSONObject = this.f5642a.optJSONObject(i);
            c2367y1 = optJSONObject != null ? new C2367y1(optJSONObject) : new C2367y1();
        }
        return c2367y1;
    }

    /* renamed from: f */
    public final C2367y1[] m9481f() {
        C2367y1[] c2367y1Arr;
        synchronized (this.f5642a) {
            c2367y1Arr = new C2367y1[this.f5642a.length()];
            for (int i = 0; i < this.f5642a.length(); i++) {
                c2367y1Arr[i] = m9482e(i);
            }
        }
        return c2367y1Arr;
    }

    /* renamed from: g */
    public final String m9480g(int i) {
        String optString;
        synchronized (this.f5642a) {
            optString = this.f5642a.optString(i);
        }
        return optString;
    }

    public final String toString() {
        String jSONArray;
        synchronized (this.f5642a) {
            jSONArray = this.f5642a.toString();
        }
        return jSONArray;
    }

    public C2328v1(String str) throws JSONException {
        this.f5642a = new JSONArray(str);
    }
}
