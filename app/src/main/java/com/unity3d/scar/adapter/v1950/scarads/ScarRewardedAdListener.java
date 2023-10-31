package com.unity3d.scar.adapter.v1950.scarads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

/* loaded from: classes3.dex */
public class ScarRewardedAdListener {

    /* renamed from: a */
    public final IScarRewardedAdListenerWrapper f18071a;

    /* renamed from: b */
    public IScarLoadListener f18072b;

    /* renamed from: c */
    public final C9279a f18073c = new C9279a();

    /* renamed from: d */
    public final C9280b f18074d = new C9280b();

    /* renamed from: com.unity3d.scar.adapter.v1950.scarads.ScarRewardedAdListener$a */
    /* loaded from: classes3.dex */
    public class C9279a extends RewardedAdLoadCallback {
    }

    /* renamed from: com.unity3d.scar.adapter.v1950.scarads.ScarRewardedAdListener$b */
    /* loaded from: classes3.dex */
    public class C9280b extends RewardedAdCallback {
    }

    public ScarRewardedAdListener(RewardedAd rewardedAd, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        this.f18071a = iScarRewardedAdListenerWrapper;
    }

    public RewardedAdCallback getRewardedAdCallback() {
        return this.f18074d;
    }

    public RewardedAdLoadCallback getRewardedAdLoadCallback() {
        return this.f18073c;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.f18072b = iScarLoadListener;
    }
}
