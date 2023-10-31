package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C2746b;
import com.applovin.impl.adview.activity.p010b.AbstractC2688a;
import com.applovin.impl.sdk.network.C3262h;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p029ad.C3077c;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p029ad.C3086f;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.p032d.C3119a;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3154j;
import com.applovin.impl.sdk.p033e.C3155k;
import com.applovin.impl.sdk.p033e.C3156l;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3169p;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService {

    /* renamed from: a */
    private final C3214m f7497a;

    /* renamed from: b */
    private final C3349v f7498b;

    /* renamed from: d */
    private final Map<C3079d, C3031b> f7500d;

    /* renamed from: c */
    private final Handler f7499c = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final Object f7501e = new Object();

    /* renamed from: f */
    private final Map<String, String> f7502f = new HashMap();

    /* renamed from: g */
    private final AtomicReference<JSONObject> f7503g = new AtomicReference<>();

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$a */
    /* loaded from: classes.dex */
    public class C3030a implements AppLovinAdLoadListener {

        /* renamed from: b */
        private final C3031b f7513b;

        private C3030a(C3031b c3031b) {
            this.f7513b = c3031b;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            HashSet hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            C3079d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof C3086f)) {
                AppLovinAdServiceImpl.this.f7497a.m7462Z().m7819a(appLovinAdImpl);
                appLovinAd = new C3086f(adZone, AppLovinAdServiceImpl.this.f7497a);
            }
            synchronized (this.f7513b.f7514a) {
                hashSet = new HashSet(this.f7513b.f7516c);
                this.f7513b.f7516c.clear();
                this.f7513b.f7515b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.m8097a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            HashSet hashSet;
            synchronized (this.f7513b.f7514a) {
                hashSet = new HashSet(this.f7513b.f7516c);
                this.f7513b.f7516c.clear();
                this.f7513b.f7515b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.m8111a(i, (AppLovinAdLoadListener) it.next());
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$b */
    /* loaded from: classes.dex */
    public static class C3031b {

        /* renamed from: a */
        final Object f7514a;

        /* renamed from: b */
        boolean f7515b;

        /* renamed from: c */
        final Collection<AppLovinAdLoadListener> f7516c;

        private C3031b() {
            this.f7514a = new Object();
            this.f7516c = new HashSet();
        }

        @NonNull
        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f7515b + ", pendingAdListeners=" + this.f7516c + '}';
        }
    }

    public AppLovinAdServiceImpl(C3214m c3214m) {
        this.f7497a = c3214m;
        this.f7498b = c3214m.m7487A();
        HashMap hashMap = new HashMap(5);
        this.f7500d = hashMap;
        hashMap.put(C3079d.m7980g(), new C3031b());
        hashMap.put(C3079d.m7979h(), new C3031b());
        hashMap.put(C3079d.m7978i(), new C3031b());
        hashMap.put(C3079d.m7977j(), new C3031b());
        hashMap.put(C3079d.m7976k(), new C3031b());
    }

    @Nullable
    /* renamed from: a */
    private Uri m8107a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable unused) {
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f7497a.m7487A();
                m7487A.m6851d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                return null;
            }
            return null;
        }
    }

    /* renamed from: a */
    private C3031b m8102a(C3079d c3079d) {
        C3031b c3031b;
        synchronized (this.f7501e) {
            c3031b = this.f7500d.get(c3079d);
            if (c3031b == null) {
                c3031b = new C3031b();
                this.f7500d.put(c3079d, c3031b);
            }
        }
        return c3031b;
    }

    /* renamed from: a */
    private String m8095a(String str, long j, int i, String str2, boolean z) {
        try {
            if (StringUtils.isValidString(str)) {
                return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString((i < 0 || i > 100) ? 0 : 0)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
            }
            return null;
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f7498b;
                c3349v.m6854b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            return null;
        }
    }

    /* renamed from: a */
    private String m8094a(String str, long j, long j2, List<Long> list, boolean z, int i) {
        if (StringUtils.isValidString(str)) {
            Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
            if (list != null && list.size() > 0) {
                appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
            }
            if (i != C3195h.f8328a) {
                appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
                appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(C3195h.m7543a(i)));
            }
            return appendQueryParameter.build().toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8111a(final int i, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7499c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.failedToReceiveAd(i);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m8110a(Uri uri, AbstractC3080e abstractC3080e, AppLovinAdView appLovinAdView, C2746b c2746b) {
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.f7497a)) {
            C3298j.m6953c(c2746b.m9008g(), abstractC3080e, appLovinAdView);
        }
        c2746b.m8992o();
    }

    /* renamed from: a */
    private void m8109a(Uri uri, AbstractC3080e abstractC3080e, @Nullable AppLovinAdView appLovinAdView, @Nullable C2746b c2746b, Context context, C3214m c3214m) {
        if (uri == null || !StringUtils.isValidString(uri.getQuery())) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6850e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
                return;
            }
            return;
        }
        Uri m8107a = m8107a(uri, "primaryUrl");
        List<Uri> m8093b = m8093b(uri, "primaryTrackingUrl");
        Uri m8107a2 = m8107a(uri, "fallbackUrl");
        List<Uri> m8093b2 = m8093b(uri, "fallbackTrackingUrl");
        if (m8107a == null && m8107a2 == null) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6850e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                return;
            }
            return;
        }
        if (!m8106a(m8107a, "primary", m8093b, abstractC3080e, appLovinAdView, c2746b, context, c3214m)) {
            m8106a(m8107a2, "backup", m8093b2, abstractC3080e, appLovinAdView, c2746b, context, c3214m);
        }
        if (c2746b != null) {
            c2746b.m8992o();
        }
    }

    /* renamed from: a */
    private void m8108a(Uri uri, AbstractC3080e abstractC3080e, C2746b c2746b, final AbstractC2688a abstractC2688a) {
        if (C3349v.m6861a(this.f7497a)) {
            C3349v c3349v = this.f7498b;
            c3349v.m6855b("AppLovinAdService", "Forwarding click " + uri);
        }
        abstractC3080e.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f7497a.m7396p().getExtraParameters().get("close_ad_on_forwarding_click_scheme");
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (abstractC2688a != null) {
                this.f7499c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (abstractC2688a != null) {
                            if (C3349v.m6861a(AppLovinAdServiceImpl.this.f7497a)) {
                                AppLovinAdServiceImpl.this.f7498b.m6855b("AppLovinAdService", "Dismissing ad after forwarding click");
                            }
                            abstractC2688a.mo9052h();
                        }
                    }
                });
            } else if (c2746b == null || Utils.isBML(abstractC3080e.getSize())) {
            } else {
                if (C3349v.m6861a(this.f7497a)) {
                    this.f7498b.m6855b("AppLovinAdService", "Closing ad after forwarding click");
                }
                c2746b.m8998l();
            }
        }
    }

    /* renamed from: a */
    private void m8101a(C3079d c3079d, C3030a c3030a) {
        AppLovinAdImpl m7818a = this.f7497a.m7462Z().m7818a(c3079d);
        if (m7818a == null) {
            m8098a(new C3155k(c3079d, c3030a, this.f7497a));
            return;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f7498b;
            c3349v.m6855b("AppLovinAdService", "Using pre-loaded ad: " + m7818a + " for " + c3079d);
        }
        c3030a.adReceived(m7818a);
    }

    /* renamed from: a */
    private void m8100a(C3079d c3079d, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (c3079d == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (C3349v.m6862a()) {
            C3349v m7487A = this.f7497a.m7487A();
            m7487A.m6855b("AppLovinAdService", "Loading next ad of zone {" + c3079d + "}...");
        }
        C3031b m8102a = m8102a(c3079d);
        synchronized (m8102a.f7514a) {
            m8102a.f7516c.add(appLovinAdLoadListener);
            if (!m8102a.f7515b) {
                m8102a.f7515b = true;
                m8101a(c3079d, new C3030a(m8102a));
            } else if (C3349v.m6862a()) {
                this.f7498b.m6855b("AppLovinAdService", "Already waiting on an ad load...");
            }
        }
    }

    /* renamed from: a */
    private void m8099a(C3119a c3119a) {
        if (StringUtils.isValidString(c3119a.m7761a())) {
            this.f7497a.m7467U().m7253a(C3262h.m7216o().m7205c(c3119a.m7761a()).m7201d(StringUtils.isValidString(c3119a.m7760b()) ? c3119a.m7760b() : null).m7208b(c3119a.m7759c()).m7211a(false).m7203c(c3119a.m7758d()).m7215a());
        } else if (C3349v.m6862a()) {
            this.f7498b.m6851d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    /* renamed from: a */
    private void m8098a(AbstractRunnableC3131a abstractRunnableC3131a) {
        if (!this.f7497a.m7411d() && C3349v.m6862a()) {
            C3349v.m6847h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f7497a.m7461a();
        this.f7497a.m7469S().m7620a(abstractRunnableC3131a, C3163o.EnumC3165a.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8097a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7499c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m8106a(Uri uri, String str, List<Uri> list, AbstractC3080e abstractC3080e, @Nullable AppLovinAdView appLovinAdView, @Nullable C2746b c2746b, Context context, C3214m c3214m) {
        if (C3349v.m6862a()) {
            C3349v m7487A = c3214m.m7487A();
            m7487A.m6855b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean openUri = Utils.openUri(context, uri, c3214m);
        boolean m6862a = C3349v.m6862a();
        if (openUri) {
            if (m6862a) {
                C3349v m7487A2 = c3214m.m7487A();
                m7487A2.m6855b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            for (Uri uri2 : list) {
                c3214m.m7464X().dispatchPostbackAsync(uri2.toString(), null);
            }
            if (c2746b != null) {
                C3298j.m6953c(c2746b.m9008g(), abstractC3080e, appLovinAdView);
            }
        } else if (m6862a) {
            c3214m.m7487A().m6850e("AppLovinAdService", "URL failed to open");
        }
        return openUri;
    }

    /* renamed from: a */
    private boolean m8096a(String str) {
        String str2 = this.f7497a.m7396p().getExtraParameters().get("forwarding_click_scheme");
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    /* renamed from: b */
    private List<Uri> m8093b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        for (String str2 : queryParameters) {
            try {
                arrayList.add(Uri.parse(str2));
            } catch (Throwable unused) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = this.f7497a.m7487A();
                    m7487A.m6851d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
            }
        }
        return arrayList;
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f7502f) {
            this.f7502f.putAll(map);
        }
    }

    public AppLovinAd dequeueAd(C3079d c3079d) {
        AppLovinAdImpl m7817b = this.f7497a.m7462Z().m7817b(c3079d);
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f7498b;
            c3349v.m6855b("AppLovinAdService", "Dequeued ad: " + m7817b + " for zone: " + c3079d + "...");
        }
        return m7817b;
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.f7503g.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        HashMap hashMap;
        synchronized (this.f7502f) {
            hashMap = new HashMap(this.f7502f);
            this.f7502f.clear();
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String m7150a = this.f7497a.m7466V().m7150a();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return m7150a;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        m8100a(C3079d.m7990a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f7498b;
            c3349v.m6855b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        m8100a(C3079d.m7989a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        StringBuilder sb;
        AbstractRunnableC3131a c3169p;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinAdService", "Invalid ad token specified");
            }
            m8111a(-8, appLovinAdLoadListener);
            return;
        }
        C3077c c3077c = new C3077c(trim, this.f7497a);
        if (c3077c.m7994b() == C3077c.EnumC3078a.REGULAR) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f7498b;
                c3349v.m6855b("AppLovinAdService", "Loading next ad for token: " + c3077c);
            }
            c3169p = new C3156l(c3077c, appLovinAdLoadListener, this.f7497a);
        } else if (c3077c.m7994b() != C3077c.EnumC3078a.AD_RESPONSE_JSON) {
            if (C3349v.m6862a()) {
                sb = new StringBuilder("Invalid ad token specified: ");
                sb.append(c3077c);
                C3349v.m6846i("AppLovinAdService", sb.toString());
            }
            appLovinAdLoadListener.failedToReceiveAd(-8);
            return;
        } else {
            JSONObject m7992d = c3077c.m7992d();
            if (m7992d == null) {
                if (C3349v.m6862a()) {
                    sb = new StringBuilder("Unable to retrieve ad response JSON from token: ");
                    sb.append(c3077c);
                    C3349v.m6846i("AppLovinAdService", sb.toString());
                }
                appLovinAdLoadListener.failedToReceiveAd(-8);
                return;
            }
            C3295h.m6999f(m7992d, this.f7497a);
            C3295h.m7003d(m7992d, this.f7497a);
            C3295h.m7004c(m7992d, this.f7497a);
            C3295h.m7001e(m7992d, this.f7497a);
            C3190f.m7557a(this.f7497a);
            if (JsonUtils.getJSONArray(m7992d, "ads", new JSONArray()).length() <= 0) {
                if (C3349v.m6862a()) {
                    C3349v c3349v2 = this.f7498b;
                    c3349v2.m6850e("AppLovinAdService", "No ad returned from the server for token: " + c3077c);
                }
                appLovinAdLoadListener.failedToReceiveAd(204);
                return;
            }
            if (C3349v.m6862a()) {
                C3349v c3349v3 = this.f7498b;
                c3349v3.m6855b("AppLovinAdService", "Rendering ad for token: " + c3077c);
            }
            c3169p = new C3169p(m7992d, Utils.getZone(m7992d, this.f7497a), EnumC3076b.DECODED_AD_TOKEN_JSON, appLovinAdLoadListener, this.f7497a);
        }
        m8098a(c3169p);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f7498b;
            c3349v.m6855b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        m8100a(C3079d.m7988a(str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (removeTrimmedEmptyStrings == null || removeTrimmedEmptyStrings.isEmpty()) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinAdService", "No zones were provided");
            }
            m8111a(-7, appLovinAdLoadListener);
            return;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f7498b;
            c3349v.m6855b("AppLovinAdService", "Loading next ad for zones: " + removeTrimmedEmptyStrings);
        }
        m8098a(new C3154j(removeTrimmedEmptyStrings, appLovinAdLoadListener, this.f7497a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f7498b;
            c3349v.m6855b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        m8100a(C3079d.m7985b(str), appLovinAdLoadListener);
    }

    public void maybeSubmitPersistentPostbacks(List<C3119a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C3119a c3119a : list) {
            m8099a(c3119a);
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f7503g.set(jSONObject);
    }

    @NonNull
    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f7500d + '}';
    }

    public void trackAndLaunchClick(AbstractC3080e abstractC3080e, AppLovinAdView appLovinAdView, C2746b c2746b, Uri uri, PointF pointF, boolean z) {
        if (abstractC3080e == null) {
            if (C3349v.m6862a()) {
                this.f7498b.m6850e("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (C3349v.m6862a()) {
            this.f7498b.m6855b("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC3080e.m7945a(pointF, z));
        if (appLovinAdView == null || uri == null) {
            if (C3349v.m6862a()) {
                this.f7498b.m6850e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (m8096a(uri.getScheme())) {
            m8108a(uri, abstractC3080e, c2746b, (AbstractC2688a) null);
        } else if (Utils.isDeepLinkPlusUrl(uri)) {
            m8109a(uri, abstractC3080e, appLovinAdView, c2746b, appLovinAdView.getContext(), this.f7497a);
        } else {
            m8110a(uri, abstractC3080e, appLovinAdView, c2746b);
        }
    }

    public void trackAndLaunchVideoClick(AbstractC3080e abstractC3080e, Uri uri, PointF pointF, AbstractC2688a abstractC2688a, Context context) {
        if (abstractC3080e == null) {
            if (C3349v.m6862a()) {
                this.f7498b.m6850e("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (C3349v.m6862a()) {
            this.f7498b.m6855b("AppLovinAdService", "Tracking VIDEO click on an ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC3080e.m7946a(pointF));
        if (m8096a(uri.getScheme())) {
            m8108a(uri, abstractC3080e, (C2746b) null, abstractC2688a);
        } else if (Utils.isDeepLinkPlusUrl(uri)) {
            m8109a(uri, abstractC3080e, (AppLovinAdView) null, (C2746b) null, context, this.f7497a);
        } else {
            Utils.openUri(context, uri, this.f7497a);
        }
    }

    public void trackAppKilled(AbstractC3080e abstractC3080e) {
        if (abstractC3080e == null) {
            if (C3349v.m6862a()) {
                this.f7498b.m6850e("AppLovinAdService", "Unable to track app killed. No ad specified");
                return;
            }
            return;
        }
        if (C3349v.m6862a()) {
            this.f7498b.m6855b("AppLovinAdService", "Tracking app killed during ad...");
        }
        List<C3119a> m7911as = abstractC3080e.m7911as();
        if (m7911as != null && !m7911as.isEmpty()) {
            for (C3119a c3119a : m7911as) {
                m8099a(new C3119a(c3119a.m7761a(), c3119a.m7760b()));
            }
        } else if (C3349v.m6862a()) {
            C3349v c3349v = this.f7498b;
            c3349v.m6851d("AppLovinAdService", "Unable to track app killed during AD #" + abstractC3080e.getAdIdNumber() + ". Missing app killed tracking URL.");
        }
    }

    public void trackFullScreenAdClosed(AbstractC3080e abstractC3080e, long j, List<Long> list, long j2, boolean z, int i) {
        boolean m6862a = C3349v.m6862a();
        if (abstractC3080e == null) {
            if (m6862a) {
                this.f7498b.m6850e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (m6862a) {
            this.f7498b.m6855b("AppLovinAdService", "Tracking ad closed...");
        }
        List<C3119a> m7912ar = abstractC3080e.m7912ar();
        if (m7912ar == null || m7912ar.isEmpty()) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f7498b;
                c3349v.m6851d("AppLovinAdService", "Unable to track ad closed for AD #" + abstractC3080e.getAdIdNumber() + ". Missing ad close tracking URL." + abstractC3080e.getAdIdNumber());
                return;
            }
            return;
        }
        for (C3119a c3119a : m7912ar) {
            String m8094a = m8094a(c3119a.m7761a(), j, j2, list, z, i);
            String m8094a2 = m8094a(c3119a.m7760b(), j, j2, list, z, i);
            if (StringUtils.isValidString(m8094a)) {
                m8099a(new C3119a(m8094a, m8094a2));
            } else if (C3349v.m6862a()) {
                C3349v c3349v2 = this.f7498b;
                c3349v2.m6850e("AppLovinAdService", "Failed to parse url: " + c3119a.m7761a());
            }
        }
    }

    public void trackImpression(AbstractC3080e abstractC3080e) {
        if (abstractC3080e == null) {
            if (C3349v.m6862a()) {
                this.f7498b.m6850e("AppLovinAdService", "Unable to track impression click. No ad specified");
                return;
            }
            return;
        }
        if (C3349v.m6862a()) {
            this.f7498b.m6855b("AppLovinAdService", "Tracking impression on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC3080e.mo7910at());
    }

    public void trackVideoEnd(AbstractC3080e abstractC3080e, long j, int i, boolean z) {
        boolean m6862a = C3349v.m6862a();
        if (abstractC3080e == null) {
            if (m6862a) {
                this.f7498b.m6850e("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (m6862a) {
            this.f7498b.m6855b("AppLovinAdService", "Tracking video end on ad...");
        }
        List<C3119a> m7913aq = abstractC3080e.m7913aq();
        if (m7913aq == null || m7913aq.isEmpty()) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f7498b;
                c3349v.m6851d("AppLovinAdService", "Unable to submit persistent postback for AD #" + abstractC3080e.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String l = Long.toString(System.currentTimeMillis());
        for (C3119a c3119a : m7913aq) {
            if (StringUtils.isValidString(c3119a.m7761a())) {
                String m8095a = m8095a(c3119a.m7761a(), j, i, l, z);
                String m8095a2 = m8095a(c3119a.m7760b(), j, i, l, z);
                if (m8095a != null) {
                    m8099a(new C3119a(m8095a, m8095a2));
                } else if (C3349v.m6862a()) {
                    C3349v c3349v2 = this.f7498b;
                    c3349v2.m6850e("AppLovinAdService", "Failed to parse url: " + c3119a.m7761a());
                }
            } else if (C3349v.m6862a()) {
                this.f7498b.m6851d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }
}
