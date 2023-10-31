package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzcgd extends zzcge {
    public zzcgd(zzcfb zzcfbVar, zzawx zzawxVar, boolean z) {
        super(zzcfbVar, zzawxVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, null);
    }
}
