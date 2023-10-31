package com.iab.omid.library.adcolony.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.p044e.C8745b;

/* renamed from: com.iab.omid.library.adcolony.publisher.b */
/* loaded from: classes3.dex */
public final class C8747b extends AbstractC8746a {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C8747b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f16626a = new C8745b(webView);
    }
}
