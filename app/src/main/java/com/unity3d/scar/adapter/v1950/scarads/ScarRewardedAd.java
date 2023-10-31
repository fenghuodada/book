package com.unity3d.scar.adapter.v1950.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.signals.QueryInfoMetadata;

/* loaded from: classes3.dex */
public class ScarRewardedAd extends ScarAdBase {

    /* renamed from: e */
    public final RewardedAd f18069e;

    /* renamed from: f */
    public final ScarRewardedAdListener f18070f;

    public ScarRewardedAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        RewardedAd rewardedAd = new RewardedAd(this.f18060a, this.f18061b.getAdUnitId());
        this.f18069e = rewardedAd;
        this.f18070f = new ScarRewardedAdListener(rewardedAd, iScarRewardedAdListenerWrapper);
    }

    @Override // com.unity3d.scar.adapter.v1950.scarads.ScarAdBase
    public void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest) {
        ScarRewardedAdListener scarRewardedAdListener = this.f18070f;
        scarRewardedAdListener.setLoadListener(iScarLoadListener);
        this.f18069e.loadAd(adRequest, scarRewardedAdListener.getRewardedAdLoadCallback());
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void show(Activity activity) {
        RewardedAd rewardedAd = this.f18069e;
        if (rewardedAd.isLoaded()) {
            rewardedAd.show(activity, this.f18070f.getRewardedAdCallback());
            return;
        }
        this.f18063d.handleError(GMAAdsError.AdNotLoadedError(this.f18061b));
    }
}
