package com.applovin.impl.sdk.p029ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.AbstractC2774i;
import com.applovin.impl.adview.C2802s;
import com.applovin.impl.adview.C2806v;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C3072ab;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p028a.AbstractC3040b;
import com.applovin.impl.sdk.p030b.C3105c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3119a;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.e */
/* loaded from: classes.dex */
public abstract class AbstractC3080e extends AppLovinAdImpl {

    /* renamed from: a */
    private final List<Uri> f7667a;

    /* renamed from: b */
    private final AtomicBoolean f7668b;

    /* renamed from: c */
    private final AtomicBoolean f7669c;

    /* renamed from: d */
    private final AtomicReference<C3105c> f7670d;

    /* renamed from: e */
    private List<C3119a> f7671e;

    /* renamed from: f */
    private List<C3119a> f7672f;

    /* renamed from: g */
    private List<C3119a> f7673g;

    /* renamed from: h */
    private List<C3119a> f7674h;

    /* renamed from: i */
    private C3084c f7675i;

    /* renamed from: com.applovin.impl.sdk.ad.e$a */
    /* loaded from: classes.dex */
    public enum EnumC3082a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$b */
    /* loaded from: classes.dex */
    public enum EnumC3083b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$c */
    /* loaded from: classes.dex */
    public class C3084c {

        /* renamed from: a */
        public final int f7684a;

        /* renamed from: b */
        public final int f7685b;

        /* renamed from: c */
        public final int f7686c;

        /* renamed from: d */
        public final int f7687d;

        /* renamed from: e */
        public final int f7688e;

