package com.unity3d.scar.adapter.v1950.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.signals.QueryInfoMetadata;

/* loaded from: classes3.dex */
public class ScarInterstitialAd extends ScarAdBase {

    /* renamed from: e */
    public final InterstitialAd f18064e;

    /* renamed from: f */
    public final ScarInterstitialAdListener f18065f;

    public ScarInterstitialAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        InterstitialAd interstitialAd = new InterstitialAd(this.f18060a);
        this.f18064e = interstitialAd;
        interstitialAd.setAdUnitId(this.f18061b.getAdUnitId());
        this.f18065f = new ScarInterstitialAdListener(interstitialAd, iScarInterstitialAdListenerWrapper);
    }

    @Override // com.unity3d.scar.adapter.v1950.scarads.ScarAdBase
    public void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest) {
        ScarInterstitialAdListener scarInterstitialAdListener = this.f18065f;
        AdListener adListener = scarInterstitialAdListener.getAdListener();
        InterstitialAd interstitialAd = this.f18064e;
        interstitialAd.setAdListener(adListener);
        scarInterstitialAdListener.setLoadListener(iScarLoadListener);
        interstitialAd.loadAd(adRequest);
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void show(Activity activity) {
        InterstitialAd interstitialAd = this.f18064e;
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
            return;
        }
        this.f18063d.handleError(GMAAdsError.AdNotLoadedError(this.f18061b));
    }
}
