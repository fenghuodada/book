package com.applovin.impl.sdk.p029ad;

import android.text.TextUtils;
import android.util.Base64;
import androidx.activity.result.C0063d;
import androidx.concurrent.futures.C0484a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.c */
/* loaded from: classes.dex */
public class C3077c {

    /* renamed from: a */
    private final C3214m f7654a;

    /* renamed from: b */
    private final String f7655b;

    /* renamed from: com.applovin.impl.sdk.ad.c$a */
    /* loaded from: classes.dex */
    public enum EnumC3078a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: d */
        private final String f7660d;

        EnumC3078a(String str) {
            this.f7660d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f7660d;
        }
    }

    public C3077c(String str, C3214m c3214m) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f7655b = str;
        this.f7654a = c3214m;
    }

    /* renamed from: a */
    private String m7995a(C3109b<String> c3109b) {
        for (String str : this.f7654a.m7423b(c3109b)) {
            if (this.f7655b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m7996a() {
        return this.f7655b;
    }

    /* renamed from: b */
    public EnumC3078a m7994b() {
        return m7995a(C3109b.f7875ba) != null ? EnumC3078a.REGULAR : m7995a(C3109b.f7876bb) != null ? EnumC3078a.AD_RESPONSE_JSON : EnumC3078a.UNSPECIFIED;
    }

    /* renamed from: c */
    public String m7993c() {
        String m7995a = m7995a(C3109b.f7875ba);
        if (TextUtils.isEmpty(m7995a)) {
            String m7995a2 = m7995a(C3109b.f7876bb);
            if (TextUtils.isEmpty(m7995a2)) {
                return null;
            }
            return m7995a2;
        }
        return m7995a;
    }

    /* renamed from: d */
    public JSONObject m7992d() {
        if (m7994b() == EnumC3078a.AD_RESPONSE_JSON) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f7655b.substring(m7993c().length()), 0), "UTF-8"));
                    if (C3349v.m6862a()) {
                        C3349v m7487A = this.f7654a.m7487A();
                        m7487A.m6855b("AdToken", "Decoded token into ad response: " + jSONObject);
                    }
                    return jSONObject;
                } catch (JSONException e) {
                    if (C3349v.m6862a()) {
                        C3349v m7487A2 = this.f7654a.m7487A();
                        m7487A2.m6854b("AdToken", "Unable to decode token '" + this.f7655b + "' into JSON", e);
                        return null;
                    }
                    return null;
                }
            } catch (UnsupportedEncodingException e2) {
                if (C3349v.m6862a()) {
                    this.f7654a.m7487A().m6854b("AdToken", C0484a.m12392a(new StringBuilder("Unable to process ad response from token '"), this.f7655b, "'"), e2);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3077c) {
            String str = this.f7655b;
            String str2 = ((C3077c) obj).f7655b;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7655b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder m13052b = C0063d.m13052b("AdToken{id=", StringUtils.prefixToIndex(32, this.f7655b), ", type=");
        m13052b.append(m7994b());
        m13052b.append('}');
        return m13052b.toString();
    }
}
