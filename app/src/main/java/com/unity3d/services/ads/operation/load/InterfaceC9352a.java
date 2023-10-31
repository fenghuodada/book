package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.InterfaceC9349c;

/* renamed from: com.unity3d.services.ads.operation.load.a */
/* loaded from: classes3.dex */
public interface InterfaceC9352a extends InterfaceC9349c<InterfaceC9353b, C9367h> {
    void onUnityAdsAdLoaded(String str);

    void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2);
}
