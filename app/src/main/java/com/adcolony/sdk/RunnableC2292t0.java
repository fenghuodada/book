package com.adcolony.sdk;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.adcolony.sdk.t0 */
/* loaded from: classes.dex */
public final class RunnableC2292t0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2218o0 f5585a;

    /* renamed from: com.adcolony.sdk.t0$a */
    /* loaded from: classes.dex */
    public static final class C2293a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ C2218o0 f5586a;

        public C2293a(C2218o0 c2218o0) {
            this.f5586a = c2218o0;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            this.f5586a.destroy();
        }
    }

    public RunnableC2292t0(C2218o0 c2218o0) {
        this.f5585a = c2218o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2218o0 c2218o0 = this.f5585a;
        c2218o0.setWebChromeClient(null);
        c2218o0.setWebViewClient(new C2293a(c2218o0));
        c2218o0.clearCache(true);
        c2218o0.removeAllViews();
        c2218o0.loadUrl("about:blank");
    }
}
