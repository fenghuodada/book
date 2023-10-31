package com.facebook.ads.redexgen.p036X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.1m */
/* loaded from: assets/audience_network.dex */
public class C40151m extends WebViewClient {
    public boolean A00 = false;
    public final C39991W A01;
    public final InterfaceC40141l A02;
    public final boolean A03;

    public C40151m(C39991W c39991w, InterfaceC40141l interfaceC40141l, boolean z) {
        this.A01 = c39991w;
        this.A02 = interfaceC40141l;
        this.A03 = z;
    }

    private void A00() {
        if (this.A03) {
            this.A02.ABm(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        InterfaceC40141l interfaceC40141l = this.A02;
        if (interfaceC40141l != null) {
            interfaceC40141l.ABn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new C6269d7(this), this.A01.A08());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC5346O6.A02(C44458z.A2d);
        A00();
        return true;
    }
}
