package com.applovin.impl.sdk.p029ad;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.AppLovinAdImpl */
/* loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd {

    /* renamed from: a */
    private C3079d f7639a;

    /* renamed from: b */
    private Bundle f7640b;

    /* renamed from: c */
    private C3086f f7641c;
    protected final EnumC3076b source;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, C3214m c3214m) {
        super(jSONObject, jSONObject2, c3214m);
        this.f7640b = new Bundle();
        this.source = enumC3076b;
    }

    public boolean equals(Object obj) {
        AppLovinAd m7870b;
        if ((obj instanceof C3086f) && (m7870b = ((C3086f) obj).m7870b()) != null) {
            obj = m7870b;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str, String str2) {
        return JsonUtils.getString(getJsonObjectFromAdObject(Utils.KEY_AD_VALUES, new JSONObject()), str, str2);
    }

    public C3079d getAdZone() {
        C3079d c3079d = this.f7639a;
        if (c3079d != null) {
            if (c3079d.m7984c() != null && this.f7639a.m7983d() != null) {
                return this.f7639a;
            }
            if (getSize() == null && getType() == null) {
                return this.f7639a;
            }
        }
        C3079d m7989a = C3079d.m7989a(getSize(), getType(), getStringFromFullResponse("zone_id", null));
        this.f7639a = m7989a;
        return m7989a;
    }

    public C3086f getDummyAd() {
        return this.f7641c;
    }

    public Bundle getMAXAdValues() {
        return this.f7640b;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    public EnumC3076b getSource() {
        return this.source;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().m7982e()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        if (C3349v.m6862a()) {
            this.sdk.m7487A().m6850e("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(C3086f c3086f) {
        this.f7641c = c3086f;
    }

    public void setHasShown(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f7640b);
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", Boolean.FALSE);
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", source=" + getSource() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
