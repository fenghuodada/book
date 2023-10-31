package com.applovin.impl.sdk.p032d;

import android.text.TextUtils;
import androidx.constraintlayout.motion.widget.C0552c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.d.b */
/* loaded from: classes.dex */
public class C3120b {

    /* renamed from: A */
    public static final C3120b f8109A;

    /* renamed from: B */
    public static final C3120b f8110B;

    /* renamed from: C */
    public static final C3120b f8111C;

    /* renamed from: D */
    public static final C3120b f8112D;

    /* renamed from: G */
    private static final Set<String> f8113G = new HashSet(32);

    /* renamed from: a */
    public static final C3120b f8114a;

    /* renamed from: b */
    public static final C3120b f8115b;

    /* renamed from: c */
    public static final C3120b f8116c;

    /* renamed from: d */
    public static final C3120b f8117d;

    /* renamed from: e */
    public static final C3120b f8118e;

    /* renamed from: f */
    public static final C3120b f8119f;

    /* renamed from: g */
    public static final C3120b f8120g;

    /* renamed from: h */
    public static final C3120b f8121h;

    /* renamed from: i */
    public static final C3120b f8122i;

    /* renamed from: j */
    public static final C3120b f8123j;

    /* renamed from: k */
    public static final C3120b f8124k;

    /* renamed from: l */
    public static final C3120b f8125l;

    /* renamed from: m */
    public static final C3120b f8126m;

    /* renamed from: n */
    public static final C3120b f8127n;

    /* renamed from: o */
    public static final C3120b f8128o;

    /* renamed from: p */
    public static final C3120b f8129p;

    /* renamed from: q */
    public static final C3120b f8130q;

    /* renamed from: r */
    public static final C3120b f8131r;

    /* renamed from: s */
    public static final C3120b f8132s;

    /* renamed from: t */
    public static final C3120b f8133t;

    /* renamed from: u */
    public static final C3120b f8134u;

    /* renamed from: v */
    public static final C3120b f8135v;

    /* renamed from: w */
    public static final C3120b f8136w;

    /* renamed from: x */
    public static final C3120b f8137x;

    /* renamed from: y */
    public static final C3120b f8138y;

    /* renamed from: z */
    public static final C3120b f8139z;

    /* renamed from: E */
    private final String f8140E;

    /* renamed from: F */
    private final String f8141F;

    static {
        m7757a("sisw", "IS_STREAMING_WEBKIT");
        m7757a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        m7757a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        m7757a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        m7757a("skr", "STOREKIT_REDIRECTED");
        m7757a("sklf", "STOREKIT_LOAD_FAILURE");
        m7757a("skps", "STOREKIT_PRELOAD_SKIPPED");
        f8114a = m7757a("sas", "AD_SOURCE");
        f8115b = m7757a("srt", "AD_RENDER_TIME");
        f8116c = m7757a("sft", "AD_FETCH_TIME");
        f8117d = m7757a("sfs", "AD_FETCH_SIZE");
        f8118e = m7757a("sadb", "AD_DOWNLOADED_BYTES");
        f8119f = m7757a("sacb", "AD_CACHED_BYTES");
        f8120g = m7757a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");
        f8121h = m7757a("stdi", "TIME_TO_DISPLAY_FROM_INIT");
        f8122i = m7757a("snas", "AD_NUMBER_IN_SESSION");
        f8123j = m7757a("snat", "AD_NUMBER_TOTAL");
        f8124k = m7757a("stah", "TIME_AD_HIDDEN_FROM_SHOW");
        f8125l = m7757a("stas", "TIME_TO_SKIP_FROM_SHOW");
        f8126m = m7757a("stac", "TIME_TO_CLICK_FROM_SHOW");
        f8127n = m7757a("stbe", "TIME_TO_EXPAND_FROM_SHOW");
        f8128o = m7757a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");
        f8129p = m7757a("saan", "AD_SHOWN_WITH_ACTIVE_NETWORK");
        f8130q = m7757a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");
        f8131r = m7757a("sugs", "AD_USED_GRAPHIC_STREAM");
        f8132s = m7757a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");
        f8133t = m7757a("stpd", "INTERSTITIAL_PAUSED_DURATION");
        f8134u = m7757a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");
        f8135v = m7757a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");
        f8136w = m7757a("schc", "AD_CANCELLED_HTML_CACHING");
        f8137x = m7757a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");
        f8138y = m7757a("vssc", "VIDEO_STREAM_STALLED_COUNT");
        f8139z = m7757a("wvem", "WEB_VIEW_ERROR_MESSAGES");
        f8109A = m7757a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");
        f8110B = m7757a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");
        f8111C = m7757a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");
        f8112D = m7757a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");
    }

    private C3120b(String str, String str2) {
        this.f8140E = str;
        this.f8141F = str2;
    }

    /* renamed from: a */
    private static C3120b m7757a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Set<String> set = f8113G;
            if (!set.contains(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    set.add(str);
                    return new C3120b(str, str2);
                }
                throw new IllegalArgumentException("No debug name specified");
            }
            throw new IllegalArgumentException(C0552c.m12192b("Key has already been used: ", str));
        }
        throw new IllegalArgumentException("No key name specified");
    }
}
