package com.applovin.impl.sdk.p031c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.c.c */
/* loaded from: classes.dex */
public class C3110c {

    /* renamed from: a */
    protected final C3214m f8057a;

    /* renamed from: b */
    protected final Context f8058b;

    /* renamed from: c */
    protected final SharedPreferences f8059c;

    /* renamed from: d */
    private final Map<String, Object> f8060d = new HashMap();

    /* renamed from: e */
    private final Object f8061e = new Object();

    public C3110c(C3214m c3214m) {
        this.f8057a = c3214m;
        Context m7476L = c3214m.m7476L();
        this.f8058b = m7476L;
        this.f8059c = m7476L.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(C3109b.class.getName());
            Class.forName(C3108a.class.getName());
        } catch (Throwable unused) {
        }
        m7801b();
    }

    /* renamed from: a */
    private static Object m7803a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    /* renamed from: e */
    private String m7796e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.f8057a.m7386z()) + ".";
    }

    /* renamed from: a */
    public <T> C3109b<T> m7804a(String str, C3109b<T> c3109b) {
        synchronized (this.f8061e) {
            Iterator<C3109b<?>> it = C3109b.m7808c().iterator();
            while (it.hasNext()) {
                C3109b<T> c3109b2 = (C3109b<T>) it.next();
                if (c3109b2.m7812a().equals(str)) {
                    return c3109b2;
                }
            }
            return c3109b;
        }
    }

    /* renamed from: a */
    public <T> T m7806a(C3109b<T> c3109b) {
        if (c3109b != null) {
            synchronized (this.f8061e) {
                Object obj = this.f8060d.get(c3109b.m7812a());
                if (obj == null) {
                    return c3109b.m7809b();
                }
                return c3109b.m7811a(obj);
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    /* renamed from: a */
    public void m7807a() {
        String m7796e = m7796e();
        synchronized (this.f8061e) {
            SharedPreferences.Editor edit = this.f8059c.edit();
            for (C3109b<?> c3109b : C3109b.m7808c()) {
                Object obj = this.f8060d.get(c3109b.m7812a());
                if (obj != null) {
                    this.f8057a.m7443a(m7796e + c3109b.m7812a(), (String) obj, edit);
                }
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    public <T> void m7805a(C3109b<?> c3109b, Object obj) {
        if (c3109b == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No new value specified");
        }
        synchronized (this.f8061e) {
            this.f8060d.put(c3109b.m7812a(), obj);
        }
    }

    /* renamed from: a */
    public void m7802a(JSONObject jSONObject) {
        synchronized (this.f8061e) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        C3109b<Long> m7804a = m7804a(next, (C3109b) null);
                        if (m7804a != null) {
                            this.f8060d.put(m7804a.m7812a(), m7803a(next, jSONObject, m7804a.m7809b()));
                            if (m7804a == C3109b.f8046er) {
                                this.f8060d.put(C3109b.f8047es.m7812a(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } catch (JSONException e) {
                        if (C3349v.m6862a()) {
                            this.f8057a.m7487A().m6854b("SettingsManager", "Unable to parse JSON settingsValues array", e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public List<String> m7800b(C3109b<String> c3109b) {
        return CollectionUtils.explode((String) m7806a(c3109b));
    }

    /* renamed from: b */
    public void m7801b() {
        String m7796e = m7796e();
        synchronized (this.f8061e) {
            for (C3109b<?> c3109b : C3109b.m7808c()) {
                try {
                    Object m7442a = this.f8057a.m7442a(m7796e + c3109b.m7812a(), null, c3109b.m7809b().getClass(), this.f8059c);
                    if (m7442a != null) {
                        this.f8060d.put(c3109b.m7812a(), m7442a);
                    }
                } catch (Exception e) {
                    if (C3349v.m6862a()) {
                        C3349v m7487A = this.f8057a.m7487A();
                        m7487A.m6854b("SettingsManager", "Unable to load \"" + c3109b.m7812a() + "\"", e);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public List<MaxAdFormat> m7798c(C3109b<String> c3109b) {
        ArrayList arrayList = new ArrayList(6);
        for (String str : m7800b(c3109b)) {
            arrayList.add(MaxAdFormat.formatFromString(str));
        }
        return arrayList;
    }

    /* renamed from: c */
    public void m7799c() {
        synchronized (this.f8061e) {
            this.f8060d.clear();
        }
        this.f8057a.m7458a(this.f8059c);
    }

    /* renamed from: d */
    public boolean m7797d() {
        return this.f8057a.m7396p().isVerboseLoggingEnabled() || ((Boolean) m7806a(C3109b.f7823ab)).booleanValue();
    }
}
