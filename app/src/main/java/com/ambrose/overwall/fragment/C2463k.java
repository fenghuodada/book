package com.ambrose.overwall.fragment;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.kongzue.dialogx.dialogs.C8897o;
import com.unity3d.ads.UnityAds;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ambrose.overwall.fragment.k */
/* loaded from: classes.dex */
public final class C2463k extends RewardedAdLoadCallback {

    /* renamed from: a */
    public final /* synthetic */ C2470n f5891a;

    public C2463k(C2470n c2470n) {
        this.f5891a = c2470n;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(@NonNull @NotNull LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        int i = C2470n.f5898e0;
        C2470n c2470n = this.f5891a;
        c2470n.getClass();
        UnityAds.load("Rewarded_Android", new C2465l(c2470n));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(@NonNull @NotNull RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        C8897o.m2905E();
        rewardedAd2.setFullScreenContentCallback(new C2459i());
        rewardedAd2.show(this.f5891a.m2811m(), new C2461j(this));
        super.onAdLoaded(rewardedAd2);
    }
}
