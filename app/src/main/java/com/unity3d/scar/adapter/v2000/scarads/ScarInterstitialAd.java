package com.unity3d.scar.adapter.v2000.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.signals.QueryInfoMetadata;

/* loaded from: classes3.dex */
public class ScarInterstitialAd extends ScarAdBase<InterstitialAd> {
    public ScarInterstitialAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        this.f18096e = new ScarInterstitialAdListener(iScarInterstitialAdListenerWrapper, this);
    }

    @Override // com.unity3d.scar.adapter.v2000.scarads.ScarAdBase
    /* renamed from: a */
    public final void mo2532a(AdRequest adRequest) {
        InterstitialAd.load(this.f18093b, this.f18094c.getAdUnitId(), adRequest, ((ScarInterstitialAdListener) this.f18096e).getAdLoadListener());
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void show(Activity activity) {
        T t = this.f18092a;
        if (t != 0) {
            ((InterstitialAd) t).show(activity);
            return;
        }
        this.f18097f.handleError(GMAAdsError.AdNotLoadedError(this.f18094c));
    }
}
