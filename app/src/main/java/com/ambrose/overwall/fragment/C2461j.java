package com.ambrose.overwall.fragment;

import androidx.annotation.NonNull;
import com.ambrose.overwall.p005mv.main.C2507n;
import com.android.tool.util.util.C2603g;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* renamed from: com.ambrose.overwall.fragment.j */
/* loaded from: classes.dex */
public final class C2461j implements OnUserEarnedRewardListener {

    /* renamed from: a */
    public final /* synthetic */ C2463k f5889a;

    public C2461j(C2463k c2463k) {
        this.f5889a = c2463k;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(@NonNull RewardItem rewardItem) {
        C2463k c2463k = this.f5889a;
        c2463k.f5891a.f5906H.getClass();
        C2603g.m9336d(C2507n.m9406b(), "ok");
        c2463k.f5891a.f5914P = Boolean.FALSE;
    }
}
