package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzauv implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzaun zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzaux zze;

    public zzauv(zzaux zzauxVar, final zzaun zzaunVar, final WebView webView, final boolean z) {
        this.zze = zzauxVar;
        this.zzb = zzaunVar;
        this.zzc = webView;
        this.zzd = z;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzauu
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzauv zzauvVar = zzauv.this;
                zzaun zzaunVar2 = zzaunVar;
                WebView webView2 = webView;
                boolean z2 = z;
                zzauvVar.zze.zzd(zzaunVar2, webView2, (String) obj, z2);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
