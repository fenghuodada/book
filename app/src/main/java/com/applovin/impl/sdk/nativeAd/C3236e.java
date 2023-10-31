package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.Nullable;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.C3231a;
import com.applovin.impl.sdk.network.C3265i;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.p033e.AbstractC3173r;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.e */
/* loaded from: classes.dex */
public class C3236e extends AbstractRunnableC3131a implements C3231a.InterfaceC3232a, AppLovinAdLoadListener {

    /* renamed from: a */
    private final JSONObject f8472a;

    /* renamed from: c */
    private final JSONObject f8473c;

    /* renamed from: d */
    private final AppLovinNativeAdLoadListener f8474d;

    /* renamed from: e */
    private String f8475e;

    /* renamed from: f */
    private String f8476f;

    /* renamed from: g */
    private String f8477g;

    /* renamed from: h */
    private String f8478h;

    /* renamed from: i */
    private Uri f8479i;

    /* renamed from: j */
    private Uri f8480j;

    /* renamed from: k */
    private Uri f8481k;

    /* renamed from: l */
    private Uri f8482l;
    @Nullable

    /* renamed from: m */
    private C2649a f8483m;
    @Nullable

    /* renamed from: n */
    private Uri f8484n;
    @Nullable

    /* renamed from: o */
    private Uri f8485o;

    /* renamed from: p */
    private final List<String> f8486p;
    @Nullable

    /* renamed from: q */
    private String f8487q;

    /* renamed from: r */
    private final List<C3265i> f8488r;

    /* renamed from: s */
    private final List<C3265i> f8489s;

    /* renamed from: t */
    private final List<C3265i> f8490t;

    /* renamed from: u */
    private final List<C3265i> f8491u;

