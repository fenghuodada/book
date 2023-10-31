package com.unity3d.services.ads.webplayer;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.ads.webplayer.a */
/* loaded from: classes3.dex */
public class C9409a {

    /* renamed from: a */
    private final String f18392a;

    public C9409a(String str) {
        this.f18392a = str;
    }

    @JavascriptInterface
    public void handleEvent(String str) {
        if (C9620a.m1774c() != null) {
            C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.WEBPLAYER_EVENT, str, this.f18392a);
        }
    }
}
