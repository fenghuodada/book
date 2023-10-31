package com.unity3d.services.ads.token;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.EnumC9514j;
import com.unity3d.services.core.device.reader.C9517a;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9569b;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.request.metrics.C9597d;
import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.request.metrics.C9606j;
import com.unity3d.services.core.request.metrics.InterfaceC9596c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.ads.token.a */
/* loaded from: classes3.dex */
public class C9383a {

    /* renamed from: a */
    private static C9383a f18314a;

    /* renamed from: c */
    private final Handler f18316c;

    /* renamed from: g */
    private InterfaceC9389b f18320g;

    /* renamed from: b */
    private final List<C9388d> f18315b = new LinkedList();

    /* renamed from: d */
    private boolean f18317d = false;

    /* renamed from: e */
    private boolean f18318e = false;

    /* renamed from: f */
    private Configuration f18319f = new Configuration();

    /* renamed from: h */
    private final C9569b f18321h = new C9569b();

    /* renamed from: com.unity3d.services.ads.token.a$a */
    /* loaded from: classes3.dex */
    public class RunnableC9384a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9388d f18322a;

        public RunnableC9384a(C9388d c9388d) {
            this.f18322a = c9388d;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9383a.this.m2394a(this.f18322a, null, EnumC9514j.TOKEN_NATIVE);
        }
    }

    /* renamed from: com.unity3d.services.ads.token.a$b */
    /* loaded from: classes3.dex */
    public class C9385b implements InterfaceC9390c {

        /* renamed from: a */
        final /* synthetic */ C9388d f18324a;

        /* renamed from: com.unity3d.services.ads.token.a$b$a */
        /* loaded from: classes3.dex */
        public class RunnableC9386a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f18326a;

            public RunnableC9386a(String str) {
                this.f18326a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9385b c9385b = C9385b.this;
                C9383a.this.m2394a(c9385b.f18324a, this.f18326a, EnumC9514j.TOKEN_NATIVE);
            }
        }

        public C9385b(C9388d c9388d) {
            this.f18324a = c9388d;
        }

        @Override // com.unity3d.services.ads.token.InterfaceC9390c
        /* renamed from: a */
        public void mo2367a(String str) {
            C9383a.this.f18316c.post(new RunnableC9386a(str));
        }
    }

    /* renamed from: com.unity3d.services.ads.token.a$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9387c {

        /* renamed from: a */
        static final /* synthetic */ int[] f18328a;

        static {
            int[] iArr = new int[EnumC9514j.values().length];
            f18328a = iArr;
            try {
                iArr[EnumC9514j.TOKEN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18328a[EnumC9514j.TOKEN_REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.token.a$d */
    /* loaded from: classes3.dex */
    public class C9388d {

        /* renamed from: a */
        public IUnityAdsTokenListener f18329a;

        /* renamed from: b */
        public Runnable f18330b;

        /* renamed from: c */
        public boolean f18331c;

        public C9388d() {
        }
    }

    public C9383a(InterfaceC9389b interfaceC9389b, Handler handler) {
        this.f18316c = handler;
        this.f18320g = interfaceC9389b;
    }

    /* renamed from: a */
    private synchronized C9388d m2396a(IUnityAdsTokenListener iUnityAdsTokenListener) {
        C9388d c9388d;
        c9388d = new C9388d();
        c9388d.f18329a = iUnityAdsTokenListener;
        c9388d.f18330b = new RunnableC9384a(c9388d);
        this.f18315b.add(c9388d);
        this.f18316c.postDelayed(c9388d.f18330b, this.f18319f.getTokenTimeout());
        return c9388d;
    }

    /* renamed from: a */
    public static C9383a m2397a() {
        if (f18314a == null) {
            f18314a = new C9383a(null, new Handler(Looper.getMainLooper()));
        }
        return f18314a;
    }

    /* renamed from: a */
    private void m2395a(C9388d c9388d) {
        if (c9388d.f18331c) {
            return;
        }
        c9388d.f18331c = true;
        if (!this.f18317d && this.f18319f.getExperiments().isNativeTokenEnabled()) {
            this.f18320g.mo2380a(new C9385b(c9388d));
            return;
        }
        String m2368c = C9398h.m2368c();
        if (m2368c == null || m2368c.isEmpty()) {
            return;
        }
        m2394a(c9388d, m2368c, EnumC9514j.TOKEN_REMOTE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m2394a(C9388d c9388d, String str, EnumC9514j enumC9514j) {
        if (this.f18315b.remove(c9388d)) {
            c9388d.f18329a.onUnityAdsTokenReady(str);
            try {
                this.f18316c.removeCallbacks(c9388d.f18330b);
            } catch (Exception e) {
                C9549a.m2023a("Failed to remove callback from a handler", e);
            }
        }
        m2388a(str, enumC9514j);
    }

    /* renamed from: a */
    private synchronized void m2390a(EnumC9514j enumC9514j) {
        String m2368c;
        while (!this.f18315b.isEmpty() && (m2368c = C9398h.m2368c()) != null) {
            m2394a(this.f18315b.get(0), m2368c, enumC9514j);
        }
    }

    /* renamed from: a */
    private void m2389a(String str) {
        InterfaceC9596c m1839a;
        C9597d m1819c;
        if (str == null) {
            m1839a = C9604i.m1839a();
            m1819c = C9606j.m1815d(m2387b());
        } else {
            m1839a = C9604i.m1839a();
            m1819c = C9606j.m1819c(m2387b());
        }
        m1839a.sendMetric(m1819c);
    }

    /* renamed from: a */
    private void m2388a(String str, EnumC9514j enumC9514j) {
        int i = C9387c.f18328a[enumC9514j.ordinal()];
        if (i == 1) {
            m2389a(str);
        } else if (i != 2) {
            C9549a.m2017c("Unknown token type passed to sendTokenMetrics");
        } else {
            m2383b(str);
        }
    }

    /* renamed from: a */
    private boolean m2391a(Configuration configuration) {
        return (configuration == null || configuration.getExperiments() == null) ? false : true;
    }

    /* renamed from: b */
    private Map<String, String> m2387b() {
        HashMap hashMap = new HashMap();
        hashMap.put("state", this.f18321h.m1956a(C9572d.m1935e()));
        return hashMap;
    }

    /* renamed from: b */
    private void m2383b(String str) {
        InterfaceC9596c m1839a;
        C9597d m1823b;
        if (str == null || str.isEmpty()) {
            m1839a = C9604i.m1839a();
            m1823b = C9606j.m1823b(m2387b());
        } else {
            m1839a = C9604i.m1839a();
            m1823b = C9606j.m1827a(m2387b());
        }
        m1839a.sendMetric(m1823b);
    }

    /* renamed from: b */
    public synchronized void m2386b(IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (C9572d.m1935e() == C9572d.EnumC9573a.INITIALIZED_FAILED) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
            m2388a(null, EnumC9514j.TOKEN_REMOTE);
        } else if (C9572d.m1935e() == C9572d.EnumC9573a.NOT_INITIALIZED) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
            m2388a(null, EnumC9514j.TOKEN_REMOTE);
        } else {
            C9388d m2396a = m2396a(iUnityAdsTokenListener);
            if (this.f18318e) {
                m2395a(m2396a);
            }
        }
    }

    /* renamed from: b */
    public synchronized void m2385b(Configuration configuration) {
        this.f18319f = configuration;
        boolean m2391a = m2391a(configuration);
        this.f18318e = m2391a;
        if (m2391a) {
            if (this.f18320g == null) {
                C9517a c9517a = new C9517a(new ConfigurationReader(), PrivacyConfigStorage.getInstance());
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this.f18320g = new C9391d(newSingleThreadExecutor, c9517a);
                if (configuration.getExperiments().shouldNativeTokenAwaitPrivacy()) {
                    this.f18320g = new C9393e(newSingleThreadExecutor, this.f18320g, configuration.getPrivacyRequestWaitTimeout());
                }
            }
            Iterator it = new ArrayList(this.f18315b).iterator();
            while (it.hasNext()) {
                m2395a((C9388d) it.next());
            }
        }
    }

    /* renamed from: b */
    public synchronized void m2384b(EnumC9514j enumC9514j) {
        this.f18317d = true;
        if (this.f18318e) {
            m2390a(enumC9514j);
        }
    }
}
