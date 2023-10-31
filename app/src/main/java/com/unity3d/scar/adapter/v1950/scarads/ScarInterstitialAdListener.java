package com.unity3d.scar.adapter.v1950.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

/* loaded from: classes3.dex */
public class ScarInterstitialAdListener {

    /* renamed from: a */
    public final IScarInterstitialAdListenerWrapper f18066a;

    /* renamed from: b */
    public IScarLoadListener f18067b;

    /* renamed from: c */
    public final C9278a f18068c = new C9278a();

    /* renamed from: com.unity3d.scar.adapter.v1950.scarads.ScarInterstitialAdListener$a */
    /* loaded from: classes3.dex */
    public class C9278a extends AdListener {
    }

    public ScarInterstitialAdListener(InterstitialAd interstitialAd, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        this.f18066a = iScarInterstitialAdListenerWrapper;
    }

    public AdListener getAdListener() {
        return this.f18068c;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.f18067b = iScarLoadListener;
    }
}
