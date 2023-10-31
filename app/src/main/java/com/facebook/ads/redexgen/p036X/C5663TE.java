package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* renamed from: com.facebook.ads.redexgen.X.TE */
/* loaded from: assets/audience_network.dex */
public final class C5663TE extends AbstractC5346O6 {
    @Nullable
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static final String A0C;
    public static final Set<String> A0D;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C5953Xy A04;
    public C5337Nx A05;
    public InterfaceC5340O0 A06;
    public C5343O3 A07;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{83, 79, 79, 75, 49, 45, 45, 41, 42};
    }

    static {
        A08();
        A0C = C5663TE.class.getSimpleName();
        A0D = new HashSet(2);
        A09 = false;
        A0A = false;
        A0D.add(A05(0, 4, 102));
        A0D.add(A05(4, 5, 4));
    }

    public C5663TE(C5953Xy c5953Xy, Activity activity, InterfaceC5340O0 interfaceC5340O0) {
        super(activity, c5953Xy);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c5953Xy, interfaceC5340O0);
    }

    public C5663TE(C5953Xy c5953Xy, InterfaceC5340O0 interfaceC5340O0) {
        super(c5953Xy);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c5953Xy, interfaceC5340O0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC5346O6
    /* renamed from: A04 */
    public final C5343O3 A0E() {
        return new C5343O3(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A07() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A09(int i, int i2, Intent intent) {
        if (A08 != null && i == 1001) {
            if (Build.VERSION.SDK_INT >= 21) {
                A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
            } else {
                A08.onReceiveValue(intent.getData());
            }
            A08 = null;
        }
    }

    private void A0A(C5953Xy c5953Xy, InterfaceC5340O0 interfaceC5340O0) {
        this.A04 = c5953Xy;
        this.A06 = interfaceC5340O0;
        this.A05 = new C5337Nx(this);
        A09 = C5065JS.A03(this.A04);
        A0A = C5065JS.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0D());
        this.A07 = A0E();
        setWebViewClient(this.A07);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5346O6
    public final WebChromeClient A0D() {
        return new C5342O2(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0F(long j) {
        if (this.A00 < 0) {
            this.A00 = j;
        }
        A07();
    }

    public final void A0G(long j) {
        if (this.A01 < 0) {
            this.A01 = j;
        }
        A07();
    }

    public final void A0H(long j) {
        if (this.A02 < 0) {
            this.A02 = j;
        }
        A07();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5346O6, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        C5352OC.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList.getSize() > 0) {
            return copyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC5341O1 interfaceC5341O1) {
        this.A07.A04(new WeakReference<>(interfaceC5341O1));
    }
}
