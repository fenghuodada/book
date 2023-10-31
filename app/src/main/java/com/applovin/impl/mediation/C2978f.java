package com.applovin.impl.mediation;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p011a.C2828f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p060j$.util.DesugarCollections;

/* renamed from: com.applovin.impl.mediation.f */
/* loaded from: classes.dex */
public class C2978f {

    /* renamed from: b */
    private final C3214m f7365b;

    /* renamed from: c */
    private final C3349v f7366c;

    /* renamed from: a */
    private final Map<String, C2980g> f7364a = DesugarCollections.synchronizedMap(new HashMap(16));

    /* renamed from: d */
    private final Object f7367d = new Object();

    /* renamed from: e */
    private final Map<String, Class<? extends MaxAdapter>> f7368e = new HashMap();

    /* renamed from: f */
    private final Set<String> f7369f = new HashSet();

    /* renamed from: g */
    private final Object f7370g = new Object();

    /* renamed from: h */
    private final Set<C2979a> f7371h = new HashSet();

    /* renamed from: com.applovin.impl.mediation.f$a */
    /* loaded from: classes.dex */
    public static class C2979a {

        /* renamed from: a */
        private final String f7372a;

        /* renamed from: b */
        private final String f7373b;

        /* renamed from: c */
        private final MaxAdFormat f7374c;

        /* renamed from: d */
        private final JSONObject f7375d;

        public C2979a(String str, String str2, @Nullable AbstractC2823a abstractC2823a, C3214m c3214m) {
            this.f7372a = str;
            this.f7373b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f7375d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (abstractC2823a == null) {
                this.f7374c = null;
                return;
            }
            this.f7374c = abstractC2823a.getFormat();
            if (abstractC2823a.getFormat() != null) {
                JsonUtils.putString(jSONObject, "format", abstractC2823a.getFormat().getLabel());
            }
        }

        /* renamed from: a */
        public JSONObject m8172a() {
            return this.f7375d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2979a c2979a = (C2979a) obj;
            if (this.f7372a.equals(c2979a.f7372a) && this.f7373b.equals(c2979a.f7373b)) {
                MaxAdFormat maxAdFormat = this.f7374c;
                MaxAdFormat maxAdFormat2 = c2979a.f7374c;
                return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
            }
            return false;
        }

        public int hashCode() {
            int i;
            int m12537a = C0406q1.m12537a(this.f7373b, this.f7372a.hashCode() * 31, 31);
            MaxAdFormat maxAdFormat = this.f7374c;
            if (maxAdFormat != null) {
                i = maxAdFormat.hashCode();
            } else {
                i = 0;
            }
            return m12537a + i;
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f7372a + "', operationTag='" + this.f7373b + "', format=" + this.f7374c + '}';
        }
    }

    public C2978f(C3214m c3214m) {
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f7365b = c3214m;
        this.f7366c = c3214m.m7487A();
    }

    /* renamed from: a */
    private C2980g m8178a(C2828f c2828f, Class<? extends MaxAdapter> cls, boolean z) {
        try {
            return new C2980g(c2828f, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f7365b.m7463Y()), z, this.f7365b);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c("MediationAdapterManager", "Failed to load adapter: " + c2828f, th);
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    private Class<? extends MaxAdapter> m8176a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            if (C3349v.m6862a()) {
                C3349v.m6846i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C2980g m8179a(C2828f c2828f) {
        return m8177a(c2828f, false);
    }

    /* renamed from: a */
    public C2980g m8177a(C2828f c2828f, boolean z) {
        Class<? extends MaxAdapter> m8176a;
        C2980g c2980g;
        if (c2828f != null) {
            String m8743L = c2828f.m8743L();
            String m8744K = c2828f.m8744K();
            if (TextUtils.isEmpty(m8743L)) {
                if (C3349v.m6862a()) {
                    C3349v c3349v = this.f7366c;
                    c3349v.m6850e("MediationAdapterManager", "No adapter name provided for " + m8744K + ", not loading the adapter ");
                }
                return null;
            } else if (TextUtils.isEmpty(m8744K)) {
                if (C3349v.m6862a()) {
                    C3349v c3349v2 = this.f7366c;
                    c3349v2.m6850e("MediationAdapterManager", "Unable to find default className for '" + m8743L + "'");
                }
                return null;
            } else if (!z || (c2980g = this.f7364a.get(m8744K)) == null) {
                synchronized (this.f7367d) {
                    if (this.f7369f.contains(m8744K)) {
                        if (C3349v.m6862a()) {
                            C3349v c3349v3 = this.f7366c;
                            c3349v3.m6855b("MediationAdapterManager", "Not attempting to load " + m8743L + " due to prior errors");
                        }
                        return null;
                    }
                    if (this.f7368e.containsKey(m8744K)) {
                        m8176a = this.f7368e.get(m8744K);
                    } else {
                        m8176a = m8176a(m8744K);
                        if (m8176a == null) {
                            this.f7369f.add(m8744K);
                            return null;
                        }
                    }
                    C2980g m8178a = m8178a(c2828f, m8176a, z);
                    if (m8178a == null) {
                        if (C3349v.m6862a()) {
                            C3349v c3349v4 = this.f7366c;
                            c3349v4.m6850e("MediationAdapterManager", "Failed to load " + m8743L);
                        }
                        this.f7369f.add(m8744K);
                        return null;
                    }
                    if (C3349v.m6862a()) {
                        C3349v c3349v5 = this.f7366c;
                        c3349v5.m6855b("MediationAdapterManager", "Loaded " + m8743L);
                    }
                    this.f7368e.put(m8744K, m8176a);
                    if (z) {
                        this.f7364a.put(c2828f.m8744K(), m8178a);
                    }
                    return m8178a;
                }
            } else {
                return c2980g;
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    /* renamed from: a */
    public Collection<String> m8180a() {
        Set unmodifiableSet;
        synchronized (this.f7367d) {
            HashSet hashSet = new HashSet(this.f7368e.size());
            for (Class<? extends MaxAdapter> cls : this.f7368e.values()) {
                hashSet.add(cls.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    /* renamed from: a */
    public void m8175a(String str, String str2, @Nullable AbstractC2823a abstractC2823a) {
        synchronized (this.f7370g) {
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f7365b.m7487A();
                m7487A.m6850e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f7371h.add(new C2979a(str, str2, abstractC2823a, this.f7365b));
        }
    }

    /* renamed from: b */
    public Collection<String> m8174b() {
        Set unmodifiableSet;
        synchronized (this.f7367d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f7369f);
        }
        return unmodifiableSet;
    }

    /* renamed from: c */
    public Collection<JSONObject> m8173c() {
        ArrayList arrayList;
        synchronized (this.f7370g) {
            arrayList = new ArrayList(this.f7371h.size());
            for (C2979a c2979a : this.f7371h) {
                arrayList.add(c2979a.m8172a());
            }
        }
        return arrayList;
    }
}
