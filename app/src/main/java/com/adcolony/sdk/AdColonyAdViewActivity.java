package com.adcolony.sdk;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.adcolony.adsession.AbstractC8712b;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.p041b.C8731c;

/* loaded from: classes.dex */
public class AdColonyAdViewActivity extends ActivityC2209n0 {

    /* renamed from: j */
    public final C2178k f4909j;

    public AdColonyAdViewActivity() {
        C2178k c2178k;
        if (!C2201m0.m9586f()) {
            c2178k = null;
        } else {
            c2178k = C2201m0.m9588d().f4996n;
        }
        this.f4909j = c2178k;
    }

    /* renamed from: e */
    public final void m9710e() {
        ViewParent parent = this.f5376a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f5376a);
        }
        C2178k c2178k = this.f4909j;
        if (c2178k.f5319k || c2178k.f5322n) {
            C2201m0.m9588d().m9691l().getClass();
            float m9524g = C2247p4.m9524g();
            C2124h c2124h = c2178k.f5311c;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (c2124h.f5160a * m9524g), (int) (c2124h.f5161b * m9524g));
            C2135i1 c2135i1 = c2178k.f5309a;
            c2135i1.setLayoutParams(layoutParams);
            C2218o0 webView = c2178k.getWebView();
            if (webView != null) {
                C2100e2 c2100e2 = new C2100e2("WebView.set_bounds", 0);
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9657k(webView.getInitialX(), c2367y1, "x");
                C2080d1.m9657k(webView.getInitialY(), c2367y1, "y");
                C2080d1.m9657k(webView.getInitialWidth(), c2367y1, "width");
                C2080d1.m9657k(webView.getInitialHeight(), c2367y1, "height");
                c2100e2.f5098b = c2367y1;
                webView.setBounds(c2100e2);
                C2367y1 c2367y12 = new C2367y1();
                C2080d1.m9660h(c2367y12, "ad_session_id", c2178k.f5312d);
                new C2100e2(c2135i1.f5202k, c2367y12, "MRAID.on_close").m9640b();
            }
            ImageView imageView = c2178k.f5316h;
            if (imageView != null) {
                c2135i1.removeView(imageView);
                ImageView imageView2 = c2178k.f5316h;
                AbstractC8712b abstractC8712b = c2135i1.f5215x;
                if (abstractC8712b != null && imageView2 != null) {
                    try {
                        C8722l c8722l = (C8722l) abstractC8712b;
                        if (!c8722l.f16575g) {
                            int i = C8722l.f16568k;
                            C8731c m3190c = c8722l.m3190c(imageView2);
                            if (m3190c != null) {
                                c8722l.f16571c.remove(m3190c);
                            }
                        }
                    } catch (RuntimeException unused) {
                    }
                }
            }
            c2178k.addView(c2135i1);
            AbstractC2187l abstractC2187l = c2178k.f5310b;
            if (abstractC2187l != null) {
                abstractC2187l.onClosed(c2178k);
            }
        }
        C2201m0.m9588d().f4996n = null;
        finish();
    }

    @Override // com.adcolony.sdk.ActivityC2209n0, android.app.Activity
    public final void onBackPressed() {
        m9710e();
    }

    @Override // com.adcolony.sdk.ActivityC2209n0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C2178k c2178k;
        if (C2201m0.m9586f() && (c2178k = this.f4909j) != null) {
            this.f5377b = c2178k.getOrientation();
            super.onCreate(bundle);
            c2178k.m9602a();
            AbstractC2187l listener = c2178k.getListener();
            if (listener != null) {
                listener.onOpened(c2178k);
                return;
            }
            return;
        }
        C2201m0.m9588d().f4996n = null;
        finish();
    }
}
