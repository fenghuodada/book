package com.applovin.impl.mediation.p011a;

import androidx.annotation.Nullable;
import com.applovin.impl.mediation.C2980g;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.d */
/* loaded from: classes.dex */
public class C2826d extends AbstractC2827e {

    /* renamed from: c */
    private final AtomicBoolean f6788c;

    /* renamed from: d */
    private final AtomicBoolean f6789d;

    private C2826d(C2826d c2826d, C2980g c2980g) {
        super(c2826d.m8735T(), c2826d.m8745J(), c2826d.m8746I(), c2980g, c2826d.f6791b);
        this.f6788c = new AtomicBoolean();
        this.f6789d = new AtomicBoolean();
    }

    public C2826d(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C3214m c3214m) {
        super(map, jSONObject, jSONObject2, null, c3214m);
        this.f6788c = new AtomicBoolean();
        this.f6789d = new AtomicBoolean();
    }

    @Override // com.applovin.impl.mediation.p011a.AbstractC2823a
    /* renamed from: a */
    public AbstractC2823a mo8759a(C2980g c2980g) {
        return new C2826d(this, c2980g);
    }

    /* renamed from: a */
    public void m8758a(MaxNativeAdView maxNativeAdView) {
        ((AbstractC2823a) this).f6781a.m8159a(maxNativeAdView);
    }

    @Override // com.applovin.impl.mediation.p011a.AbstractC2823a, com.applovin.mediation.MaxAd
    @Nullable
    public MaxNativeAd getNativeAd() {
        return ((AbstractC2823a) this).f6781a.m8152b();
    }

    @Nullable
    /* renamed from: u */
    public MaxNativeAdView m8757u() {
        return ((AbstractC2823a) this).f6781a.m8147c();
    }

    /* renamed from: v */
    public String m8756v() {
        return BundleUtils.getString("template", "", m8734U());
    }

    /* renamed from: w */
    public boolean m8755w() {
        return ((AbstractC2823a) this).f6781a == null;
    }

    /* renamed from: x */
    public AtomicBoolean m8754x() {
        return this.f6788c;
    }

    /* renamed from: y */
    public AtomicBoolean m8753y() {
        return this.f6789d;
    }
}
