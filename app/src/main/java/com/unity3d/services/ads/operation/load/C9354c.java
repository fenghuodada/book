package com.unity3d.services.ads.operation.load;

import android.text.TextUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AbstractC9347a;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.request.metrics.C9593b;
import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.request.metrics.EnumC9592a;
import com.unity3d.services.core.request.metrics.InterfaceC9596c;
import com.unity3d.services.core.webview.bridge.EnumC9628a;
import com.unity3d.services.core.webview.bridge.InterfaceC9629b;
import com.unity3d.services.core.webview.bridge.invocation.C9639c;
import com.unity3d.services.core.webview.bridge.invocation.InterfaceC9638b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.ads.operation.load.c */
/* loaded from: classes3.dex */
public class C9354c extends AbstractC9347a<InterfaceC9353b, C9367h> implements InterfaceC9352a {

    /* renamed from: d */
    private static InterfaceC9352a f18260d;

    /* renamed from: com.unity3d.services.ads.operation.load.c$a */
    /* loaded from: classes3.dex */
    public class C9355a implements InterfaceC9638b {

        /* renamed from: a */
        final /* synthetic */ C9367h f18261a;

        public C9355a(C9367h c9367h) {
            this.f18261a = c9367h;
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.InterfaceC9638b
        /* renamed from: a */
        public void mo1749a() {
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.InterfaceC9638b
        /* renamed from: a */
        public void mo1748a(String str, EnumC9628a enumC9628a) {
            C9354c.this.mo2412a().mo1835a(C9593b.m1863a(EnumC9592a.callback_error, Long.valueOf(this.f18261a.m2433d())));
            C9354c.this.m2430a(this.f18261a, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", false);
            C9354c.this.mo1740a(this.f18261a.f18254b);
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.InterfaceC9638b
        /* renamed from: b */
        public void mo1747b() {
            C9354c.this.mo2412a().mo1835a(C9593b.m1863a(EnumC9592a.callback_timeout, Long.valueOf(this.f18261a.m2433d())));
            C9354c.this.m2430a(this.f18261a, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication timeout", false);
            C9354c.this.mo1740a(this.f18261a.f18254b);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.load.c$b */
    /* loaded from: classes3.dex */
    public class RunnableC9356b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9367h f18263a;

        /* renamed from: b */
        final /* synthetic */ UnityAds.UnityAdsLoadError f18264b;

        /* renamed from: c */
        final /* synthetic */ String f18265c;

        public RunnableC9356b(C9367h c9367h, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.f18263a = c9367h;
            this.f18264b = unityAdsLoadError;
            this.f18265c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18263a.m2418a(this.f18264b, this.f18265c);
        }
    }

    public C9354c(InterfaceC9596c interfaceC9596c) {
        super(interfaceC9596c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2430a(C9367h c9367h, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, boolean z) {
        if (c9367h == null || c9367h.f18285h == null) {
            return;
        }
        if (z) {
            mo2412a().mo1835a(C9593b.m1867a(unityAdsLoadError, Long.valueOf(c9367h.m2433d())));
        }
        C9564j.m1991a(new RunnableC9356b(c9367h, unityAdsLoadError, str));
    }

    /* renamed from: b */
    public static InterfaceC9352a m2428b() {
        if (f18260d == null) {
            f18260d = new C9361f(new C9358e(new C9354c(C9604i.m1839a()), InitializationNotificationCenter.getInstance()), new ConfigurationReader());
        }
        return f18260d;
    }

    @Override // com.unity3d.services.ads.operation.InterfaceC9349c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo2406a(InterfaceC9629b interfaceC9629b, C9367h c9367h) {
        if (TextUtils.isEmpty(c9367h.f18255c)) {
            m2430a(c9367h, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", true);
            return;
        }
        C9364g c9364g = new C9364g(c9367h, new C9639c(this.f18249c, interfaceC9629b, new C9355a(c9367h)));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("headerBiddingOptions", c9367h.f18286i.getData());
            jSONObject.put("options", jSONObject2);
            jSONObject.put("listenerId", c9364g.mo1766a());
            jSONObject.put("placementId", c9367h.f18255c);
            jSONObject.put("time", C9498b.m2115p());
            m1741a((C9354c) c9364g);
            c9364g.mo2434a(c9367h.f18256d.getWebViewBridgeTimeout(), jSONObject);
        } catch (NullPointerException unused) {
            m2430a(c9367h, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        } catch (JSONException unused2) {
            m2430a(c9367h, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        }
    }

    @Override // com.unity3d.services.ads.operation.load.InterfaceC9352a
    public void onUnityAdsAdLoaded(String str) {
        InterfaceC9353b interfaceC9353b = (InterfaceC9353b) get(str);
        if (interfaceC9353b == null || interfaceC9353b.mo2419b() == null) {
            return;
        }
        C9367h mo2419b = interfaceC9353b.mo2419b();
        mo2412a().mo1835a(C9593b.m1862a(Long.valueOf(mo2419b.m2433d())));
        interfaceC9353b.onUnityAdsAdLoaded(mo2419b.f18255c);
        mo1740a(str);
    }

    @Override // com.unity3d.services.ads.operation.load.InterfaceC9352a
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        InterfaceC9353b interfaceC9353b = (InterfaceC9353b) get(str);
        if (interfaceC9353b == null || interfaceC9353b.mo2419b() == null) {
            return;
        }
        C9367h mo2419b = interfaceC9353b.mo2419b();
        mo2412a().mo1835a(C9593b.m1867a(unityAdsLoadError, Long.valueOf(mo2419b.m2433d())));
        interfaceC9353b.onUnityAdsFailedToLoad(mo2419b.f18255c, unityAdsLoadError, str2);
        mo1740a(str);
    }
}
