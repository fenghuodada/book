package com.google.ads.mediation.unity;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public class UnityReward implements RewardItem {
    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @NonNull
    public String getType() {
        return "";
    }
}
