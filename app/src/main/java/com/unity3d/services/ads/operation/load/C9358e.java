package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.IInitializationNotificationCenter;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.request.metrics.C9593b;
import com.unity3d.services.core.webview.bridge.InterfaceC9629b;
import java.util.Map;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.unity3d.services.ads.operation.load.e */
/* loaded from: classes3.dex */
public class C9358e extends C9357d implements IInitializationListener {

    /* renamed from: b */
    private ConcurrentHashMap<C9367h, InterfaceC9629b> f18268b;

    /* renamed from: com.unity3d.services.ads.operation.load.e$a */
    /* loaded from: classes3.dex */
    public class RunnableC9359a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9367h f18269a;

        /* renamed from: b */
        final /* synthetic */ UnityAds.UnityAdsLoadError f18270b;

        /* renamed from: c */
        final /* synthetic */ String f18271c;

        public RunnableC9359a(C9367h c9367h, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.f18269a = c9367h;
            this.f18270b = unityAdsLoadError;
            this.f18271c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9367h c9367h = this.f18269a;
            c9367h.f18285h.onUnityAdsFailedToLoad(c9367h.f18255c, this.f18270b, this.f18271c);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.load.e$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9360b {

        /* renamed from: a */
        static final /* synthetic */ int[] f18273a;

        static {
            int[] iArr = new int[C9572d.EnumC9573a.values().length];
            f18273a = iArr;
            try {
                iArr[C9572d.EnumC9573a.INITIALIZED_SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18273a[C9572d.EnumC9573a.INITIALIZED_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9358e(InterfaceC9352a interfaceC9352a, IInitializationNotificationCenter iInitializationNotificationCenter) {
        super(interfaceC9352a);
        iInitializationNotificationCenter.addListener(this);
        this.f18268b = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    private void m2426a(C9367h c9367h, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        if (c9367h == null || c9367h.f18285h == null) {
            return;
        }
        mo2412a().mo1835a(C9593b.m1867a(unityAdsLoadError, Long.valueOf(c9367h.m2433d())));
        C9564j.m1991a(new RunnableC9359a(c9367h, unityAdsLoadError, str));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.InterfaceC9349c
    /* renamed from: a */
    public void mo2406a(InterfaceC9629b interfaceC9629b, C9367h c9367h) {
        if (c9367h == null) {
            return;
        }
        int i = C9360b.f18273a[C9572d.m1935e().ordinal()];
        if (i == 1) {
            super.mo2423a(interfaceC9629b, c9367h);
        } else if (i != 2) {
            this.f18268b.put(c9367h, interfaceC9629b);
        } else {
            m2426a(c9367h, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failed");
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public synchronized void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
        for (C9367h c9367h : this.f18268b.keySet()) {
            m2426a(c9367h, UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failure");
        }
        this.f18268b.clear();
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public synchronized void onSdkInitialized() {
        for (Map.Entry<C9367h, InterfaceC9629b> entry : this.f18268b.entrySet()) {
            super.mo2423a(entry.getValue(), entry.getKey());
        }
        this.f18268b.clear();
    }
}
