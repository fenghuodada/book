package com.unity3d.services.core.webview;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;
import androidx.fragment.app.C1431t;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.misc.C9565k;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.webview.bridge.C9632e;
import com.unity3d.services.core.webview.bridge.C9633f;
import com.unity3d.services.core.webview.bridge.C9634g;
import com.unity3d.services.core.webview.bridge.EnumC9628a;
import com.unity3d.services.core.webview.bridge.InterfaceC9629b;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.unity3d.services.core.webview.a */
/* loaded from: classes3.dex */
public class C9620a implements InterfaceC9629b {

    /* renamed from: a */
    private static C9620a f19082a;

    /* renamed from: b */
    private static ConditionVariable f19083b;

    /* renamed from: c */
    private static AtomicReference<Boolean> f19084c = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: d */
    private static AtomicReference<String> f19085d = new AtomicReference<>();

    /* renamed from: e */
    private static AtomicReference<Integer> f19086e = new AtomicReference<>();

    /* renamed from: f */
    private boolean f19087f;

    /* renamed from: g */
    private WebView f19088g;

    /* renamed from: h */
    private Configuration f19089h;

    /* renamed from: i */
    private HashMap<String, C9633f> f19090i;

    /* renamed from: com.unity3d.services.core.webview.a$a */
    /* loaded from: classes3.dex */
    public static class RunnableC9621a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Configuration f19091a;

