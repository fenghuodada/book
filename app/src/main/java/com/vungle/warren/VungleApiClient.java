package com.vungle.warren;

import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.work.C1828a;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8690m;
import com.google.gson.C8695r;
import com.vungle.warren.C9818j0;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.model.C9874j;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.network.C9897d;
import com.vungle.warren.network.C9901e;
import com.vungle.warren.network.C9902f;
import com.vungle.warren.network.InterfaceC9891a;
import com.vungle.warren.omsdk.C9907b;
import com.vungle.warren.omsdk.RunnableC9906a;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.InterfaceC10107v;
import com.vungle.warren.utility.platform.InterfaceC10100c;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class VungleApiClient {

    /* renamed from: C */
    public static String f19359C;

    /* renamed from: D */
    public static final String f19360D;

    /* renamed from: A */
    public final C9907b f19361A;

    /* renamed from: a */
    public final InterfaceC10100c f19363a;

    /* renamed from: b */
    public final Context f19364b;

    /* renamed from: c */
    public final C9902f f19365c;

    /* renamed from: d */
    public String f19366d;

    /* renamed from: e */
    public String f19367e;

    /* renamed from: f */
    public String f19368f;

    /* renamed from: g */
    public String f19369g;

    /* renamed from: h */
    public String f19370h;

    /* renamed from: i */
    public String f19371i;

    /* renamed from: j */
    public String f19372j;

    /* renamed from: k */
    public String f19373k;

    /* renamed from: l */
    public C8695r f19374l;

    /* renamed from: m */
    public C8695r f19375m;

    /* renamed from: n */
    public boolean f19376n;

    /* renamed from: o */
    public int f19377o;

    /* renamed from: p */
    public final OkHttpClient f19378p;

    /* renamed from: q */
    public C9902f f19379q;

    /* renamed from: r */
    public final C9902f f19380r;

    /* renamed from: s */
    public boolean f19381s;

    /* renamed from: t */
    public final C9914a f19382t;

    /* renamed from: u */
    public Boolean f19383u;

    /* renamed from: v */
    public final InterfaceC10107v f19384v;

    /* renamed from: x */
    public boolean f19386x;

    /* renamed from: y */
    public final C9928h f19387y;

    /* renamed from: w */
    public final ConcurrentHashMap f19385w = new ConcurrentHashMap();

    /* renamed from: z */
    public String f19388z = System.getProperty("http.agent");

    /* renamed from: B */
    public String f19362B = "";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        public static final String EDGE = "edge";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "LTE";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";
    }

    @Keep
    /* loaded from: classes3.dex */
    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    /* renamed from: com.vungle.warren.VungleApiClient$a */
    /* loaded from: classes3.dex */
    public class C9740a implements Interceptor {
        public C9740a() {
        }

        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            int code;
            Request request = chain.request();
            String encodedPath = request.url().encodedPath();
            VungleApiClient vungleApiClient = VungleApiClient.this;
            Long l = (Long) vungleApiClient.f19385w.get(encodedPath);
            ConcurrentHashMap concurrentHashMap = vungleApiClient.f19385w;
            if (l != null) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(l.longValue() - System.currentTimeMillis());
                if (seconds > 0) {
                    return new Response.Builder().request(request).addHeader("Retry-After", String.valueOf(seconds)).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"Error\":\"Retry-After\"}")).build();
                }
                concurrentHashMap.remove(encodedPath);
            }
            Response proceed = chain.proceed(request);
            if (proceed != null && ((code = proceed.code()) == 429 || code == 500 || code == 502 || code == 503)) {
                String str = proceed.headers().get("Retry-After");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        long parseLong = Long.parseLong(str);
                        if (parseLong > 0) {
                            concurrentHashMap.put(encodedPath, Long.valueOf((parseLong * 1000) + System.currentTimeMillis()));
                        }
                    } catch (NumberFormatException unused) {
                        String str2 = VungleApiClient.f19359C;
                        Log.d("com.vungle.warren.VungleApiClient", "Retry-After value is not an valid value");
                    }
                }
            }
            return proceed;
        }
    }

    /* renamed from: com.vungle.warren.VungleApiClient$b */
    /* loaded from: classes3.dex */
    public static class C9741b extends IOException {
        public C9741b() {
            super("Clear Text Traffic is blocked");
        }
    }

    /* renamed from: com.vungle.warren.VungleApiClient$c */
    /* loaded from: classes3.dex */
    public static class C9742c implements Interceptor {
        @Override // okhttp3.Interceptor
        @NonNull
        public final Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            if (request.body() != null && request.header("Content-Encoding") == null) {
                Request.Builder header = request.newBuilder().header("Content-Encoding", "gzip");
                String method = request.method();
                RequestBody body = request.body();
                Buffer buffer = new Buffer();
                BufferedSink buffer2 = Okio.buffer(new GzipSink(buffer));
                body.writeTo(buffer2);
                buffer2.close();
                return chain.proceed(header.method(method, new C9969s1(body, buffer)).build());
            }
            return chain.proceed(request);
        }
    }

    static {
        f19359C = ("Amazon".equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/").concat("6.11.0");
        f19360D = "https://ads.api.vungle.com/";
        new HashSet();
        new HashSet();
    }

    public VungleApiClient(@NonNull Context context, @NonNull C9914a c9914a, @NonNull C9928h c9928h, @NonNull C9907b c9907b, @NonNull InterfaceC10100c interfaceC10100c) {
        this.f19382t = c9914a;
        this.f19364b = context.getApplicationContext();
        this.f19387y = c9928h;
        this.f19361A = c9907b;
        this.f19363a = interfaceC10100c;
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new C9740a());
        OkHttpClient build = addInterceptor.build();
        this.f19378p = build;
        OkHttpClient build2 = addInterceptor.addInterceptor(new C9742c()).build();
        String str = f19360D;
        HttpUrl httpUrl = HttpUrl.get(str);
        List<String> pathSegments = httpUrl.pathSegments();
        if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
            Vungle vungle = Vungle._instance;
            String str2 = vungle.appID;
            C9902f c9902f = new C9902f(httpUrl, build);
            c9902f.f19888c = str2;
            this.f19365c = c9902f;
            HttpUrl httpUrl2 = HttpUrl.get(str);
            List<String> pathSegments2 = httpUrl2.pathSegments();
            if ("".equals(pathSegments2.get(pathSegments2.size() - 1))) {
                String str3 = vungle.appID;
                C9902f c9902f2 = new C9902f(httpUrl2, build2);
                c9902f2.f19888c = str3;
                this.f19380r = c9902f2;
                this.f19384v = (InterfaceC10107v) C10114v0.m1234a(context).m1232c(InterfaceC10107v.class);
                return;
            }
            throw new IllegalArgumentException(C0552c.m12192b("baseUrl must end in /: ", str));
        }
        throw new IllegalArgumentException(C0552c.m12192b("baseUrl must end in /: ", str));
    }

    /* renamed from: g */
    public static long m1613g(C9901e c9901e) {
        try {
            return Long.parseLong(c9901e.f19882a.headers().get("Retry-After")) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public final C9897d m1619a(long j) {
        if (this.f19372j != null) {
            C8695r c8695r = new C8695r();
            c8695r.m3218r(m1616d(false), "device");
            c8695r.m3218r(this.f19375m, "app");
            c8695r.m3218r(m1612h(), "user");
            C8695r c8695r2 = new C8695r();
            c8695r2.m3216t("last_cache_bust", Long.valueOf(j));
            c8695r.m3218r(c8695r2, "request");
            return this.f19380r.m1428b(f19359C, this.f19372j, c8695r);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: b */
    public final C9901e m1618b() throws VungleException, IOException {
        C8695r c8695r = new C8695r();
        c8695r.m3218r(m1616d(true), "device");
        c8695r.m3218r(this.f19375m, "app");
        c8695r.m3218r(m1612h(), "user");
        C8695r m1615e = m1615e();
        if (m1615e != null) {
            c8695r.m3218r(m1615e, "ext");
        }
        C9901e m1432a = ((C9897d) this.f19365c.config(f19359C, c8695r)).m1432a();
        if (!m1432a.m1430a()) {
            return m1432a;
        }
        C8695r c8695r2 = (C8695r) m1432a.f19883b;
        Log.d("com.vungle.warren.VungleApiClient", "Config Response: " + c8695r2);
        String str = "";
        if (C9874j.m1441c(c8695r2, "sleep")) {
            if (C9874j.m1441c(c8695r2, "info")) {
                str = c8695r2.m3213w("info").mo3202p();
            }
            Log.e("com.vungle.warren.VungleApiClient", "Error Initializing Vungle. Please try again. " + str);
            throw new VungleException(3);
        } else if (C9874j.m1441c(c8695r2, "endpoints")) {
            C8695r m3211z = c8695r2.m3211z("endpoints");
            HttpUrl parse = HttpUrl.parse(m3211z.m3213w("new").mo3202p());
            HttpUrl parse2 = HttpUrl.parse(m3211z.m3213w("ads").mo3202p());
            HttpUrl parse3 = HttpUrl.parse(m3211z.m3213w("will_play_ad").mo3202p());
            HttpUrl parse4 = HttpUrl.parse(m3211z.m3213w("report_ad").mo3202p());
            HttpUrl parse5 = HttpUrl.parse(m3211z.m3213w("ri").mo3202p());
            HttpUrl parse6 = HttpUrl.parse(m3211z.m3213w("log").mo3202p());
            HttpUrl parse7 = HttpUrl.parse(m3211z.m3213w("cache_bust").mo3202p());
            HttpUrl parse8 = HttpUrl.parse(m3211z.m3213w("sdk_bi").mo3202p());
            if (parse != null && parse2 != null && parse3 != null && parse4 != null && parse5 != null && parse6 != null && parse7 != null && parse8 != null) {
                this.f19366d = parse.toString();
                this.f19367e = parse2.toString();
                this.f19369g = parse3.toString();
                this.f19368f = parse4.toString();
                this.f19370h = parse5.toString();
                this.f19371i = parse6.toString();
                this.f19372j = parse7.toString();
                this.f19373k = parse8.toString();
                C8695r m3211z2 = c8695r2.m3211z("will_play_ad");
                this.f19377o = m3211z2.m3213w("request_timeout").mo3204k();
                this.f19376n = m3211z2.m3213w("enabled").mo3207b();
                this.f19381s = C9874j.m1443a(c8695r2.m3211z("viewability"), "om", false);
                if (this.f19376n) {
                    Log.v("com.vungle.warren.VungleApiClient", "willPlayAd is enabled, generating a timeout client.");
                    OkHttpClient build = this.f19378p.newBuilder().readTimeout(this.f19377o, TimeUnit.MILLISECONDS).build();
                    HttpUrl httpUrl = HttpUrl.get("https://api.vungle.com/");
                    List<String> pathSegments = httpUrl.pathSegments();
                    if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                        String str2 = Vungle._instance.appID;
                        C9902f c9902f = new C9902f(httpUrl, build);
                        c9902f.f19888c = str2;
                        this.f19379q = c9902f;
                    } else {
                        throw new IllegalArgumentException("baseUrl must end in /: https://api.vungle.com/");
                    }
                }
                if (this.f19381s) {
                    C9907b c9907b = this.f19361A;
                    c9907b.f19895a.post(new RunnableC9906a(c9907b));
                } else {
                    C9846m1 m1477b = C9846m1.m1477b();
                    C8695r c8695r3 = new C8695r();
                    c8695r3.m3215u("event", C0539e.m12265a(15));
                    c8695r3.m3217s(C1828a.m9909a(10), Boolean.FALSE);
                    m1477b.m1474e(new C9879m(15, c8695r3));
                }
                return m1432a;
            }
            Log.e("com.vungle.warren.VungleApiClient", "Error Initializing Vungle. Please try again. ");
            throw new VungleException(3);
        } else {
            Log.e("com.vungle.warren.VungleApiClient", "Error Initializing Vungle. Please try again. ");
            throw new VungleException(3);
        }
    }

    /* renamed from: c */
    public final String m1617c() {
        if (TextUtils.isEmpty(this.f19362B)) {
            C9867g c9867g = (C9867g) this.f19387y.m1383p(C9867g.class, "appSetIdCookie").get(this.f19384v.mo1238a(), TimeUnit.MILLISECONDS);
            this.f19362B = c9867g != null ? c9867g.m1446c("appSetId") : null;
        }
        return this.f19362B;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:3|4|5|(2:6|7)|(1:8)|(6:10|11|(1:13)(1:177)|14|15|16)(3:181|182|(5:184|185|186|187|188)(2:196|194))|17|(1:(3:20|(1:22)(1:24)|23)(5:25|(3:36|29|(1:33))|28|29|(2:31|33)))|37|(1:171)|40|(1:42)(1:170)|43|(1:45)|46|(1:48)|49|(4:51|(1:54)|55|(1:57)(24:(21:62|63|(1:160)(1:67)|68|(4:70|(2:74|(1:(1:86)(2:79|(2:81|(1:83)(1:84))(1:85)))(2:87|88))|101|(3:103|(3:105|(1:(1:(1:109)(1:112))(1:113))(1:114)|110)(1:115)|111))|116|(3:118|(1:120)(1:122)|121)|123|(1:127)|128|(1:130)(2:156|(1:158)(1:159))|131|(1:133)|134|135|(2:137|(1:139))(2:151|(1:153))|140|141|(1:143)(1:149)|144|145)|161|(1:(1:(1:165)(1:166))(1:167))(1:168)|63|(1:65)|160|68|(0)|116|(0)|123|(2:125|127)|128|(0)(0)|131|(0)|134|135|(0)(0)|140|141|(0)(0)|144|145))|169|63|(0)|160|68|(0)|116|(0)|123|(0)|128|(0)(0)|131|(0)|134|135|(0)(0)|140|141|(0)(0)|144|145) */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a4, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a5, code lost:
        android.util.Log.e("com.vungle.warren.VungleApiClient", "isInstallNonMarketAppsEnabled Settings not found", r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d4 A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f1 A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c9 A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02fa A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0319 A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032a A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0364 A[Catch: all -> 0x0405, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037b A[Catch: SettingNotFoundException -> 0x03a4, all -> 0x0405, TRY_ENTER, TryCatch #5 {SettingNotFoundException -> 0x03a4, blocks: (B:177:0x037b, B:179:0x0385, B:180:0x0394), top: B:201:0x0379, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0394 A[Catch: SettingNotFoundException -> 0x03a4, all -> 0x0405, TRY_LEAVE, TryCatch #5 {SettingNotFoundException -> 0x03a4, blocks: (B:177:0x037b, B:179:0x0385, B:180:0x0394), top: B:201:0x0379, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169 A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178 A[Catch: all -> 0x0405, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:12:0x002e, B:18:0x003a, B:40:0x009e, B:42:0x00a6, B:45:0x00b5, B:49:0x00c4, B:50:0x00cd, B:57:0x00ea, B:59:0x00f3, B:61:0x00f7, B:53:0x00e0, B:62:0x00fc, B:70:0x013a, B:72:0x015e, B:73:0x0165, B:75:0x0169, B:78:0x0178, B:81:0x0189, B:82:0x0195, B:99:0x01c1, B:101:0x01d4, B:105:0x01dd, B:107:0x01f1, B:109:0x0201, B:111:0x0207, B:124:0x0225, B:125:0x022b, B:138:0x0251, B:140:0x025f, B:142:0x0265, B:150:0x027a, B:152:0x0293, B:151:0x0286, B:153:0x0296, B:155:0x02c9, B:159:0x02e4, B:160:0x02eb, B:162:0x02fa, B:164:0x0300, B:165:0x030f, B:167:0x0319, B:172:0x033d, B:174:0x0364, B:177:0x037b, B:179:0x0385, B:185:0x03ac, B:189:0x0400, B:180:0x0394, B:184:0x03a5, B:168:0x032a, B:90:0x01a7, B:65:0x010b, B:21:0x0046, B:23:0x004e, B:24:0x0052, B:33:0x0060, B:36:0x0079), top: B:198:0x0005, inners: #5 }] */
    @android.annotation.SuppressLint({"HardwareIds", "NewApi"})
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.gson.C8695r m1616d(boolean r12) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.VungleApiClient.m1616d(boolean):com.google.gson.r");
    }

    /* renamed from: e */
    public final C8695r m1615e() {
        C9867g c9867g = (C9867g) this.f19387y.m1383p(C9867g.class, "config_extension").get(this.f19384v.mo1238a(), TimeUnit.MILLISECONDS);
        String m1446c = c9867g != null ? c9867g.m1446c("config_extension") : "";
        if (TextUtils.isEmpty(m1446c)) {
            return null;
        }
        C8695r c8695r = new C8695r();
        c8695r.m3215u("config_extension", m1446c);
        return c8695r;
    }

    @VisibleForTesting
    /* renamed from: f */
    public final Boolean m1614f() {
        String str;
        boolean z;
        C9928h c9928h = this.f19387y;
        Boolean bool = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            if (googleApiAvailabilityLight == null) {
                return null;
            }
            if (googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.f19364b) == 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            boolean booleanValue = bool.booleanValue();
            C9867g c9867g = new C9867g("isPlaySvcAvailable");
            c9867g.m1445d(Boolean.valueOf(booleanValue), "isPlaySvcAvailable");
            c9928h.m1376w(c9867g);
            return bool;
        } catch (Exception unused) {
            str = "Unexpected exception from Play services lib.";
            Log.w("com.vungle.warren.VungleApiClient", str);
            return bool;
        } catch (NoClassDefFoundError unused2) {
            Log.w("com.vungle.warren.VungleApiClient", "Play services Not available");
            bool = Boolean.FALSE;
            try {
                C9867g c9867g2 = new C9867g("isPlaySvcAvailable");
                c9867g2.m1445d(bool, "isPlaySvcAvailable");
                c9928h.m1376w(c9867g2);
                return bool;
            } catch (C9919c.C9920a unused3) {
                str = "Failure to write GPS availability to DB";
                Log.w("com.vungle.warren.VungleApiClient", str);
                return bool;
            }
        }
    }

    /* renamed from: h */
    public final C8695r m1612h() {
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        boolean booleanValue;
        C8695r c8695r = new C8695r();
        C9928h c9928h = this.f19387y;
        C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "consentIsImportantToVungle").get(this.f19384v.mo1238a(), TimeUnit.MILLISECONDS);
        String str5 = "";
        if (c9867g != null) {
            str = c9867g.m1446c("consent_status");
            str2 = c9867g.m1446c("consent_source");
            j = c9867g.m1447b("timestamp").longValue();
            str3 = c9867g.m1446c("consent_message_version");
        } else {
            str = ConnectionTypeDetail.UNKNOWN;
            str2 = "no_interaction";
            j = 0;
            str3 = "";
        }
        C8695r c8695r2 = new C8695r();
        c8695r2.m3215u("consent_status", str);
        c8695r2.m3215u("consent_source", str2);
        c8695r2.m3216t("consent_timestamp", Long.valueOf(j));
        if (!TextUtils.isEmpty(str3)) {
            str5 = str3;
        }
        c8695r2.m3215u("consent_message_version", str5);
        c8695r.m3218r(c8695r2, "gdpr");
        C9867g c9867g2 = (C9867g) c9928h.m1383p(C9867g.class, "ccpaIsImportantToVungle").get();
        if (c9867g2 != null) {
            str4 = c9867g2.m1446c("ccpa_status");
        } else {
            str4 = "opted_in";
        }
        C8695r c8695r3 = new C8695r();
        c8695r3.m3215u("status", str4);
        c8695r.m3218r(c8695r3, "ccpa");
        C9818j0.m1500b().getClass();
        if (C9818j0.m1501a() != C9818j0.EnumC9819a.f19606d) {
            C8695r c8695r4 = new C8695r();
            C9818j0.m1500b().getClass();
            Boolean bool = C9818j0.m1501a().f19608a;
            if (bool == null) {
                booleanValue = true;
            } else {
                booleanValue = bool.booleanValue();
            }
            c8695r4.m3217s("is_coppa", Boolean.valueOf(booleanValue));
            c8695r.m3218r(c8695r4, "coppa");
        }
        return c8695r;
    }

    @VisibleForTesting
    /* renamed from: i */
    public final Boolean m1611i() {
        Boolean bool;
        if (this.f19383u == null) {
            C9867g c9867g = (C9867g) this.f19387y.m1383p(C9867g.class, "isPlaySvcAvailable").get(this.f19384v.mo1238a(), TimeUnit.MILLISECONDS);
            if (c9867g != null) {
                bool = c9867g.m1448a("isPlaySvcAvailable");
            } else {
                bool = null;
            }
            this.f19383u = bool;
        }
        if (this.f19383u == null) {
            this.f19383u = m1614f();
        }
        return this.f19383u;
    }

    /* renamed from: j */
    public final boolean m1610j(String str) throws C9741b, MalformedURLException {
        boolean isCleartextTrafficPermitted;
        boolean isEmpty = TextUtils.isEmpty(str);
        Boolean bool = Boolean.FALSE;
        if (!isEmpty && HttpUrl.parse(str) != null) {
            try {
                String host = new URL(str).getHost();
                if (Build.VERSION.SDK_INT >= 24) {
                    isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
                } else {
                    isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                if (!isCleartextTrafficPermitted && URLUtil.isHttpUrl(str)) {
                    C9846m1 m1477b = C9846m1.m1477b();
                    C8695r c8695r = new C8695r();
                    c8695r.m3215u("event", C0539e.m12265a(18));
                    c8695r.m3217s(C1828a.m9909a(3), bool);
                    c8695r.m3215u(C1828a.m9909a(11), "Clear Text Traffic is blocked");
                    c8695r.m3215u(C1828a.m9909a(8), str);
                    m1477b.m1474e(new C9879m(18, c8695r));
                    throw new C9741b();
                }
                try {
                    C9901e m1432a = ((C9897d) this.f19365c.pingTPAT(this.f19388z, str)).m1432a();
                    Response response = m1432a.f19882a;
                    if (!m1432a.m1430a()) {
                        C9846m1 m1477b2 = C9846m1.m1477b();
                        C8695r c8695r2 = new C8695r();
                        c8695r2.m3215u("event", C0539e.m12265a(18));
                        c8695r2.m3217s(C1828a.m9909a(3), bool);
                        c8695r2.m3215u(C1828a.m9909a(11), response.code() + ": " + response.message());
                        c8695r2.m3215u(C1828a.m9909a(8), str);
                        m1477b2.m1474e(new C9879m(18, c8695r2));
                        return true;
                    }
                    return true;
                } catch (IOException e) {
                    C9846m1 m1477b3 = C9846m1.m1477b();
                    C8695r c8695r3 = new C8695r();
                    c8695r3.m3215u("event", C0539e.m12265a(18));
                    c8695r3.m3217s(C1828a.m9909a(3), bool);
                    c8695r3.m3215u(C1828a.m9909a(11), e.getMessage());
                    c8695r3.m3215u(C1828a.m9909a(8), str);
                    m1477b3.m1474e(new C9879m(18, c8695r3));
                    Log.d("com.vungle.warren.VungleApiClient", "Error on pinging TPAT");
                    return false;
                }
            } catch (MalformedURLException unused) {
                C9846m1 m1477b4 = C9846m1.m1477b();
                C8695r c8695r4 = new C8695r();
                c8695r4.m3215u("event", C0539e.m12265a(18));
                c8695r4.m3217s(C1828a.m9909a(3), bool);
                c8695r4.m3215u(C1828a.m9909a(11), "Invalid URL");
                c8695r4.m3215u(C1828a.m9909a(8), str);
                m1477b4.m1474e(new C9879m(18, c8695r4));
                throw new MalformedURLException(C0552c.m12192b("Invalid URL : ", str));
            }
        }
        C9846m1 m1477b5 = C9846m1.m1477b();
        C8695r c8695r5 = new C8695r();
        c8695r5.m3215u("event", C0539e.m12265a(18));
        c8695r5.m3217s(C1828a.m9909a(3), bool);
        c8695r5.m3215u(C1828a.m9909a(11), "Invalid URL");
        c8695r5.m3215u(C1828a.m9909a(8), str);
        m1477b5.m1474e(new C9879m(18, c8695r5));
        throw new MalformedURLException(C0552c.m12192b("Invalid URL : ", str));
    }

    /* renamed from: k */
    public final C9897d m1609k(C8695r c8695r) {
        if (this.f19368f != null) {
            C8695r c8695r2 = new C8695r();
            c8695r2.m3218r(m1616d(false), "device");
            c8695r2.m3218r(this.f19375m, "app");
            c8695r2.m3218r(c8695r, "request");
            c8695r2.m3218r(m1612h(), "user");
            C8695r m1615e = m1615e();
            if (m1615e != null) {
                c8695r2.m3218r(m1615e, "ext");
            }
            return this.f19380r.m1428b(f19359C, this.f19368f, c8695r2);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: l */
    public final InterfaceC9891a<C8695r> m1608l() throws IllegalStateException {
        String str;
        if (this.f19366d != null) {
            HashMap hashMap = new HashMap(2);
            AbstractC8692o m3213w = this.f19375m.m3213w(FacebookAdapter.KEY_ID);
            String str2 = "";
            if (m3213w == null) {
                str = "";
            } else {
                str = m3213w.mo3202p();
            }
            hashMap.put(AdColonyAdapterUtils.KEY_APP_ID, str);
            C8695r m1616d = m1616d(false);
            C9818j0.m1500b().getClass();
            if (C9818j0.m1498d()) {
                AbstractC8692o m3213w2 = m1616d.m3213w("ifa");
                if (m3213w2 != null) {
                    str2 = m3213w2.mo3202p();
                }
                hashMap.put("ifa", str2);
            }
            return this.f19365c.reportNew(f19359C, this.f19366d, hashMap);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: m */
    public final C9897d m1607m(LinkedList linkedList) {
        String str;
        if (this.f19373k != null) {
            if (!linkedList.isEmpty()) {
                C8695r c8695r = new C8695r();
                c8695r.m3218r(m1616d(false), "device");
                c8695r.m3218r(this.f19375m, "app");
                C8695r c8695r2 = new C8695r();
                C8690m c8690m = new C8690m(linkedList.size());
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    CacheBust cacheBust = (CacheBust) it.next();
                    for (int i = 0; i < cacheBust.f19767d.length; i++) {
                        C8695r c8695r3 = new C8695r();
                        if (cacheBust.f19766c == 1) {
                            str = FirebaseAnalytics.Param.CAMPAIGN;
                        } else {
                            str = "creative";
                        }
                        c8695r3.m3215u("target", str);
                        c8695r3.m3215u(FacebookAdapter.KEY_ID, cacheBust.m1465a());
                        c8695r3.m3215u("event_id", cacheBust.f19767d[i]);
                        c8690m.m3224r(c8695r3);
                    }
                }
                if (c8690m.size() > 0) {
                    c8695r2.m3218r(c8690m, "cache_bust");
                }
                c8695r.m3218r(c8695r2, "request");
                return this.f19380r.m1428b(f19359C, this.f19373k, c8695r);
            }
            throw new IllegalArgumentException("Cannot send analytics when bust and session data is empty");
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: n */
    public final C9897d m1606n(@NonNull C8690m c8690m) {
        if (this.f19373k != null) {
            C8695r c8695r = new C8695r();
            c8695r.m3218r(m1616d(false), "device");
            c8695r.m3218r(this.f19375m, "app");
            C8695r c8695r2 = new C8695r();
            c8695r2.m3218r(c8690m, "session_events");
            c8695r.m3218r(c8695r2, "request");
            return this.f19380r.m1428b(f19359C, this.f19373k, c8695r);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }
}
