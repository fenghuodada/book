package com.applovin.impl.sdk.p028a;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.applovin.impl.sdk.a.e */
/* loaded from: classes.dex */
public class C3050e extends AbstractC3040b {
    public C3050e(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.sdk.p028a.AbstractC3040b
    @Nullable
    /* renamed from: a */
    public AdSessionConfiguration mo8046a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f7568c.m6854b(this.f7569d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.p028a.AbstractC3040b
    @Nullable
    /* renamed from: a */
    public AdSessionContext mo8044a(@Nullable WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f7567b.m7428al().m8048d(), this.f7567b.m7428al().m8047e(), this.f7566a.getOpenMeasurementVerificationScriptResources(), this.f7566a.getOpenMeasurementContentUrl(), this.f7566a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f7568c.m6854b(this.f7569d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
