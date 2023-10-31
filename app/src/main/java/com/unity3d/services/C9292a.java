package com.unity3d.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.C0499a;
import com.adcolony.sdk.C2362x3;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.EnvironmentCheck;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;

/* renamed from: com.unity3d.services.a */
/* loaded from: classes3.dex */
public class C9292a {
    /* renamed from: a */
    private static String m2529a(String str, Object obj, Object obj2) {
        String obj3 = obj == null ? "null" : obj.toString();
        String obj4 = obj2 != null ? obj2.toString() : "null";
        StringBuilder m9460b = C2362x3.m9460b("\n - ", str, " Current: ", obj3, " | Received: ");
        m9460b.append(obj4);
        return m9460b.toString();
    }

    /* renamed from: a */
    public static void m2528a(boolean z) {
        C9572d.m1945a(z);
    }

    /* renamed from: a */
    public static boolean m2531a() {
        return C9572d.m1934f();
    }

    /* renamed from: b */
    public static String m2527b() {
        return C9572d.m1925o();
    }

    /* renamed from: c */
    public static boolean m2526c() {
        return C9572d.m1923q();
    }

    /* renamed from: d */
    public static boolean m2525d() {
        return true;
    }

    /* renamed from: a */
    public static void m2530a(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        Application application;
        StringBuilder sb;
        String str2;
        C9549a.m2029a();
        if (C9572d.m1935e() != C9572d.EnumC9573a.NOT_INITIALIZED) {
            String m1958f = C9568a.m1958f();
            String str3 = "";
            if (m1958f != null && !m1958f.equals(str)) {
                str3 = "" + m2529a("Game ID", C9568a.m1958f(), str);
            }
            boolean m1921s = C9572d.m1921s();
            if (m1921s != z) {
                StringBuilder m12383b = C0499a.m12383b(str3);
                m12383b.append(m2529a("Test Mode", Boolean.valueOf(m1921s), Boolean.valueOf(z)));
                str3 = m12383b.toString();
            }
            if (!TextUtils.isEmpty(str3)) {
                String str4 = "Unity Ads SDK failed to initialize due to already being initialized with different parameters" + str3;
                C9549a.m2014e(str4);
                if (iUnityAdsInitializationListener != null) {
                    iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, str4);
                    return;
                }
                return;
            }
        }
        C9572d.m1951a(iUnityAdsInitializationListener);
        if (C9572d.m1935e() == C9572d.EnumC9573a.INITIALIZED_SUCCESSFULLY) {
            C9572d.m1920t();
        } else if (C9572d.m1935e() == C9572d.EnumC9573a.INITIALIZED_FAILED) {
            C9572d.m1950a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
        } else {
            C9572d.EnumC9573a m1935e = C9572d.m1935e();
            C9572d.EnumC9573a enumC9573a = C9572d.EnumC9573a.INITIALIZING;
            if (m1935e == enumC9573a) {
                return;
            }
            C9572d.m1947a(enumC9573a);
            C9568a.m1963a(str);
            C9572d.m1936d(z);
            if (!m2525d()) {
                C9549a.m2017c("Error while initializing Unity Services: device is not supported");
                C9572d.m1950a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to device is not supported");
                return;
            }
            C9572d.m1953a(C9498b.m2115p());
            C9572d.m1943b(System.currentTimeMillis());
            if (str == null || str.length() == 0) {
                C9549a.m2017c("Error while initializing Unity Services: empty game ID, halting Unity Ads init");
                C9572d.m1950a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to empty game ID");
            } else if (context == null) {
                C9549a.m2017c("Error while initializing Unity Services: null context, halting Unity Ads init");
                C9572d.m1950a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to null context");
            } else {
                if (context instanceof Application) {
                    application = (Application) context;
                } else if (!(context instanceof Activity)) {
                    C9549a.m2017c("Error while initializing Unity Services: invalid context, halting Unity Ads init");
                    C9572d.m1950a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
                    return;
                } else {
                    Activity activity = (Activity) context;
                    if (activity.getApplication() == null) {
                        C9549a.m2017c("Error while initializing Unity Services: cannot retrieve application from context, halting Unity Ads init");
                        C9572d.m1950a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application from context");
                        return;
                    }
                    application = activity.getApplication();
                }
                C9568a.m1965a(application);
                if (z) {
                    sb = new StringBuilder("Initializing Unity Services ");
                    sb.append(C9572d.m1925o());
                    sb.append(" (");
                    sb.append(C9572d.m1926n());
                    sb.append(") with game id ");
                    sb.append(str);
                    str2 = " in test mode";
                } else {
                    sb = new StringBuilder("Initializing Unity Services ");
                    sb.append(C9572d.m1925o());
                    sb.append(" (");
                    sb.append(C9572d.m1926n());
                    sb.append(") with game id ");
                    sb.append(str);
                    str2 = " in production mode";
                }
                sb.append(str2);
                C9549a.m2015d(sb.toString());
                C9572d.m1945a(C9572d.m1934f());
                if (context.getApplicationContext() == null) {
                    C9549a.m2017c("Error while initializing Unity Services: cannot retrieve application context, halting Unity Ads init");
                    C9572d.m1950a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application context");
                    return;
                }
                C9568a.m1964a(context.getApplicationContext());
                if (EnvironmentCheck.isEnvironmentOk()) {
                    C9549a.m2015d("Unity Services environment check OK");
                    InitializeThread.initialize(new Configuration());
                    return;
                }
                C9549a.m2017c("Error during Unity Services environment check, halting Unity Services init");
                C9572d.m1950a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
            }
        }
    }
}