    public C3236e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C3214m c3214m) {
        super("TaskRenderNativeAd", c3214m);
        this.f8475e = "";
        this.f8476f = "";
        this.f8477g = "";
        this.f8478h = "";
        this.f8479i = null;
        this.f8480j = null;
        this.f8481k = null;
        this.f8482l = null;
        this.f8484n = null;
        this.f8485o = null;
        this.f8486p = new ArrayList();
        this.f8488r = new ArrayList();
        this.f8489s = new ArrayList();
        this.f8490t = new ArrayList();
        this.f8491u = new ArrayList();
        this.f8472a = jSONObject;
        this.f8473c = jSONObject2;
        this.f8474d = appLovinNativeAdLoadListener;
    }

    /* renamed from: a */
    private void m7361a() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f8472a), JsonUtils.shallowCopy(this.f8473c), this.f8192b).setTitle(this.f8475e).setAdvertiser(this.f8476f).setBody(this.f8477g).setCallToAction(this.f8478h).setIconUri(this.f8479i).setMainImageUri(this.f8480j).setPrivacyIconUri(this.f8481k).setVastAd(this.f8483m).setPrivacyDestinationUri(this.f8482l).setClickDestinationUri(this.f8484n).setClickDestinationBackupUri(this.f8485o).setClickTrackingUrls(this.f8486p).setJsTracker(this.f8487q).setImpressionRequests(this.f8488r).setViewableMRC50Requests(this.f8489s).setViewableMRC100Requests(this.f8490t).setViewableVideo50Requests(this.f8491u).build();
        build.getAdEventTracker().m8062b();
        if (C3349v.m6862a()) {
            m7705a("Starting cache task for type: " + build.getType() + "...");
        }
        this.f8192b.m7469S().m7620a(new C3231a(build, this.f8192b, this), C3163o.EnumC3165a.MAIN);
    }

    /* renamed from: a */
    private void m7356a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, ImagesContract.URL, null);
        if (StringUtils.isValidString(string)) {
            this.f8484n = Uri.parse(string);
            if (C3349v.m6862a()) {
                m7705a("Processed click destination URL: " + this.f8484n);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f8485o = Uri.parse(string2);
            if (C3349v.m6862a()) {
                m7705a("Processed click destination backup URL: " + this.f8485o);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            try {
                this.f8486p.addAll(JsonUtils.toList(jSONArray));
                if (C3349v.m6862a()) {
                    m7705a("Processed click tracking URLs: " + this.f8486p);
                }
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    m7704a("Failed to render click tracking URLs", th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7355b() {
        this.f8474d.onNativeAdLoadFailed(-6);
    }

    /* renamed from: b */
    private void m7354b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.e.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3349v.m6862a()) {
                    C3236e.this.m7705a("Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    if (C3349v.m6862a()) {
                        C3236e.this.m7705a("Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().mo8039c();
                    C3236e.this.f8474d.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3236e.this.m7704a("Failed to prepare native ad view components", th);
                    }
                    C3236e.this.m7355b();
                }
            }
        });
    }

    @Override // com.applovin.impl.sdk.nativeAd.C3231a.InterfaceC3232a
    /* renamed from: a */
    public void mo7360a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C3349v.m6862a()) {
            m7705a("Successfully cached and loaded ad");
        }
        m7354b(appLovinNativeAdImpl);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (C3349v.m6862a()) {
            m7705a("VAST ad rendered successfully");
        }
        this.f8483m = (C2649a) appLovinAd;
        m7361a();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        if (C3349v.m6862a()) {
            m7700d("VAST ad failed to render");
        }
        m7361a();
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        String sb4;
        String str2;
        Uri uri;
        String string = JsonUtils.getString(this.f8472a, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f8481k = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f8472a, "privacy_url", null);
        if (!URLUtil.isValidUrl(string2)) {
            string2 = "https://www.applovin.com/privacy/";
        }
        this.f8482l = Uri.parse(string2);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8472a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (C3349v.m6862a()) {
                m7700d("No oRtb response provided: " + this.f8472a);
            }
            m7355b();
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, MediationMetaData.KEY_VERSION, null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (C3349v.m6862a()) {
            m7705a("Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        m7356a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (C3349v.m6862a()) {
                m7700d("Unable to retrieve assets - failing ad load: " + this.f8472a);
            }
            m7355b();
            return;
        }
        String str3 = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject4.has(AppIntroBaseFragmentKt.ARG_TITLE)) {
                this.f8475e = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, AppIntroBaseFragmentKt.ARG_TITLE, (JSONObject) null), "text", null);
                if (C3349v.m6862a()) {
                    sb2 = new StringBuilder("Processed title: ");
                    str = this.f8475e;
                    sb2.append(str);
                }
            } else {
                if (jSONObject4.has("link")) {
                    m7356a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
                } else if (jSONObject4.has("img")) {
                    int i2 = JsonUtils.getInt(jSONObject4, FacebookAdapter.KEY_ID, -1);
                    JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                    int i3 = JsonUtils.getInt(jSONObject5, "type", -1);
                    String string4 = JsonUtils.getString(jSONObject5, ImagesContract.URL, null);
                    if (i3 == 1 || 3 == i2) {
                        this.f8479i = Uri.parse(string4);
                        if (C3349v.m6862a()) {
                            sb2 = new StringBuilder("Processed icon URL: ");
                            uri = this.f8479i;
                            sb2.append(uri);
                        }
                    } else if (i3 == 3 || 2 == i2) {
                        this.f8480j = Uri.parse(string4);
                        if (C3349v.m6862a()) {
                            sb2 = new StringBuilder("Processed main image URL: ");
                            uri = this.f8480j;
                            sb2.append(uri);
                        }
                    } else {
                        if (C3349v.m6862a()) {
                            m7702c("Unrecognized image: " + jSONObject4);
                        }
                        int i4 = JsonUtils.getInt(jSONObject5, "w", -1);
                        int i5 = JsonUtils.getInt(jSONObject5, "h", -1);
                        if (i4 <= 0 || i5 <= 0) {
                            if (C3349v.m6862a()) {
                                sb4 = "Skipping...";
                                m7702c(sb4);
                            }
                        } else if (i4 / i5 > 1.0d) {
                            if (C3349v.m6862a()) {
                                m7705a("Inferring main image from " + i4 + "x" + i5 + "...");
                            }
                            this.f8480j = Uri.parse(string4);
                        } else {
                            if (C3349v.m6862a()) {
                                m7705a("Inferring icon image from " + i4 + "x" + i5 + "...");
                            }
                            this.f8479i = Uri.parse(string4);
                        }
                    }
                } else {
                    if (jSONObject4.has("video")) {
                        str3 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                        if (StringUtils.isValidString(str3)) {
                            if (C3349v.m6862a()) {
                                str2 = "Processed VAST video";
                                m7705a(str2);
                            }
                        } else if (C3349v.m6862a()) {
                            sb3 = new StringBuilder("Ignoring invalid \"vasttag\" for video: ");
                            sb3.append(jSONObject4);
                            sb4 = sb3.toString();
                        }
                    } else if (jSONObject4.has("data")) {
                        int i6 = JsonUtils.getInt(jSONObject4, FacebookAdapter.KEY_ID, -1);
                        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                        int i7 = JsonUtils.getInt(jSONObject6, "type", -1);
                        String string5 = JsonUtils.getString(jSONObject6, "value", null);
                        if (i7 == 1 || i6 == 8) {
                            this.f8476f = string5;
                            if (C3349v.m6862a()) {
                                sb2 = new StringBuilder("Processed advertiser: ");
                                str = this.f8476f;
                                sb2.append(str);
                            }
                        } else if (i7 == 2 || i6 == 4) {
                            this.f8477g = string5;
                            if (C3349v.m6862a()) {
                                sb2 = new StringBuilder("Processed body: ");
                                str = this.f8477g;
                                sb2.append(str);
                            }
                        } else if (i7 == 12 || i6 == 5) {
                            this.f8478h = string5;
                            if (C3349v.m6862a()) {
                                sb2 = new StringBuilder("Processed cta: ");
                                str = this.f8478h;
                                sb2.append(str);
                            }
                        } else if (C3349v.m6862a()) {
                            sb3 = new StringBuilder("Skipping unsupported data: ");
                            sb3.append(jSONObject4);
                            sb4 = sb3.toString();
                        }
                    } else if (C3349v.m6862a()) {
                        m7700d("Unsupported asset object: " + jSONObject4);
                    }
                    m7702c(sb4);
                }
            }
            str2 = sb2.toString();
            m7705a(str2);
        }
        String string6 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string6)) {
            this.f8487q = string6;
            m7705a("Processed jstracker: " + string6);
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i8, null);
                if (objectAtIndex instanceof String) {
                    String str4 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str4)) {
                        this.f8488r.add(new C3265i.C3266a(this.f8192b).mo7186a(str4).mo7169d(false).mo7173c(false).mo7190a());
                        if (C3349v.m6862a()) {
                            m7705a("Processed imptracker URL: " + str4);
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            for (int i9 = 0; i9 < jSONArray3.length(); i9++) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i9, (JSONObject) null);
                int i10 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i11 = JsonUtils.getInt(jSONObject7, FirebaseAnalytics.Param.METHOD, -1);
                String string7 = JsonUtils.getString(jSONObject7, ImagesContract.URL, null);
                if (!TextUtils.isEmpty(string7)) {
                    if (i11 == 1 || i11 == 2) {
                        C3265i mo7190a = new C3265i.C3266a(this.f8192b).mo7186a(string7).mo7169d(false).mo7173c(false).m7161g(i11 == 2).mo7190a();
                        if (i10 == 1) {
                            this.f8488r.add(mo7190a);
                            if (C3349v.m6862a()) {
                                m7705a("Processed impression URL: " + string7);
                            }
                        } else if (i10 == 2) {
                            this.f8489s.add(mo7190a);
                            if (C3349v.m6862a()) {
                                sb = new StringBuilder("Processed viewable MRC50 URL: ");
                                sb.append(string7);
                                m7705a(sb.toString());
                            }
                        } else if (i10 == 3) {
                            this.f8490t.add(mo7190a);
                            if (C3349v.m6862a()) {
                                sb = new StringBuilder("Processed viewable MRC100 URL: ");
                                sb.append(string7);
                                m7705a(sb.toString());
                            }
                        } else {
                            if (i10 == 4) {
                                this.f8491u.add(mo7190a);
                                if (C3349v.m6862a()) {
                                    m7705a("Processed viewable video 50 URL: " + string7);
                                }
                            } else if (C3349v.m6862a()) {
                                m7700d("Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (C3349v.m6862a()) {
                        m7700d("Unsupported method for event tracker: " + jSONObject7);
                    }
                }
            }
        }
        if (!StringUtils.isValidString(str3)) {
            m7361a();
            return;
        }
        if (C3349v.m6862a()) {
            m7705a("Processing VAST video...");
        }
        this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) AbstractC3173r.m7593a(str3, JsonUtils.shallowCopy(this.f8472a), JsonUtils.shallowCopy(this.f8473c), EnumC3076b.UNKNOWN, this, this.f8192b));
    }
}
