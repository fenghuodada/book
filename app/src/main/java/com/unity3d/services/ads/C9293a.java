package com.unity3d.services.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.C9292a;
import com.unity3d.services.ads.operation.load.C9354c;
import com.unity3d.services.ads.operation.load.C9367h;
import com.unity3d.services.ads.operation.show.C9370c;
import com.unity3d.services.ads.operation.show.C9382g;
import com.unity3d.services.ads.token.C9383a;
import com.unity3d.services.ads.token.C9398h;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.request.metrics.C9593b;
import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.bridge.C9642j;

/* renamed from: com.unity3d.services.ads.a */
/* loaded from: classes3.dex */
public final class C9293a {

    /* renamed from: a */
    private static Configuration f18113a;

    /* renamed from: b */
    private static C9642j f18114b = new C9642j();

    /* renamed from: a */
    public static void m2523a(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        m2522a(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    /* renamed from: a */
    public static void m2522a(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        if (!m2512e()) {
            m2520a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
        } else if (!m2513d()) {
            m2520a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not initialized");
        } else if (activity == null) {
            m2520a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
        } else {
            Configuration configuration = f18113a;
            if (configuration == null) {
                configuration = new Configuration();
            }
            C9568a.m1966a(activity);
            C9370c.m2413b().mo2406a(C9620a.m1774c(), new C9382g(str, iUnityAdsShowListener, activity, unityAdsShowOptions, configuration));
        }
    }

    /* renamed from: a */
    public static void m2521a(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        C9549a.m2029a();
        C9292a.m2530a(context, str, z, iUnityAdsInitializationListener);
    }

    /* renamed from: a */
    private static void m2520a(IUnityAdsShowListener iUnityAdsShowListener, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        C9604i.m1839a().mo1835a(C9593b.m1865a(unityAdsShowError, (Long) 0L));
        if (iUnityAdsShowListener == null) {
            return;
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    /* renamed from: a */
    public static void m2519a(IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (iUnityAdsTokenListener == null) {
            C9549a.m2015d("Please provide non-null listener to UnityAds.GetToken method");
        } else if (C9568a.m1959e() == null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        } else {
            C9383a.m2397a().m2386b(iUnityAdsTokenListener);
        }
    }

    /* renamed from: a */
    public static void m2518a(Configuration configuration) {
        f18113a = configuration;
    }

    /* renamed from: a */
    public static void m2517a(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        Configuration configuration = f18113a;
        if (configuration == null) {
            configuration = new Configuration();
        }
        C9354c.m2428b().mo2406a(f18114b, new C9367h(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration));
    }

    /* renamed from: a */
    public static void m2516a(boolean z) {
        C9292a.m2528a(z);
    }

    /* renamed from: a */
    public static boolean m2524a() {
        return C9292a.m2531a();
    }

    /* renamed from: b */
    public static String m2515b() {
        return C9398h.m2368c();
    }

    /* renamed from: c */
    public static String m2514c() {
        return C9292a.m2527b();
    }

    /* renamed from: d */
    public static boolean m2513d() {
        return C9292a.m2526c();
    }

    /* renamed from: e */
    public static boolean m2512e() {
        return C9292a.m2525d();
    }
}
