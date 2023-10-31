package com.unity3d.scar.adapter.v2000.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.signals.QueryInfoMetadata;

/* loaded from: classes3.dex */
public class ScarRewardedAd extends ScarAdBase<RewardedAd> {
    public ScarRewardedAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        this.f18096e = new ScarRewardedAdListener(iScarRewardedAdListenerWrapper, this);
    }

    @Override // com.unity3d.scar.adapter.v2000.scarads.ScarAdBase
    /* renamed from: a */
    public final void mo2532a(AdRequest adRequest) {
        RewardedAd.load(this.f18093b, this.f18094c.getAdUnitId(), adRequest, ((ScarRewardedAdListener) this.f18096e).getAdLoadListener());
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void show(Activity activity) {
        T t = this.f18092a;
        if (t != 0) {
            ((RewardedAd) t).show(activity, ((ScarRewardedAdListener) this.f18096e).getOnUserEarnedRewardListener());
            return;
        }
        this.f18097f.handleError(GMAAdsError.AdNotLoadedError(this.f18094c));
    }
}
