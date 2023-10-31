package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.adview.c */
/* loaded from: classes.dex */
public class C2761c extends WebChromeClient {

    /* renamed from: a */
    private final C3349v f6601a;

    /* renamed from: b */
    private final C2746b f6602b;

    public C2761c(@Nullable C2746b c2746b, C3214m c3214m) {
        this.f6601a = c3214m.m7487A();
        this.f6602b = c2746b;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6601a;
            c3349v.m6851d("AdWebView", "console.log[" + i + "] :" + str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (C3349v.m6862a()) {
            this.f6601a.m6855b("AdWebView", consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6601a;
            c3349v.m6851d("AdWebView", "Alert attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6601a;
            c3349v.m6851d("AdWebView", "JS onBeforeUnload attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6601a;
            c3349v.m6851d("AdWebView", "JS confirm attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        C2746b c2746b;
        if (i != 100 || (c2746b = this.f6602b) == null) {
            return;
        }
        c2746b.m9038a(webView);
    }
}
