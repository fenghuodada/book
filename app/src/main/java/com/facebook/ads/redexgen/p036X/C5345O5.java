package com.facebook.ads.redexgen.p036X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.O5 */
/* loaded from: assets/audience_network.dex */
public class C5345O5 extends WebViewClient {
    public final /* synthetic */ AbstractC5346O6 A00;

    public C5345O5(AbstractC5346O6 abstractC5346O6) {
        this.A00 = abstractC5346O6;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC5346O6.A02(C44458z.A2e);
        return true;
    }
}
