package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.InterfaceC9596c;
import com.unity3d.services.core.webview.bridge.InterfaceC9629b;

/* renamed from: com.unity3d.services.ads.operation.load.d */
/* loaded from: classes3.dex */
public class C9357d implements InterfaceC9352a {

    /* renamed from: a */
    private final InterfaceC9352a f18267a;

    public C9357d(InterfaceC9352a interfaceC9352a) {
        this.f18267a = interfaceC9352a;
    }

    @Override // com.unity3d.services.ads.operation.InterfaceC9349c
    /* renamed from: a */
    public InterfaceC9596c mo2412a() {
        return this.f18267a.mo2412a();
    }

    /* renamed from: a */
    public void mo2423a(InterfaceC9629b interfaceC9629b, C9367h c9367h) {
        this.f18267a.mo2406a(interfaceC9629b, c9367h);
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9630c
    /* renamed from: a */
    public void mo1740a(String str) {
        this.f18267a.mo1740a(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9630c
    /* renamed from: c */
    public InterfaceC9353b get(String str) {
        return (InterfaceC9353b) this.f18267a.get(str);
    }

    @Override // com.unity3d.services.ads.operation.load.InterfaceC9352a
    public void onUnityAdsAdLoaded(String str) {
        this.f18267a.onUnityAdsAdLoaded(str);
    }

    @Override // com.unity3d.services.ads.operation.load.InterfaceC9352a
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f18267a.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }
}
