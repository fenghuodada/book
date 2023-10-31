package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.core.log.C9549a;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.unity3d.services.core.cache.e */
/* loaded from: classes3.dex */
public class C9471e extends Thread {

    /* renamed from: a */
    private static HandlerC9472f f18626a = null;

    /* renamed from: b */
    private static boolean f18627b = false;

    /* renamed from: c */
    private static final Object f18628c = new Object();

    /* renamed from: d */
    private static int f18629d = 30000;

    /* renamed from: e */
    private static int f18630e = 30000;

    /* renamed from: f */
    private static int f18631f;

    /* renamed from: a */
    public static void m2242a() {
        if (f18627b) {
            f18626a.removeMessages(1);
            f18626a.m2228a(true);
        }
    }

    /* renamed from: a */
    public static void m2241a(int i) {
        f18629d = i;
    }

    /* renamed from: a */
    public static synchronized void m2240a(String str, String str2, HashMap<String, List<String>> hashMap, boolean z) {
        synchronized (C9471e.class) {
            if (!f18627b) {
                m2234e();
            }
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.SOURCE, str);
            bundle.putString("target", str2);
            bundle.putInt("connectTimeout", f18629d);
            bundle.putInt("readTimeout", f18630e);
            bundle.putInt("progressInterval", f18631f);
            bundle.putBoolean("append", z);
            if (hashMap != null) {
                for (String str3 : hashMap.keySet()) {
                    bundle.putStringArray(str3, (String[]) hashMap.get(str3).toArray(new String[hashMap.get(str3).size()]));
                }
            }
            Message message = new Message();
            message.what = 1;
            message.setData(bundle);
            f18626a.m2228a(false);
            f18626a.sendMessage(message);
        }
    }

    /* renamed from: b */
    public static int m2239b() {
        return f18629d;
    }

    /* renamed from: b */
    public static void m2238b(int i) {
        f18631f = i;
    }

    /* renamed from: c */
    public static int m2237c() {
        return f18631f;
    }

    /* renamed from: c */
    public static void m2236c(int i) {
        f18630e = i;
    }

    /* renamed from: d */
    public static int m2235d() {
        return f18630e;
    }

    /* renamed from: e */
    private static void m2234e() {
        C9471e c9471e = new C9471e();
        c9471e.setName("UnityAdsCacheThread");
        c9471e.start();
        while (!f18627b) {
            try {
                Object obj = f18628c;
                synchronized (obj) {
                    obj.wait();
                }
            } catch (InterruptedException unused) {
                C9549a.m2019b("Couldn't synchronize thread");
            }
        }
    }

    /* renamed from: f */
    public static boolean m2233f() {
        if (f18627b) {
            return f18626a.m2232a();
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        f18626a = new HandlerC9472f();
        f18627b = true;
        Object obj = f18628c;
        synchronized (obj) {
            obj.notify();
        }
        Looper.loop();
    }
}
