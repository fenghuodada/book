package com.applovin.impl.sdk.p033e;

import androidx.annotation.Nullable;
import com.applovin.impl.p008a.C2657e;
import com.applovin.impl.p008a.C2665l;
import com.applovin.impl.p008a.EnumC2658f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.C3344s;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.r */
/* loaded from: classes.dex */
public abstract class AbstractC3173r extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final AppLovinAdLoadListener f8284a;

    /* renamed from: c */
    private final C3174a f8285c;

    /* renamed from: com.applovin.impl.sdk.e.r$a */
    /* loaded from: classes.dex */
    public static final class C3174a extends C2657e {
        public C3174a(JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, C3214m c3214m) {
            super(jSONObject, jSONObject2, enumC3076b, c3214m);
        }

        /* renamed from: a */
        public void m7590a(C3343r c3343r) {
            if (c3343r == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f6285a.add(c3343r);
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$b */
    /* loaded from: classes.dex */
    public static final class C3175b extends AbstractC3173r {

        /* renamed from: a */
        private final String f8286a;

        public C3175b(String str, C2657e c2657e, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
            super(c2657e, appLovinAdLoadListener, c3214m);
            this.f8286a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            m7595a(m7591e(this.f8286a));
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$c */
    /* loaded from: classes.dex */
    public static final class C3176c extends AbstractC3173r {

        /* renamed from: a */
        private final JSONObject f8287a;

        public C3176c(C2657e c2657e, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
            super(c2657e, appLovinAdLoadListener, c3214m);
            this.f8287a = c2657e.m9243c();
        }

        @Override // java.lang.Runnable
        public void run() {
            EnumC2658f enumC2658f;
            if (C3349v.m6862a()) {
                m7705a("Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f8287a, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (C3349v.m6862a()) {
                    m7700d("No VAST response received.");
                }
                enumC2658f = EnumC2658f.NO_WRAPPER_RESPONSE;
            } else if (string.length() < ((Integer) this.f8192b.m7456a(C3109b.f8036eh)).intValue()) {
                m7595a(m7591e(string));
                return;
            } else {
                if (C3349v.m6862a()) {
                    m7700d("VAST response is over max length");
                }
                enumC2658f = EnumC2658f.XML_PARSING;
            }
            m7596a(enumC2658f);
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.r$d */
    /* loaded from: classes.dex */
    public static final class C3177d extends AbstractC3173r {

        /* renamed from: a */
        private final C3343r f8288a;

        public C3177d(C3343r c3343r, C2657e c2657e, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
            super(c2657e, appLovinAdLoadListener, c3214m);
            if (c3343r == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (c2657e == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f8288a = c3343r;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3349v.m6862a()) {
                m7705a("Processing VAST Wrapper response...");
            }
            m7595a(this.f8288a);
        }
    }

    public AbstractC3173r(C2657e c2657e, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        super("TaskProcessVastResponse", c3214m);
        if (c2657e == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f8284a = appLovinAdLoadListener;
        this.f8285c = (C3174a) c2657e;
    }

    /* renamed from: a */
    public static AbstractC3173r m7594a(C3343r c3343r, C2657e c2657e, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        return new C3177d(c3343r, c2657e, appLovinAdLoadListener, c3214m);
    }

    /* renamed from: a */
    public static AbstractC3173r m7593a(String str, JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        return new C3175b(str, new C3174a(jSONObject, jSONObject2, enumC3076b, c3214m), appLovinAdLoadListener, c3214m);
    }

    /* renamed from: a */
    public static AbstractC3173r m7592a(JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        return new C3176c(new C3174a(jSONObject, jSONObject2, enumC3076b, c3214m), appLovinAdLoadListener, c3214m);
    }

    /* renamed from: a */
    public void m7596a(EnumC2658f enumC2658f) {
        if (C3349v.m6862a()) {
            m7700d("Failed to process VAST response due to VAST error code " + enumC2658f);
        }
        C2665l.m9215a(this.f8285c, this.f8284a, enumC2658f, -6, this.f8192b);
    }

    /* renamed from: a */
    public void m7595a(C3343r c3343r) {
        EnumC2658f enumC2658f;
        AbstractRunnableC3131a c3179t;
        int m9245a = this.f8285c.m9245a();
        if (C3349v.m6862a()) {
            m7705a("Finished parsing XML at depth " + m9245a);
        }
        this.f8285c.m7590a(c3343r);
        if (!C2665l.m9214a(c3343r)) {
            if (C2665l.m9203b(c3343r)) {
                if (C3349v.m6862a()) {
                    m7705a("VAST response is inline. Rendering ad...");
                }
                c3179t = new C3179t(this.f8285c, this.f8284a, this.f8192b);
                this.f8192b.m7469S().m7621a(c3179t);
                return;
            }
            if (C3349v.m6862a()) {
                m7700d("VAST response is an error");
            }
            enumC2658f = EnumC2658f.NO_WRAPPER_RESPONSE;
            m7596a(enumC2658f);
        }
        int intValue = ((Integer) this.f8192b.m7456a(C3109b.f8037ei)).intValue();
        if (m9245a < intValue) {
            if (C3349v.m6862a()) {
                m7705a("VAST response is wrapper. Resolving...");
            }
            c3179t = new C3185x(this.f8285c, this.f8284a, this.f8192b);
            this.f8192b.m7469S().m7621a(c3179t);
            return;
        }
        if (C3349v.m6862a()) {
            m7700d("Reached beyond max wrapper depth of " + intValue);
        }
        enumC2658f = EnumC2658f.WRAPPER_LIMIT_REACHED;
        m7596a(enumC2658f);
    }

    @Nullable
    /* renamed from: e */
    public C3343r m7591e(String str) {
        try {
            return C3344s.m6872a(str, this.f8192b);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                m7704a("Failed to process VAST response", th);
            }
            m7596a(EnumC2658f.XML_PARSING);
            return null;
        }
    }
}
