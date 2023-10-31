package com.unity3d.services.core.webview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.misc.C9565k;
import com.unity3d.services.core.webview.bridge.C9636i;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class WebView extends android.webkit.WebView {

    /* renamed from: a */
    private static Method f19078a;

    /* renamed from: com.unity3d.services.core.webview.WebView$a */
    /* loaded from: classes3.dex */
    public class RunnableC9619a implements Runnable {

        /* renamed from: a */
        private String f19079a;

        /* renamed from: b */
        private android.webkit.WebView f19080b;

        public RunnableC9619a(String str, android.webkit.WebView webView) {
            this.f19079a = str;
            this.f19080b = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f19079a == null) {
                C9549a.m2017c("Could not process JavaScript, the string is NULL");
                return;
            }
            try {
                WebView.f19078a.invoke(this.f19080b, this.f19079a, null);
            } catch (Exception e) {
                C9549a.m2023a("Error while processing JavaScriptString", e);
            }
        }
    }

    public WebView(Context context) {
        super(context);
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        try {
            f19078a = android.webkit.WebView.class.getMethod("evaluateJavascript", String.class, ValueCallback.class);
        } catch (NoSuchMethodException e) {
            C9549a.m2023a("Method evaluateJavascript not found", e);
            f19078a = null;
        }
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        C9565k.m1981a(this, new ColorDrawable(0));
        setBackgroundResource(0);
        addJavascriptInterface(new C9636i(), "webviewbridge");
    }

    /* renamed from: a */
    public void m1793a(String str) {
        C9564j.m1991a(new RunnableC9619a(str, this));
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        C9549a.m2019b("Loading url: " + str);
        super.loadUrl(str);
    }
}
