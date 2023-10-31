package com.google.ads.mediation.adcolony;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
class AdColonyReward implements RewardItem {
    private final int rewardAmount;
    private final String rewardType;

    public AdColonyReward(@NonNull String str, int i) {
        this.rewardType = str;
        this.rewardAmount = i;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.rewardAmount;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @NonNull
    public String getType() {
        return this.rewardType;
    }
}
