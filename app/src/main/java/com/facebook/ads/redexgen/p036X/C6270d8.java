package com.facebook.ads.redexgen.p036X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.d8 */
/* loaded from: assets/audience_network.dex */
public class C6270d8 implements InterfaceC43577M {
    public final C39991W A00;
    public final InterfaceC40141l A01;
    public final C43657U A02;
    public final C5953Xy A03;
    public final boolean A04;

    public C6270d8(C5953Xy c5953Xy, InterfaceC40141l interfaceC40141l, C43657U c43657u, C39991W c39991w, boolean z) {
        this.A03 = c5953Xy;
        this.A01 = interfaceC40141l;
        this.A02 = c43657u;
        this.A00 = c39991w;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C40151m(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == EnumC40001X.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z) {
            A0E = this.A02.A0R(this.A00.A0E());
        }
        this.A00.A0H(A0E);
        this.A01.ABn();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAH() {
        if (this.A04) {
            this.A01.ABm(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAO() {
        A01(true);
    }
}
