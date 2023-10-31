package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.ads.operation.C9351e;
import com.unity3d.services.core.configuration.Configuration;

/* renamed from: com.unity3d.services.ads.operation.load.h */
/* loaded from: classes3.dex */
public class C9367h extends C9351e {

    /* renamed from: h */
    public IUnityAdsLoadListener f18285h;

    /* renamed from: i */
    public UnityAdsLoadOptions f18286i;

    public C9367h(String str, IUnityAdsLoadListener iUnityAdsLoadListener, UnityAdsLoadOptions unityAdsLoadOptions, Configuration configuration) {
        super(str, configuration);
        this.f18285h = iUnityAdsLoadListener;
        this.f18286i = unityAdsLoadOptions;
    }

    /* renamed from: a */
    public void m2418a(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        IUnityAdsLoadListener iUnityAdsLoadListener = this.f18285h;
        if (iUnityAdsLoadListener != null) {
            iUnityAdsLoadListener.onUnityAdsFailedToLoad(this.f18255c, unityAdsLoadError, str);
        }
    }

    /* renamed from: f */
    public void m2417f() {
        IUnityAdsLoadListener iUnityAdsLoadListener = this.f18285h;
        if (iUnityAdsLoadListener != null) {
            iUnityAdsLoadListener.onUnityAdsAdLoaded(this.f18255c);
        }
    }
}
