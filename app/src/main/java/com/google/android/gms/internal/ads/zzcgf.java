package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

@TargetApi(21)
/* loaded from: classes.dex */
public final class zzcgf extends zzcge {
    public zzcgf(zzcfb zzcfbVar, zzawx zzawxVar, boolean z) {
        super(zzcfbVar, zzawxVar, z);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzN(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
