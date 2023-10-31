package com.ambrose.overwall.fragment;

import com.ambrose.overwall.fragment.C2470n;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* renamed from: com.ambrose.overwall.fragment.t */
/* loaded from: classes.dex */
public final class C2485t extends FullScreenContentCallback {

    /* renamed from: a */
    public final /* synthetic */ C2470n.C2474d f5945a;

    public C2485t(C2470n.C2474d c2474d) {
        this.f5945a = c2474d;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        C2470n c2470n = C2470n.this;
        c2470n.f5917S = null;
        c2470n.m9410E();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        C2470n.this.f5917S = null;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
    }
}
