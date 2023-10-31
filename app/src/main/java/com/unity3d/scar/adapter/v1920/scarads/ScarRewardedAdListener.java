package com.unity3d.scar.adapter.v1920.scarads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

/* loaded from: classes3.dex */
public class ScarRewardedAdListener {

    /* renamed from: a */
    public final IScarRewardedAdListenerWrapper f18039a;

    /* renamed from: b */
    public IScarLoadListener f18040b;

    /* renamed from: c */
    public final C9271a f18041c = new C9271a();

    /* renamed from: d */
    public final C9272b f18042d = new C9272b();

    /* renamed from: com.unity3d.scar.adapter.v1920.scarads.ScarRewardedAdListener$a */
    /* loaded from: classes3.dex */
    public class C9271a extends RewardedAdLoadCallback {
    }

    /* renamed from: com.unity3d.scar.adapter.v1920.scarads.ScarRewardedAdListener$b */
    /* loaded from: classes3.dex */
    public class C9272b extends RewardedAdCallback {
    }

    public ScarRewardedAdListener(RewardedAd rewardedAd, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        this.f18039a = iScarRewardedAdListenerWrapper;
    }

    public RewardedAdCallback getRewardedAdCallback() {
        return this.f18042d;
    }

    public RewardedAdLoadCallback getRewardedAdLoadCallback() {
        return this.f18041c;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.f18040b = iScarLoadListener;
    }
}
