package com.applovin.impl.sdk.p029ad;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.d */
/* loaded from: classes.dex */
public final class C3079d {

    /* renamed from: a */
    private static final Map<String, C3079d> f7661a = new HashMap();

    /* renamed from: b */
    private static final Object f7662b = new Object();

    /* renamed from: c */
    private JSONObject f7663c;

    /* renamed from: d */
    private final String f7664d;

    /* renamed from: e */
    private AppLovinAdSize f7665e;

    /* renamed from: f */
    private AppLovinAdType f7666f;

    private C3079d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        String str2;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f7665e = appLovinAdSize;
        this.f7666f = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            str2 = str.trim();
        } else {
            str2 = appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel();
        }
        this.f7664d = str2.toLowerCase(Locale.ENGLISH);
    }

    /* renamed from: a */
    public static C3079d m7990a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return m7989a(appLovinAdSize, appLovinAdType, null);
    }

    /* renamed from: a */
    public static C3079d m7989a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        C3079d c3079d = new C3079d(appLovinAdSize, appLovinAdType, str);
        synchronized (f7662b) {
            String str2 = c3079d.f7664d;
            Map<String, C3079d> map = f7661a;
            if (map.containsKey(str2)) {
                c3079d = map.get(str2);
            } else {
                map.put(str2, c3079d);
            }
        }
        return c3079d;
    }

    /* renamed from: a */
    public static C3079d m7988a(String str) {
        return m7989a(null, null, str);
    }

    /* renamed from: a */
    public static void m7987a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f7662b) {
                C3079d c3079d = f7661a.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (c3079d != null) {
                    c3079d.f7665e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    c3079d.f7666f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    /* renamed from: b */
    public static C3079d m7985b(String str) {
        return m7989a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    /* renamed from: f */
    public static Collection<C3079d> m7981f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(6);
        Collections.addAll(linkedHashSet, m7980g(), m7979h(), m7978i(), m7977j(), m7976k(), m7975l());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: g */
    public static C3079d m7980g() {
        return m7990a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    /* renamed from: h */
    public static C3079d m7979h() {
        return m7990a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    /* renamed from: i */
    public static C3079d m7978i() {
        return m7990a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    /* renamed from: j */
    public static C3079d m7977j() {
        return m7990a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    /* renamed from: k */
    public static C3079d m7976k() {
        return m7990a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    /* renamed from: l */
    public static C3079d m7975l() {
        return m7990a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    /* renamed from: a */
    public String m7991a() {
        return this.f7664d;
    }

    @Nullable
    /* renamed from: b */
    public MaxAdFormat m7986b() {
        AppLovinAdSize m7984c = m7984c();
        if (m7984c == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (m7984c == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (m7984c == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (m7984c == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (m7984c != AppLovinAdSize.INTERSTITIAL) {
            if (m7984c == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        } else if (m7983d() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        } else {
            if (m7983d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (m7983d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        }
    }

    /* renamed from: c */
    public AppLovinAdSize m7984c() {
        if (this.f7665e == null && JsonUtils.valueExists(this.f7663c, "ad_size")) {
            this.f7665e = AppLovinAdSize.fromString(JsonUtils.getString(this.f7663c, "ad_size", null));
        }
        return this.f7665e;
    }

    /* renamed from: d */
    public AppLovinAdType m7983d() {
        if (this.f7666f == null && JsonUtils.valueExists(this.f7663c, "ad_type")) {
            this.f7666f = AppLovinAdType.fromString(JsonUtils.getString(this.f7663c, "ad_type", null));
        }
        return this.f7666f;
    }

    /* renamed from: e */
    public boolean m7982e() {
        return m7981f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3079d.class != obj.getClass()) {
            return false;
        }
        return this.f7664d.equalsIgnoreCase(((C3079d) obj).f7664d);
    }

    public int hashCode() {
        return this.f7664d.hashCode();
    }

    public String toString() {
        return "AdZone{id=" + this.f7664d + ", zoneObject=" + this.f7663c + '}';
    }
}
