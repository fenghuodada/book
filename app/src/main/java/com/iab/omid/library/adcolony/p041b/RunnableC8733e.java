package com.iab.omid.library.adcolony.p041b;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.adcolony.b.e */
/* loaded from: classes3.dex */
public final class RunnableC8733e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WebView f16604a;

    /* renamed from: b */
    public final /* synthetic */ String f16605b;

    public RunnableC8733e(WebView webView, String str) {
        this.f16604a = webView;
        this.f16605b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16604a.loadUrl(this.f16605b);
    }
}
