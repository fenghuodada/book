package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.Np */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5329Np implements View.OnClickListener {
    public final /* synthetic */ C5332Ns A00;

    public View$OnClickListenerC5329Np(C5332Ns c5332Ns) {
        this.A00 = c5332Ns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A08;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goForward();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
