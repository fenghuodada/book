package com.adcolony.sdk;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.adcolony.sdk.v */
/* loaded from: classes.dex */
public final class C2326v {

    /* renamed from: a */
    public final int f5637a;

    /* renamed from: b */
    public final String f5638b;

    /* renamed from: c */
    public final String f5639c;

    /* renamed from: d */
    public final boolean f5640d;

    public C2326v(C2100e2 c2100e2) {
        C2367y1 c2367y1 = c2100e2.f5098b;
        this.f5637a = c2367y1.m9441r("reward_amount");
        this.f5638b = c2367y1.m9436w("reward_name");
        this.f5640d = c2367y1.m9444o(FirebaseAnalytics.Param.SUCCESS);
        this.f5639c = c2367y1.m9436w("zone_id");
    }
}
