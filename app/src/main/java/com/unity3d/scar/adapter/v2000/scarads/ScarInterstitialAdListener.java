package com.unity3d.scar.adapter.v2000.scarads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;

/* loaded from: classes3.dex */
public class ScarInterstitialAdListener extends ScarAdListener {

    /* renamed from: b */
    public final IScarInterstitialAdListenerWrapper f18099b;

    /* renamed from: c */
    public final C9286a f18100c = new C9286a();

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarInterstitialAdListener$a */
    /* loaded from: classes3.dex */
    public class C9286a extends InterstitialAdLoadCallback {
    }

    /* renamed from: com.unity3d.scar.adapter.v2000.scarads.ScarInterstitialAdListener$b */
    /* loaded from: classes3.dex */
    public class C9287b extends FullScreenContentCallback {
    }

    public ScarInterstitialAdListener(IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper, ScarInterstitialAd scarInterstitialAd) {
        new C9287b();
        this.f18099b = iScarInterstitialAdListenerWrapper;
    }

    public InterstitialAdLoadCallback getAdLoadListener() {
        return this.f18100c;
    }
}
