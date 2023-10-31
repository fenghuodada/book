package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.show.C9370c;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class Show {
    @WebViewExposed
    public static void sendShowClickEvent(String str, String str2, C9644l c9644l) {
        C9370c.m2413b().onUnityAdsShowClick(str2);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowCompleteEvent(String str, String str2, String str3, C9644l c9644l) {
        C9370c.m2413b().onUnityAdsShowComplete(str2, UnityAds.UnityAdsShowCompletionState.valueOf(str3));
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowConsentEvent(String str, String str2, C9644l c9644l) {
        C9370c.m2413b().mo2405b(str2);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowFailedEvent(String str, String str2, String str3, String str4, C9644l c9644l) {
        C9370c.m2413b().onUnityAdsShowFailure(str2, UnityAds.UnityAdsShowError.valueOf(str3), str4);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowStartEvent(String str, String str2, C9644l c9644l) {
        C9370c.m2413b().onUnityAdsShowStart(str2);
        c9644l.m1736a(new Object[0]);
    }
}
