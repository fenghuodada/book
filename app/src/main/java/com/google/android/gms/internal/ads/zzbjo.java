package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.p039h5.H5AdsRequestHandler;
import com.google.android.gms.ads.p039h5.OnH5AdsEventListener;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public final class zzbjo extends zzbjb {
    public static final /* synthetic */ int zza = 0;
    @Nullable
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbjo(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzfoz.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbjn
            @Override // com.google.android.gms.ads.p039h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = webView;
                int i = zzbjo.zza;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        zzbzt.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzc(webView) && !this.zzc.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (zzc(this.zzd)) {
            if (this.zzc.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (zzc(webView)) {
            if (this.zzc.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return false;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(@Nullable WebViewClient webViewClient) {
        zzfoz.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }
}
