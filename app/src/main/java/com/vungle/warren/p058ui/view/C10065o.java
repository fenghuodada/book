package com.vungle.warren.p058ui.view;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.vungle.warren.ui.view.o */
/* loaded from: classes3.dex */
public final class C10065o {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m1293a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        webView.setVisibility(4);
    }
}
