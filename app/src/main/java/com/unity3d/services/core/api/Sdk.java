package com.unity3d.services.core.api;

import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class Sdk {
    @WebViewExposed
    public static void downloadLatestWebView(C9644l c9644l) {
        C9549a.m2019b("Unity Ads init: WebView called download");
        c9644l.m1736a(Integer.valueOf(InitializeThread.downloadLatestWebView().getValue()));
    }

    @WebViewExposed
    public static void getDebugMode(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9572d.m1934f()));
    }

    @WebViewExposed
    public static void initComplete(C9644l c9644l) {
        C9549a.m2019b("Web Application initialized");
        C9572d.m1940b(true);
        C9620a.m1774c().m1781a(true);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void initError(String str, Integer num, C9644l c9644l) {
        C9620a.m1774c().m1777b(str);
        C9620a.m1774c().m1791a(num.intValue());
        C9620a.m1774c().m1781a(false);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void loadComplete(C9644l c9644l) {
        C9549a.m2019b("Web Application loaded");
        C9620a.m1774c().m1775b(true);
        Object[] objArr = new Object[18];
        objArr[0] = C9568a.m1958f();
        objArr[1] = Boolean.valueOf(C9572d.m1921s());
        objArr[2] = C9568a.m1962b();
        objArr[3] = C9568a.m1961c();
        objArr[4] = Integer.valueOf(C9572d.m1926n());
        objArr[5] = C9572d.m1925o();
        objArr[6] = Boolean.valueOf(C9568a.m1957g());
        objArr[7] = C9572d.m1937d();
        objArr[8] = C9620a.m1774c().m1780b().getWebViewUrl();
        objArr[9] = C9620a.m1774c().m1780b().getWebViewHash();
        objArr[10] = C9620a.m1774c().m1780b().getWebViewVersion();
        objArr[11] = Long.valueOf(C9572d.m1932h());
        objArr[12] = Boolean.valueOf(C9572d.m1922r());
        objArr[13] = Boolean.TRUE;
        objArr[14] = Boolean.valueOf(C9572d.m1930j() != null);
        objArr[15] = Long.valueOf(C9498b.m2115p());
        objArr[16] = C9620a.m1774c().m1780b().getStateId();
        objArr[17] = PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
        c9644l.m1736a(objArr);
    }

    @WebViewExposed
    public static void logDebug(String str, C9644l c9644l) {
        C9549a.m2019b(str);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void logError(String str, C9644l c9644l) {
        C9549a.m2017c(str);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void logInfo(String str, C9644l c9644l) {
        C9549a.m2015d(str);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void logWarning(String str, C9644l c9644l) {
        C9549a.m2014e(str);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void reinitialize(C9644l c9644l) {
        C9572d.m1938c(true);
        InitializeThread.initialize(C9620a.m1774c().m1780b());
    }

    @WebViewExposed
    public static void setDebugMode(Boolean bool, C9644l c9644l) {
        C9572d.m1945a(bool.booleanValue());
        c9644l.m1736a(new Object[0]);
    }
}
