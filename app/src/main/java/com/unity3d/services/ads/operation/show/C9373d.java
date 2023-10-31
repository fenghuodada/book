package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.InterfaceC9596c;
import com.unity3d.services.core.webview.bridge.InterfaceC9629b;

/* renamed from: com.unity3d.services.ads.operation.show.d */
/* loaded from: classes3.dex */
public class C9373d implements InterfaceC9368a {

    /* renamed from: a */
    private final InterfaceC9368a f18295a;

    public C9373d(InterfaceC9368a interfaceC9368a) {
        this.f18295a = interfaceC9368a;
    }

    @Override // com.unity3d.services.ads.operation.InterfaceC9349c
    /* renamed from: a */
    public InterfaceC9596c mo2412a() {
        return this.f18295a.mo2412a();
    }

    /* renamed from: a */
    public void mo2407a(InterfaceC9629b interfaceC9629b, C9382g c9382g) {
        this.f18295a.mo2406a(interfaceC9629b, c9382g);
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9630c
    /* renamed from: a */
    public void mo1740a(String str) {
        this.f18295a.mo1740a(str);
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    /* renamed from: b */
    public void mo2405b(String str) {
        this.f18295a.mo2405b(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9630c
    /* renamed from: c */
    public InterfaceC9369b get(String str) {
        return (InterfaceC9369b) this.f18295a.get(str);
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowClick(String str) {
        this.f18295a.onUnityAdsShowClick(str);
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.f18295a.onUnityAdsShowComplete(str, unityAdsShowCompletionState);
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.f18295a.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowStart(String str) {
        this.f18295a.onUnityAdsShowStart(str);
    }
}
