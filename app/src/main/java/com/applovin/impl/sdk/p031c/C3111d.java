package com.applovin.impl.sdk.p031c;

import java.util.HashSet;

/* renamed from: com.applovin.impl.sdk.c.d */
/* loaded from: classes.dex */
public class C3111d<T> {

    /* renamed from: D */
    private final String f8091D;

    /* renamed from: E */
    private final Class<T> f8092E;

    /* renamed from: a */
    public static final C3111d<String> f8065a = new C3111d<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: b */
    public static final C3111d<Boolean> f8066b = new C3111d<>("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: c */
    public static final C3111d<String> f8067c = new C3111d<>("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: d */
    public static final C3111d<Long> f8068d = new C3111d<>("com.applovin.sdk.install_date", Long.class);

    /* renamed from: e */
    public static final C3111d<String> f8069e = new C3111d<>("com.applovin.sdk.user_id", String.class);

    /* renamed from: f */
    public static final C3111d<String> f8070f = new C3111d<>("com.applovin.sdk.compass_id", String.class);

    /* renamed from: g */
    public static final C3111d<String> f8071g = new C3111d<>("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: h */
    public static final C3111d<String> f8072h = new C3111d<>("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: i */
    public static final C3111d<String> f8073i = new C3111d<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: j */
    public static final C3111d<String> f8074j = new C3111d<>("com.applovin.sdk.variables", String.class);

    /* renamed from: k */
    public static final C3111d<Boolean> f8075k = new C3111d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: l */
    public static final C3111d<Boolean> f8076l = new C3111d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: m */
    public static final C3111d<Boolean> f8077m = new C3111d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: n */
    public static final C3111d<String> f8078n = new C3111d<>("IABTCF_TCString", String.class);

    /* renamed from: o */
    public static final C3111d<?> f8079o = new C3111d<>("IABTCF_gdprApplies", Object.class);

    /* renamed from: p */
    public static final C3111d<HashSet> f8080p = new C3111d<>("com.applovin.sdk.impl.postbackQueue.key", HashSet.class);

    /* renamed from: q */
    public static final C3111d<String> f8081q = new C3111d<>("com.applovin.sdk.stats", String.class);

    /* renamed from: r */
    public static final C3111d<HashSet> f8082r = new C3111d<>("com.applovin.sdk.task.stats", HashSet.class);

    /* renamed from: s */
    public static final C3111d<String> f8083s = new C3111d<>("com.applovin.sdk.network_response_code_mapping", String.class);

    /* renamed from: t */
    public static final C3111d<String> f8084t = new C3111d<>("com.applovin.sdk.event_tracking.super_properties", String.class);

    /* renamed from: u */
    public static final C3111d<HashSet> f8085u = new C3111d<>("com.applovin.sdk.ad.stats", HashSet.class);

    /* renamed from: v */
    public static final C3111d<Integer> f8086v = new C3111d<>("com.applovin.sdk.last_video_position", Integer.class);

    /* renamed from: w */
    public static final C3111d<Boolean> f8087w = new C3111d<>("com.applovin.sdk.should_resume_video", Boolean.class);

    /* renamed from: x */
    public static final C3111d<String> f8088x = new C3111d<>("com.applovin.sdk.mediation.signal_providers", String.class);

    /* renamed from: y */
    public static final C3111d<String> f8089y = new C3111d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);

    /* renamed from: z */
    public static final C3111d<String> f8090z = new C3111d<>("com.applovin.sdk.persisted_data", String.class);

    /* renamed from: A */
    public static final C3111d<String> f8062A = new C3111d<>("com.applovin.sdk.mediation_provider", String.class);

    /* renamed from: B */
    public static final C3111d<String> f8063B = new C3111d<>("com.applovin.sdk.mediation.test_mode_network", String.class);

    /* renamed from: C */
    public static final C3111d<Boolean> f8064C = new C3111d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);

    public C3111d(String str, Class<T> cls) {
        this.f8091D = str;
        this.f8092E = cls;
    }

    /* renamed from: a */
    public String m7795a() {
        return this.f8091D;
    }

    /* renamed from: b */
    public Class<T> m7794b() {
        return this.f8092E;
    }

    public String toString() {
        return "Key{name='" + this.f8091D + "', type=" + this.f8092E + '}';
    }
}
