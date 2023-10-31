package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.iab.omid.library.applovin.publisher.a */
/* loaded from: classes3.dex */
public class C8799a extends AdSessionStatePublisher {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C8799a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m3022a(webView);
    }
}
