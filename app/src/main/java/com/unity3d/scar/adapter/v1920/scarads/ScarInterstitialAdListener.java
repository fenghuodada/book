package com.unity3d.scar.adapter.v1920.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

/* loaded from: classes3.dex */
public class ScarInterstitialAdListener {

    /* renamed from: a */
    public final IScarInterstitialAdListenerWrapper f18034a;

    /* renamed from: b */
    public IScarLoadListener f18035b;

    /* renamed from: c */
    public final C9270a f18036c = new C9270a();

    /* renamed from: com.unity3d.scar.adapter.v1920.scarads.ScarInterstitialAdListener$a */
    /* loaded from: classes3.dex */
    public class C9270a extends AdListener {
    }

    public ScarInterstitialAdListener(InterstitialAd interstitialAd, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        this.f18034a = iScarInterstitialAdListenerWrapper;
    }

    public AdListener getAdListener() {
        return this.f18036c;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.f18035b = iScarLoadListener;
    }
}
