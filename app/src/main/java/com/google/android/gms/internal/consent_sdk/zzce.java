package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebView;
import androidx.annotation.GuardedBy;

/* loaded from: classes.dex */
public final class zzce {
    @GuardedBy("WebViewUtil.class")
    private static Boolean zza;

    private zzce() {
    }

    @TargetApi(19)
    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzce.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
            return;
        }
        String valueOf = String.valueOf(str);
        webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
    }
}
