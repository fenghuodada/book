package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.C9354c;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class Load {
    @WebViewExposed
    public static void sendAdFailedToLoad(String str, String str2, String str3, String str4, C9644l c9644l) {
        C9354c.m2428b().onUnityAdsFailedToLoad(str2, UnityAds.UnityAdsLoadError.valueOf(str3), str4);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void sendAdLoaded(String str, String str2, C9644l c9644l) {
        C9354c.m2428b().onUnityAdsAdLoaded(str2);
        c9644l.m1736a(new Object[0]);
    }
}