        public RunnableC9621a(Configuration configuration) {
            this.f19091a = configuration;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:(2:10|11)|(5:13|15|16|(1:18)|20)|23|15|16|(0)|20) */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
            com.unity3d.services.core.log.C9549a.m2023a("Unsupported charset when encoding webview version", r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[Catch: UnsupportedEncodingException -> 0x0081, TRY_LEAVE, TryCatch #1 {UnsupportedEncodingException -> 0x0081, blocks: (B:13:0x005a, B:15:0x0062), top: B:27:0x005a }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r13 = this;
                java.lang.String r0 = "UTF-8"
                java.lang.String r1 = "?platform=android&origin="
                com.unity3d.services.core.webview.a r2 = new com.unity3d.services.core.webview.a     // Catch: java.lang.Exception -> Lc3
                com.unity3d.services.core.configuration.Configuration r3 = r13.f19091a     // Catch: java.lang.Exception -> Lc3
                com.unity3d.services.core.configuration.Experiments r4 = r3.getExperiments()     // Catch: java.lang.Exception -> Lc3
                boolean r4 = r4.isWebAssetAdCaching()     // Catch: java.lang.Exception -> Lc3
                r5 = 0
                r2.<init>(r3, r4, r5)     // Catch: java.lang.Exception -> Lc3
                com.unity3d.services.core.webview.c r3 = new com.unity3d.services.core.webview.c
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "file://"
                r4.<init>(r5)
                java.lang.String r6 = com.unity3d.services.core.properties.C9572d.m1927m()
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                com.unity3d.services.core.configuration.Configuration r6 = r13.f19091a
                r3.<init>(r4, r6)
                java.lang.String r8 = r3.m1733a()
                if (r8 != 0) goto Lad
                com.unity3d.services.core.configuration.Configuration r3 = r13.f19091a     // Catch: java.io.UnsupportedEncodingException -> L52
                java.lang.String r3 = r3.getWebViewUrl()     // Catch: java.io.UnsupportedEncodingException -> L52
                if (r3 == 0) goto L58
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L52
                r3.<init>(r1)     // Catch: java.io.UnsupportedEncodingException -> L52
                com.unity3d.services.core.configuration.Configuration r1 = r13.f19091a     // Catch: java.io.UnsupportedEncodingException -> L52
                java.lang.String r1 = r1.getWebViewUrl()     // Catch: java.io.UnsupportedEncodingException -> L52
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> L52
                r3.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L52
                java.lang.String r1 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> L52
                goto L5a
            L52:
                r1 = move-exception
                java.lang.String r3 = "Unsupported charset when encoding origin url"
                com.unity3d.services.core.log.C9549a.m2023a(r3, r1)
            L58:
                java.lang.String r1 = "?platform=android"
            L5a:
                com.unity3d.services.core.configuration.Configuration r3 = r13.f19091a     // Catch: java.io.UnsupportedEncodingException -> L81
                java.lang.String r3 = r3.getWebViewVersion()     // Catch: java.io.UnsupportedEncodingException -> L81
                if (r3 == 0) goto L87
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L81
                r3.<init>()     // Catch: java.io.UnsupportedEncodingException -> L81
                r3.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L81
                java.lang.String r4 = "&version="
                r3.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L81
                com.unity3d.services.core.configuration.Configuration r4 = r13.f19091a     // Catch: java.io.UnsupportedEncodingException -> L81
                java.lang.String r4 = r4.getWebViewVersion()     // Catch: java.io.UnsupportedEncodingException -> L81
                java.lang.String r0 = java.net.URLEncoder.encode(r4, r0)     // Catch: java.io.UnsupportedEncodingException -> L81
                r3.append(r0)     // Catch: java.io.UnsupportedEncodingException -> L81
                java.lang.String r1 = r3.toString()     // Catch: java.io.UnsupportedEncodingException -> L81
                goto L87
            L81:
                r0 = move-exception
                java.lang.String r3 = "Unsupported charset when encoding webview version"
                com.unity3d.services.core.log.C9549a.m2023a(r3, r0)
            L87:
                com.unity3d.services.core.webview.WebView r6 = r2.m1770g()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r5)
                java.lang.String r3 = com.unity3d.services.core.properties.C9572d.m1927m()
                r0.append(r3)
                r0.append(r1)
                java.lang.String r7 = r0.toString()
                com.unity3d.services.core.configuration.Configuration r0 = r13.f19091a
                java.lang.String r8 = r0.getWebViewData()
                java.lang.String r9 = "text/html"
                java.lang.String r10 = "UTF-8"
                r11 = 0
                r6.loadDataWithBaseURL(r7, r8, r9, r10, r11)
                goto Lbf
            Lad:
                com.unity3d.services.core.webview.WebView r7 = r2.m1770g()
                com.unity3d.services.core.configuration.Configuration r0 = r13.f19091a
                java.lang.String r9 = r0.getWebViewData()
                java.lang.String r10 = "text/html"
                java.lang.String r11 = "UTF-8"
                r12 = 0
                r7.loadDataWithBaseURL(r8, r9, r10, r11, r12)
            Lbf:
                com.unity3d.services.core.webview.C9620a.m1787a(r2)
                return
            Lc3:
                java.lang.String r0 = "Couldn't construct WebViewApp"
                com.unity3d.services.core.log.C9549a.m2017c(r0)
                android.os.ConditionVariable r0 = com.unity3d.services.core.webview.C9620a.m1792a()
                r0.open()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.C9620a.RunnableC9621a.run():void");
        }
    }

    /* renamed from: com.unity3d.services.core.webview.a$b */
    /* loaded from: classes3.dex */
    public static class RunnableC9622b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Configuration f19092a;

        public RunnableC9622b(Configuration configuration) {
            this.f19092a = configuration;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C9620a c9620a = new C9620a(this.f19092a, true, null);
                c9620a.m1770g().loadUrl(new C9646c(this.f19092a.getWebViewUrl(), this.f19092a).m1733a());
                C9620a.m1787a(c9620a);
            } catch (Exception unused) {
                C9549a.m2017c("Couldn't construct WebViewApp");
                C9620a.f19083b.open();
            }
        }
    }

    /* renamed from: com.unity3d.services.core.webview.a$c */
    /* loaded from: classes3.dex */
    public class C9623c extends WebChromeClient {
        private C9623c() {
        }

        public /* synthetic */ C9623c(C9620a c9620a, RunnableC9621a runnableC9621a) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public void onConsoleMessage(String str, int i, String str2) {
            File file;
            try {
                file = new File(str2);
            } catch (Exception e) {
                C9549a.m2023a("Could not handle sourceId", e);
                file = null;
            }
            if (file != null) {
                file.getName();
            }
        }
    }

    /* renamed from: com.unity3d.services.core.webview.a$d */
    /* loaded from: classes3.dex */
    public class C9624d extends WebViewClient {

        /* renamed from: com.unity3d.services.core.webview.a$d$a */
        /* loaded from: classes3.dex */
        public class RunnableC9625a implements Runnable {
            public RunnableC9625a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().finish();
                }
                if (C9620a.m1774c() != null && C9620a.m1774c().m1770g() != null) {
                    C9565k.m1982a(C9620a.m1774c().m1770g());
                }
                InitializeThread.reset();
            }
        }

        /* renamed from: com.unity3d.services.core.webview.a$d$b */
        /* loaded from: classes3.dex */
        public class C9626b extends HashMap<String, String> {

            /* renamed from: a */
            final /* synthetic */ RenderProcessGoneDetail f19096a;

            public C9626b(RenderProcessGoneDetail renderProcessGoneDetail) {
                boolean didCrash;
                int rendererPriorityAtExit;
                this.f19096a = renderProcessGoneDetail;
                if (Build.VERSION.SDK_INT >= 26) {
                    StringBuilder sb = new StringBuilder("");
                    didCrash = renderProcessGoneDetail.didCrash();
                    sb.append(didCrash);
                    put("dc", sb.toString());
                    StringBuilder sb2 = new StringBuilder("");
                    rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
                    sb2.append(rendererPriorityAtExit);
                    put("pae", sb2.toString());
                }
            }
        }

        private C9624d() {
        }

        public /* synthetic */ C9624d(C9620a c9620a, RunnableC9621a runnableC9621a) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) {
            super.onPageFinished(webView, str);
            C9549a.m2019b("onPageFinished url: " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webView != null) {
                C9549a.m2017c("WEBVIEW_ERROR: " + webView.toString());
            }
            if (webResourceRequest != null) {
                C9549a.m2017c("WEBVIEW_ERROR: " + webResourceRequest.toString());
            }
            if (webResourceError != null) {
                C9549a.m2017c("WEBVIEW_ERROR: " + webResourceError.toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            C9564j.m1991a(new RunnableC9625a());
            C9549a.m2017c("UnityAds Sdk WebView onRenderProcessGone : " + renderProcessGoneDetail.toString());
            C9604i.m1839a().mo1833a("native_webview_render_process_gone", new C9626b(renderProcessGoneDetail));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
            C9549a.m2019b("Trying to load url: " + str);
            return false;
        }
    }

    private C9620a(Configuration configuration, boolean z) {
        this.f19087f = false;
        m1779b(configuration);
        C9634g.m1754a(m1780b().getWebAppApiClassList());
        WebView c9647d = z ? new C9647d(C9568a.m1959e()) : new WebView(C9568a.m1959e());
        this.f19088g = c9647d;
        c9647d.setWebViewClient(new C9624d(this, null));
        this.f19088g.setWebChromeClient(new C9623c(this, null));
    }

    public /* synthetic */ C9620a(Configuration configuration, boolean z, RunnableC9621a runnableC9621a) {
        this(configuration, z);
    }

    /* renamed from: a */
    private static ErrorState m1790a(Configuration configuration) {
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        C9564j.m1991a(new RunnableC9622b(configuration));
        ConditionVariable conditionVariable = new ConditionVariable();
        f19083b = conditionVariable;
        boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z = true;
        boolean z2 = m1774c() != null;
        boolean z3 = z2 && m1774c().m1769h();
        if (!block || !z2 || !z3) {
            z = false;
        }
        if (z) {
            return null;
        }
        return !block ? ErrorState.CreateWebviewTimeout : m1774c().m1773d();
    }

    /* renamed from: a */
    public static ErrorState m1789a(Configuration configuration, boolean z) throws IllegalThreadStateException {
        C9549a.m2029a();
        if (z) {
            return m1790a(configuration);
        }
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        C9564j.m1991a(new RunnableC9621a(configuration));
        ConditionVariable conditionVariable = new ConditionVariable();
        f19083b = conditionVariable;
        boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z2 = true;
        boolean z3 = m1774c() != null;
        boolean z4 = z3 && m1774c().m1769h();
        if (!block || !z3 || !z4) {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        return !block ? ErrorState.CreateWebviewTimeout : m1774c().m1773d();
    }

    /* renamed from: a */
    private String m1782a(String str, String str2, JSONArray jSONArray) throws JSONException {
        String jSONArray2 = jSONArray.toString();
        return C1431t.m10577a(C2745h.m9043a(jSONArray2.length() + str2.length() + str.length() + 22, "javascript:window.", str, ".", str2), "(", jSONArray2, ");");
    }

    /* renamed from: a */
    public static void m1787a(C9620a c9620a) {
        f19082a = c9620a;
    }

    /* renamed from: b */
    private void m1776b(String str, String str2, JSONArray jSONArray) throws JSONException {
        String m1782a = m1782a(str, str2, jSONArray);
        C9549a.m2022a("Invoking javascript: %s", m1782a);
        m1770g().m1793a(m1782a);
    }

    /* renamed from: c */
    public static C9620a m1774c() {
        return f19082a;
    }

    /* renamed from: d */
    private ErrorState m1773d() {
        int m1772e = m1772e();
        return m1772e == 1 ? ErrorState.CreateWebviewGameIdDisabled : m1772e == 2 ? ErrorState.CreateWebviewConfigError : m1772e == 3 ? ErrorState.CreateWebviewInvalidArgument : ErrorState.CreateWebview;
    }

    /* renamed from: a */
    public C9633f m1783a(String str) {
        C9633f c9633f;
        synchronized (this.f19090i) {
            c9633f = this.f19090i.get(str);
        }
        return c9633f;
    }

    /* renamed from: a */
    public void m1791a(int i) {
        f19086e.set(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m1788a(WebView webView) {
        this.f19088g = webView;
    }

    /* renamed from: a */
    public void m1785a(C9633f c9633f) {
        if (this.f19090i == null) {
            this.f19090i = new HashMap<>();
        }
        synchronized (this.f19090i) {
            this.f19090i.put(c9633f.m1758a(), c9633f);
        }
    }

    /* renamed from: a */
    public void m1781a(boolean z) {
        f19084c.set(Boolean.valueOf(z));
        f19083b.open();
    }

    /* renamed from: a */
    public boolean m1786a(C9632e c9632e) {
        if (!m1768i()) {
            C9549a.m2019b("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<ArrayList<Object>> m1761b = c9632e.m1761b();
        if (m1761b != null && !m1761b.isEmpty()) {
            Iterator<ArrayList<Object>> it = m1761b.iterator();
            while (it.hasNext()) {
                ArrayList<Object> next = it.next();
                Enum r5 = (Enum) next.get(1);
                Object[] objArr = (Object[]) next.get(2);
                Object[] copyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) objArr[0]);
                arrayList.add(((EnumC9628a) next.get(0)).toString());
                JSONArray jSONArray2 = new JSONArray();
                if (r5 != null) {
                    jSONArray2.put(r5.name());
                }
                for (Object obj : copyOfRange) {
                    jSONArray2.put(obj);
                }
                arrayList.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            m1776b("nativebridge", "handleCallback", jSONArray);
        } catch (Exception e) {
            C9549a.m2023a("Error while invoking batch response for WebView", e);
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1784a(Enum r4, Enum r5, Object... objArr) {
        if (!m1768i()) {
            C9549a.m2019b("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r4.name());
        jSONArray.put(r5.name());
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        try {
            m1776b("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Exception e) {
            C9549a.m2023a("Error while sending event to WebView", e);
            return false;
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9629b
    /* renamed from: a */
    public boolean mo1742a(String str, String str2, Method method, Object... objArr) {
        String str3;
        if (!m1768i()) {
            C9549a.m2019b("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            C9633f c9633f = new C9633f(method);
            m1785a(c9633f);
            str3 = c9633f.m1758a();
        } else {
            str3 = null;
        }
        jSONArray.put(str3);
        if (objArr != null) {
            for (Object obj : objArr) {
                jSONArray.put(obj);
            }
        }
        try {
            m1776b("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Exception e) {
            C9549a.m2023a("Error invoking javascript method", e);
            return false;
        }
    }

    /* renamed from: b */
    public Configuration m1780b() {
        return this.f19089h;
    }

    /* renamed from: b */
    public void m1779b(Configuration configuration) {
        this.f19089h = configuration;
    }

    /* renamed from: b */
    public void m1778b(C9633f c9633f) {
        HashMap<String, C9633f> hashMap = this.f19090i;
        if (hashMap == null) {
            return;
        }
        synchronized (hashMap) {
            this.f19090i.remove(c9633f.m1758a());
        }
    }

    /* renamed from: b */
    public void m1777b(String str) {
        f19085d.set(str);
    }

    /* renamed from: b */
    public void m1775b(boolean z) {
        this.f19087f = z;
    }

    /* renamed from: e */
    public int m1772e() {
        return f19086e.get().intValue();
    }

    /* renamed from: f */
    public String m1771f() {
        return f19085d.get();
    }

    /* renamed from: g */
    public WebView m1770g() {
        return this.f19088g;
    }

    /* renamed from: h */
    public boolean m1769h() {
        return f19084c.get().booleanValue();
    }

    /* renamed from: i */
    public boolean m1768i() {
        return this.f19087f;
    }

    /* renamed from: j */
    public void m1767j() {
        this.f19087f = false;
        f19086e.set(-1);
        f19085d.set("");
        f19084c.set(Boolean.FALSE);
    }
}
