package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.request.metrics.C9593b;
import com.unity3d.services.core.request.metrics.EnumC9592a;
import com.unity3d.services.core.timer.C9609a;
import com.unity3d.services.core.timer.InterfaceC9617g;
import com.unity3d.services.core.webview.bridge.InterfaceC9629b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.ads.operation.show.e */
/* loaded from: classes3.dex */
public class C9374e extends C9373d {

    /* renamed from: b */
    private final ExecutorService f18296b;

    /* renamed from: c */
    private final boolean f18297c;

    /* renamed from: com.unity3d.services.ads.operation.show.e$a */
    /* loaded from: classes3.dex */
    public class C9375a implements InterfaceC9617g {

        /* renamed from: a */
        final /* synthetic */ C9382g f18298a;

        public C9375a(C9382g c9382g) {
            this.f18298a = c9382g;
        }

        @Override // com.unity3d.services.core.timer.InterfaceC9617g
        /* renamed from: a */
        public void mo1798a() {
            C9374e c9374e = C9374e.this;
            C9382g c9382g = this.f18298a;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
            c9374e.m2408a(c9382g, unityAdsShowError, "[UnityAds] Timeout while trying to show " + this.f18298a.f18255c);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.e$b */
    /* loaded from: classes3.dex */
    public class RunnableC9376b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9382g f18300a;

        public RunnableC9376b(C9382g c9382g) {
            this.f18300a = c9382g;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9382g c9382g = this.f18300a;
            if (c9382g.f18257e.block(c9382g.f18256d.getShowTimeout())) {
                return;
            }
            C9374e c9374e = C9374e.this;
            C9382g c9382g2 = this.f18300a;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
            c9374e.m2408a(c9382g2, unityAdsShowError, "[UnityAds] Timeout while trying to show " + this.f18300a.f18255c);
        }
    }

    public C9374e(InterfaceC9368a interfaceC9368a, ConfigurationReader configurationReader) {
        super(interfaceC9368a);
        this.f18296b = Executors.newSingleThreadExecutor();
        this.f18297c = configurationReader.getCurrentConfiguration().getExperiments().isNewLifecycleTimer();
    }

    /* renamed from: a */
    private void m2409a(C9382g c9382g) {
        if (!this.f18297c) {
            this.f18296b.submit(new RunnableC9376b(c9382g));
        } else if (c9382g == null) {
        } else {
            C9609a c9609a = new C9609a(Integer.valueOf(c9382g.f18256d.getShowTimeout()), new C9375a(c9382g));
            c9382g.f18259g = c9609a;
            c9609a.mo1801a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2408a(C9382g c9382g, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (c9382g != null) {
            mo2412a().mo1835a(C9593b.m1860b(EnumC9592a.timeout, Long.valueOf(c9382g.m2433d())));
            mo1740a(c9382g.f18254b);
            c9382g.m2400a(unityAdsShowError, str);
        }
    }

    /* renamed from: d */
    private void m2404d(String str) {
        C9382g mo2402c;
        InterfaceC9369b interfaceC9369b = get(str);
        if (interfaceC9369b == null || (mo2402c = interfaceC9369b.mo2402c()) == null) {
            return;
        }
        if (!this.f18297c) {
            if (interfaceC9369b.mo2402c().f18257e == null) {
                return;
            }
            interfaceC9369b.mo2402c().f18257e.open();
            return;
        }
        C9609a c9609a = mo2402c.f18259g;
        if (c9609a == null) {
            return;
        }
        c9609a.mo1797a();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.InterfaceC9349c
    /* renamed from: a */
    public void mo2406a(InterfaceC9629b interfaceC9629b, C9382g c9382g) {
        mo2412a().mo1835a(C9593b.m1861b());
        c9382g.m2432e();
        m2409a(c9382g);
        super.mo2407a(interfaceC9629b, c9382g);
    }

    @Override // com.unity3d.services.ads.operation.show.C9373d, com.unity3d.services.ads.operation.show.InterfaceC9368a
    /* renamed from: b */
    public void mo2405b(String str) {
        m2404d(str);
        super.mo2405b(str);
    }

    @Override // com.unity3d.services.ads.operation.show.C9373d, com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        m2404d(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.C9373d, com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowStart(String str) {
        m2404d(str);
        super.onUnityAdsShowStart(str);
    }
}
