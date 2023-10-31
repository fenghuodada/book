package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p031c.C3109b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.c */
/* loaded from: classes.dex */
public class C3245c<T> {

    /* renamed from: a */
    private String f8513a;

    /* renamed from: b */
    private String f8514b;

    /* renamed from: c */
    private Map<String, String> f8515c;

    /* renamed from: d */
    private Map<String, String> f8516d;

    /* renamed from: e */
    private final JSONObject f8517e;

    /* renamed from: f */
    private String f8518f;

    /* renamed from: g */
    private final T f8519g;

    /* renamed from: h */
    private final int f8520h;

    /* renamed from: i */
    private int f8521i;

    /* renamed from: j */
    private final int f8522j;

    /* renamed from: k */
    private final int f8523k;

    /* renamed from: l */
    private final boolean f8524l;

    /* renamed from: m */
    private final boolean f8525m;

    /* renamed from: n */
    private final boolean f8526n;

    /* renamed from: o */
    private final boolean f8527o;

    /* renamed from: com.applovin.impl.sdk.network.c$a */
    /* loaded from: classes.dex */
    public static class C3246a<T> {

        /* renamed from: a */
        String f8528a;

        /* renamed from: b */
        String f8529b;

        /* renamed from: c */
        String f8530c;

        /* renamed from: e */
        Map<String, String> f8532e;

        /* renamed from: f */
        JSONObject f8533f;

        /* renamed from: g */
        T f8534g;

        /* renamed from: i */
        int f8536i;

        /* renamed from: j */
        int f8537j;

        /* renamed from: k */
        boolean f8538k;

        /* renamed from: l */
        boolean f8539l;

        /* renamed from: m */
        boolean f8540m;

        /* renamed from: n */
        boolean f8541n;

        /* renamed from: h */
        int f8535h = 1;

        /* renamed from: d */
        Map<String, String> f8531d = new HashMap();

        public C3246a(C3214m c3214m) {
            this.f8536i = ((Integer) c3214m.m7456a(C3109b.f7915cO)).intValue();
            this.f8537j = ((Integer) c3214m.m7456a(C3109b.f7914cN)).intValue();
            this.f8539l = ((Boolean) c3214m.m7456a(C3109b.f7913cM)).booleanValue();
            this.f8540m = ((Boolean) c3214m.m7456a(C3109b.f8044ep)).booleanValue();
            this.f8541n = ((Boolean) c3214m.m7456a(C3109b.f8049eu)).booleanValue();
        }

        /* renamed from: a */
        public C3246a<T> mo7189a(int i) {
            this.f8535h = i;
            return this;
        }

        /* renamed from: a */
        public C3246a<T> mo7187a(T t) {
            this.f8534g = t;
            return this;
        }

        /* renamed from: a */
        public C3246a<T> mo7186a(String str) {
            this.f8529b = str;
            return this;
        }

        /* renamed from: a */
        public C3246a<T> mo7185a(Map<String, String> map) {
            this.f8531d = map;
            return this;
        }

        /* renamed from: a */
        public C3246a<T> mo7184a(JSONObject jSONObject) {
            this.f8533f = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C3246a<T> m7306a(boolean z) {
            this.f8538k = z;
            return this;
        }

        /* renamed from: a */
        public C3245c<T> mo7190a() {
            return new C3245c<>(this);
        }

        /* renamed from: b */
        public C3246a<T> mo7182b(int i) {
            this.f8536i = i;
            return this;
        }

        /* renamed from: b */
        public C3246a<T> mo7179b(String str) {
            this.f8528a = str;
            return this;
        }

        /* renamed from: b */
        public C3246a<T> mo7178b(Map<String, String> map) {
            this.f8532e = map;
            return this;
        }

        /* renamed from: b */
        public C3246a<T> m7305b(boolean z) {
            this.f8539l = z;
            return this;
        }

        /* renamed from: c */
        public C3246a<T> mo7176c(int i) {
            this.f8537j = i;
            return this;
        }

        /* renamed from: c */
        public C3246a<T> mo7175c(String str) {
            this.f8530c = str;
            return this;
        }

        /* renamed from: c */
        public C3246a<T> mo7173c(boolean z) {
            this.f8540m = z;
            return this;
        }

        /* renamed from: d */
        public C3246a<T> mo7169d(boolean z) {
            this.f8541n = z;
            return this;
        }
    }

    public C3245c(C3246a<T> c3246a) {
        this.f8513a = c3246a.f8529b;
        this.f8514b = c3246a.f8528a;
        this.f8515c = c3246a.f8531d;
        this.f8516d = c3246a.f8532e;
        this.f8517e = c3246a.f8533f;
        this.f8518f = c3246a.f8530c;
        this.f8519g = c3246a.f8534g;
        int i = c3246a.f8535h;
        this.f8520h = i;
        this.f8521i = i;
        this.f8522j = c3246a.f8536i;
        this.f8523k = c3246a.f8537j;
        this.f8524l = c3246a.f8538k;
        this.f8525m = c3246a.f8539l;
        this.f8526n = c3246a.f8540m;
        this.f8527o = c3246a.f8541n;
    }

