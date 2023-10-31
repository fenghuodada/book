package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AbstractC9348b;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.webview.bridge.invocation.InterfaceC9637a;

/* renamed from: com.unity3d.services.ads.operation.load.g */
/* loaded from: classes3.dex */
public class C9364g extends AbstractC9348b implements InterfaceC9353b {

    /* renamed from: d */
    private C9367h f18280d;

    /* renamed from: com.unity3d.services.ads.operation.load.g$a */
    /* loaded from: classes3.dex */
    public class RunnableC9365a implements Runnable {
        public RunnableC9365a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9364g.this.f18280d != null) {
                C9364g.this.f18280d.m2417f();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.load.g$b */
    /* loaded from: classes3.dex */
    public class RunnableC9366b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityAds.UnityAdsLoadError f18282a;

        /* renamed from: b */
        final /* synthetic */ String f18283b;

        public RunnableC9366b(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.f18282a = unityAdsLoadError;
            this.f18283b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9364g.this.f18280d != null) {
                C9364g.this.f18280d.m2418a(this.f18282a, this.f18283b);
            }
        }
    }

    public C9364g(C9367h c9367h, InterfaceC9637a interfaceC9637a) {
        super(interfaceC9637a, "load");
        this.f18280d = c9367h;
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9631d
    /* renamed from: a */
    public String mo1766a() {
        return this.f18280d.f18254b;
    }

    @Override // com.unity3d.services.ads.operation.load.InterfaceC9353b
    /* renamed from: b */
    public C9367h mo2419b() {
        return this.f18280d;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        C9367h c9367h = this.f18280d;
        if (c9367h == null || c9367h.f18285h == null || str == null) {
            return;
        }
        C9564j.m1991a(new RunnableC9365a());
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        C9367h c9367h = this.f18280d;
        if (c9367h == null || c9367h.f18285h == null || str == null) {
            return;
        }
        C9564j.m1991a(new RunnableC9366b(unityAdsLoadError, str2));
    }
}
