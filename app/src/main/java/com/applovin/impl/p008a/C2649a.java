package com.applovin.impl.p008a;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.p008a.C2666m;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p028a.C3053g;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3119a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a.a */
/* loaded from: classes.dex */
public class C2649a extends AbstractC3080e {

    /* renamed from: a */
    private final String f6239a;

    /* renamed from: b */
    private final String f6240b;

    /* renamed from: c */
    private final C2662i f6241c;

    /* renamed from: d */
    private final long f6242d;

    /* renamed from: e */
    private final C2666m f6243e;

    /* renamed from: f */
    private final C2656d f6244f;

    /* renamed from: g */
    private final String f6245g;

    /* renamed from: h */
    private final C2655c f6246h;

    /* renamed from: i */
    private final C3053g f6247i;

    /* renamed from: j */
    private final Set<C2663j> f6248j;

    /* renamed from: k */
    private final Set<C2663j> f6249k;

    /* renamed from: com.applovin.impl.a.a$a */
    /* loaded from: classes.dex */
    public static class C2651a {

        /* renamed from: a */
        private JSONObject f6250a;

        /* renamed from: b */
        private JSONObject f6251b;

        /* renamed from: c */
        private EnumC3076b f6252c;

        /* renamed from: d */
        private C3214m f6253d;

        /* renamed from: e */
        private long f6254e;

        /* renamed from: f */
        private String f6255f;

        /* renamed from: g */
        private String f6256g;

        /* renamed from: h */
        private C2662i f6257h;

        /* renamed from: i */
        private C2666m f6258i;

        /* renamed from: j */
        private C2656d f6259j;

        /* renamed from: k */
        private C2655c f6260k;

        /* renamed from: l */
        private Set<C2663j> f6261l;

        /* renamed from: m */
        private Set<C2663j> f6262m;

        /* renamed from: a */
        public C2651a m9283a(long j) {
            this.f6254e = j;
            return this;
        }

        /* renamed from: a */
        public C2651a m9281a(C2655c c2655c) {
            this.f6260k = c2655c;
            return this;
        }

        /* renamed from: a */
        public C2651a m9280a(C2656d c2656d) {
            this.f6259j = c2656d;
            return this;
        }

        /* renamed from: a */
        public C2651a m9279a(C2662i c2662i) {
            this.f6257h = c2662i;
            return this;
        }

        /* renamed from: a */
        public C2651a m9278a(C2666m c2666m) {
            this.f6258i = c2666m;
            return this;
        }

        /* renamed from: a */
        public C2651a m9277a(EnumC3076b enumC3076b) {
            this.f6252c = enumC3076b;
            return this;
        }

        /* renamed from: a */
        public C2651a m9276a(C3214m c3214m) {
            if (c3214m != null) {
                this.f6253d = c3214m;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        /* renamed from: a */
        public C2651a m9275a(String str) {
            this.f6255f = str;
            return this;
        }

        /* renamed from: a */
        public C2651a m9274a(Set<C2663j> set) {
            this.f6261l = set;
            return this;
        }

        /* renamed from: a */
        public C2651a m9273a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6250a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        /* renamed from: a */
        public C2649a m9284a() {
            return new C2649a(this);
        }

        /* renamed from: b */
        public C2651a m9271b(String str) {
            this.f6256g = str;
            return this;
        }

        /* renamed from: b */
        public C2651a m9270b(Set<C2663j> set) {
            this.f6262m = set;
            return this;
        }

        /* renamed from: b */
        public C2651a m9269b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6251b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }
    }

    /* renamed from: com.applovin.impl.a.a$b */
    /* loaded from: classes.dex */
    public enum EnumC2652b {
        COMPANION_AD,
        VIDEO
    }

    /* renamed from: com.applovin.impl.a.a$c */
    /* loaded from: classes.dex */
    public enum EnumC2653c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        ERROR
    }

    private C2649a(C2651a c2651a) {
        super(c2651a.f6250a, c2651a.f6251b, c2651a.f6252c, c2651a.f6253d);
        this.f6239a = c2651a.f6255f;
        this.f6241c = c2651a.f6257h;
        this.f6240b = c2651a.f6256g;
        this.f6243e = c2651a.f6258i;
        this.f6244f = c2651a.f6259j;
        this.f6246h = c2651a.f6260k;
        this.f6248j = c2651a.f6261l;
        this.f6249k = c2651a.f6262m;
        this.f6247i = new C3053g(this);
        Uri mo7887h = mo7887h();
        this.f6245g = mo7887h != null ? mo7887h.toString() : "";
        this.f6242d = c2651a.f6254e;
    }

