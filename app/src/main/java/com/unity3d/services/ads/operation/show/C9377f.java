package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AbstractC9348b;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.webview.bridge.invocation.InterfaceC9637a;

/* renamed from: com.unity3d.services.ads.operation.show.f */
/* loaded from: classes3.dex */
public class C9377f extends AbstractC9348b implements InterfaceC9369b {

    /* renamed from: d */
    private C9382g f18302d;

    /* renamed from: com.unity3d.services.ads.operation.show.f$a */
    /* loaded from: classes3.dex */
    public class RunnableC9378a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityAds.UnityAdsShowError f18303a;

        /* renamed from: b */
        final /* synthetic */ String f18304b;

        public RunnableC9378a(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
            this.f18303a = unityAdsShowError;
            this.f18304b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9377f.this.f18302d != null) {
                C9377f.this.f18302d.m2400a(this.f18303a, this.f18304b);
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.f$b */
    /* loaded from: classes3.dex */
    public class RunnableC9379b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f18306a;

        public RunnableC9379b(String str) {
            this.f18306a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9377f.this.f18302d != null) {
                C9377f.this.f18302d.m2399a(this.f18306a);
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.f$c */
    /* loaded from: classes3.dex */
    public class RunnableC9380c implements Runnable {
        public RunnableC9380c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9377f.this.f18302d != null) {
                C9377f.this.f18302d.m2398f();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.f$d */
    /* loaded from: classes3.dex */
    public class RunnableC9381d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UnityAds.UnityAdsShowCompletionState f18309a;

        public RunnableC9381d(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            this.f18309a = unityAdsShowCompletionState;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9377f.this.f18302d != null) {
                C9377f.this.f18302d.m2401a(this.f18309a);
            }
        }
    }

    public C9377f(C9382g c9382g, InterfaceC9637a interfaceC9637a) {
        super(interfaceC9637a, "show");
        this.f18302d = c9382g;
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9631d
    /* renamed from: a */
    public String mo1766a() {
        return this.f18302d.f18254b;
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9369b
    /* renamed from: c */
    public C9382g mo2402c() {
        return this.f18302d;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        if (this.f18302d == null) {
            return;
        }
        C9564j.m1991a(new RunnableC9380c());
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.f18302d == null) {
            return;
        }
        C9564j.m1991a(new RunnableC9381d(unityAdsShowCompletionState));
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        C9382g c9382g = this.f18302d;
        if (c9382g == null || c9382g.f18312i == null) {
            return;
        }
        C9564j.m1991a(new RunnableC9378a(unityAdsShowError, str2));
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String str) {
        if (this.f18302d == null) {
            return;
        }
        C9564j.m1991a(new RunnableC9379b(str));
    }
}
