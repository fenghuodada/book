package com.applovin.impl.sdk.p029ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.f */
/* loaded from: classes.dex */
public final class C3086f extends AppLovinAdImpl {

    /* renamed from: a */
    private AppLovinAd f7696a;

    /* renamed from: b */
    private final C3079d f7697b;

    public C3086f(C3079d c3079d, C3214m c3214m) {
        super(new JSONObject(), new JSONObject(), EnumC3076b.UNKNOWN, c3214m);
        this.f7697b = c3079d;
    }

    /* renamed from: c */
    private AppLovinAd m7869c() {
        return (AppLovinAd) this.sdk.m7462Z().m7816c(this.f7697b);
    }

    /* renamed from: d */
    private String m7868d() {
        C3079d adZone = getAdZone();
        if (adZone == null || adZone.m7982e()) {
            return null;
        }
        return adZone.m7991a();
    }

    /* renamed from: a */
    public AppLovinAd m7872a() {
        return this.f7696a;
    }

    /* renamed from: a */
    public void m7871a(AppLovinAd appLovinAd) {
        this.f7696a = appLovinAd;
    }

    /* renamed from: b */
    public AppLovinAd m7870b() {
        AppLovinAd appLovinAd = this.f7696a;
        return appLovinAd != null ? appLovinAd : m7869c();
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3086f.class != obj.getClass()) {
            return false;
        }
        AppLovinAd m7870b = m7870b();
        return m7870b != null ? m7870b.equals(obj) : super.equals(obj);
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        AppLovinAd m7870b = m7870b();
        if (m7870b != null) {
            return m7870b.getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public C3079d getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) m7870b();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f7697b;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd m7870b = m7870b();
        if (m7870b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) m7870b).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    @Nullable
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd m7870b = m7870b();
        if (m7870b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) m7870b).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().m7984c();
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public EnumC3076b getSource() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) m7870b();
        return appLovinAdImpl != null ? appLovinAdImpl.getSource() : EnumC3076b.UNKNOWN;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().m7983d();
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f7697b.m7982e()) {
            return null;
        }
        return this.f7697b.m7991a();
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd m7870b = m7870b();
        return m7870b != null ? m7870b.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        AppLovinAd m7870b = m7870b();
        return m7870b != null && m7870b.isVideoAd();
    }

    @Override // com.applovin.impl.sdk.p029ad.AppLovinAdImpl
    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinAd{ #");
        sb.append(getAdIdNumber());
        sb.append(", adType=");
        sb.append(getType());
        sb.append(", adSize=");
        sb.append(getSize());
        sb.append(", zoneId='");
        return C0484a.m12392a(sb, m7868d(), "'}");
    }
}
