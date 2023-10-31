package com.unity3d.services.ads.webplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.misc.C9565k;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.ads.webplayer.f */
/* loaded from: classes3.dex */
public class C9414f extends WebView {

    /* renamed from: a */
    private Map<String, String> f18436a;

    /* renamed from: b */
    private JSONObject f18437b;

    /* renamed from: c */
    private Method f18438c;

    /* renamed from: d */
    private String f18439d;

    /* renamed from: e */
    private Runnable f18440e;

    /* renamed from: com.unity3d.services.ads.webplayer.f$a */
    /* loaded from: classes3.dex */
    public class View$OnLayoutChangeListenerC9415a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC9415a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C9414f.this.m2344a();
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$b */
    /* loaded from: classes3.dex */
    public class RunnableC9416b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View.OnLayoutChangeListener f18442a;

        public RunnableC9416b(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f18442a = onLayoutChangeListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9414f.this.removeOnLayoutChangeListener(this.f18442a);
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$c */
    /* loaded from: classes3.dex */
    public class RunnableC9417c implements Runnable {

        /* renamed from: a */
        private String f18444a;

        /* renamed from: b */
        private WebView f18445b;

        public RunnableC9417c(String str, WebView webView) {
            this.f18444a = str;
            this.f18445b = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18444a == null) {
                C9549a.m2017c("Could not process JavaScript, the string is NULL");
                return;
            }
            try {
                C9414f.this.f18438c.invoke(this.f18445b, this.f18444a, null);
            } catch (Exception e) {
                C9549a.m2023a("Error while processing JavaScriptString", e);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: com.unity3d.services.ads.webplayer.f$d */
    /* loaded from: classes3.dex */
    public class C9418d extends WebChromeClient {
        private C9418d() {
        }

        public /* synthetic */ C9418d(C9414f c9414f, View$OnLayoutChangeListenerC9415a view$OnLayoutChangeListenerC9415a) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            if (C9414f.this.m2327c("onCloseWindow")) {
                super.onCloseWindow(webView);
            }
            if (C9414f.this.m2325d("onCloseWindow")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.CLOSE_WINDOW, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Boolean bool = Boolean.FALSE;
            if (C9414f.this.m2327c("onConsoleMessage")) {
                bool = Boolean.valueOf(super.onConsoleMessage(consoleMessage));
            }
            if (C9414f.this.m2325d("onConsoleMessage")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.CONSOLE_MESSAGE, consoleMessage != null ? consoleMessage.message() : "", C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("onConsoleMessage")) {
                bool = (Boolean) C9414f.this.m2337a("onConsoleMessage", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            Boolean bool = Boolean.FALSE;
            Boolean valueOf = C9414f.this.m2327c("onCreateWindow") ? Boolean.valueOf(super.onCreateWindow(webView, z, z2, message)) : bool;
            if (C9414f.this.m2325d("onCreateWindow")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.CREATE_WINDOW, Boolean.valueOf(z), Boolean.valueOf(z2), message, C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("onCreateWindow")) {
                valueOf = (Boolean) C9414f.this.m2337a("onCreateWindow", Boolean.class, bool);
            }
            return valueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (C9414f.this.m2327c("onGeolocationPermissionsShowPrompt")) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
            if (C9414f.this.m2325d("onGeolocationPermissionsShowPrompt")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.GEOLOCATION_PERMISSIONS_SHOW, str, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (C9414f.this.m2327c("onHideCustomView")) {
                super.onHideCustomView();
            }
            if (C9414f.this.m2325d("onHideCustomView")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.HIDE_CUSTOM_VIEW, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Boolean bool = Boolean.FALSE;
            if (C9414f.this.m2327c("onJsAlert")) {
                bool = Boolean.valueOf(super.onJsAlert(webView, str, str2, jsResult));
            }
            if (C9414f.this.m2325d("onJsAlert")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.JS_ALERT, str, str2, jsResult, C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("onJsAlert")) {
                bool = (Boolean) C9414f.this.m2337a("onJsAlert", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            Boolean bool = Boolean.FALSE;
            if (C9414f.this.m2327c("onJsConfirm")) {
                bool = Boolean.valueOf(super.onJsConfirm(webView, str, str2, jsResult));
            }
            if (C9414f.this.m2325d("onJsConfirm")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.JS_CONFIRM, str, str2, C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("onJsConfirm")) {
                bool = (Boolean) C9414f.this.m2337a("onJsConfirm", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            Boolean bool = Boolean.FALSE;
            if (C9414f.this.m2327c("onJsPrompt")) {
                bool = Boolean.valueOf(super.onJsPrompt(webView, str, str2, str3, jsPromptResult));
            }
            if (C9414f.this.m2325d("onJsPrompt")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.JS_PROMPT, str, str2, str3, C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("onJsPrompt")) {
                bool = (Boolean) C9414f.this.m2337a("onJsPrompt", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            if (C9414f.this.m2327c("onPermissionRequest")) {
                super.onPermissionRequest(permissionRequest);
            }
            if (C9414f.this.m2325d("onPermissionRequest")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.PERMISSION_REQUEST, (permissionRequest == null || permissionRequest.getOrigin() == null) ? "" : permissionRequest.getOrigin().toString(), C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (C9414f.this.m2327c("onProgressChanged")) {
                super.onProgressChanged(webView, i);
            }
            if (C9414f.this.m2325d("onProgressChanged")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.PROGRESS_CHANGED, Integer.valueOf(i), C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            if (C9414f.this.m2327c("onReceivedIcon")) {
                super.onReceivedIcon(webView, bitmap);
            }
            if (C9414f.this.m2325d("onReceivedIcon")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.RECEIVED_ICON, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (C9414f.this.m2327c("onReceivedTitle")) {
                super.onReceivedTitle(webView, str);
            }
            if (C9414f.this.m2325d("onReceivedTitle")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.RECEIVED_TITLE, str, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
            if (C9414f.this.m2327c("onReceivedTouchIconUrl")) {
                super.onReceivedTouchIconUrl(webView, str, z);
            }
            if (C9414f.this.m2325d("onReceivedTouchIconUrl")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.RECEIVED_TOUCH_ICON_URL, str, Boolean.valueOf(z), C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onRequestFocus(WebView webView) {
            if (C9414f.this.m2327c("onRequestFocus")) {
                super.onRequestFocus(webView);
            }
            if (C9414f.this.m2325d("onRequestFocus")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.REQUEST_FOCUS, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (C9414f.this.m2327c("onShowCustomView")) {
                super.onShowCustomView(view, customViewCallback);
            }
            if (C9414f.this.m2325d("onShowCustomView")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.SHOW_CUSTOM_VIEW, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Boolean bool = Boolean.FALSE;
            if (C9414f.this.m2327c("onShowFileChooser")) {
                bool = Boolean.valueOf(super.onShowFileChooser(webView, valueCallback, fileChooserParams));
            }
            if (C9414f.this.m2325d("onShowFileChooser")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.SHOW_FILE_CHOOSER, C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("onShowFileChooser")) {
                bool = (Boolean) C9414f.this.m2337a("onShowFileChooser", Boolean.class, Boolean.TRUE);
                if (bool.booleanValue()) {
                    valueCallback.onReceiveValue(null);
                }
            }
            return bool.booleanValue();
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$e */
    /* loaded from: classes3.dex */
    public class C9419e extends WebViewClient {

        /* renamed from: com.unity3d.services.ads.webplayer.f$e$a */
        /* loaded from: classes3.dex */
        public class RunnableC9420a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ WebView f18449a;

            public RunnableC9420a(WebView webView) {
                this.f18449a = webView;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9565k.m1982a(this.f18449a);
                this.f18449a.destroy();
            }
        }

        private C9419e() {
        }

        public /* synthetic */ C9419e(C9414f c9414f, View$OnLayoutChangeListenerC9415a view$OnLayoutChangeListenerC9415a) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            if (C9414f.this.m2327c("onFormResubmission")) {
                super.onFormResubmission(webView, message, message2);
            }
            if (C9414f.this.m2325d("onFormResubmission")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.FORM_RESUBMISSION, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (C9414f.this.m2327c("onLoadResource")) {
                super.onLoadResource(webView, str);
            }
            if (C9414f.this.m2325d("onLoadResource")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.LOAD_RESOUCE, str, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            if (C9414f.this.m2327c("onPageCommitVisible")) {
                super.onPageCommitVisible(webView, str);
            }
            if (C9414f.this.m2325d("onPageCommitVisible")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.PAGE_COMMIT_VISIBLE, str, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (C9414f.this.m2327c("onPageFinished")) {
                super.onPageFinished(webView, str);
            }
            if (C9414f.this.m2325d("onPageFinished")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.PAGE_FINISHED, str, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (C9414f.this.m2327c("onPageStarted")) {
                super.onPageStarted(webView, str, bitmap);
            }
            if (C9414f.this.m2325d("onPageStarted")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.PAGE_STARTED, str, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            String str;
            int i;
            if (C9414f.this.m2327c("onReceivedClientCertRequest")) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
            if (C9414f.this.m2325d("onReceivedClientCertRequest")) {
                if (clientCertRequest != null) {
                    str = clientCertRequest.getHost();
                    i = clientCertRequest.getPort();
                } else {
                    str = "";
                    i = -1;
                }
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.CLIENT_CERT_REQUEST, str, Integer.valueOf(i), C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (C9414f.this.m2327c("onReceivedError")) {
                super.onReceivedError(webView, i, str, str2);
            }
            if (C9414f.this.m2325d("onReceivedError")) {
                C9412d.m2355a(C9414f.this.f18439d, str2, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(25)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (C9414f.this.m2327c("onReceivedError")) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
            if (C9414f.this.m2325d("onReceivedError")) {
                String str = "";
                String charSequence = (webResourceError == null || webResourceError.getDescription() == null) ? "" : webResourceError.getDescription().toString();
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    str = webResourceRequest.getUrl().toString();
                }
                C9412d.m2355a(C9414f.this.f18439d, str, charSequence);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            if (C9414f.this.m2327c("onReceivedHttpAuthRequest")) {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
            if (C9414f.this.m2325d("onReceivedHttpAuthRequest")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.HTTP_AUTH_REQUEST, str, str2, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String str;
            int i;
            if (C9414f.this.m2327c("onReceivedHttpError")) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
            if (C9414f.this.m2325d("onReceivedHttpError")) {
                String uri = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "" : webResourceRequest.getUrl().toString();
                if (webResourceResponse != null) {
                    i = webResourceResponse.getStatusCode();
                    str = webResourceResponse.getReasonPhrase();
                } else {
                    str = "";
                    i = -1;
                }
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.HTTP_ERROR, uri, str, Integer.valueOf(i), C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (C9414f.this.m2327c("onReceivedLoginRequest")) {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
            if (C9414f.this.m2325d("onReceivedLoginRequest")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.LOGIN_REQUEST, str, str2, str3, C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(14)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            C9549a.m2018b("Received SSL error for '%s': %s", sslError.getUrl(), sslError.toString());
            if (C9414f.this.m2325d("onReceivedSslError")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.SSL_ERROR, sslError.getUrl(), C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            C9564j.m1991a(new RunnableC9420a(webView));
            String str = C9414f.this.f18439d;
            String url = C9414f.this.getUrl();
            C9412d.m2355a(str, url, "UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            C9549a.m2017c("UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            if (C9414f.this.m2327c("onScaleChanged")) {
                super.onScaleChanged(webView, f, f2);
            }
            if (C9414f.this.m2325d("onScaleChanged")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.SCALE_CHANGED, Float.valueOf(f), Float.valueOf(f2), C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            if (C9414f.this.m2327c("onUnhandledKeyEvent")) {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
            if (C9414f.this.m2325d("onUnhandledKeyEvent")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.UNHANDLED_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), C9414f.this.f18439d);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse shouldInterceptRequest = C9414f.this.m2327c("shouldInterceptRequest") ? super.shouldInterceptRequest(webView, webResourceRequest) : null;
            if (C9414f.this.m2325d("shouldInterceptRequest")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.SHOULD_INTERCEPT_REQUEST, webResourceRequest.getUrl().toString(), C9414f.this.f18439d);
            }
            return shouldInterceptRequest;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            Boolean bool = Boolean.FALSE;
            if (C9414f.this.m2327c("shouldOverrideKeyEvent")) {
                bool = Boolean.valueOf(super.shouldOverrideKeyEvent(webView, keyEvent));
            }
            if (C9414f.this.m2325d("shouldOverrideKeyEvent")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.SHOULD_OVERRIDE_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("shouldOverrideKeyEvent")) {
                bool = (Boolean) C9414f.this.m2337a("shouldOverrideKeyEvent", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Boolean bool = Boolean.FALSE;
            if (C9414f.this.m2327c("shouldOverrideUrlLoading")) {
                bool = Boolean.valueOf(super.shouldOverrideUrlLoading(webView, webResourceRequest));
            }
            if (C9414f.this.m2325d("shouldOverrideUrlLoading")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.SHOULD_OVERRIDE_URL_LOADING, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("shouldOverrideUrlLoading")) {
                bool = (Boolean) C9414f.this.m2337a("shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Boolean bool = Boolean.FALSE;
            if (C9414f.this.m2327c("shouldOverrideUrlLoading")) {
                bool = Boolean.valueOf(super.shouldOverrideUrlLoading(webView, str));
            }
            if (C9414f.this.m2325d("shouldOverrideUrlLoading")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.SHOULD_OVERRIDE_URL_LOADING, str, C9414f.this.f18439d);
            }
            if (C9414f.this.m2338a("shouldOverrideUrlLoading")) {
                bool = (Boolean) C9414f.this.m2337a("shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }
    }

    /* renamed from: com.unity3d.services.ads.webplayer.f$f */
    /* loaded from: classes3.dex */
    public class C9421f implements DownloadListener {
        private C9421f() {
        }

        public /* synthetic */ C9421f(C9414f c9414f, View$OnLayoutChangeListenerC9415a view$OnLayoutChangeListenerC9415a) {
            this();
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (C9414f.this.m2325d("onDownloadStart")) {
                C9620a.m1774c().m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.DOWNLOAD_START, str, str2, str3, str4, Long.valueOf(j), C9414f.this.f18439d);
            }
        }
    }

    public C9414f(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        super(context);
        this.f18438c = null;
        this.f18440e = null;
        this.f18439d = str;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            this.f18438c = WebView.class.getMethod("evaluateJavascript", String.class, ValueCallback.class);
        } catch (NoSuchMethodException e) {
            C9549a.m2023a("Method evaluateJavascript not found", e);
            this.f18438c = null;
        }
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        C9565k.m1981a(this, new ColorDrawable(0));
        setBackgroundResource(0);
        m2334a(jSONObject, jSONObject2);
        setWebViewClient(new C9419e(this, null));
        setWebChromeClient(new C9418d(this, null));
        setDownloadListener(new C9421f(this, null));
        addJavascriptInterface(new C9409a(str), "webplayerbridge");
        C9422g.m2324a().m2322a(str, this);
        m2333b();
    }

    /* renamed from: a */
    private Object m2339a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    obj.getClass().getMethod(next, m2335a(jSONArray)).invoke(obj, m2329b(jSONArray));
                } catch (Exception e) {
                    m2336a(next, e.getMessage());
                    C9549a.m2023a("Setting errored", e);
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public <T> T m2337a(String str, Class<T> cls, T t) {
        try {
            JSONObject jSONObject = this.f18437b;
            if (jSONObject != null && jSONObject.has(str) && this.f18437b.getJSONObject(str).has("returnValue")) {
                return cls.cast(this.f18437b.getJSONObject(str).get("returnValue"));
            }
        } catch (Exception e) {
            C9549a.m2023a("Error getting default return value", e);
        }
        return t;
    }

    /* renamed from: a */
    private void m2336a(String str, String str2) {
        if (this.f18436a == null) {
            this.f18436a = new HashMap();
        }
        this.f18436a.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m2338a(String str) {
        try {
            JSONObject jSONObject = this.f18437b;
            if (jSONObject == null || !jSONObject.has(str)) {
                return false;
            }
            return this.f18437b.getJSONObject(str).has("returnValue");
        } catch (Exception e) {
            C9549a.m2023a("Error getting default return value", e);
            return false;
        }
    }

    /* renamed from: a */
    private Class<?>[] m2335a(JSONArray jSONArray) throws JSONException, ClassNotFoundException {
        if (jSONArray == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                clsArr[i] = Class.forName(((JSONObject) jSONArray.get(i)).getString("className"));
            } else {
                clsArr[i] = m2340a(jSONArray.get(i).getClass());
            }
        }
        return clsArr;
    }

    /* renamed from: b */
    private void m2333b() {
        Runnable runnable = this.f18440e;
        if (runnable != null) {
            runnable.run();
        }
        View$OnLayoutChangeListenerC9415a view$OnLayoutChangeListenerC9415a = new View$OnLayoutChangeListenerC9415a();
        addOnLayoutChangeListener(view$OnLayoutChangeListenerC9415a);
        this.f18440e = new RunnableC9416b(view$OnLayoutChangeListenerC9415a);
    }

    /* renamed from: b */
    private Object[] m2329b(JSONArray jSONArray) throws JSONException, ClassNotFoundException, NoSuchMethodException {
        if (jSONArray == null) {
            return null;
        }
        Object[] objArr = new Object[jSONArray.length()];
        Object[] objArr2 = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                Object obj = jSONObject.get("value");
                String string = jSONObject.getString("type");
                String string2 = jSONObject.has("className") ? jSONObject.getString("className") : null;
                if (string2 != null && string.equals("Enum")) {
                    objArr2[i] = Enum.valueOf(Class.forName(string2), (String) obj);
                }
            } else {
                objArr2[i] = jSONArray.get(i);
            }
        }
        System.arraycopy(objArr2, 0, objArr, 0, jSONArray.length());
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m2327c(String str) {
        try {
            JSONObject jSONObject = this.f18437b;
            if (jSONObject != null && jSONObject.has(str) && this.f18437b.getJSONObject(str).has("callSuper")) {
                return this.f18437b.getJSONObject(str).getBoolean("callSuper");
            }
            return true;
        } catch (Exception e) {
            C9549a.m2023a("Error getting super call status", e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public boolean m2325d(String str) {
        try {
            JSONObject jSONObject = this.f18437b;
            if (jSONObject != null && jSONObject.has(str) && this.f18437b.getJSONObject(str).has("sendEvent")) {
                return this.f18437b.getJSONObject(str).getBoolean("sendEvent");
            }
            return false;
        } catch (Exception e) {
            C9549a.m2023a("Error getting send event status", e);
            return false;
        }
    }

    /* renamed from: a */
    public Class<?> m2340a(Class<?> cls) {
        String name = cls.getName();
        return name.equals("java.lang.Byte") ? Byte.TYPE : name.equals("java.lang.Short") ? Short.TYPE : name.equals("java.lang.Integer") ? Integer.TYPE : name.equals("java.lang.Long") ? Long.TYPE : name.equals("java.lang.Character") ? Character.TYPE : name.equals("java.lang.Float") ? Float.TYPE : name.equals("java.lang.Double") ? Double.TYPE : name.equals("java.lang.Boolean") ? Boolean.TYPE : name.equals("java.lang.Void") ? Void.TYPE : cls;
    }

    /* renamed from: a */
    public void m2344a() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        C9412d.m2357a(this.f18439d, iArr[0], iArr[1], getWidth(), getHeight(), getAlpha());
    }

    /* renamed from: a */
    public void m2334a(JSONObject jSONObject, JSONObject jSONObject2) {
        Map<String, String> map = this.f18436a;
        if (map != null) {
            map.clear();
        }
        m2339a(getSettings(), jSONObject);
        m2339a(this, jSONObject2);
    }

    /* renamed from: b */
    public void m2330b(String str) {
        C9564j.m1991a(new RunnableC9417c(str, this));
    }

    /* renamed from: c */
    public void m2326c(JSONArray jSONArray) {
        m2330b("javascript:window.nativebridge.receiveEvent(" + jSONArray.toString() + ")");
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        C9422g.m2324a().m2321b(this.f18439d);
        Runnable runnable = this.f18440e;
        if (runnable != null) {
            runnable.run();
        }
    }

    public Map<String, String> getErroredSettings() {
        return this.f18436a;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m2344a();
    }

    public void setEventSettings(JSONObject jSONObject) {
        this.f18437b = jSONObject;
    }
}
