package com.applovin.impl.sdk.p031c;

import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.c.a */
/* loaded from: classes.dex */
public class C3108a<T> extends C3109b<T> {

    /* renamed from: A */
    public static final C3109b<Boolean> f7743A;

    /* renamed from: B */
    public static final C3109b<Boolean> f7744B;

    /* renamed from: C */
    public static final C3109b<Boolean> f7745C;

    /* renamed from: D */
    public static final C3109b<Long> f7746D;

    /* renamed from: E */
    public static final C3109b<Boolean> f7747E;

    /* renamed from: F */
    public static final C3109b<Long> f7748F;

    /* renamed from: G */
    public static final C3109b<Long> f7749G;

    /* renamed from: H */
    public static final C3109b<Boolean> f7750H;

    /* renamed from: I */
    public static final C3109b<Long> f7751I;

    /* renamed from: J */
    public static final C3109b<Boolean> f7752J;

    /* renamed from: K */
    public static final C3109b<Integer> f7753K;

    /* renamed from: L */
    public static final C3109b<String> f7754L;

    /* renamed from: M */
    public static final C3109b<String> f7755M;

    /* renamed from: N */
    public static final C3109b<Integer> f7756N;

    /* renamed from: O */
    public static final C3109b<String> f7757O;

    /* renamed from: P */
    public static final C3109b<Boolean> f7758P;

    /* renamed from: Q */
    public static final C3109b<Boolean> f7759Q;

    /* renamed from: R */
    public static final C3109b<Boolean> f7760R;

    /* renamed from: S */
    public static final C3109b<Boolean> f7761S;

    /* renamed from: T */
    public static final C3109b<Boolean> f7762T;

    /* renamed from: U */
    public static final C3109b<Boolean> f7763U;

    /* renamed from: V */
    public static final C3109b<Boolean> f7764V;

    /* renamed from: a */
    public static final C3109b<String> f7765a = C3109b.m7810a("afi", "");

    /* renamed from: b */
    public static final C3109b<Long> f7766b;

    /* renamed from: c */
    public static final C3109b<String> f7767c;

    /* renamed from: d */
    public static final C3109b<String> f7768d;

    /* renamed from: e */
    public static final C3109b<Long> f7769e;

    /* renamed from: f */
    public static final C3109b<Long> f7770f;

    /* renamed from: g */
    public static final C3109b<Long> f7771g;

    /* renamed from: h */
    public static final C3109b<Boolean> f7772h;

    /* renamed from: i */
    public static final C3109b<String> f7773i;

    /* renamed from: j */
    public static final C3109b<Boolean> f7774j;

    /* renamed from: k */
    public static final C3109b<Long> f7775k;

    /* renamed from: l */
    public static final C3109b<Long> f7776l;

    /* renamed from: m */
    public static final C3109b<Long> f7777m;

    /* renamed from: n */
    public static final C3109b<Long> f7778n;

    /* renamed from: o */
    public static final C3109b<String> f7779o;

    /* renamed from: p */
    public static final C3109b<Long> f7780p;

    /* renamed from: q */
    public static final C3109b<Boolean> f7781q;

    /* renamed from: r */
    public static final C3109b<Boolean> f7782r;

    /* renamed from: s */
    public static final C3109b<Boolean> f7783s;

    /* renamed from: t */
    public static final C3109b<Boolean> f7784t;

    /* renamed from: u */
    public static final C3109b<Boolean> f7785u;

    /* renamed from: v */
    public static final C3109b<Long> f7786v;

    /* renamed from: w */
    public static final C3109b<Boolean> f7787w;

    /* renamed from: x */
    public static final C3109b<Long> f7788x;

    /* renamed from: y */
    public static final C3109b<Long> f7789y;

