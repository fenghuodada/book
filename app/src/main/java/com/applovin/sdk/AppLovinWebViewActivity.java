package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.provider.C0758e;
import com.applovin.impl.adview.C2808x;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";

    /* renamed from: a */
    private String f8979a;

    /* renamed from: b */
    private WebView f8980b;

    /* renamed from: c */
    private EventListener f8981c;

    /* loaded from: classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f8981c = eventListener;
        WebView webView = this.f8980b;
        if (webView == null) {
            this.f8979a = str;
        } else {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f8981c;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinWebViewActivity", "No SDK key specified");
            }
            finish();
            return;
        }
        final C3214m c3214m = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).coreSdk;
        WebView tryToCreateWebView = Utils.tryToCreateWebView(this, "WebView Activity");
        this.f8980b = tryToCreateWebView;
        if (tryToCreateWebView == null) {
            finish();
            return;
        }
        setContentView(tryToCreateWebView);
        WebSettings settings = this.f8980b.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f8980b.setVerticalScrollBarEnabled(true);
        this.f8980b.setHorizontalScrollBarEnabled(true);
        this.f8980b.setScrollBarStyle(33554432);
        this.f8980b.setWebViewClient(new WebViewClient() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                String str2;
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                if (C3349v.m6862a()) {
                    C2808x.m8855b("Handling url load: ", str, c3214m.m7487A(), "AppLovinWebViewActivity");
                }
                if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f8981c != null) {
                    if (path.endsWith("webview_event")) {
                        Set<String> queryParameterNames = parse.getQueryParameterNames();
                        if (queryParameterNames.isEmpty()) {
                            str2 = "";
                        } else {
                            str2 = (String) queryParameterNames.toArray()[0];
                        }
                        if (StringUtils.isValidString(str2)) {
                            String queryParameter = parse.getQueryParameter(str2);
                            if (C3349v.m6862a()) {
                                c3214m.m7487A().m6855b("AppLovinWebViewActivity", C0758e.m11827a("Parsed WebView event parameter name: ", str2, " and value: ", queryParameter));
                            }
                            AppLovinWebViewActivity.this.f8981c.onReceivedEvent(queryParameter);
                            return true;
                        } else if (C3349v.m6862a()) {
                            c3214m.m7487A().m6850e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                            return true;
                        } else {
                            return true;
                        }
                    }
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        if (StringUtils.isValidString(this.f8979a)) {
            this.f8980b.loadUrl(this.f8979a);
        }
    }
}
