package com.unity3d.services.core.api;

import com.unity3d.services.core.connectivity.C9488c;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class Connectivity {
    @WebViewExposed
    public static void setConnectionMonitoring(Boolean bool, C9644l c9644l) {
        C9488c.m2189a(bool.booleanValue());
        c9644l.m1736a(new Object[0]);
    }
}
