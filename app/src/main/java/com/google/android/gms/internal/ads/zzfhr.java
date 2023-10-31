package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class zzfhr implements Runnable {
    final /* synthetic */ zzfhs zza;
    private final WebView zzb;

    public zzfhr(zzfhs zzfhsVar) {
        WebView webView;
        this.zza = zzfhsVar;
        webView = zzfhsVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
