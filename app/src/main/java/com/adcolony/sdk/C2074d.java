package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2232o6;
import com.google.ads.mediation.adcolony.AdColonyRewardedEventForwarder;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.vungle.warren.VungleApiClient;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.d */
/* loaded from: classes.dex */
public final class C2074d {

    /* renamed from: a */
    public static ExecutorService f5043a = C2232o6.m9563A();

    /* renamed from: com.adcolony.sdk.d$a */
    /* loaded from: classes.dex */
    public class C2075a implements C2232o6.InterfaceRunnableC2233a {

        /* renamed from: a */
        public boolean f5044a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC2187l f5045b;

        /* renamed from: c */
        public final /* synthetic */ String f5046c;

        /* renamed from: d */
        public final /* synthetic */ C2232o6.C2234b f5047d;

        public C2075a(AbstractC2187l abstractC2187l, String str, C2232o6.C2234b c2234b) {
            this.f5045b = abstractC2187l;
            this.f5046c = str;
            this.f5047d = c2234b;
        }

        @Override // com.adcolony.sdk.C2232o6.InterfaceRunnableC2233a
        /* renamed from: a */
        public final boolean mo9518a() {
            return this.f5044a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            synchronized (this) {
                if (this.f5044a) {
                    return;
                }
                this.f5044a = true;
                AbstractC2187l abstractC2187l = this.f5045b;
                String str = this.f5046c;
                if (abstractC2187l != null) {
                    C2232o6.m9548o(new RunnableC2054b(abstractC2187l, str));
                }
                if (this.f5047d.m9536a() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder("RequestNotFilled called due to a native timeout. ");
                    sb.append("Timeout set to: " + this.f5047d.f5448a + " ms. ");
                    StringBuilder sb2 = new StringBuilder("Execution took: ");
                    long currentTimeMillis = System.currentTimeMillis();
                    C2232o6.C2234b c2234b = this.f5047d;
                    sb2.append(currentTimeMillis - (c2234b.f5449b - c2234b.f5448a));
                    sb2.append(" ms. ");
                    sb.append(sb2.toString());
                    sb.append("AdView request not yet started.");
                    C1169e.m11129c(sb.toString(), 0, 0, true);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$b */
    /* loaded from: classes.dex */
    public class RunnableC2076b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2232o6.InterfaceRunnableC2233a f5048a;

        /* renamed from: b */
        public final /* synthetic */ String f5049b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC2187l f5050c;

        /* renamed from: d */
        public final /* synthetic */ C2124h f5051d;

        /* renamed from: e */
        public final /* synthetic */ C2114g f5052e;

        /* renamed from: f */
        public final /* synthetic */ C2232o6.C2234b f5053f;

        public RunnableC2076b(C2075a c2075a, String str, AbstractC2187l abstractC2187l, C2124h c2124h, C2114g c2114g, C2232o6.C2234b c2234b) {
            this.f5048a = c2075a;
            this.f5049b = str;
            this.f5050c = abstractC2187l;
            this.f5051d = c2124h;
            this.f5052e = c2114g;
            this.f5053f = c2234b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2367y1 c2367y1;
            C2058b3 m9588d = C2201m0.m9588d();
            boolean z = m9588d.f4960B;
            C2232o6.InterfaceRunnableC2233a interfaceRunnableC2233a = this.f5048a;
            if (!z && !m9588d.f4961C) {
                C2058b3 m9588d2 = C2201m0.m9588d();
                m9588d2.f4962D.m9428a(15000L);
                if (!m9588d2.f4962D.f5701a && C2201m0.m9587e()) {
                    C2232o6.m9557f(interfaceRunnableC2233a);
                    return;
                }
                C2232o6.m9545r(interfaceRunnableC2233a);
                if (!interfaceRunnableC2233a.mo9518a()) {
                    C2145j1 m9692k = m9588d.m9692k();
                    String str = this.f5049b;
                    long m9536a = this.f5053f.m9536a();
                    m9692k.getClass();
                    String m9559d = C2232o6.m9559d();
                    C2201m0.m9588d().m9691l().getClass();
                    float m9524g = C2247p4.m9524g();
                    C2367y1 c2367y12 = new C2367y1();
                    C2080d1.m9660h(c2367y12, "zone_id", str);
                    C2080d1.m9657k(1, c2367y12, "type");
                    C2124h c2124h = this.f5051d;
                    C2080d1.m9657k((int) (c2124h.f5160a * m9524g), c2367y12, "width_pixels");
                    int i = c2124h.f5161b;
                    C2080d1.m9657k((int) (i * m9524g), c2367y12, "height_pixels");
                    C2080d1.m9657k(c2124h.f5160a, c2367y12, "width");
                    C2080d1.m9657k(i, c2367y12, "height");
                    C2080d1.m9660h(c2367y12, FacebookAdapter.KEY_ID, m9559d);
                    C2114g c2114g = this.f5052e;
                    if (c2114g != null && (c2367y1 = c2114g.f5121c) != null) {
                        C2080d1.m9661g(c2367y12, "options", c2367y1);
                    }
                    AbstractC2187l abstractC2187l = this.f5050c;
                    abstractC2187l.m9598a(str);
                    abstractC2187l.m9599a(c2124h);
                    m9692k.f5267d.put(m9559d, abstractC2187l);
                    m9692k.f5264a.put(m9559d, new RunnableC2226o1(m9692k, m9559d, str, m9536a));
                    new C2100e2(1, c2367y12, "AdSession.on_request").m9640b();
                    C2232o6.m9556g(m9692k.f5264a.get(m9559d), m9536a);
                    return;
                }
                return;
            }
            C2201m0.m9588d().m9689n().m9706d("The AdColony API is not available while AdColony is disabled.", 0, 0, false);
            C2232o6.m9557f(interfaceRunnableC2233a);
        }
    }

    /* renamed from: com.adcolony.sdk.d$c */
    /* loaded from: classes.dex */
    public class C2077c implements C2232o6.InterfaceRunnableC2233a {

        /* renamed from: a */
        public boolean f5054a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC2317u f5055b;

        /* renamed from: c */
        public final /* synthetic */ String f5056c;

        /* renamed from: d */
        public final /* synthetic */ C2232o6.C2234b f5057d;

        public C2077c(AbstractC2317u abstractC2317u, String str, C2232o6.C2234b c2234b) {
            this.f5055b = abstractC2317u;
            this.f5056c = str;
            this.f5057d = c2234b;
        }

        @Override // com.adcolony.sdk.C2232o6.InterfaceRunnableC2233a
        /* renamed from: a */
        public final boolean mo9518a() {
            return this.f5054a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            synchronized (this) {
                if (this.f5054a) {
                    return;
                }
                this.f5054a = true;
                AbstractC2317u abstractC2317u = this.f5055b;
                String str = this.f5056c;
                if (abstractC2317u != null) {
                    C2232o6.m9548o(new RunnableC2105f(abstractC2317u, str));
                }
                if (this.f5057d.m9536a() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder("RequestNotFilled called due to a native timeout. ");
                    sb.append("Timeout set to: " + this.f5057d.f5448a + " ms. ");
                    StringBuilder sb2 = new StringBuilder("Execution took: ");
                    long currentTimeMillis = System.currentTimeMillis();
                    C2232o6.C2234b c2234b = this.f5057d;
                    sb2.append(currentTimeMillis - (c2234b.f5449b - c2234b.f5448a));
                    sb2.append(" ms. ");
                    sb.append(sb2.toString());
                    sb.append("Interstitial request not yet started.");
                    C1169e.m11129c(sb.toString(), 0, 0, true);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d$d */
    /* loaded from: classes.dex */
    public class RunnableC2078d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2232o6.InterfaceRunnableC2233a f5058a;

        /* renamed from: b */
        public final /* synthetic */ String f5059b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC2317u f5060c;

        /* renamed from: d */
        public final /* synthetic */ C2114g f5061d;

        /* renamed from: e */
        public final /* synthetic */ C2232o6.C2234b f5062e;

        public RunnableC2078d(C2077c c2077c, String str, AbstractC2317u abstractC2317u, C2114g c2114g, C2232o6.C2234b c2234b) {
            this.f5058a = c2077c;
            this.f5059b = str;
            this.f5060c = abstractC2317u;
            this.f5061d = c2114g;
            this.f5062e = c2234b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2367y1 c2367y1;
            C2058b3 m9588d = C2201m0.m9588d();
            boolean z = m9588d.f4960B;
            C2232o6.InterfaceRunnableC2233a interfaceRunnableC2233a = this.f5058a;
            if (!z && !m9588d.f4961C) {
                C2058b3 m9588d2 = C2201m0.m9588d();
                m9588d2.f4962D.m9428a(15000L);
                if (!m9588d2.f4962D.f5701a && C2201m0.m9587e()) {
                    C2232o6.m9557f(interfaceRunnableC2233a);
                    return;
                }
                HashMap<String, C2365y> hashMap = m9588d.f5003u;
                String str = this.f5059b;
                C2365y c2365y = hashMap.get(str);
                if (c2365y == null) {
                    c2365y = new C2365y(str);
                }
                int i = c2365y.f5684c;
                if (i != 2 && i != 1) {
                    C2232o6.m9545r(interfaceRunnableC2233a);
                    if (!interfaceRunnableC2233a.mo9518a()) {
                        C2145j1 m9692k = m9588d.m9692k();
                        String str2 = this.f5059b;
                        long m9536a = this.f5062e.m9536a();
                        m9692k.getClass();
                        String m9559d = C2232o6.m9559d();
                        C2058b3 m9588d3 = C2201m0.m9588d();
                        C2249q c2249q = new C2249q(m9559d, this.f5060c, str2);
                        C2367y1 c2367y12 = new C2367y1();
                        C2080d1.m9660h(c2367y12, "zone_id", str2);
                        C2080d1.m9656l(c2367y12, "fullscreen", true);
                        m9588d3.m9691l().getClass();
                        Rect m9523h = C2247p4.m9523h();
                        C2080d1.m9657k(m9523h.width(), c2367y12, "width");
                        C2080d1.m9657k(m9523h.height(), c2367y12, "height");
                        C2080d1.m9657k(0, c2367y12, "type");
                        C2080d1.m9660h(c2367y12, FacebookAdapter.KEY_ID, m9559d);
                        C2114g c2114g = this.f5061d;
                        if (c2114g != null && (c2367y1 = c2114g.f5121c) != null) {
                            c2249q.f5479d = c2114g;
                            C2080d1.m9661g(c2367y12, "options", c2367y1);
                        }
                        m9692k.f5266c.put(m9559d, c2249q);
                        m9692k.f5264a.put(m9559d, new RunnableC2238p1(m9692k, m9559d, str2, m9536a));
                        new C2100e2(1, c2367y12, "AdSession.on_request").m9640b();
                        C2232o6.m9556g(m9692k.f5264a.get(m9559d), m9536a);
                        return;
                    }
                    return;
                }
                C2232o6.m9557f(interfaceRunnableC2233a);
                return;
            }
            C2201m0.m9588d().m9689n().m9706d("The AdColony API is not available while AdColony is disabled.", 0, 0, false);
            C2232o6.m9557f(interfaceRunnableC2233a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.adcolony.sdk.C2365y m9676a(@androidx.annotation.NonNull java.lang.String r1) {
        /*
            boolean r0 = com.adcolony.sdk.C2201m0.m9587e()
            if (r0 == 0) goto Lb
            com.adcolony.sdk.b3 r0 = com.adcolony.sdk.C2201m0.m9588d()
            goto L15
        Lb:
            boolean r0 = com.adcolony.sdk.C2201m0.m9586f()
            if (r0 == 0) goto L1e
            com.adcolony.sdk.b3 r0 = com.adcolony.sdk.C2201m0.m9588d()
        L15:
            java.util.HashMap<java.lang.String, com.adcolony.sdk.y> r0 = r0.f5003u
            java.lang.Object r0 = r0.get(r1)
            com.adcolony.sdk.y r0 = (com.adcolony.sdk.C2365y) r0
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L26
            com.adcolony.sdk.y r0 = new com.adcolony.sdk.y
            r0.<init>(r1)
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2074d.m9676a(java.lang.String):com.adcolony.sdk.y");
    }

    /* renamed from: b */
    public static void m9675b(Context context, C2200m c2200m) {
        String str;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        C2058b3 m9588d = C2201m0.m9588d();
        C2247p4 m9691l = m9588d.m9691l();
        if (c2200m != null && context != null) {
            ThreadPoolExecutor threadPoolExecutor = C2232o6.f5446a;
            try {
                str = context.getPackageName();
            } catch (Exception unused) {
                str = VungleApiClient.ConnectionTypeDetail.UNKNOWN;
            }
            String m9546q = C2232o6.m9546q();
            Context context2 = C2201m0.f5363a;
            int i = 0;
            if (context2 != null) {
                try {
                    i = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
                } catch (Exception unused2) {
                    C1169e.m11129c("Failed to retrieve package info.", 0, 0, true);
                }
            }
            m9691l.getClass();
            String m9525f = C2247p4.m9525f();
            if (m9588d.f4993k == null) {
                m9588d.f4993k = new C2354w3();
            }
            m9588d.f4993k.getClass();
            String m9463b = C2354w3.m9463b();
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", VungleApiClient.ConnectionTypeDetail.UNKNOWN);
            hashMap.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
            C2201m0.m9588d().m9691l().getClass();
            hashMap.put("countryLocaleShort", Locale.getDefault().getCountry());
            C2201m0.m9588d().m9691l().getClass();
            hashMap.put("manufacturer", Build.MANUFACTURER);
            C2201m0.m9588d().m9691l().getClass();
            hashMap.put("model", Build.MODEL);
            C2201m0.m9588d().m9691l().getClass();
            hashMap.put("osVersion", Build.VERSION.RELEASE);
            hashMap.put("carrierName", m9525f);
            hashMap.put("networkType", m9463b);
            hashMap.put("platform", "android");
            hashMap.put("appName", str);
            hashMap.put("appVersion", m9546q);
            hashMap.put("appBuildNumber", Integer.valueOf(i));
            hashMap.put("appId", "" + c2200m.f5361a);
            hashMap.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
            C2201m0.m9588d().m9691l().getClass();
            hashMap.put("sdkVersion", "4.8.0");
            hashMap.put("controllerVersion", VungleApiClient.ConnectionTypeDetail.UNKNOWN);
            JSONObject m9593b = c2200m.m9593b();
            m9593b.getClass();
            JSONObject m9592c = c2200m.m9592c();
            m9592c.getClass();
            synchronized (m9593b) {
                optString = m9593b.optString("mediation_network");
            }
            if (!optString.equals("")) {
                synchronized (m9593b) {
                    optString5 = m9593b.optString("mediation_network");
                }
                hashMap.put("mediationNetwork", optString5);
                synchronized (m9593b) {
                    optString6 = m9593b.optString("mediation_network_version");
                }
                hashMap.put("mediationNetworkVersion", optString6);
            }
            synchronized (m9592c) {
                optString2 = m9592c.optString("plugin");
            }
            if (!optString2.equals("")) {
                synchronized (m9592c) {
                    optString3 = m9592c.optString("plugin");
                }
                hashMap.put("plugin", optString3);
                synchronized (m9592c) {
                    optString4 = m9592c.optString("plugin_version");
                }
                hashMap.put("pluginVersion", optString4);
            }
            C2040a2 m9689n = m9588d.m9689n();
            m9689n.getClass();
            try {
                C2323u4 c2323u4 = new C2323u4(new C2284s1(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
                m9689n.f4926e = c2323u4;
                c2323u4.m9491b(TimeUnit.SECONDS);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    @android.annotation.SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m9674c(android.content.Context r6, com.adcolony.sdk.C2200m r7, @androidx.annotation.NonNull java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2074d.m9674c(android.content.Context, com.adcolony.sdk.m, java.lang.String):boolean");
    }

    /* renamed from: d */
    public static boolean m9673d(Runnable runnable) {
        try {
            f5043a.execute(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static C2367y1 m9672e(long j) {
        C2061b4 c2061b4;
        C2367y1 c2367y1 = new C2367y1();
        if (j > 0) {
            C2110f4 m9634c = C2110f4.m9634c();
            m9634c.getClass();
            C2061b4[] c2061b4Arr = new C2061b4[1];
            CountDownLatch countDownLatch = new CountDownLatch(1);
            m9634c.m9635b(new C2083d4(c2061b4Arr, countDownLatch), j);
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
            c2061b4 = c2061b4Arr[0];
        } else {
            c2061b4 = C2110f4.m9634c().f5112c;
        }
        if (c2061b4 != null) {
            C2080d1.m9661g(c2367y1, "odt_payload", c2061b4.m9684a());
        }
        return c2367y1;
    }

    /* renamed from: f */
    public static void m9671f() {
        if (!C2201m0.f5365c) {
            return;
        }
        Context context = C2201m0.f5363a;
        if (context != null && (context instanceof ActivityC2209n0)) {
            ((Activity) context).finish();
        }
        C2058b3 m9588d = C2201m0.m9588d();
        m9588d.m9692k().m9605e();
        m9588d.m9700c();
        m9588d.m9698e();
        m9588d.m9693j();
    }

    /* renamed from: g */
    public static boolean m9670g(@NonNull String str, @NonNull AbstractC2187l abstractC2187l, @NonNull C2124h c2124h, @Nullable C2114g c2114g) {
        if (abstractC2187l == null) {
            C1169e.m11129c("AdColonyAdViewListener is set to null. It is required to be non null.", 0, 1, false);
        }
        if (!C2201m0.f5365c) {
            C1169e.m11129c("Ignoring call to requestAdView as AdColony has not yet been configured.", 0, 1, false);
            if (abstractC2187l != null) {
                C2232o6.m9548o(new RunnableC2054b(abstractC2187l, str));
            }
            return false;
        } else if (c2124h.f5161b > 0 && c2124h.f5160a > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("zone_id", str);
            if (C2278r4.m9509a(1, bundle)) {
                if (abstractC2187l != null) {
                    C2232o6.m9548o(new RunnableC2054b(abstractC2187l, str));
                }
                return false;
            }
            C2232o6.C2234b c2234b = new C2232o6.C2234b(C2201m0.m9588d().f4978T);
            C2075a c2075a = new C2075a(abstractC2187l, str, c2234b);
            C2232o6.m9556g(c2075a, c2234b.m9536a());
            if (m9673d(new RunnableC2076b(c2075a, str, abstractC2187l, c2124h, c2114g, c2234b))) {
                return true;
            }
            C2232o6.m9557f(c2075a);
            return false;
        } else {
            C1169e.m11129c("Ignoring call to requestAdView as you've provided an AdColonyAdSize object with an invalid width or height.", 0, 1, false);
            if (abstractC2187l != null) {
                C2232o6.m9548o(new RunnableC2054b(abstractC2187l, str));
            }
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m9669h(@NonNull String str, @NonNull AbstractC2317u abstractC2317u, @Nullable C2114g c2114g) {
        if (abstractC2317u == null) {
            C1169e.m11129c("AdColonyInterstitialListener is set to null. It is required to be non null.", 0, 1, false);
        }
        if (!C2201m0.f5365c) {
            C1169e.m11129c("Ignoring call to AdColony.requestInterstitial as AdColony has not yet been configured.", 0, 1, false);
            if (abstractC2317u != null) {
                C2232o6.m9548o(new RunnableC2105f(abstractC2317u, str));
            }
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("zone_id", str);
        if (C2278r4.m9509a(1, bundle)) {
            if (abstractC2317u != null) {
                C2232o6.m9548o(new RunnableC2105f(abstractC2317u, str));
            }
            return false;
        }
        C2232o6.C2234b c2234b = new C2232o6.C2234b(C2201m0.m9588d().f4978T);
        C2077c c2077c = new C2077c(abstractC2317u, str, c2234b);
        C2232o6.m9556g(c2077c, c2234b.m9536a());
        if (m9673d(new RunnableC2078d(c2077c, str, abstractC2317u, c2114g, c2234b))) {
            return true;
        }
        C2232o6.m9557f(c2077c);
        return false;
    }

    /* renamed from: i */
    public static void m9668i(@NonNull AdColonyRewardedEventForwarder adColonyRewardedEventForwarder) {
        if (!C2201m0.f5365c) {
            C1169e.m11129c("Ignoring call to AdColony.setRewardListener() as AdColony has not yet been configured.", 0, 1, false);
        } else {
            C2201m0.m9588d().f4998p = adColonyRewardedEventForwarder;
        }
    }
}
