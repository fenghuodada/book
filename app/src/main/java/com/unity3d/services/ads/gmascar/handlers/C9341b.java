package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.core.misc.C9554a;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.b */
/* loaded from: classes3.dex */
public class C9341b extends AbstractC9339a implements IScarInterstitialAdListenerWrapper {
    public C9341b(ScarAdMetadata scarAdMetadata, C9554a<GMAEvent> c9554a) {
        super(scarAdMetadata, c9554a);
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdClicked() {
        this.f18245c.m2435a(GMAEvent.AD_CLICKED, new Object[0]);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.AbstractC9339a, com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        if (!this.f18244b.m2009a()) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdFailedToShow(int i, String str) {
        this.f18245c.m2435a(GMAEvent.INTERSTITIAL_SHOW_ERROR, this.f18243a.getPlacementId(), this.f18243a.getQueryId(), str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdImpression() {
        this.f18245c.m2435a(GMAEvent.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdLeftApplication() {
        this.f18245c.m2435a(GMAEvent.AD_LEFT_APPLICATION, new Object[0]);
    }
}
