package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzfhq extends zzfhp {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfhq(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzi(webView);
    }
}
