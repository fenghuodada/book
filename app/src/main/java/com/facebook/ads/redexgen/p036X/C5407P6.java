package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.P6 */
/* loaded from: assets/audience_network.dex */
public class C5407P6 extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"hfMJ0frXuRQdVVGg5HhbkedMp84qvG2m", "353suYezQm1X4xGGmKd", "JSegO1TQToLz4SD5sG2", "wzs2neDsiDlXGMSMfb3", "O6PuLNBrYuNMqKQgURK12L6N", "9iUPqfJGnhoj94eJuJeS1Wm6njk1Rmvr", "BdwoSzPq3MvWa04biSMwYNzp8DFOBLqT", "enVVpEgx3aC4K8YdK2hdvlOQVko"};
    public final /* synthetic */ C5411PA A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 4, 18, 2, 17, 8, 15, 19, 8, 14, 13, -11, -6, -11, -44, 3, -14, 4, -7, 13, 26, 26, 23, 26, -21, 23, 12, 13, 48, 43, 64, 51, 45, 57, 56, -8, 51, 45, 57, 39, 51, 51, 47, 30, 36, 49, 49, 46, 49, 71, 73, 64, 70, 73, 64, 75, 80, -4, -7, -13};
    }

    static {
        A01();
    }

    public C5407P6(C5411PA c5411pa) {
        this.A00 = c5411pa;
    }

    private void A02(int i, String str, String str2, boolean z) {
        C5088Jp c5088Jp;
        C5953Xy c5953Xy;
        C5399Ox c5399Ox;
        if (z) {
            this.A00.A0S();
        }
        c5088Jp = this.A00.A0D;
        c5088Jp.A02(EnumC5087Jo.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 44), i);
            jSONObject.put(A00(0, 11, 35), str);
            jSONObject.put(A00(57, 3, 11), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c5953Xy = this.A00.A0B;
        c5953Xy.A0D().A54(jSONObject2);
        c5399Ox = this.A00.A0E;
        c5399Ox.A04(C44458z.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C5088Jp c5088Jp;
        C5953Xy c5953Xy;
        long j;
        InterfaceC5409P8 interfaceC5409P8;
        InterfaceC5409P8 interfaceC5409P82;
        c5088Jp = this.A00.A0D;
        c5088Jp.A02(EnumC5087Jo.A0R, null);
        c5953Xy = this.A00.A0B;
        InterfaceC39330R A0D = c5953Xy.A0D();
        j = this.A00.A00;
        A0D.A55(C5236MJ.A01(j));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC5409P8 = this.A00.A03;
        if (interfaceC5409P8 == null) {
            return;
        }
        interfaceC5409P82 = this.A00.A03;
        interfaceC5409P82.ACv();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb = new StringBuilder();
        String A00 = A00(0, 0, 48);
        sb.append(A00);
        sb.append((Object) webResourceError.getDescription());
        String sb2 = sb.toString();
        A02(errorCode, sb2, A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 78))) {
            return;
        }
        if (webResourceResponse != null) {
            i = webResourceResponse.getStatusCode();
        } else {
            i = -1;
        }
        A02(i, A00(39, 10, 67), A00(0, 0, 48) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C5953Xy c5953Xy;
        AbstractC397518 abstractC397518;
        InterfaceC5410P9 interfaceC5410P9;
        InterfaceC5410P9 interfaceC5410P92;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 21), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 91), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c5953Xy = this.A00.A0B;
        c5953Xy.A0D().A50(jSONObject2);
        abstractC397518 = this.A00.A09;
        C5412PB.A04(abstractC397518.A0Z());
        interfaceC5410P9 = this.A00.A04;
        if (interfaceC5410P9 == null) {
            return true;
        }
        interfaceC5410P92 = this.A00.A04;
        String[] strArr = A02;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[0] = "kv0KfCNN1XAdbICEJBZwu3dTiw7XNBbg";
        interfaceC5410P92.ABx();
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @RequiresApi(api = 21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C5953Xy c5953Xy;
        C43657U c43657u;
        C5423PM c5423pm;
        AbstractC397518 abstractC397518;
        c5953Xy = this.A00.A0B;
        c43657u = this.A00.A0A;
        c5423pm = this.A00.A0H;
        abstractC397518 = this.A00.A09;
        return C5425PO.A00(c5953Xy, c43657u, webResourceRequest, c5423pm, abstractC397518.A0n());
    }
}
