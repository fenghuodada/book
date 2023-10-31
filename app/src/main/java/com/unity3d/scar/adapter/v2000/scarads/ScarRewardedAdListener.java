package com.unity3d.scar.adapter.v2000.scarads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;

/* loaded from: classes3.dex */
public class ScarRewardedAdListener extends ScarAdListener {

    /* renamed from: b */
    public final IScarRewardedAdListenerWrapper f18101b;

    /* renamed from: c */
    public final C9288a f18102c = new C9288a();

    /* renamed from: d */
    public final C9289b f18103d = new C9289b();

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAdListener$a */
    /* loaded from: classes3.dex */
    public class C9288a extends RewardedAdLoadCallback {
    }

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAdListener$b */
    /* loaded from: classes3.dex */
    public class C9289b implements OnUserEarnedRewardListener {
    }

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAdListener$c */
    /* loaded from: classes3.dex */
    public class C9290c extends FullScreenContentCallback {
    }

    public ScarRewardedAdListener(IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper, ScarRewardedAd scarRewardedAd) {
        new C9290c();
        this.f18101b = iScarRewardedAdListenerWrapper;
    }

    public RewardedAdLoadCallback getAdLoadListener() {
        return this.f18102c;
    }

    public OnUserEarnedRewardListener getOnUserEarnedRewardListener() {
        return this.f18103d;
    }
}
