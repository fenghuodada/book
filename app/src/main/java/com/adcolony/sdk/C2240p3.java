package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.C2190l2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.adcolony.sdk.p3 */
/* loaded from: classes.dex */
public final class C2240p3 extends C2190l2 {
    @JvmField

    /* renamed from: F */
    public static boolean f5458F;

    /* renamed from: com.adcolony.sdk.p3$a */
    /* loaded from: classes.dex */
    public final class C2241a extends C2190l2.C2191a {
        public C2241a() {
            super();
        }

        @Override // com.adcolony.sdk.C2190l2.C2191a, com.adcolony.sdk.C2088e1.C2091c, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2246f().m9531a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.p3$b */
    /* loaded from: classes.dex */
    public final class C2242b extends C2190l2.C2192b {
        public C2242b() {
            super();
        }

        @Override // com.adcolony.sdk.C2190l2.C2192b, com.adcolony.sdk.C2088e1.C2092d, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2246f().m9531a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.p3$c */
    /* loaded from: classes.dex */
    public final class C2243c extends C2190l2.C2193c {
        public C2243c() {
            super();
        }

        @Override // com.adcolony.sdk.C2190l2.C2193c, com.adcolony.sdk.C2088e1.C2093e, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2246f().m9531a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.p3$d */
    /* loaded from: classes.dex */
    public final class C2244d extends C2190l2.C2194d {
        public C2244d() {
            super();
        }

        @Override // com.adcolony.sdk.C2190l2.C2194d, com.adcolony.sdk.C2088e1.C2094f, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2246f().m9531a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.p3$e */
    /* loaded from: classes.dex */
    public final class C2245e extends C2190l2.C2195e {
        public C2245e() {
            super();
        }

        @Override // com.adcolony.sdk.C2190l2.C2195e, com.adcolony.sdk.C2088e1.C2095g, com.adcolony.sdk.C2218o0.C2220b, android.webkit.WebViewClient
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            new C2246f().m9531a();
            super.onPageFinished(webView, str);
        }
    }

    /* renamed from: com.adcolony.sdk.p3$f */
    /* loaded from: classes.dex */
    public final class C2246f {
        public C2246f() {
        }

        /* renamed from: a */
        public final void m9531a() {
            boolean z;
            C2240p3 c2240p3 = C2240p3.this;
            if (!c2240p3.getModuleInitialized()) {
                C2328v1 c2328v1 = new C2328v1();
                C2145j1 m9692k = C2201m0.m9588d().m9692k();
                m9692k.getClass();
                ArrayList arrayList = new ArrayList();
                for (C2249q c2249q : m9692k.f5266c.values()) {
                    int i = c2249q.f5487l;
                    if (i != 4 && i != 5 && i != 6) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(c2249q);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C2249q c2249q2 = (C2249q) it.next();
                    C2367y1 c2367y1 = new C2367y1();
                    C2080d1.m9660h(c2367y1, "ad_session_id", c2249q2.f5482g);
                    String str = c2249q2.f5483h;
                    if (str == null) {
                        str = "";
                    }
                    C2080d1.m9660h(c2367y1, "ad_id", str);
                    C2080d1.m9660h(c2367y1, "zone_id", c2249q2.f5484i);
                    C2080d1.m9660h(c2367y1, "ad_request_id", c2249q2.f5486k);
                    c2328v1.m9486a(c2367y1);
                }
                C2080d1.m9662f(c2240p3.getInfo(), "ads_to_restore", c2328v1);
            }
        }
    }

    public C2240p3(Context context, C2100e2 c2100e2) {
        super(context, 1, c2100e2);
    }

    @Override // com.adcolony.sdk.C2190l2, com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new C2242b();
    }

    @Override // com.adcolony.sdk.C2190l2, com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new C2243c();
    }

    @Override // com.adcolony.sdk.C2190l2, com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new C2244d();
    }

    @Override // com.adcolony.sdk.C2190l2, com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new C2245e();
    }

    @Override // com.adcolony.sdk.C2190l2, com.adcolony.sdk.C2088e1, com.adcolony.sdk.C2218o0
    public /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new C2241a();
    }

    @Override // com.adcolony.sdk.C2218o0
    /* renamed from: k */
    public final boolean mo9516k(C2367y1 c2367y1, String str) {
        if (!super.mo9516k(c2367y1, str)) {
            C2201m0.m9588d().m9689n().m9706d("Unable to communicate with controller, disabling AdColony.", 0, 0, false);
            C2074d.m9671f();
            return true;
        }
        return true;
    }

    @Override // com.adcolony.sdk.C2088e1
    /* renamed from: u */
    public final String mo9532u(C2367y1 c2367y1) {
        if (f5458F) {
            return "android_asset/ADCController.js";
        }
        return c2367y1.m9436w("filepath");
    }
}