    /* renamed from: a */
    public static <T> C3246a<T> m7323a(C3214m c3214m) {
        return new C3246a<>(c3214m);
    }

    /* renamed from: a */
    public String m7325a() {
        return this.f8513a;
    }

    /* renamed from: a */
    public void m7324a(int i) {
        this.f8521i = i;
    }

    /* renamed from: a */
    public void m7322a(String str) {
        this.f8513a = str;
    }

    /* renamed from: b */
    public String m7321b() {
        return this.f8514b;
    }

    /* renamed from: b */
    public void m7320b(String str) {
        this.f8514b = str;
    }

    /* renamed from: c */
    public Map<String, String> m7319c() {
        return this.f8515c;
    }

    /* renamed from: d */
    public Map<String, String> m7318d() {
        return this.f8516d;
    }

    /* renamed from: e */
    public JSONObject m7317e() {
        return this.f8517e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3245c) {
            C3245c c3245c = (C3245c) obj;
            String str = this.f8513a;
            if (str == null ? c3245c.f8513a == null : str.equals(c3245c.f8513a)) {
                Map<String, String> map = this.f8515c;
                if (map == null ? c3245c.f8515c == null : map.equals(c3245c.f8515c)) {
                    Map<String, String> map2 = this.f8516d;
                    if (map2 == null ? c3245c.f8516d == null : map2.equals(c3245c.f8516d)) {
                        String str2 = this.f8518f;
                        if (str2 == null ? c3245c.f8518f == null : str2.equals(c3245c.f8518f)) {
                            String str3 = this.f8514b;
                            if (str3 == null ? c3245c.f8514b == null : str3.equals(c3245c.f8514b)) {
                                JSONObject jSONObject = this.f8517e;
                                if (jSONObject == null ? c3245c.f8517e == null : jSONObject.equals(c3245c.f8517e)) {
                                    T t = this.f8519g;
                                    if (t == null ? c3245c.f8519g == null : t.equals(c3245c.f8519g)) {
                                        return this.f8520h == c3245c.f8520h && this.f8521i == c3245c.f8521i && this.f8522j == c3245c.f8522j && this.f8523k == c3245c.f8523k && this.f8524l == c3245c.f8524l && this.f8525m == c3245c.f8525m && this.f8526n == c3245c.f8526n && this.f8527o == c3245c.f8527o;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public String m7316f() {
        return this.f8518f;
    }

    /* renamed from: g */
    public T m7315g() {
        return this.f8519g;
    }

    /* renamed from: h */
    public int m7314h() {
        return this.f8521i;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f8513a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8518f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8514b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t = this.f8519g;
        int hashCode5 = ((((((((((((((((hashCode4 + (t != null ? t.hashCode() : 0)) * 31) + this.f8520h) * 31) + this.f8521i) * 31) + this.f8522j) * 31) + this.f8523k) * 31) + (this.f8524l ? 1 : 0)) * 31) + (this.f8525m ? 1 : 0)) * 31) + (this.f8526n ? 1 : 0)) * 31) + (this.f8527o ? 1 : 0);
        Map<String, String> map = this.f8515c;
        if (map != null) {
            hashCode5 = (hashCode5 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f8516d;
        if (map2 != null) {
            hashCode5 = (hashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f8517e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (hashCode5 * 31) + new String(charArray).hashCode();
        }
        return hashCode5;
    }

    /* renamed from: i */
    public int m7313i() {
        return this.f8520h - this.f8521i;
    }

    /* renamed from: j */
    public int m7312j() {
        return this.f8522j;
    }

    /* renamed from: k */
    public int m7311k() {
        return this.f8523k;
    }

    /* renamed from: l */
    public boolean m7310l() {
        return this.f8524l;
    }

    /* renamed from: m */
    public boolean m7309m() {
        return this.f8525m;
    }

    /* renamed from: n */
    public boolean m7308n() {
        return this.f8526n;
    }

    /* renamed from: o */
    public boolean m7307o() {
        return this.f8527o;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f8513a + ", backupEndpoint=" + this.f8518f + ", httpMethod=" + this.f8514b + ", httpHeaders=" + this.f8516d + ", body=" + this.f8517e + ", emptyResponse=" + this.f8519g + ", initialRetryAttempts=" + this.f8520h + ", retryAttemptsLeft=" + this.f8521i + ", timeoutMillis=" + this.f8522j + ", retryDelayMillis=" + this.f8523k + ", exponentialRetries=" + this.f8524l + ", retryOnAllErrors=" + this.f8525m + ", encodingEnabled=" + this.f8526n + ", gzipBodyEncoding=" + this.f8527o + '}';
    }
}
