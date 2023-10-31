package com.applovin.impl.sdk.network;

import androidx.core.content.C0663f;
import androidx.core.util.InterfaceC0797a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3249e;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.C3335m;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.C3344s;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import libv2ray.V2rayConfig;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.network.b */
/* loaded from: classes.dex */
public class C3240b {

    /* renamed from: a */
    private static final List<String> f8498a = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: b */
    private final C3214m f8499b;

    /* renamed from: c */
    private final C3349v f8500c;

    /* renamed from: d */
    private final C3249e f8501d;

    /* renamed from: com.applovin.impl.sdk.network.b$a */
    /* loaded from: classes.dex */
    public static class C3242a {

        /* renamed from: a */
        private long f8502a;

        /* renamed from: b */
        private long f8503b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m7333a(long j) {
            this.f8502a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m7330b(long j) {
            this.f8503b = j;
        }

        /* renamed from: a */
        public long m7334a() {
            return this.f8502a;
        }

        /* renamed from: b */
        public long m7331b() {
            return this.f8503b;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$b */
    /* loaded from: classes.dex */
    public class C3243b<T> implements InterfaceC0797a<C3249e.C3255c> {

        /* renamed from: b */
        private final String f8505b;

        /* renamed from: c */
        private final C3245c<T> f8506c;

        /* renamed from: d */
        private final String f8507d;

        /* renamed from: e */
        private final T f8508e;

        /* renamed from: f */
        private final boolean f8509f;

        /* renamed from: g */
        private final long f8510g;

        /* renamed from: h */
        private final C3242a f8511h;

        /* renamed from: i */
        private final InterfaceC3244c<T> f8512i;

        private C3243b(String str, C3245c<T> c3245c, String str2, T t, boolean z, long j, C3242a c3242a, InterfaceC3244c<T> interfaceC3244c) {
            this.f8505b = str;
            this.f8506c = c3245c;
            this.f8507d = str2;
            this.f8508e = t;
            this.f8509f = z;
            this.f8510g = j;
            this.f8511h = c3242a;
            this.f8512i = interfaceC3244c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.util.InterfaceC0797a
        /* renamed from: a */
        public void accept(C3249e.C3255c c3255c) {
            InterfaceC3244c<T> interfaceC3244c;
            Object obj = null;
            try {
                int m7270a = c3255c.m7270a();
                if (m7270a > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f8510g;
                    if (m7270a >= 200 && m7270a < 400) {
                        C3242a c3242a = this.f8511h;
                        if (c3242a != null) {
                            c3242a.m7333a(currentTimeMillis);
                        }
                        C3240b.this.m7338a(this.f8507d, this.f8505b, m7270a, this.f8510g);
                        String m7269b = c3255c.m7269b();
                        if (Utils.isDspDemoApp(C3240b.this.f8499b.m7476L())) {
                            C3240b.this.f8499b.m7433ag().m7528a(m7269b != null ? m7269b : "", this.f8505b, this.f8506c.m7317e() != null ? this.f8506c.m7317e().toString() : "");
                        }
                        if (m7269b == null) {
                            this.f8512i.mo7326a(this.f8508e, m7270a);
                            return;
                        }
                        if (C3349v.m6862a()) {
                            C3240b.this.f8500c.m6858a("ConnectionManager", m7269b);
                        }
                        C3242a c3242a2 = this.f8511h;
                        if (c3242a2 != null) {
                            c3242a2.m7330b(m7269b.length());
                        }
                        if (this.f8509f) {
                            String m6919a = C3335m.m6919a(m7269b, C3240b.this.f8499b.m7386z());
                            if (m6919a == null) {
                                HashMap hashMap = new HashMap(2);
                                hashMap.put("request", StringUtils.getHostAndPath(this.f8505b));
                                hashMap.put("response", m7269b);
                                C3240b.this.f8499b.m7389w().trackEvent("rdf", hashMap);
                            }
                            m7269b = m6919a;
                        }
                        try {
                            this.f8512i.mo7326a(C3240b.this.m7339a(m7269b, (String) this.f8508e), m7270a);
                            return;
                        } catch (Throwable th) {
                            String str = "Unable to parse response from " + C3240b.this.m7340a(this.f8505b);
                            if (C3349v.m6862a()) {
                                C3240b.this.f8500c.m6854b("ConnectionManager", str, th);
                            }
                            C3240b.this.f8499b.m7468T().m7719a(C3125f.f8169i);
                            this.f8512i.mo7327a(AppLovinErrorCodes.INVALID_RESPONSE, str, null);
                            return;
                        }
                    }
                    interfaceC3244c = this.f8512i;
                } else {
                    C3240b.this.m7337a(this.f8507d, this.f8505b, m7270a, this.f8510g, (Throwable) null);
                    interfaceC3244c = this.f8512i;
                }
                interfaceC3244c.mo7327a(m7270a, null, null);
            } catch (MalformedURLException e) {
                if (this.f8508e != null) {
                    C3240b.this.m7337a(this.f8507d, this.f8505b, 0, this.f8510g, e);
                    this.f8512i.mo7327a(-901, e.getMessage(), null);
                    return;
                }
                C3240b.this.m7338a(this.f8507d, this.f8505b, 0, this.f8510g);
                this.f8512i.mo7326a(this.f8508e, -901);
            } catch (Throwable th2) {
                int m7336a = 0 == 0 ? C3240b.this.m7336a(th2) : 0;
                try {
                    String m7268c = c3255c.m7268c();
                    if (m7268c != null) {
                        if (this.f8509f) {
                            m7268c = C3335m.m6919a(m7268c, C3240b.this.f8499b.m7386z());
                        }
                        obj = C3240b.this.m7339a(m7268c, (String) this.f8508e);
                    }
                } catch (Throwable unused) {
                }
                C3240b.this.m7337a(this.f8507d, this.f8505b, m7336a, this.f8510g, th2);
                this.f8512i.mo7327a(m7336a, th2.getMessage(), obj);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3244c<T> {
        /* renamed from: a */
        void mo7327a(int i, String str, T t);

        /* renamed from: a */
        void mo7326a(T t, int i);
    }

    public C3240b(C3214m c3214m) {
        this.f8499b = c3214m;
        this.f8500c = c3214m.m7487A();
        C3249e c3249e = new C3249e(c3214m);
        this.f8501d = c3249e;
        c3249e.m7299a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m7336a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> T m7339a(String str, T t) throws JSONException, SAXException, ClassCastException {
        if (t == null) {
            return str;
        }
        if (str != 0 && str.length() >= 3) {
            if (t instanceof JSONObject) {
                return (T) new JSONObject(str);
            }
            if (t instanceof C3343r) {
                return (T) C3344s.m6872a(str, this.f8499b);
            }
            if (t instanceof String) {
                return str;
            }
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f8500c;
                c3349v.m6850e("ConnectionManager", "Failed to process response of type '" + t.getClass().getName() + "'");
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m7340a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7338a(String str, String str2, int i, long j) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8500c;
            c3349v.m6853c("ConnectionManager", "Successful " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + C3295h.m7000f(this.f8499b) + " to " + m7340a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7337a(String str, String str2, int i, long j, Throwable th) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8500c;
            c3349v.m6854b("ConnectionManager", "Failed " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + C3295h.m7000f(this.f8499b) + " to " + m7340a(str2), th);
        }
    }

    /* renamed from: a */
    public <T> void m7341a(C3245c<T> c3245c, C3242a c3242a, InterfaceC3244c<T> interfaceC3244c) {
        String str;
        String jSONObject;
        byte[] bArr;
        String hostAndPath;
        if (c3245c != null) {
            String m7325a = c3245c.m7325a();
            String m7321b = c3245c.m7321b();
            if (m7325a != null) {
                if (m7321b != null) {
                    if (interfaceC3244c != null) {
                        if (!m7325a.toLowerCase().startsWith(V2rayConfig.HTTP)) {
                            String m12005a = C0663f.m12005a("Requested postback submission to non HTTP endpoint ", m7325a, "; skipping...");
                            if (C3349v.m6862a()) {
                                C3349v.m6846i("ConnectionManager", m12005a);
                            }
                            interfaceC3244c.mo7327a(AppLovinErrorCodes.INVALID_URL, m12005a, null);
                            return;
                        }
                        if (((Boolean) this.f8499b.m7456a(C3109b.f7917cQ)).booleanValue() && !m7325a.contains("https://")) {
                            if (C3349v.m6862a()) {
                                this.f8499b.m7487A().m6851d("ConnectionManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
                            }
                            m7325a = m7325a.replace("http://", "https://");
                        }
                        HashMap hashMap = new HashMap(2);
                        boolean m7308n = c3245c.m7308n();
                        long serverAdjustedUnixTimestampMillis = Utils.getServerAdjustedUnixTimestampMillis(this.f8499b);
                        if ((c3245c.m7319c() != null && !c3245c.m7319c().isEmpty()) || c3245c.m7313i() >= 0) {
                            Map<String, String> m7319c = c3245c.m7319c();
                            Boolean bool = (Boolean) this.f8499b.m7456a(C3109b.f7984df);
                            if (m7319c != null && c3245c.m7313i() >= 0 && c3245c.m7313i() > 0) {
                                m7319c.put("current_retry_attempt", String.valueOf(c3245c.m7313i()));
                            }
                            boolean booleanValue = bool.booleanValue();
                            if (m7308n) {
                                String encodeUrlMap = Utils.encodeUrlMap(m7319c, booleanValue, ((Boolean) this.f8499b.m7456a(C3109b.f7985dg)).booleanValue());
                                String m6918a = C3335m.m6918a(encodeUrlMap, this.f8499b.m7386z(), serverAdjustedUnixTimestampMillis);
                                if (StringUtils.isValidString(encodeUrlMap) && m6918a == null) {
                                    hashMap.put("query", encodeUrlMap);
                                }
                                m7325a = StringUtils.appendQueryParameter(m7325a, "p", m6918a);
                            } else {
                                m7325a = StringUtils.appendQueryParameters(m7325a, m7319c, booleanValue);
                            }
                        }
                        String str2 = m7325a;
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            Boolean endsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str2), f8498a);
                            if (C3349v.m6862a()) {
                                C3349v c3349v = this.f8500c;
                                StringBuilder sb = new StringBuilder("Sending ");
                                sb.append(m7321b);
                                sb.append(" request to id=#");
                                sb.append(str2.hashCode());
                                sb.append(" \"");
                                if (endsWith.booleanValue()) {
                                    hostAndPath = str2;
                                } else {
                                    hostAndPath = StringUtils.getHostAndPath(str2);
                                }
                                sb.append(hostAndPath);
                                sb.append("\"...");
                                c3349v.m6853c("ConnectionManager", sb.toString());
                            }
                            C3249e.C3253b.C3254a m7285a = new C3249e.C3253b.C3254a().m7282a(str2).m7276b(m7321b).m7280a(c3245c.m7318d()).m7285a(c3245c.m7312j());
                            if (c3245c.m7317e() != null) {
                                if (m7308n) {
                                    jSONObject = C3335m.m6918a(c3245c.m7317e().toString(), this.f8499b.m7386z(), serverAdjustedUnixTimestampMillis);
                                    if (jSONObject == null) {
                                        hashMap.put("body", c3245c.m7317e().toString());
                                    }
                                } else {
                                    jSONObject = c3245c.m7317e().toString();
                                }
                                String str3 = jSONObject;
                                if (c3245c.m7307o() && str3 != null && str3.length() > ((Integer) this.f8499b.m7456a(C3109b.f8048et)).intValue()) {
                                    bArr = Utils.gzip(str3.getBytes(Charset.forName("UTF-8")));
                                } else {
                                    bArr = null;
                                }
                                if (C3349v.m6862a()) {
                                    C3349v c3349v2 = this.f8500c;
                                    c3349v2.m6855b("ConnectionManager", "Request to " + m7340a(str2) + " is " + str3);
                                }
                                m7285a.m7281a("Content-Type", "application/json; charset=utf-8");
                                if (c3245c.m7307o() && bArr != null) {
                                    m7285a.m7281a("Content-Encoding", "gzip");
                                    m7285a.m7278a(bArr);
                                } else if (str3 != null) {
                                    m7285a.m7278a(str3.getBytes("UTF-8"));
                                }
                            }
                            if (!hashMap.isEmpty()) {
                                hashMap.put("request", StringUtils.getHostAndPath(str2));
                                this.f8499b.m7389w().trackEvent("ref", hashMap);
                            }
                            str = str2;
                            try {
                                this.f8501d.m7298a(m7285a.m7284a(new C3243b(str2, c3245c, m7321b, c3245c.m7315g(), m7308n, currentTimeMillis, c3242a, interfaceC3244c)).m7279a(this.f8499b.m7469S().m7612b()).m7286a());
                            } catch (Throwable th) {
                                th = th;
                                m7337a(m7321b, str, 0, currentTimeMillis, th);
                                interfaceC3244c.mo7327a(0, th.getMessage(), null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = str2;
                        }
                    } else {
                        throw new IllegalArgumentException("No callback specified");
                    }
                } else {
                    throw new IllegalArgumentException("No method specified");
                }
            } else {
                throw new IllegalArgumentException("No endpoint specified");
            }
        } else {
            throw new IllegalArgumentException("No request specified");
        }
    }
}
