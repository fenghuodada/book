package com.applovin.impl.sdk;

import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.ab */
/* loaded from: classes.dex */
public class C3072ab {
    @Nullable

    /* renamed from: a */
    private static WebView f7635a;

    /* renamed from: b */
    private static volatile String f7636b;

    /* renamed from: a */
    public static String m8014a() {
        return f7636b;
    }

    /* renamed from: a */
    public static void m8013a(C3214m c3214m) {
    }

    /* renamed from: b */
    public static void m8010b(final C3214m c3214m) {
        if (f7636b != null) {
            return;
        }
        f7636b = "";
        if (C3294g.m7025b()) {
            c3214m.m7469S().m7620a(new C3189z(c3214m, true, new Runnable() { // from class: com.applovin.impl.sdk.ab.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String unused = C3072ab.f7636b = WebSettings.getDefaultUserAgent(C3214m.this.m7476L());
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3214m.this.m7487A().m6854b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            }), C3163o.EnumC3165a.BACKGROUND);
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ab.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C3072ab.m8013a(C3214m.this);
                        String unused = C3072ab.f7636b = C3072ab.f7635a.getSettings().getUserAgentString();
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3214m.this.m7487A().m6854b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            });
        }
    }
}
