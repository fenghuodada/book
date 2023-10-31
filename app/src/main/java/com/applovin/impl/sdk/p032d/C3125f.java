package com.applovin.impl.sdk.p032d;

import android.text.TextUtils;
import androidx.constraintlayout.motion.widget.C0552c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.f */
/* loaded from: classes.dex */
public class C3125f {

    /* renamed from: t */
    private final String f8181t;

    /* renamed from: s */
    private static final Set<String> f8179s = new HashSet(32);

    /* renamed from: u */
    private static final Set<C3125f> f8180u = new HashSet(16);

    /* renamed from: a */
    public static final C3125f f8161a = m7722a("ad_req");

    /* renamed from: b */
    public static final C3125f f8162b = m7722a("ad_imp");

    /* renamed from: c */
    public static final C3125f f8163c = m7722a("ad_session_start");

    /* renamed from: d */
    public static final C3125f f8164d = m7722a("ad_imp_session");

    /* renamed from: e */
    public static final C3125f f8165e = m7722a("cached_files_expired");

    /* renamed from: f */
    public static final C3125f f8166f = m7722a("cache_drop_count");

    /* renamed from: g */
    public static final C3125f f8167g = m7721a("sdk_reset_state_count", true);

    /* renamed from: h */
    public static final C3125f f8168h = m7721a("ad_response_process_failures", true);

    /* renamed from: i */
    public static final C3125f f8169i = m7721a("response_process_failures", true);

    /* renamed from: j */
    public static final C3125f f8170j = m7721a("incent_failed_to_display_count", true);

    /* renamed from: k */
    public static final C3125f f8171k = m7722a("app_paused_and_resumed");

    /* renamed from: l */
    public static final C3125f f8172l = m7721a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: m */
    public static final C3125f f8173m = m7722a("ad_shown_outside_app_count");

    /* renamed from: n */
    public static final C3125f f8174n = m7722a("med_ad_req");

    /* renamed from: o */
    public static final C3125f f8175o = m7721a("med_ad_response_process_failures", true);

    /* renamed from: p */
    public static final C3125f f8176p = m7721a("med_waterfall_ad_no_fill", true);

    /* renamed from: q */
    public static final C3125f f8177q = m7721a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: r */
    public static final C3125f f8178r = m7721a("med_waterfall_ad_invalid_response", true);

    static {
        m7722a("fullscreen_ad_nil_vc_count");
        m7722a("applovin_bundle_missing");
    }

    private C3125f(String str) {
        this.f8181t = str;
    }

    /* renamed from: a */
    private static C3125f m7722a(String str) {
        return m7721a(str, false);
    }

    /* renamed from: a */
    private static C3125f m7721a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            Set<String> set = f8179s;
            if (!set.contains(str)) {
                set.add(str);
                C3125f c3125f = new C3125f(str);
                if (z) {
                    f8180u.add(c3125f);
                }
                return c3125f;
            }
            throw new IllegalArgumentException(C0552c.m12192b("Key has already been used: ", str));
        }
        throw new IllegalArgumentException("No key name specified");
    }
}
