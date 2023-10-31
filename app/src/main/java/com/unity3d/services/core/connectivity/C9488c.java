package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.util.Collections;
import java.util.Set;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.unity3d.services.core.connectivity.c */
/* loaded from: classes3.dex */
public class C9488c {

    /* renamed from: a */
    private static int f18780a = -1;

    /* renamed from: b */
    private static boolean f18781b = false;

    /* renamed from: c */
    private static boolean f18782c = false;

    /* renamed from: d */
    private static boolean f18783d = false;

    /* renamed from: e */
    private static int f18784e = -1;

    /* renamed from: f */
    private static Set<InterfaceC9491e> f18785f;

    /* renamed from: com.unity3d.services.core.connectivity.c$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9489a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18786a;

        static {
            int[] iArr = new int[EnumC9487b.values().length];
            f18786a = iArr;
            try {
                iArr[EnumC9487b.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18786a[EnumC9487b.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18786a[EnumC9487b.NETWORK_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static void m2192a() {
        if (f18780a == 1) {
            return;
        }
        C9549a.m2019b("Unity Ads connectivity change: connected");
        m2185d();
        Set<InterfaceC9491e> set = f18785f;
        if (set != null) {
            for (InterfaceC9491e interfaceC9491e : set) {
                interfaceC9491e.onConnected();
            }
        }
        m2191a(EnumC9487b.CONNECTED, f18783d, f18784e);
    }

    /* renamed from: a */
    private static void m2191a(EnumC9487b enumC9487b, boolean z, int i) {
        C9620a m1774c;
        if (f18782c && (m1774c = C9620a.m1774c()) != null && m1774c.m1768i()) {
            int i2 = C9489a.f18786a[enumC9487b.ordinal()];
            if (i2 == 1) {
                EnumC9627b enumC9627b = EnumC9627b.CONNECTIVITY;
                if (z) {
                    m1774c.m1784a(enumC9627b, EnumC9487b.CONNECTED, Boolean.valueOf(z), 0);
                } else {
                    m1774c.m1784a(enumC9627b, EnumC9487b.CONNECTED, Boolean.valueOf(z), Integer.valueOf(i));
                }
            } else if (i2 == 2) {
                m1774c.m1784a(EnumC9627b.CONNECTIVITY, EnumC9487b.DISCONNECTED, new Object[0]);
            } else if (i2 != 3) {
            } else {
                EnumC9627b enumC9627b2 = EnumC9627b.CONNECTIVITY;
                if (z) {
                    m1774c.m1784a(enumC9627b2, EnumC9487b.NETWORK_CHANGE, Boolean.valueOf(z), 0);
                } else {
                    m1774c.m1784a(enumC9627b2, EnumC9487b.NETWORK_CHANGE, Boolean.valueOf(z), Integer.valueOf(i));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2190a(InterfaceC9491e interfaceC9491e) {
        if (f18785f == null) {
            f18785f = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        f18785f.add(interfaceC9491e);
        m2181h();
    }

    /* renamed from: a */
    public static void m2189a(boolean z) {
        f18782c = z;
        m2181h();
    }

    /* renamed from: b */
    public static void m2188b() {
        NetworkInfo activeNetworkInfo;
        int i;
        if (f18780a == 1 && (activeNetworkInfo = ((ConnectivityManager) C9568a.m1959e().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            boolean z = activeNetworkInfo.getType() == 1;
            try {
                i = ((TelephonyManager) C9568a.m1959e().getSystemService("phone")).getNetworkType();
            } catch (SecurityException unused) {
                C9549a.m2014e("Unity Ads was not able to get current network type due to missing permission");
                i = -1;
            }
            boolean z2 = f18783d;
            if (z == z2 && (i == f18784e || z2)) {
                return;
            }
            f18783d = z;
            f18784e = i;
            C9549a.m2019b("Unity Ads connectivity change: network change");
            m2191a(EnumC9487b.NETWORK_CHANGE, z, i);
        }
    }

    /* renamed from: b */
    public static void m2187b(InterfaceC9491e interfaceC9491e) {
        Set<InterfaceC9491e> set = f18785f;
        if (set == null) {
            return;
        }
        set.remove(interfaceC9491e);
        m2181h();
    }

    /* renamed from: c */
    public static void m2186c() {
        if (f18780a == 0) {
            return;
        }
        f18780a = 0;
        C9549a.m2019b("Unity Ads connectivity change: disconnected");
        Set<InterfaceC9491e> set = f18785f;
        if (set != null) {
            for (InterfaceC9491e interfaceC9491e : set) {
                interfaceC9491e.onDisconnected();
            }
        }
        m2191a(EnumC9487b.DISCONNECTED, false, 0);
    }

    /* renamed from: d */
    private static void m2185d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C9568a.m1959e().getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            f18780a = 0;
            return;
        }
        f18780a = 1;
        boolean z = activeNetworkInfo.getType() == 1;
        f18783d = z;
        if (z) {
            return;
        }
        try {
            f18784e = ((TelephonyManager) C9568a.m1959e().getSystemService("phone")).getNetworkType();
        } catch (SecurityException unused) {
            C9549a.m2014e("Unity Ads was not able to get current network type due to missing permission");
        }
    }

    /* renamed from: e */
    private static void m2184e() {
        if (f18781b) {
            return;
        }
        f18781b = true;
        m2185d();
        C9490d.m2180a();
    }

    /* renamed from: f */
    public static void m2183f() {
        f18785f = null;
        f18782c = false;
        m2181h();
    }

    /* renamed from: g */
    private static void m2182g() {
        if (f18781b) {
            f18781b = false;
            C9490d.m2179b();
        }
    }

    /* renamed from: h */
    private static void m2181h() {
        Set<InterfaceC9491e> set;
        if (f18782c || !((set = f18785f) == null || set.isEmpty())) {
            m2184e();
        } else {
            m2182g();
        }
    }
}
