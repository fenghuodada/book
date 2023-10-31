package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0484a;
import com.applovin.mediation.MaxReward;

/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a */
    private final String f6745a;

    /* renamed from: b */
    private final int f6746b;

    private MaxRewardImpl(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f6745a = str;
        this.f6746b = i;
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f6746b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f6745a;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxReward{amount=");
        sb.append(this.f6746b);
        sb.append(", label=");
        return C0484a.m12392a(sb, this.f6745a, "}");
    }
}
