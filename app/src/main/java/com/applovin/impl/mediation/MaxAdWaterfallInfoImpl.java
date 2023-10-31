package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    @Nullable

    /* renamed from: a */
    private final AbstractC2823a f6720a;

    /* renamed from: b */
    private final String f6721b;

    /* renamed from: c */
    private final String f6722c;

    /* renamed from: d */
    private final List<MaxNetworkResponseInfo> f6723d;

    /* renamed from: e */
    private final long f6724e;

    public MaxAdWaterfallInfoImpl(AbstractC2823a abstractC2823a, long j, List<MaxNetworkResponseInfo> list) {
        this(abstractC2823a, abstractC2823a.m8791m(), abstractC2823a.m8790n(), j, list);
    }

    public MaxAdWaterfallInfoImpl(@Nullable AbstractC2823a abstractC2823a, String str, String str2, long j, List<MaxNetworkResponseInfo> list) {
        this.f6720a = abstractC2823a;
        this.f6721b = str;
        this.f6722c = str2;
        this.f6723d = list;
        this.f6724e = j;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f6724e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f6720a;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f6721b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f6723d;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f6722c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f6721b + ", testName=" + this.f6722c + ", networkResponses=" + this.f6723d + ", latencyMillis=" + this.f6724e + '}';
    }
}
