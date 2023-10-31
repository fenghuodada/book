package com.unity3d.services.core.log;

import android.util.Log;
import androidx.constraintlayout.core.C0510h;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: com.unity3d.services.core.log.a */
/* loaded from: classes3.dex */
public class C9549a {

    /* renamed from: a */
    private static boolean f18905a = true;

    /* renamed from: b */
    private static boolean f18906b = true;

    /* renamed from: c */
    private static boolean f18907c = true;

    /* renamed from: d */
    private static boolean f18908d = true;

    /* renamed from: e */
    private static boolean f18909e = false;

    /* renamed from: f */
    private static final HashMap<EnumC9551b, C9553c> f18910f;

    /* renamed from: com.unity3d.services.core.log.a$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9550a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18911a;

        static {
            int[] iArr = new int[EnumC9551b.values().length];
            f18911a = iArr;
            try {
                iArr[EnumC9551b.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18911a[EnumC9551b.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18911a[EnumC9551b.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18911a[EnumC9551b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.unity3d.services.core.log.a$b */
    /* loaded from: classes3.dex */
    public enum EnumC9551b {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        HashMap<EnumC9551b, C9553c> hashMap = new HashMap<>();
        f18910f = hashMap;
        if (hashMap.size() == 0) {
            hashMap.put(EnumC9551b.INFO, new C9553c("i"));
            hashMap.put(EnumC9551b.DEBUG, new C9553c("d"));
            hashMap.put(EnumC9551b.WARNING, new C9553c("w"));
            hashMap.put(EnumC9551b.ERROR, new C9553c("e"));
        }
        if (new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
            f18909e = true;
        }
    }

    /* renamed from: a */
    private static C9552b m2026a(EnumC9551b enumC9551b, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        C9553c m2027a = m2027a(enumC9551b);
        if (m2027a != null) {
            int i = 0;
            boolean z = false;
            while (i < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().equals(C9549a.class.getName())) {
                    z = true;
                }
                if (!stackTraceElement.getClassName().equals(C9549a.class.getName()) && z) {
                    break;
                }
                i++;
            }
            StackTraceElement stackTraceElement2 = i < stackTrace.length ? stackTrace[i] : null;
            if (stackTraceElement2 != null) {
                return new C9552b(m2027a, str, stackTraceElement2);
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    private static C9553c m2027a(EnumC9551b enumC9551b) {
        return f18910f.get(enumC9551b);
    }

    /* renamed from: a */
    private static String m2024a(String str) {
        return (str == null || str.length() == 0) ? "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead" : str;
    }

    /* renamed from: a */
    public static void m2029a() {
        m2019b("ENTERED METHOD");
    }

    /* renamed from: a */
    public static void m2028a(int i) {
        if (i >= 8) {
            f18905a = true;
            f18906b = true;
            f18907c = true;
            f18908d = true;
            return;
        }
        if (i >= 4) {
            f18905a = true;
            f18906b = true;
            f18907c = true;
        } else {
            if (i >= 2) {
                f18905a = true;
                f18906b = true;
            } else {
                if (i >= 1) {
                    f18905a = true;
                } else {
                    f18905a = false;
                }
                f18906b = false;
            }
            f18907c = false;
        }
        f18908d = false;
    }

    /* renamed from: a */
    private static void m2025a(C9552b c9552b) {
        Method method;
        if (c9552b == null || c9552b.m2013a() == null) {
            return;
        }
        try {
            method = Log.class.getMethod(c9552b.m2013a().m2010b(), String.class, String.class);
        } catch (Exception e) {
            Log.e("UnityAds", "Writing to log failed!", e);
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(null, c9552b.m2013a().m2011a(), c9552b.m2012b());
            } catch (Exception e2) {
                Log.e("UnityAds", "Writing to log failed!", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m2023a(String str, Exception exc) {
        if (str == null) {
            str = "";
        }
        if (exc != null) {
            StringBuilder m12339b = C0510h.m12339b(str, ": ");
            m12339b.append(exc.getMessage());
            str = m12339b.toString();
        }
        if (exc != null && exc.getCause() != null) {
            StringBuilder m12339b2 = C0510h.m12339b(str, ": ");
            m12339b2.append(exc.getCause().getMessage());
            str = m12339b2.toString();
        }
        m2020b(EnumC9551b.ERROR, str);
    }

    /* renamed from: a */
    public static void m2022a(String str, Object... objArr) {
        if (m2021b()) {
            m2019b(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    private static void m2020b(EnumC9551b enumC9551b, String str) {
        int i = C9550a.f18911a[enumC9551b.ordinal()];
        if (f18909e ? true : i != 1 ? i != 2 ? i != 3 ? i != 4 ? true : f18905a : f18906b : f18908d : f18907c) {
            m2025a(m2026a(enumC9551b, str));
        }
    }

    /* renamed from: b */
    public static void m2019b(String str) {
        if (m2021b()) {
            if (str.length() <= 3072) {
                m2020b(EnumC9551b.DEBUG, m2024a(str));
                return;
            }
            m2019b(str.substring(0, 3072));
            if (str.length() < 30720) {
                m2019b(str.substring(3072));
            }
        }
    }

    /* renamed from: b */
    public static void m2018b(String str, Object... objArr) {
        m2017c(String.format(str, objArr));
    }

    /* renamed from: b */
    private static boolean m2021b() {
        return f18908d || f18909e;
    }

    /* renamed from: c */
    public static void m2017c(String str) {
        m2020b(EnumC9551b.ERROR, m2024a(str));
    }

    /* renamed from: c */
    public static void m2016c(String str, Object... objArr) {
        m2014e(String.format(str, objArr));
    }

    /* renamed from: d */
    public static void m2015d(String str) {
        m2020b(EnumC9551b.INFO, m2024a(str));
    }

    /* renamed from: e */
    public static void m2014e(String str) {
        m2020b(EnumC9551b.WARNING, m2024a(str));
    }
}