        private C3084c() {
            this.f7684a = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) AbstractC3080e.this).sdk.m7476L(), AbstractC3080e.this.m7950Y());
            this.f7685b = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) AbstractC3080e.this).sdk.m7476L(), AbstractC3080e.this.m7949Z());
            this.f7686c = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) AbstractC3080e.this).sdk.m7476L(), AbstractC3080e.this.m7929aa());
            this.f7687d = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) AbstractC3080e.this).sdk.m7476L(), ((Integer) ((AppLovinAdBase) AbstractC3080e.this).sdk.m7456a(C3109b.f7855bG)).intValue());
            this.f7688e = AppLovinSdkUtils.dpToPx(((AppLovinAdBase) AbstractC3080e.this).sdk.m7476L(), ((Integer) ((AppLovinAdBase) AbstractC3080e.this).sdk.m7456a(C3109b.f7854bF)).intValue());
        }
    }

    /* renamed from: com.applovin.impl.sdk.ad.e$d */
    /* loaded from: classes.dex */
    public enum EnumC3085d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public AbstractC3080e(JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, C3214m c3214m) {
        super(jSONObject, jSONObject2, enumC3076b, c3214m);
        this.f7667a = CollectionUtils.synchronizedList();
        this.f7668b = new AtomicBoolean();
        this.f7669c = new AtomicBoolean();
        this.f7670d = new AtomicReference<>();
    }

    /* renamed from: b */
    private AbstractC2774i.EnumC2775a m7899b(boolean z) {
        return z ? AbstractC2774i.EnumC2775a.WHITE_ON_TRANSPARENT : AbstractC2774i.EnumC2775a.WHITE_ON_BLACK;
    }

    /* renamed from: b */
    private String m7902b(PointF pointF, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map<String, String> m7897c = m7897c(pointF, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, m7897c);
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    private List<Integer> m7903b() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* renamed from: c */
    private String m7898c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    /* renamed from: c */
    private Map<String, String> m7897c(PointF pointF, boolean z) {
        Point m7027a = C3294g.m7027a(this.sdk.m7476L());
        HashMap hashMap = new HashMap(5);
        hashMap.put(Utils.MACRO_CLCODE, getClCode());
        hashMap.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        hashMap.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        hashMap.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(m7027a.x));
        hashMap.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(m7027a.y));
        hashMap.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z));
        return hashMap;
    }

    /* renamed from: A */
    public List<Uri> m7974A() {
        return this.f7667a;
    }

    /* renamed from: B */
    public String m7973B() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }

    /* renamed from: C */
    public C2802s m7972C() {
        return new C2802s(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    /* renamed from: D */
    public boolean mo7971D() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    /* renamed from: E */
    public boolean m7970E() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    /* renamed from: F */
    public EnumC3082a m7969F() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC3082a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC3082a.DO_NOT_DISMISS;
            }
        }
        return EnumC3082a.UNSPECIFIED;
    }

    /* renamed from: G */
    public List<String> m7968G() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    /* renamed from: H */
    public List<String> m7967H() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.m7423b(C3109b.f7890bp);
    }

    /* renamed from: I */
    public boolean m7966I() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    /* renamed from: J */
    public boolean m7965J() {
        return getBooleanFromAdObject("recognize_interaction_as_click", Boolean.FALSE);
    }

    /* renamed from: K */
    public boolean m7964K() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    /* renamed from: L */
    public String m7963L() {
        return getStringFromAdObject("cache_prefix", null);
    }

    /* renamed from: M */
    public boolean m7962M() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    /* renamed from: N */
    public String m7961N() {
        return getStringFromFullResponse("event_id", null);
    }

    /* renamed from: O */
    public boolean m7960O() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    /* renamed from: P */
    public int m7959P() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    /* renamed from: Q */
    public int m7958Q() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    /* renamed from: R */
    public int m7957R() {
        synchronized (this.adObjectLock) {
            int i = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i < 0 || i > 100) {
                return 90;
            }
            return i;
        }
    }

    /* renamed from: S */
    public int m7956S() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    /* renamed from: T */
    public int m7955T() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    /* renamed from: U */
    public boolean m7954U() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    /* renamed from: V */
    public boolean m7953V() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    /* renamed from: W */
    public boolean m7952W() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    /* renamed from: X */
    public C3084c m7951X() {
        if (this.f7675i == null) {
            this.f7675i = new C3084c();
        }
        return this.f7675i;
    }

    /* renamed from: Y */
    public int m7950Y() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.m7456a(C3109b.f7936cj)).intValue());
    }

    /* renamed from: Z */
    public int m7949Z() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.m7456a(C3109b.f7937ck)).intValue());
    }

    /* renamed from: a */
    public AbstractC2774i.EnumC2775a m7947a(int i) {
        return i == 1 ? AbstractC2774i.EnumC2775a.WHITE_ON_TRANSPARENT : i == 2 ? AbstractC2774i.EnumC2775a.INVISIBLE : i == 3 ? AbstractC2774i.EnumC2775a.TRANSPARENT_SKIP : AbstractC2774i.EnumC2775a.WHITE_ON_BLACK;
    }

    /* renamed from: a */
    public List<C3119a> m7946a(PointF pointF) {
        List<C3119a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, m7897c(pointF, true), null, m7909au(), m7874y(), this.sdk);
        }
        return postbacks.isEmpty() ? m7945a(pointF, true) : postbacks;
    }

    /* renamed from: a */
    public List<C3119a> m7945a(PointF pointF, boolean z) {
        List<C3119a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, m7897c(pointF, z), m7902b(pointF, z), m7909au(), m7874y(), this.sdk);
        }
        return postbacks;
    }

    /* renamed from: a */
    public abstract void mo7948a();

    /* renamed from: a */
    public void m7943a(C3105c c3105c) {
        this.f7670d.set(c3105c);
    }

    /* renamed from: a */
    public void m7942a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: aA */
    public List<String> m7941aA() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    /* renamed from: aB */
    public List<String> m7940aB() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    /* renamed from: aC */
    public Uri m7939aC() {
        String stringFromAdObject = getStringFromAdObject("mute_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aD */
    public Uri m7938aD() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aE */
    public boolean m7937aE() {
        return this.f7669c.get();
    }

    /* renamed from: aF */
    public void m7936aF() {
        this.f7669c.set(true);
    }

    /* renamed from: aG */
    public C3105c m7935aG() {
        return this.f7670d.getAndSet(null);
    }

    /* renamed from: aH */
    public boolean m7934aH() {
        String str = this.sdk.m7396p().getExtraParameters().get("should_use_exoplayer_if_available");
        return StringUtils.isValidString(str) ? Boolean.parseBoolean(str) : getBooleanFromAdObject("suep", Boolean.FALSE);
    }

    /* renamed from: aI */
    public boolean m7933aI() {
        return getBooleanFromAdObject("rwvbv", Boolean.FALSE);
    }

    /* renamed from: aJ */
    public boolean m7932aJ() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    /* renamed from: aK */
    public boolean m7931aK() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    /* renamed from: aL */
    public EnumC3085d m7930aL() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? EnumC3085d.TOP : "bottom".equals(stringFromAdObject) ? EnumC3085d.BOTTOM : "left".equals(stringFromAdObject) ? EnumC3085d.LEFT : "right".equals(stringFromAdObject) ? EnumC3085d.RIGHT : EnumC3085d.RESIZE_ASPECT;
    }

    /* renamed from: aa */
    public int m7929aa() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.m7456a(C3109b.f7935ci)).intValue());
    }

    /* renamed from: ab */
    public boolean m7928ab() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.m7456a(C3109b.f7934ch));
    }

    /* renamed from: ac */
    public boolean m7927ac() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.m7456a(C3109b.f7941co));
    }

    /* renamed from: ad */
    public long m7926ad() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    /* renamed from: ae */
    public int m7925ae() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    /* renamed from: af */
    public boolean m7924af() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    /* renamed from: ag */
    public AtomicBoolean m7923ag() {
        return this.f7668b;
    }

    /* renamed from: ah */
    public boolean m7922ah() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    /* renamed from: ai */
    public String m7921ai() {
        return getStringFromAdObject("nia_title", "");
    }

    /* renamed from: aj */
    public String m7920aj() {
        return getStringFromAdObject("nia_message", "");
    }

    /* renamed from: ak */
    public String m7919ak() {
        return getStringFromAdObject("nia_button_title", "");
    }

    /* renamed from: al */
    public boolean m7918al() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    /* renamed from: am */
    public boolean m7917am() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    /* renamed from: an */
    public String m7916an() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    /* renamed from: ao */
    public String m7915ao() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    /* renamed from: ap */
    public String m7914ap() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    /* renamed from: aq */
    public List<C3119a> m7913aq() {
        List<C3119a> postbacks;
        List<C3119a> list = this.f7671e;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), m7898c(), this.sdk);
            this.f7671e = postbacks;
        }
        return postbacks;
    }

    /* renamed from: ar */
    public List<C3119a> m7912ar() {
        List<C3119a> postbacks;
        List<C3119a> list = this.f7672f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f7672f = postbacks;
        }
        return postbacks;
    }

    /* renamed from: as */
    public List<C3119a> m7911as() {
        List<C3119a> postbacks;
        List<C3119a> list = this.f7673g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f7673g = postbacks;
        }
        return postbacks;
    }

    /* renamed from: at */
    public List<C3119a> mo7910at() {
        List<C3119a> postbacks;
        List<C3119a> list = this.f7674h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), null, null, m7909au(), m7874y(), this.sdk);
            this.f7674h = postbacks;
        }
        return postbacks;
    }

    /* renamed from: au */
    public Map<String, String> m7909au() {
        HashMap hashMap = new HashMap();
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            hashMap.put("User-Agent", C3072ab.m8014a());
        }
        return hashMap;
    }

    /* renamed from: av */
    public boolean m7908av() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    /* renamed from: aw */
    public String m7907aw() {
        String stringFromAdObject = getStringFromAdObject("base_url", RemoteSettings.FORWARD_SLASH_STRING);
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* renamed from: ax */
    public boolean m7906ax() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.FALSE);
    }

    /* renamed from: ay */
    public C2806v m7905ay() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new C2806v(jsonObjectFromAdObject);
        }
        return null;
    }

    /* renamed from: az */
    public int m7904az() {
        return getIntFromAdObject("whalt", Utils.isBML(getSize()) ? 1 : ((Boolean) this.sdk.m7456a(C3109b.f8016eL)).booleanValue() ? 0 : -1);
    }

    /* renamed from: b */
    public void m7901b(Uri uri) {
        this.f7667a.add(uri);
    }

    /* renamed from: c */
    public void m7896c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "mute_image", uri);
        }
    }

    /* renamed from: d */
    public abstract String mo7894d();

    /* renamed from: d */
    public void m7893d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    /* renamed from: f */
    public boolean mo7890f() {
        if (C3349v.m6862a()) {
            this.sdk.m7487A().m6850e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
            return false;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    @Nullable
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return Collections.emptyList();
    }

    /* renamed from: h */
    public Uri mo7887h() {
        if (C3349v.m6862a()) {
            this.sdk.m7487A().m6850e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
            return null;
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public abstract boolean isOpenMeasurementEnabled();

    /* renamed from: j */
    public Uri mo7886j() {
        if (C3349v.m6862a()) {
            this.sdk.m7487A().m6850e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
            return null;
        }
        return null;
    }

    /* renamed from: k */
    public Uri mo7885k() {
        if (C3349v.m6862a()) {
            this.sdk.m7487A().m6850e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
            return null;
        }
        return null;
    }

    /* renamed from: o */
    public abstract AbstractC3040b mo7884o();

    /* renamed from: p */
    public EnumC3083b m7883p() {
        EnumC3083b enumC3083b = EnumC3083b.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", enumC3083b.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? EnumC3083b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? EnumC3083b.ACTIVITY_LANDSCAPE : enumC3083b;
    }

    /* renamed from: q */
    public long m7882q() {
        return getLongFromAdObject("close_delay", 0L);
    }

    /* renamed from: r */
    public long m7881r() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    /* renamed from: s */
    public long m7880s() {
        List<Integer> m7879t = m7879t();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (m7879t == null || m7879t.size() <= 0) ? 0L : m7879t.get(0).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    @Nullable
    /* renamed from: t */
    public List<Integer> m7879t() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    /* renamed from: u */
    public AbstractC2774i.EnumC2775a m7878u() {
        List<Integer> m7903b = m7903b();
        int intFromAdObject = getIntFromAdObject("close_style", (m7903b == null || m7903b.size() <= 0) ? -1 : m7903b.get(0).intValue());
        return intFromAdObject == -1 ? m7899b(hasVideoUrl()) : m7947a(intFromAdObject);
    }

    @Nullable
    /* renamed from: v */
    public List<AbstractC2774i.EnumC2775a> m7877v() {
        List<Integer> m7903b = m7903b();
        if (m7903b != null) {
            ArrayList arrayList = new ArrayList(m7903b.size());
            for (Integer num : m7903b) {
                arrayList.add(m7947a(num.intValue()));
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: w */
    public AbstractC2774i.EnumC2775a m7876w() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? m7878u() : m7947a(intFromAdObject);
    }

    /* renamed from: x */
    public boolean m7875x() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    /* renamed from: y */
    public boolean m7874y() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    /* renamed from: z */
    public boolean m7873z() {
        return getBooleanFromAdObject("html_resources_cached", Boolean.FALSE);
    }
}
