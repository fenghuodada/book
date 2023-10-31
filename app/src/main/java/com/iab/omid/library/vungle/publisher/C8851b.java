package com.iab.omid.library.vungle.publisher;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.iab.omid.library.vungle.p055e.C8849b;

/* renamed from: com.iab.omid.library.vungle.publisher.b */
/* loaded from: classes3.dex */
public final class C8851b extends AbstractC8850a {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C8851b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f16854a = new C8849b(webView);
    }
}
