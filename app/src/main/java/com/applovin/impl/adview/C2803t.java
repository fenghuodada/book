package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: com.applovin.impl.adview.t */
/* loaded from: classes.dex */
public class C2803t extends C2773h {
    public C2803t(C2804u c2804u, Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(c2804u);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    /* renamed from: a */
    public void m8875a(String str) {
        loadDataWithBaseURL(RemoteSettings.FORWARD_SLASH_STRING, str, "text/html", null, "");
    }
}
