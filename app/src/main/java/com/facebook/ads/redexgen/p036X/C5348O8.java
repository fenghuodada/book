package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.O8 */
/* loaded from: assets/audience_network.dex */
public class C5348O8 {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = C5348O8.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<InterfaceC39330R> A03;
    public final WeakReference<InterfaceC5349O9> A04;
    public final WeakReference<C5521Qw> A05;
    public final WeakReference<C5654T5> A06;

    public C5348O8(C5654T5 c5654t5, InterfaceC5349O9 interfaceC5349O9, C5521Qw c5521Qw, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C5953Xy c5953Xy) {
        this.A06 = new WeakReference<>(c5654t5);
        this.A04 = new WeakReference<>(interfaceC5349O9);
        this.A05 = new WeakReference<>(c5521Qw);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c5953Xy.A0D());
    }

    private InterfaceC39330R A00() {
        InterfaceC39330R interfaceC39330R = this.A03.get();
        if (interfaceC39330R == null) {
            return new C6314dq();
        }
        return interfaceC39330R;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return C5214Lx.A01(C445498.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AFT(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AFU();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z) {
            this.A01.get().set(true);
            A00().AFV();
            if (this.A06.get().isShown()) {
                A00().AFW();
                new Handler(Looper.getMainLooper()).post(new C5656T7(this.A05));
            }
            InterfaceC5349O9 interfaceC5349O9 = this.A04.get();
            if (interfaceC5349O9 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC5347O7(this, interfaceC5349O9));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C5654T5 c5654t5 = this.A06.get();
        if (c5654t5 == null || c5654t5.A06()) {
            A00().AFX(true);
            return;
        }
        InterfaceC5349O9 interfaceC5349O9 = this.A04.get();
        if (interfaceC5349O9 == null) {
            A00().AFX(true);
            return;
        }
        A00().AFX(false);
        interfaceC5349O9.ABh();
    }
}
