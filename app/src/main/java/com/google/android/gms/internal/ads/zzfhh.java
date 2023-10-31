package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class zzfhh implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzfhh(zzfhi zzfhiVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.loadUrl(this.zzb);
    }
}
