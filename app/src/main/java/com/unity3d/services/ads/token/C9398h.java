package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.EnumC9514j;
import com.unity3d.services.core.device.reader.C9517a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.unity3d.services.ads.token.h */
/* loaded from: classes3.dex */
public class C9398h {

    /* renamed from: b */
    private static ConcurrentLinkedQueue<String> f18353b = null;

    /* renamed from: c */
    private static int f18354c = 0;

    /* renamed from: d */
    private static boolean f18355d = false;

    /* renamed from: e */
    private static String f18356e;

    /* renamed from: a */
    private static final Object f18352a = new Object();

    /* renamed from: f */
    private static ExecutorService f18357f = Executors.newSingleThreadExecutor();

    /* renamed from: com.unity3d.services.ads.token.h$a */
    /* loaded from: classes3.dex */
    public static class C9399a implements InterfaceC9390c {
        @Override // com.unity3d.services.ads.token.InterfaceC9390c
        /* renamed from: a */
        public void mo2367a(String str) {
            C9620a.m1774c().m1784a(EnumC9627b.TOKEN, EnumC9397g.TOKEN_NATIVE_DATA, str);
        }
    }

    /* renamed from: a */
    public static void m2375a() {
        synchronized (f18352a) {
            f18353b = null;
            f18354c = 0;
        }
    }

    /* renamed from: a */
    private static void m2374a(Boolean bool) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(bool.booleanValue());
    }

    /* renamed from: a */
    public static void m2373a(String str) {
        boolean z;
        synchronized (f18352a) {
            f18356e = str;
            z = str != null;
        }
        if (z) {
            C9383a.m2397a().m2384b(EnumC9514j.TOKEN_REMOTE);
            m2374a(Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public static void m2372a(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (f18352a) {
            if (f18353b == null) {
                f18353b = new ConcurrentLinkedQueue<>();
                f18354c = 0;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                f18353b.add(jSONArray.getString(i));
            }
            z = !f18353b.isEmpty();
        }
        if (z) {
            m2374a(Boolean.FALSE);
            C9383a.m2397a().m2384b(EnumC9514j.TOKEN_REMOTE);
        }
    }

    /* renamed from: a */
    public static void m2371a(boolean z) {
        synchronized (f18352a) {
            f18355d = z;
        }
    }

    /* renamed from: b */
    public static void m2370b() {
        new C9391d(f18357f, new C9517a(new ConfigurationReader(), PrivacyConfigStorage.getInstance()), null).mo2380a(new C9399a());
    }

    /* renamed from: b */
    public static void m2369b(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (f18352a) {
            f18353b = new ConcurrentLinkedQueue<>();
            f18354c = 0;
            for (int i = 0; i < jSONArray.length(); i++) {
                f18353b.add(jSONArray.getString(i));
            }
            z = !f18353b.isEmpty();
        }
        if (z) {
            m2374a(Boolean.FALSE);
            C9383a.m2397a().m2384b(EnumC9514j.TOKEN_REMOTE);
        }
    }

    /* renamed from: c */
    public static String m2368c() {
        synchronized (f18352a) {
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = f18353b;
            if (concurrentLinkedQueue == null) {
                return f18356e;
            } else if (concurrentLinkedQueue.isEmpty()) {
                C9620a.m1774c().m1784a(EnumC9627b.TOKEN, EnumC9397g.QUEUE_EMPTY, new Object[0]);
                return null;
            } else if (f18355d) {
                C9620a m1774c = C9620a.m1774c();
                EnumC9627b enumC9627b = EnumC9627b.TOKEN;
                EnumC9397g enumC9397g = EnumC9397g.TOKEN_ACCESS;
                int i = f18354c;
                f18354c = i + 1;
                m1774c.m1784a(enumC9627b, enumC9397g, Integer.valueOf(i));
                return f18353b.peek();
            } else {
                C9620a m1774c2 = C9620a.m1774c();
                EnumC9627b enumC9627b2 = EnumC9627b.TOKEN;
                EnumC9397g enumC9397g2 = EnumC9397g.TOKEN_ACCESS;
                int i2 = f18354c;
                f18354c = i2 + 1;
                m1774c2.m1784a(enumC9627b2, enumC9397g2, Integer.valueOf(i2));
                return f18353b.poll();
            }
        }
    }
}
