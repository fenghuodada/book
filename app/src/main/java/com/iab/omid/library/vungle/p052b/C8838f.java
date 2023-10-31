package com.iab.omid.library.vungle.p052b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.C8831b;

/* renamed from: com.iab.omid.library.vungle.b.f */
/* loaded from: classes3.dex */
public final class C8838f {
    @VisibleForTesting
    /* renamed from: a */
    public static void m2937a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
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
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new RunnableC8837e(webView, sb2));
                return;
            } else {
                webView.loadUrl(sb2);
                return;
            }
        }
        String concat = "The WebView is null for ".concat(str);
        if (C8831b.f16828a.booleanValue() && !TextUtils.isEmpty(concat)) {
            Log.i("OMIDLIB", concat);
        }
    }
}