    /* renamed from: z */
    public static final C3109b<Boolean> f7790z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f7766b = C3114f.m7779a(timeUnit, 5L, "afi_ms");
        f7767c = C3109b.m7810a("mediation_endpoint", "https://ms.applovin.com/");
        f7768d = C3109b.m7810a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f7769e = C3114f.m7779a(timeUnit, 2L, "fetch_next_ad_retry_delay_ms");
        f7770f = C3114f.m7779a(timeUnit, 5L, "fetch_next_ad_timeout_ms");
        f7771g = C3114f.m7779a(timeUnit, 7L, "fetch_mediation_debugger_info_timeout_ms");
        Boolean bool = Boolean.TRUE;
        f7772h = C3109b.m7810a("auto_init_mediation_debugger", bool);
        f7773i = C3109b.m7810a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        Boolean bool2 = Boolean.FALSE;
        f7774j = C3109b.m7810a("persistent_mediated_postbacks", bool2);
        f7775k = C3114f.m7779a(timeUnit, 30L, "max_signal_provider_latency_ms");
        f7776l = C3114f.m7779a(timeUnit, 10L, "default_adapter_timeout_ms");
        f7777m = C3114f.m7779a(timeUnit, 30L, "ad_refresh_ms");
        f7778n = C3114f.m7779a(timeUnit, 30L, "ad_load_failure_refresh_ms");
        f7779o = C3109b.m7810a("ad_load_failure_refresh_ignore_error_codes", "204");
        f7780p = C3109b.m7810a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        f7781q = C3109b.m7810a("refresh_ad_view_timer_responds_to_background", bool);
        f7782r = C3109b.m7810a("refresh_ad_view_timer_responds_to_store_kit", bool);
        f7783s = C3109b.m7810a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool2);
        f7784t = C3109b.m7810a("avrsponse", bool2);
        f7785u = C3109b.m7810a("allow_pause_auto_refresh_immediately", bool2);
        f7786v = C3109b.m7810a("fullscreen_display_delay_ms", 600L);
        f7787w = C3109b.m7810a("susaode", bool2);
        f7788x = C3109b.m7810a("ahdm", 500L);
        f7789y = C3109b.m7810a("ad_view_refresh_precache_request_viewability_undesired_flags", 502L);
        f7790z = C3109b.m7810a("ad_view_refresh_precache_request_enabled", bool);
        f7743A = C3109b.m7810a("fullscreen_ads_block_publisher_load_if_another_showing", bool);
        f7744B = C3109b.m7810a("fabsina", bool2);
        f7745C = C3109b.m7810a("fabsiaif", bool2);
        f7746D = C3114f.m7779a(TimeUnit.HOURS, 4L, "ad_expiration_ms");
        f7747E = C3109b.m7810a("saewib", bool2);
        f7748F = C3109b.m7810a("fullscreen_ad_displayed_timeout_ms", -1L);
        f7749G = C3109b.m7810a("ad_hidden_timeout_ms", -1L);
        f7750H = C3109b.m7810a("schedule_ad_hidden_on_ad_dismiss", bool2);
        f7751I = C3114f.m7779a(timeUnit, 1L, "ad_hidden_on_ad_dismiss_callback_delay_ms");
        f7752J = C3109b.m7810a("proe", bool2);
        f7753K = C3109b.m7810a("mute_state", 2);
        f7754L = C3109b.m7810a("saf", "");
        f7755M = C3109b.m7810a("saui", "");
        f7756N = C3109b.m7810a("mra", -1);
        f7757O = C3109b.m7810a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
        f7758P = C3109b.m7810a("pmp", bool2);
        f7759Q = C3109b.m7810a("sai", bool2);
        f7760R = C3109b.m7810a("init_adapter_for_sc", bool);
        f7761S = C3109b.m7810a("init_adapter_for_al", bool);
        f7762T = C3109b.m7810a("fadiafase", bool);
        f7763U = C3109b.m7810a("fetch_mediated_ad_gzip", bool2);
        f7764V = C3109b.m7810a("max_postback_gzip", bool2);
    }
}
