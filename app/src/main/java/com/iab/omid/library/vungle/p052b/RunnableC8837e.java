package com.iab.omid.library.vungle.p052b;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.vungle.b.e */
/* loaded from: classes3.dex */
public final class RunnableC8837e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WebView f16838a;

    /* renamed from: b */
    public final /* synthetic */ String f16839b;

    public RunnableC8837e(WebView webView, String str) {
        this.f16838a = webView;
        this.f16839b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16838a.loadUrl(this.f16839b);
    }
}
