package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.Pl */
/* loaded from: assets/audience_network.dex */
public final class C5448Pl extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC397518 A03;
    public final C39991W A04;
    public final C5953Xy A05;
    public final InterfaceC5080Jh A06;
    public final InterfaceC5349O9 A07;
    public final C5654T5 A08;
    public final InterfaceC5446Pj A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i4] = (byte) (i5 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, 68, 1, 22, 22, 11, 22, 52, 8, 5, 29, 5, 6, 8, 1, 68, 0, 11, 39, 16, 5, 39, 8, 13, 7, 15, 68, 16, 22, 13, 3, 3, 1, 22, 1, 0, 68, 19, 13, 16, 12, 68, 20, 22, 1, 73, 1, 18, 1, 10, 16, 68, 7, 8, 13, 7, 15, 23, 68, 7, 11, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, 29, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, 61, 50, 55, 61, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, 24, 53, 34, 42, 40, 51, 34, 21, 2, 10, 8, 19, 2, 56, 20, 2, 20, 20, 14, 8, 9, 56, 14, 3, 20, 15, 11, 5, 14, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (C5208Lr.A00 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C5448Pl(C5953Xy c5953Xy, AbstractC397518 abstractC397518, C39991W c39991w, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5446Pj interfaceC5446Pj, Map<String, String> map) {
        super(c5953Xy);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC5657T8() { // from class: com.facebook.ads.redexgen.X.8J
            @Override // com.facebook.ads.redexgen.p036X.InterfaceC5349O9
            public final void AA3() {
            }

            @Override // com.facebook.ads.redexgen.p036X.AbstractC5657T8, com.facebook.ads.redexgen.p036X.InterfaceC5349O9
            public final void AAn(int i, @Nullable String str) {
                AtomicBoolean atomicBoolean;
                InterfaceC5446Pj interfaceC5446Pj2;
                atomicBoolean = C5448Pl.this.A0B;
                atomicBoolean.set(true);
                interfaceC5446Pj2 = C5448Pl.this.A09;
                interfaceC5446Pj2.ABK();
            }

            @Override // com.facebook.ads.redexgen.p036X.AbstractC5657T8, com.facebook.ads.redexgen.p036X.InterfaceC5349O9
            public final void AAz() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                InterfaceC5446Pj interfaceC5446Pj2;
                atomicBoolean = C5448Pl.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = C5448Pl.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC5446Pj2 = C5448Pl.this.A09;
                interfaceC5446Pj2.AAz();
            }

            @Override // com.facebook.ads.redexgen.p036X.InterfaceC5349O9
            public final void ACu() {
                InterfaceC5446Pj interfaceC5446Pj2;
                interfaceC5446Pj2 = C5448Pl.this.A09;
                interfaceC5446Pj2.ACu();
            }
        };
        this.A05 = c5953Xy;
        this.A03 = abstractC397518;
        this.A04 = c39991w;
        this.A06 = interfaceC5080Jh;
        this.A09 = interfaceC5446Pj;
        this.A02 = map;
        this.A08 = A04();
        if (C5064JR.A1I(this.A05)) {
            this.A05.A09().AFP(this.A08, this.A03.A0U(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C5448Pl c5448Pl) {
        int i = c5448Pl.A00;
        c5448Pl.A00 = i + 1;
        return i;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private C5654T5 A04() {
        C5654T5 c5654t5 = new C5654T5(this.A05, new WeakReference(this.A07), 10, C5064JR.A1P(this.A05));
        c5654t5.setCornerRadius(A0E);
        c5654t5.setLogMultipleImpressions(false);
        c5654t5.setCheckAssetsByJavascriptBridge(false);
        c5654t5.setWebViewTimeoutInMillis(this.A04.A08());
        c5654t5.setRequestId(this.A03.A0Z());
        c5654t5.setOnTouchListener(new View$OnTouchListenerC5447Pk(this));
        WebSettings settings = c5654t5.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c5654t5.addJavascriptInterface(new C5449Pm(this.A05, this, this.A06, this.A02, this.A03.A0U()), A06(0, 12, 104));
        }
        return c5654t5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b8, code lost:
        if (r3 <= com.facebook.ads.redexgen.p036X.C5064JR.A0F(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ba, code lost:
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.p036X.C5448Pl.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ce, code lost:
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
        r3.AAQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
        r2 = com.facebook.ads.redexgen.p036X.C5448Pl.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.AAQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f2, code lost:
        if (r3 <= com.facebook.ads.redexgen.p036X.C5064JR.A0F(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f5, code lost:
        r6.A03(0);
        r9.A05.A06().A8y(r5, com.facebook.ads.redexgen.p036X.C44458z.A2D, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5448Pl.A0A():void");
    }

    public final void A0B() {
        String A0E2;
        if (this.A04.A0J()) {
            C444690 c444690 = new C444690(A06(107, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A0U());
            } catch (JSONException e) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e);
            }
            c444690.A05(jSONObject);
            c444690.A03(1);
            InterfaceC44448y A06 = this.A05.A06();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i = C44458z.A2F;
            String A062 = A06(155, 15, 98);
            A06.A8z(A062, i, c444690);
            if (C5064JR.A0l(this.A05) && C5234MH.A00(this.A05) == EnumC5233MG.A07) {
                this.A05.A06().A8z(A062, C44458z.A2E, c444690);
                this.A07.AAn(0, null);
                return;
            }
        }
        try {
            C5654T5 c5654t5 = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                A0E2 = this.A04.A0B();
            } else {
                A0E2 = this.A04.A0E();
            }
            c5654t5.loadUrl(A0E2);
        } catch (Exception e2) {
            this.A05.A06().A8y(A06(192, 8, 57), C44458z.A2c, new C444690(e2));
        }
    }

    public final void A0C() {
        if (C5064JR.A1I(this.A05)) {
            C5953Xy c5953Xy = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c5953Xy.A09().AFF(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
            return;
        }
        this.A08.destroy();
    }

    public C5237MK getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public C5521Qw getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
