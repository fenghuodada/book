package com.unity3d.services.core.properties;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.constraintlayout.core.C0499a;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.cache.C9467a;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.log.C9549a;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.unity3d.services.core.properties.d */
/* loaded from: classes3.dex */
public class C9572d {

    /* renamed from: a */
    private static String f18939a;

    /* renamed from: b */
    private static C9467a f18940b;

    /* renamed from: c */
    private static long f18941c;

    /* renamed from: d */
    private static long f18942d;

    /* renamed from: e */
    private static Configuration f18943e;

    /* renamed from: f */
    private static final LinkedHashSet<IUnityAdsInitializationListener> f18944f = new LinkedHashSet<>();

    /* renamed from: g */
    private static boolean f18945g = false;

    /* renamed from: h */
    private static boolean f18946h = false;

    /* renamed from: i */
    private static boolean f18947i = false;

    /* renamed from: j */
    private static boolean f18948j = false;

    /* renamed from: k */
    private static final AtomicReference<EnumC9573a> f18949k = new AtomicReference<>(EnumC9573a.NOT_INITIALIZED);

    /* renamed from: com.unity3d.services.core.properties.d$a */
    /* loaded from: classes3.dex */
    public enum EnumC9573a {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED
    }

    /* renamed from: a */
    public static File m1954a() {
        return m1952a(C9568a.m1959e());
    }

    /* renamed from: a */
    public static File m1952a(Context context) {
        if (f18940b == null) {
            m1949a(new C9467a("UnityAdsCache"));
        }
        return f18940b.m2246a(context);
    }

    /* renamed from: a */
    public static String m1946a(String str) {
        String str2 = "https://" + m1942b(C9568a.m1959e()) + ".unityads.unity3d.com/webview/";
        if (m1941b(C9498b.m2106y())) {
            str2 = "https://" + m1942b(C9568a.m1959e()) + ".unityads.unitychina.cn/webview/";
        }
        StringBuilder m12383b = C0499a.m12383b(str2);
        m12383b.append(m1924p());
        m12383b.append(RemoteSettings.FORWARD_SLASH_STRING);
        m12383b.append(str);
        m12383b.append("/config.json");
        return m12383b.toString();
    }

    /* renamed from: a */
    public static void m1953a(long j) {
        f18941c = j;
    }

    /* renamed from: a */
    public static void m1951a(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (iUnityAdsInitializationListener == null) {
            return;
        }
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f18944f;
        synchronized (linkedHashSet) {
            linkedHashSet.add(iUnityAdsInitializationListener);
        }
    }

    /* renamed from: a */
    public static void m1950a(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        m1947a(EnumC9573a.INITIALIZED_FAILED);
        for (IUnityAdsInitializationListener iUnityAdsInitializationListener : m1933g()) {
            iUnityAdsInitializationListener.onInitializationFailed(unityAdsInitializationError, str);
        }
        m1919u();
    }

    /* renamed from: a */
    public static void m1949a(C9467a c9467a) {
        f18940b = c9467a;
    }

    /* renamed from: a */
    public static void m1948a(Configuration configuration) {
        f18943e = configuration;
    }

    /* renamed from: a */
    public static void m1947a(EnumC9573a enumC9573a) {
        f18949k.set(enumC9573a);
    }

    /* renamed from: a */
    public static void m1945a(boolean z) {
        f18948j = z;
        C9549a.m2028a(z ? 8 : 4);
    }

    /* renamed from: b */
    public static C9467a m1944b() {
        return f18940b;
    }

    /* renamed from: b */
    public static String m1942b(Context context) {
        if (context != null) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                return bundle != null ? bundle.getString("com.unity3d.ads.configversion", "configv2") : "configv2";
            } catch (PackageManager.NameNotFoundException unused) {
                C9549a.m2014e("Failed to retrieve application info for current package");
                return "configv2";
            }
        }
        return "configv2";
    }

    /* renamed from: b */
    public static void m1943b(long j) {
        f18942d = j;
    }

    /* renamed from: b */
    public static void m1940b(boolean z) {
        f18945g = z;
    }

    /* renamed from: b */
    public static boolean m1941b(String str) {
        return str.equalsIgnoreCase("CN") || str.equalsIgnoreCase("CHN");
    }

    /* renamed from: c */
    public static String m1939c() {
        return "UnityAdsCache-";
    }

    /* renamed from: c */
    public static void m1938c(boolean z) {
        f18946h = z;
    }

    /* renamed from: d */
    public static String m1937d() {
        if (f18939a == null) {
            f18939a = m1946a("release");
        }
        return f18939a;
    }

    /* renamed from: d */
    public static void m1936d(boolean z) {
        f18947i = z;
    }

    /* renamed from: e */
    public static EnumC9573a m1935e() {
        return f18949k.get();
    }

    /* renamed from: f */
    public static boolean m1934f() {
        return f18948j;
    }

    /* renamed from: g */
    public static IUnityAdsInitializationListener[] m1933g() {
        IUnityAdsInitializationListener[] iUnityAdsInitializationListenerArr;
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f18944f;
        synchronized (linkedHashSet) {
            iUnityAdsInitializationListenerArr = new IUnityAdsInitializationListener[linkedHashSet.size()];
            linkedHashSet.toArray(iUnityAdsInitializationListenerArr);
        }
        return iUnityAdsInitializationListenerArr;
    }

    /* renamed from: h */
    public static long m1932h() {
        return f18941c;
    }

    /* renamed from: i */
    public static long m1931i() {
        return f18942d;
    }

    /* renamed from: j */
    public static Configuration m1930j() {
        return f18943e;
    }

    /* renamed from: k */
    public static String m1929k() {
        return m1954a().getAbsolutePath() + "/UnityAdsWebViewConfiguration.json";
    }

    /* renamed from: l */
    public static String m1928l() {
        return "UnityAdsStorage-";
    }

    /* renamed from: m */
    public static String m1927m() {
        return m1954a().getAbsolutePath() + "/UnityAdsWebApp.html";
    }

    /* renamed from: n */
    public static int m1926n() {
        return BuildConfig.VERSION_CODE;
    }

    /* renamed from: o */
    public static String m1925o() {
        return "4.3.0";
    }

    /* renamed from: p */
    private static String m1924p() {
        return m1925o();
    }

    /* renamed from: q */
    public static boolean m1923q() {
        return f18945g;
    }

    /* renamed from: r */
    public static boolean m1922r() {
        return f18946h;
    }

    /* renamed from: s */
    public static boolean m1921s() {
        return f18947i;
    }

    /* renamed from: t */
    public static void m1920t() {
        m1947a(EnumC9573a.INITIALIZED_SUCCESSFULLY);
        for (IUnityAdsInitializationListener iUnityAdsInitializationListener : m1933g()) {
            iUnityAdsInitializationListener.onInitializationComplete();
        }
        m1919u();
    }

    /* renamed from: u */
    public static void m1919u() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f18944f;
        synchronized (linkedHashSet) {
            linkedHashSet.clear();
        }
    }
}