    /* renamed from: a */
    private Set<C2663j> m9307a(EnumC2652b enumC2652b, String[] strArr) {
        C2656d c2656d;
        C2666m c2666m;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<C2663j>> m9246d = (enumC2652b != EnumC2652b.VIDEO || (c2666m = this.f6243e) == null) ? (enumC2652b != EnumC2652b.COMPANION_AD || (c2656d = this.f6244f) == null) ? null : c2656d.m9246d() : c2666m.m9193e();
        HashSet hashSet = new HashSet();
        if (m9246d != null && !m9246d.isEmpty()) {
            for (String str : strArr) {
                if (m9246d.containsKey(str)) {
                    hashSet.addAll(m9246d.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: aT */
    private String m9296aT() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    /* renamed from: aU */
    private C2666m.EnumC2668a m9295aU() {
        C2666m.EnumC2668a[] values = C2666m.EnumC2668a.values();
        int intValue = ((Integer) this.sdk.m7456a(C3109b.f8041em)).intValue();
        return (intValue < 0 || intValue >= values.length) ? C2666m.EnumC2668a.UNSPECIFIED : values[intValue];
    }

    /* renamed from: aV */
    private Set<C2663j> m9294aV() {
        C2666m c2666m = this.f6243e;
        return c2666m != null ? c2666m.m9194d() : Collections.emptySet();
    }

    /* renamed from: aW */
    private Set<C2663j> m9293aW() {
        C2656d c2656d = this.f6244f;
        return c2656d != null ? c2656d.m9247c() : Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: D */
    public boolean mo7971D() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && mo7886j() != null;
    }

    /* renamed from: a */
    public Set<C2663j> m9306a(EnumC2653c enumC2653c, String str) {
        return m9305a(enumC2653c, new String[]{str});
    }

    /* renamed from: a */
    public Set<C2663j> m9305a(EnumC2653c enumC2653c, String[] strArr) {
        EnumC2652b enumC2652b;
        if (C3349v.m6862a()) {
            C3349v m7487A = this.sdk.m7487A();
            m7487A.m6855b("VastAd", "Retrieving trackers of type '" + enumC2653c + "' and events '" + strArr + "'...");
        }
        if (enumC2653c == EnumC2653c.IMPRESSION) {
            return this.f6248j;
        }
        if (enumC2653c == EnumC2653c.VIDEO_CLICK) {
            return m9294aV();
        }
        if (enumC2653c == EnumC2653c.COMPANION_CLICK) {
            return m9293aW();
        }
        if (enumC2653c == EnumC2653c.VIDEO) {
            enumC2652b = EnumC2652b.VIDEO;
        } else if (enumC2653c != EnumC2653c.COMPANION) {
            if (enumC2653c == EnumC2653c.ERROR) {
                return this.f6249k;
            }
            if (C3349v.m6862a()) {
                C3349v m7487A2 = this.sdk.m7487A();
                m7487A2.m6850e("VastAd", "Failed to retrieve trackers of invalid type '" + enumC2653c + "' and events '" + strArr + "'");
            }
            return Collections.emptySet();
        } else {
            enumC2652b = EnumC2652b.COMPANION_AD;
        }
        return m9307a(enumC2652b, strArr);
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: a */
    public void mo7948a() {
    }

    /* renamed from: a */
    public void m9304a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    /* renamed from: aM */
    public C2656d m9303aM() {
        return this.f6244f;
    }

    /* renamed from: aN */
    public boolean m9302aN() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    /* renamed from: aO */
    public String m9301aO() {
        return getStringFromAdObject("html_template", "");
    }

    /* renamed from: aP */
    public Uri m9300aP() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aQ */
    public boolean m9299aQ() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    /* renamed from: aR */
    public boolean m9298aR() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    @Nullable
    /* renamed from: aS */
    public C2655c m9297aS() {
        return this.f6246h;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: at */
    public List<C3119a> mo7910at() {
        List<C3119a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), null, m9296aT(), m7909au(), m7874y(), this.sdk);
        }
        return postbacks;
    }

    /* renamed from: b */
    public void m9292b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: c */
    public C3053g mo7884o() {
        return this.f6247i;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: d */
    public String mo7894d() {
        return this.f6245g;
    }

    /* renamed from: e */
    public long m9290e() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2649a) && super.equals(obj)) {
            C2649a c2649a = (C2649a) obj;
            String str = this.f6239a;
            if (str == null ? c2649a.f6239a == null : str.equals(c2649a.f6239a)) {
                String str2 = this.f6240b;
                if (str2 == null ? c2649a.f6240b == null : str2.equals(c2649a.f6240b)) {
                    C2662i c2662i = this.f6241c;
                    if (c2662i == null ? c2649a.f6241c == null : c2662i.equals(c2649a.f6241c)) {
                        C2666m c2666m = this.f6243e;
                        if (c2666m == null ? c2649a.f6243e == null : c2666m.equals(c2649a.f6243e)) {
                            C2656d c2656d = this.f6244f;
                            if (c2656d == null ? c2649a.f6244f == null : c2656d.equals(c2649a.f6244f)) {
                                C2655c c2655c = this.f6246h;
                                if (c2655c == null ? c2649a.f6246h == null : c2655c.equals(c2649a.f6246h)) {
                                    Set<C2663j> set = this.f6248j;
                                    if (set == null ? c2649a.f6248j == null : set.equals(c2649a.f6248j)) {
                                        Set<C2663j> set2 = this.f6249k;
                                        Set<C2663j> set3 = c2649a.f6249k;
                                        return set2 != null ? set2.equals(set3) : set3 == null;
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

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: f */
    public boolean mo7890f() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    /* renamed from: g */
    public EnumC2652b m9289g() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? EnumC2652b.COMPANION_AD : EnumC2652b.VIDEO;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f6242d;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: h */
    public Uri mo7887h() {
        C2669n m9285n = m9285n();
        if (m9285n != null) {
            return m9285n.m9187b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List<C2669n> m9201a;
        C2666m c2666m = this.f6243e;
        return (c2666m == null || (m9201a = c2666m.m9201a()) == null || m9201a.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f6239a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6240b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C2662i c2662i = this.f6241c;
        int hashCode4 = (hashCode3 + (c2662i != null ? c2662i.hashCode() : 0)) * 31;
        C2666m c2666m = this.f6243e;
        int hashCode5 = (hashCode4 + (c2666m != null ? c2666m.hashCode() : 0)) * 31;
        C2656d c2656d = this.f6244f;
        int hashCode6 = (hashCode5 + (c2656d != null ? c2656d.hashCode() : 0)) * 31;
        C2655c c2655c = this.f6246h;
        int hashCode7 = (hashCode6 + (c2655c != null ? c2655c.hashCode() : 0)) * 31;
        Set<C2663j> set = this.f6248j;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<C2663j> set2 = this.f6249k;
        return hashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    /* renamed from: i */
    public boolean m9288i() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e, com.applovin.impl.sdk.p028a.InterfaceC3039a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f6246h != null;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: j */
    public Uri mo7886j() {
        C2666m c2666m = this.f6243e;
        if (c2666m != null) {
            return c2666m.m9195c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p029ad.AbstractC3080e
    /* renamed from: k */
    public Uri mo7885k() {
        return mo7886j();
    }

    /* renamed from: l */
    public C2662i m9287l() {
        return this.f6241c;
    }

    /* renamed from: m */
    public C2666m m9286m() {
        return this.f6243e;
    }

    /* renamed from: n */
    public C2669n m9285n() {
        C2666m c2666m = this.f6243e;
        if (c2666m != null) {
            return c2666m.m9200a(m9295aU());
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    @NonNull
    public String toString() {
        return "VastAd{title='" + this.f6239a + "', adDescription='" + this.f6240b + "', systemInfo=" + this.f6241c + ", videoCreative=" + this.f6243e + ", companionAd=" + this.f6244f + ", adVerifications=" + this.f6246h + ", impressionTrackers=" + this.f6248j + ", errorTrackers=" + this.f6249k + '}';
    }
}
