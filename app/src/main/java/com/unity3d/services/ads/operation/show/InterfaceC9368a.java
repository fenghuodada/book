package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.InterfaceC9349c;

/* renamed from: com.unity3d.services.ads.operation.show.a */
/* loaded from: classes3.dex */
public interface InterfaceC9368a extends InterfaceC9349c<InterfaceC9369b, C9382g> {
    /* renamed from: b */
    void mo2405b(String str);

    void onUnityAdsShowClick(String str);

    void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onUnityAdsShowStart(String str);
}
