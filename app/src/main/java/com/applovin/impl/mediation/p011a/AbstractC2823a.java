package com.applovin.impl.mediation.p011a;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.mediation.C2980g;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC2823a extends C2828f implements MaxAd {

    /* renamed from: a */
    protected C2980g f6781a;

    /* renamed from: c */
    private final AtomicBoolean f6782c;

    /* renamed from: d */
    private MaxAdWaterfallInfo f6783d;

    /* renamed from: e */
    private String f6784e;

    public AbstractC2823a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, @Nullable C2980g c2980g, C3214m c3214m) {
        super(map, jSONObject, jSONObject2, c3214m);
        this.f6782c = new AtomicBoolean();
        this.f6781a = c2980g;
    }

    /* renamed from: a */
    public static AbstractC2823a m8804a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C3214m c3214m) {
        String string = JsonUtils.getString(jSONObject2, FirebaseAnalytics.Param.AD_FORMAT, null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        if (formatFromString.isAdViewAd()) {
            return new C2824b(map, jSONObject, jSONObject2, c3214m);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new C2826d(map, jSONObject, jSONObject2, c3214m);
        }
        if (formatFromString.isFullscreenAd()) {
            return new C2825c(map, jSONObject, jSONObject2, c3214m);
        }
        throw new IllegalArgumentException(C0552c.m12192b("Unsupported ad format: ", string));
    }

    /* renamed from: u */
    private long m8783u() {
        return m8717b("load_started_time_ms", 0L);
    }

    /* renamed from: a */
    public abstract AbstractC2823a mo8759a(C2980g c2980g);

    /* renamed from: a */
    public String m8808a() {
        return this.f6784e;
    }

    /* renamed from: a */
    public void m8807a(@Nullable Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("creative_id") && !m8719b("creative_id")) {
                m8710c("creative_id", BundleUtils.getString("creative_id", bundle));
            }
            if (!bundle.containsKey("ad_width") || m8719b("ad_width") || !bundle.containsKey("ad_height") || m8719b("ad_height")) {
                return;
            }
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            m8712c("ad_width", i);
            m8712c("ad_height", i2);
        }
    }

    /* renamed from: a */
    public void m8806a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f6783d = maxAdWaterfallInfo;
    }

    /* renamed from: a */
    public void m8805a(String str) {
        this.f6784e = str;
    }

    /* renamed from: a */
    public void m8803a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject m8802b = m8802b();
        JsonUtils.putAll(m8802b, jSONObject);
        m8723a(Utils.KEY_AD_VALUES, (Object) m8802b);
    }

    /* renamed from: b */
    public JSONObject m8802b() {
        return m8720a(Utils.KEY_AD_VALUES, new JSONObject());
    }

    /* renamed from: c */
    public JSONObject m8801c() {
        return m8720a("revenue_parameters", new JSONObject());
    }

    /* renamed from: d */
    public String m8800d() {
        return JsonUtils.getString(m8801c(), "revenue_event", "");
    }

    /* renamed from: e */
    public boolean m8799e() {
        C2980g c2980g = this.f6781a;
        return c2980g != null && c2980g.m8141f() && this.f6781a.m8139g();
    }

    /* renamed from: f */
    public String m8798f() {
        return m8722a("event_id", "");
    }

    /* renamed from: g */
    public C2980g m8797g() {
        return this.f6781a;
    }

    @Override // com.applovin.mediation.MaxAd
    @Nullable
    public String getAdReviewCreativeId() {
        return this.f6791b.m7486B().m7711a(m8798f());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject m8802b = m8802b();
        if (m8802b.has(str)) {
            return JsonUtils.getString(m8802b, str, str2);
        }
        Bundle m8734U = m8734U();
        return m8734U.containsKey(str) ? m8734U.getString(str) : m8715b(str, str2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return m8715b("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    @Nullable
    public String getDspId() {
        return m8715b("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    @Nullable
    public String getDspName() {
        return m8715b("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(m8715b(FirebaseAnalytics.Param.AD_FORMAT, m8722a(FirebaseAnalytics.Param.AD_FORMAT, (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    @Nullable
    public MaxNativeAd getNativeAd() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return m8715b("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(m8792l());
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        return JsonUtils.getDouble(m8720a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return JsonUtils.getString(m8720a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int m8718b = m8718b("ad_width", -3);
        int m8718b2 = m8718b("ad_height", -3);
        return (m8718b == -3 || m8718b2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(m8718b, m8718b2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f6783d;
    }

    /* renamed from: h */
    public Bundle m8796h() {
        JSONObject m8720a;
        if (m8719b("credentials")) {
            m8720a = m8720a("credentials", new JSONObject());
        } else {
            m8720a = m8720a("server_parameters", new JSONObject());
            JsonUtils.putString(m8720a, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, m8792l());
        }
        return JsonUtils.toBundle(m8720a);
    }

    /* renamed from: i */
    public String m8795i() {
        return m8715b("bid_response", (String) null);
    }

    /* renamed from: j */
    public long m8794j() {
        return m8717b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, m8734U()));
    }

    /* renamed from: k */
    public boolean m8793k() {
        return m8716b("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    /* renamed from: l */
    public String m8792l() {
        return m8715b("third_party_ad_placement_id", (String) null);
    }

    /* renamed from: m */
    public String m8791m() {
        return m8722a("waterfall_name", "");
    }

    /* renamed from: n */
    public String m8790n() {
        return m8722a("waterfall_test_name", "");
    }

    /* renamed from: o */
    public long m8789o() {
        if (m8783u() > 0) {
            return m8787q() - m8783u();
        }
        return -1L;
    }

    /* renamed from: p */
    public void m8788p() {
        m8711c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: q */
    public long m8787q() {
        return m8717b("load_completed_time_ms", 0L);
    }

    /* renamed from: r */
    public void m8786r() {
        m8711c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: s */
    public AtomicBoolean m8785s() {
        return this.f6782c;
    }

    /* renamed from: t */
    public void m8784t() {
        this.f6781a = null;
        this.f6783d = null;
    }

    @Override // com.applovin.impl.mediation.p011a.C2828f
    @NonNull
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + m8792l() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }
}
