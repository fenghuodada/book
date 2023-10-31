package com.unity3d.services.ads.operation.show;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AbstractC9347a;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.properties.C9568a;
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

/* renamed from: com.unity3d.services.ads.operation.show.c */
/* loaded from: classes3.dex */
public class C9370c extends AbstractC9347a<InterfaceC9369b, C9382g> implements InterfaceC9368a {

    /* renamed from: d */
    private static InterfaceC9368a f18287d = null;

    /* renamed from: e */
    public static String f18288e = "[UnityAds] Placement ID cannot be null";

    /* renamed from: com.unity3d.services.ads.operation.show.c$a */
    /* loaded from: classes3.dex */
    public class C9371a implements InterfaceC9638b {

        /* renamed from: a */
        final /* synthetic */ C9382g f18289a;

        public C9371a(C9382g c9382g) {
            this.f18289a = c9382g;
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.InterfaceC9638b
        /* renamed from: a */
        public void mo1749a() {
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.InterfaceC9638b
        /* renamed from: a */
        public void mo1748a(String str, EnumC9628a enumC9628a) {
            C9370c.this.mo2412a().mo1835a(C9593b.m1860b(EnumC9592a.callback_error, Long.valueOf(this.f18289a.m2433d())));
            C9370c.this.m2415a(this.f18289a, str, UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
            C9370c.this.mo1740a(this.f18289a.f18254b);
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.InterfaceC9638b
        /* renamed from: b */
        public void mo1747b() {
            C9370c.this.mo2412a().mo1835a(C9593b.m1860b(EnumC9592a.callback_timeout, Long.valueOf(this.f18289a.m2433d())));
            C9370c.this.m2415a(this.f18289a, "[UnityAds] Show Invocation Timeout", UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
            C9370c.this.mo1740a(this.f18289a.f18254b);
        }
    }

    /* renamed from: com.unity3d.services.ads.operation.show.c$b */
    /* loaded from: classes3.dex */
    public class RunnableC9372b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9382g f18291a;

        /* renamed from: b */
        final /* synthetic */ UnityAds.UnityAdsShowError f18292b;

        /* renamed from: c */
        final /* synthetic */ String f18293c;

        public RunnableC9372b(C9382g c9382g, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
            this.f18291a = c9382g;
            this.f18292b = unityAdsShowError;
            this.f18293c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18291a.m2400a(this.f18292b, this.f18293c);
        }
    }

    public C9370c(InterfaceC9596c interfaceC9596c) {
        super(interfaceC9596c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2415a(C9382g c9382g, String str, UnityAds.UnityAdsShowError unityAdsShowError, boolean z) {
        if (c9382g == null || c9382g.f18312i == null) {
            return;
        }
        if (z) {
            mo2412a().mo1835a(C9593b.m1865a(unityAdsShowError, Long.valueOf(c9382g.m2433d())));
        }
        C9564j.m1991a(new RunnableC9372b(c9382g, unityAdsShowError, str));
    }

    /* renamed from: b */
    public static InterfaceC9368a m2413b() {
        if (f18287d == null) {
            f18287d = new C9374e(new C9370c(C9604i.m1839a()), new ConfigurationReader());
        }
        return f18287d;
    }

    @Override // com.unity3d.services.ads.operation.InterfaceC9349c
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo2406a(InterfaceC9629b interfaceC9629b, C9382g c9382g) {
        if (TextUtils.isEmpty(c9382g.f18255c)) {
            m2415a(c9382g, f18288e, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, true);
            return;
        }
        C9377f c9377f = new C9377f(c9382g, new C9639c(this.f18249c, interfaceC9629b, new C9371a(c9382g)));
        C9568a.m1966a(c9382g.f18311h);
        Display defaultDisplay = ((WindowManager) c9382g.f18311h.getSystemService("window")).getDefaultDisplay();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("requestedOrientation", c9382g.f18311h.getRequestedOrientation());
            jSONObject3.put("rotation", defaultDisplay.getRotation());
            Point point = new Point();
            defaultDisplay.getSize(point);
            jSONObject3.put("width", point.x);
            jSONObject3.put("height", point.y);
            jSONObject2.put("display", jSONObject3);
            jSONObject2.put("headerBiddingOptions", c9382g.f18313j.getData());
            jSONObject.put("options", jSONObject2);
            jSONObject.put("listenerId", c9377f.mo1766a());
            jSONObject.put("placementId", c9382g.f18255c);
            jSONObject.put("time", C9498b.m2115p());
            m1741a((C9370c) c9377f);
            c9377f.mo2434a(c9382g.f18256d.getWebViewBridgeTimeout(), jSONObject);
        } catch (NullPointerException unused) {
            m2415a(c9382g, "[UnityAds] Error creating show options", UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        } catch (JSONException unused2) {
            m2415a(c9382g, "[UnityAds] Error creating show options", UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        }
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    /* renamed from: b */
    public void mo2405b(String str) {
        InterfaceC9369b interfaceC9369b = (InterfaceC9369b) get(str);
        if (interfaceC9369b != null) {
            interfaceC9369b.mo2402c();
        }
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowClick(String str) {
        InterfaceC9369b interfaceC9369b = (InterfaceC9369b) get(str);
        if (interfaceC9369b == null || interfaceC9369b.mo2402c() == null) {
            return;
        }
        interfaceC9369b.onUnityAdsShowClick(interfaceC9369b.mo2402c().f18255c);
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        InterfaceC9369b interfaceC9369b = (InterfaceC9369b) get(str);
        if (interfaceC9369b == null || interfaceC9369b.mo2402c() == null) {
            return;
        }
        C9382g mo2402c = interfaceC9369b.mo2402c();
        mo2412a().mo1835a(C9593b.m1859b(Long.valueOf(mo2402c.m2433d())));
        interfaceC9369b.onUnityAdsShowComplete(mo2402c.f18255c, unityAdsShowCompletionState);
        mo1740a(str);
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        InterfaceC9369b interfaceC9369b = (InterfaceC9369b) get(str);
        if (interfaceC9369b == null || interfaceC9369b.mo2402c() == null) {
            return;
        }
        C9382g mo2402c = interfaceC9369b.mo2402c();
        mo2412a().mo1835a(C9593b.m1865a(unityAdsShowError, Long.valueOf(mo2402c.m2433d())));
        interfaceC9369b.onUnityAdsShowFailure(mo2402c.f18255c, unityAdsShowError, str2);
        mo1740a(str);
    }

    @Override // com.unity3d.services.ads.operation.show.InterfaceC9368a
    public void onUnityAdsShowStart(String str) {
        InterfaceC9369b interfaceC9369b = (InterfaceC9369b) get(str);
        if (interfaceC9369b == null || interfaceC9369b.mo2402c() == null) {
            return;
        }
        interfaceC9369b.onUnityAdsShowStart(interfaceC9369b.mo2402c().f18255c);
    }
}
