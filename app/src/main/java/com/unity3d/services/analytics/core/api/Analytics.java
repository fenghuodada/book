package com.unity3d.services.analytics.core.api;

import com.unity3d.services.analytics.interfaces.EnumC9424a;
import com.unity3d.services.analytics.interfaces.InterfaceC9425b;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class Analytics {
    public static InterfaceC9425b analyticsInterface;

    /* renamed from: com.unity3d.services.analytics.core.api.Analytics$a */
    /* loaded from: classes3.dex */
    public static class RunnableC9423a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f18454a;

        public RunnableC9423a(String str) {
            this.f18454a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Analytics.analyticsInterface.m2320a(this.f18454a);
        }
    }

    @WebViewExposed
    public static void addExtras(String str, C9644l c9644l) {
        if (analyticsInterface == null) {
            c9644l.m1737a(EnumC9424a.API_NOT_FOUND, str);
            return;
        }
        C9564j.m1991a(new RunnableC9423a(str));
        c9644l.m1736a(new Object[0]);
    }

    public static void setAnalyticsInterface(InterfaceC9425b interfaceC9425b) {
        analyticsInterface = interfaceC9425b;
    }
}
