package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.core.misc.C9554a;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.c */
/* loaded from: classes3.dex */
public class C9342c extends AbstractC9339a implements IScarRewardedAdListenerWrapper {

    /* renamed from: d */
    private boolean f18247d;

    public C9342c(ScarAdMetadata scarAdMetadata, C9554a<GMAEvent> c9554a) {
        super(scarAdMetadata, c9554a);
        this.f18247d = false;
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.AbstractC9339a, com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        if (!this.f18247d) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdFailedToShow(int i, String str) {
        this.f18245c.m2435a(GMAEvent.REWARDED_SHOW_ERROR, this.f18243a.getPlacementId(), this.f18243a.getQueryId(), str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdImpression() {
        this.f18245c.m2435a(GMAEvent.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onUserEarnedReward() {
        this.f18247d = true;
        this.f18245c.m2435a(GMAEvent.AD_EARNED_REWARD, new Object[0]);
    }
}
