package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.request.metrics.C9593b;
import com.unity3d.services.core.request.metrics.EnumC9592a;
import com.unity3d.services.core.timer.C9609a;
import com.unity3d.services.core.timer.InterfaceC9617g;
import com.unity3d.services.core.webview.bridge.InterfaceC9629b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.ads.operation.load.f */
/* loaded from: classes3.dex */
public class C9361f extends C9357d {

    /* renamed from: b */
    private final ExecutorService f18274b;

    /* renamed from: c */
    private final boolean f18275c;

    /* renamed from: com.unity3d.services.ads.operation.load.f$a */
    /* loaded from: classes3.dex */
    public class C9362a implements InterfaceC9617g {

        /* renamed from: a */
        final /* synthetic */ C9367h f18276a;

        public C9362a(C9367h c9367h) {
            this.f18276a = c9367h;
        }

        @Override // com.unity3d.services.core.timer.InterfaceC9617g
        /* renamed from: a */
        public void mo1798a() {
            C9361f.this.m2424a(this.f18276a);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.load.f$b */
    /* loaded from: classes3.dex */
    public class RunnableC9363b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9367h f18278a;

        public RunnableC9363b(C9367h c9367h) {
            this.f18278a = c9367h;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9367h c9367h = this.f18278a;
            if (c9367h.f18257e.block(c9367h.f18256d.getLoadTimeout())) {
                return;
            }
            C9361f.this.m2424a(this.f18278a);
        }
    }

    public C9361f(InterfaceC9352a interfaceC9352a, ConfigurationReader configurationReader) {
        super(interfaceC9352a);
        this.f18274b = Executors.newCachedThreadPool();
        this.f18275c = configurationReader.getCurrentConfiguration().getExperiments().isNewLifecycleTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2424a(C9367h c9367h) {
        if (c9367h != null) {
            mo2412a().mo1835a(C9593b.m1863a(EnumC9592a.timeout, Long.valueOf(c9367h.m2433d())));
            mo1740a(c9367h.f18254b);
            UnityAds.UnityAdsLoadError unityAdsLoadError = UnityAds.UnityAdsLoadError.TIMEOUT;
            c9367h.m2418a(unityAdsLoadError, "[UnityAds] Timeout while loading " + c9367h.f18255c);
        }
    }

    /* renamed from: b */
    private void m2422b(C9367h c9367h) {
        if (!this.f18275c) {
            this.f18274b.submit(new RunnableC9363b(c9367h));
        } else if (c9367h == null) {
        } else {
            C9609a c9609a = new C9609a(Integer.valueOf(c9367h.f18256d.getLoadTimeout()), new C9362a(c9367h));
            c9367h.f18259g = c9609a;
            c9609a.mo1801a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    /* renamed from: d */
    private void m2421d(String str) {
        C9367h mo2419b;
        InterfaceC9353b interfaceC9353b = get(str);
        if (interfaceC9353b == null || (mo2419b = interfaceC9353b.mo2419b()) == null) {
            return;
        }
        if (!this.f18275c) {
            if (interfaceC9353b.mo2419b().f18257e == null) {
                return;
            }
            interfaceC9353b.mo2419b().f18257e.open();
            return;
        }
        C9609a c9609a = mo2419b.f18259g;
        if (c9609a == null) {
            return;
        }
        c9609a.mo1797a();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.InterfaceC9349c
    /* renamed from: a */
    public void mo2406a(InterfaceC9629b interfaceC9629b, C9367h c9367h) {
        mo2412a().mo1835a(C9593b.m1869a());
        c9367h.m2432e();
        m2422b(c9367h);
        super.mo2423a(interfaceC9629b, c9367h);
    }

    @Override // com.unity3d.services.ads.operation.load.C9357d, com.unity3d.services.ads.operation.load.InterfaceC9352a
    public void onUnityAdsAdLoaded(String str) {
        m2421d(str);
        super.onUnityAdsAdLoaded(str);
    }

    @Override // com.unity3d.services.ads.operation.load.C9357d, com.unity3d.services.ads.operation.load.InterfaceC9352a
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        m2421d(str);
        super.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }
}
