package com.iab.omid.library.applovin.p046b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.p048d.C8792c;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.b.e */
/* loaded from: classes3.dex */
public class C8780e {

    /* renamed from: a */
    private static C8780e f16706a = new C8780e();

    private C8780e() {
    }

    /* renamed from: a */
    public static final C8780e m3104a() {
        return f16706a;
    }

    /* renamed from: a */
    public void m3103a(WebView webView) {
        m3096a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public void m3102a(WebView webView, float f) {
        m3096a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: a */
    public void m3101a(WebView webView, ErrorType errorType, String str) {
        m3096a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void m3099a(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m3100a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m3098a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m3096a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            m3096a(webView, "publishMediaEvent", str);
        }
    }

    /* renamed from: a */
    public void m3097a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m3096a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m3096a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C8792c.m3044a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        m3093a(sb, objArr);
        sb.append(")}");
        m3095a(webView, sb);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m3095a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() { // from class: com.iab.omid.library.applovin.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    /* renamed from: a */
    public void m3094a(WebView webView, JSONObject jSONObject) {
        m3096a(webView, "init", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m3093a(StringBuilder sb, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                sb.append('\"');
            } else {
                if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb.append(obj2);
                    } else {
                        sb.append('\"');
                        sb.append(obj2);
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append('\"');
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    /* renamed from: a */
    public boolean m3100a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: b */
    public void m3092b(WebView webView) {
        m3096a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public void m3091b(WebView webView, String str) {
        m3096a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: b */
    public void m3090b(WebView webView, @NonNull JSONObject jSONObject) {
        m3096a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public void m3089c(WebView webView) {
        m3096a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: c */
    public void m3088c(WebView webView, String str) {
        m3096a(webView, "setState", str);
    }
}
