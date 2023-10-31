package com.adcolony.sdk;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.y1 */
/* loaded from: classes.dex */
public final class C2367y1 {

    /* renamed from: a */
    public final JSONObject f5690a;

    public C2367y1() {
        this.f5690a = new JSONObject();
    }

    public C2367y1(@NonNull JSONObject jSONObject) throws NullPointerException {
        jSONObject.getClass();
        this.f5690a = jSONObject;
    }

    /* renamed from: a */
    public final int m9458a(String str, int i) {
        int optInt;
        synchronized (this.f5690a) {
            optInt = this.f5690a.optInt(str, i);
        }
        return optInt;
    }

    /* renamed from: b */
    public final void m9457b(C2328v1 c2328v1) {
        synchronized (this.f5690a) {
            Iterator<String> keys = this.f5690a.keys();
            while (keys.hasNext()) {
                if (!c2328v1.m9485b(keys.next())) {
                    keys.remove();
                }
            }
        }
    }

    /* renamed from: c */
    public final void m9456c(C2367y1 c2367y1, String str) throws JSONException {
        synchronized (this.f5690a) {
            this.f5690a.put(str, c2367y1.f5690a);
        }
    }

    /* renamed from: d */
    public final void m9455d(String str, String str2) throws JSONException {
        synchronized (this.f5690a) {
            this.f5690a.put(str, str2);
        }
    }

    /* renamed from: e */
    public final void m9454e(String[] strArr) {
        synchronized (this.f5690a) {
            for (String str : strArr) {
                this.f5690a.remove(str);
            }
        }
    }

    /* renamed from: f */
    public final boolean m9453f(String str) {
        boolean z;
        synchronized (this.f5690a) {
            Iterator<String> keys = this.f5690a.keys();
            while (true) {
                if (keys.hasNext()) {
                    if (str.equals(keys.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: g */
    public final int m9452g(String str) throws JSONException {
        int i;
        synchronized (this.f5690a) {
            i = this.f5690a.getInt(str);
        }
        return i;
    }

    /* renamed from: h */
    public final void m9451h(int i, String str) throws JSONException {
        synchronized (this.f5690a) {
            this.f5690a.put(str, i);
        }
    }

    /* renamed from: i */
    public final void m9450i(String str, double d) throws JSONException {
        synchronized (this.f5690a) {
            this.f5690a.put(str, d);
        }
    }

    /* renamed from: j */
    public final boolean m9449j() {
        return this.f5690a.length() == 0;
    }

    /* renamed from: k */
    public final C2328v1 m9448k(String str) throws JSONException {
        C2328v1 c2328v1;
        synchronized (this.f5690a) {
            c2328v1 = new C2328v1(this.f5690a.getJSONArray(str));
        }
        return c2328v1;
    }

    /* renamed from: l */
    public final boolean m9447l(int i, String str) throws JSONException {
        synchronized (this.f5690a) {
            if (this.f5690a.has(str)) {
                return false;
            }
            this.f5690a.put(str, i);
            return true;
        }
    }

    /* renamed from: m */
    public final String m9446m(String str) throws JSONException {
        String string;
        synchronized (this.f5690a) {
            string = this.f5690a.getString(str);
        }
        return string;
    }

    /* renamed from: n */
    public final HashMap m9445n() {
        HashMap hashMap = new HashMap();
        synchronized (this.f5690a) {
            Iterator<String> keys = this.f5690a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, m9436w(next));
            }
        }
        return hashMap;
    }

    /* renamed from: o */
    public final boolean m9444o(String str) {
        boolean optBoolean;
        synchronized (this.f5690a) {
            optBoolean = this.f5690a.optBoolean(str);
        }
        return optBoolean;
    }

    /* renamed from: p */
    public final double m9443p() {
        double optDouble;
        synchronized (this.f5690a) {
            optDouble = this.f5690a.optDouble("thread_pool_scaling_factor");
        }
        return optDouble;
    }

    /* renamed from: q */
    public final Integer m9442q(String str) {
        Integer valueOf;
        try {
            synchronized (this.f5690a) {
                valueOf = Integer.valueOf(this.f5690a.getInt(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public final int m9441r(String str) {
        int optInt;
        synchronized (this.f5690a) {
            optInt = this.f5690a.optInt(str);
        }
        return optInt;
    }

    /* renamed from: s */
    public final C2328v1 m9440s(String str) {
        C2328v1 c2328v1;
        synchronized (this.f5690a) {
            JSONArray optJSONArray = this.f5690a.optJSONArray(str);
            c2328v1 = optJSONArray != null ? new C2328v1(optJSONArray) : null;
        }
        return c2328v1;
    }

    /* renamed from: t */
    public final C2367y1 m9439t(String str) {
        C2367y1 c2367y1;
        synchronized (this.f5690a) {
            JSONObject optJSONObject = this.f5690a.optJSONObject(str);
            c2367y1 = optJSONObject != null ? new C2367y1(optJSONObject) : new C2367y1();
        }
        return c2367y1;
    }

    public final String toString() {
        String jSONObject;
        synchronized (this.f5690a) {
            jSONObject = this.f5690a.toString();
        }
        return jSONObject;
    }

    /* renamed from: u */
    public final C2367y1 m9438u(String str) {
        C2367y1 c2367y1;
        synchronized (this.f5690a) {
            JSONObject optJSONObject = this.f5690a.optJSONObject(str);
            c2367y1 = optJSONObject != null ? new C2367y1(optJSONObject) : null;
        }
        return c2367y1;
    }

    /* renamed from: v */
    public final Object m9437v(String str) {
        Object opt;
        synchronized (this.f5690a) {
            opt = this.f5690a.isNull(str) ? null : this.f5690a.opt(str);
        }
        return opt;
    }

    /* renamed from: w */
    public final String m9436w(String str) {
        String optString;
        synchronized (this.f5690a) {
            optString = this.f5690a.optString(str);
        }
        return optString;
    }

    /* renamed from: x */
    public final void m9435x(String str) {
        synchronized (this.f5690a) {
            this.f5690a.remove(str);
        }
    }

    public C2367y1(@NonNull String str) throws JSONException {
        this.f5690a = new JSONObject(str);
    }

    public C2367y1(@NonNull HashMap hashMap) {
        this.f5690a = new JSONObject(hashMap);
    }
}
