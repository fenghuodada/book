package com.unity3d.services.core.broadcast;

import android.content.IntentFilter;
import com.unity3d.services.core.properties.C9568a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.broadcast.d */
/* loaded from: classes3.dex */
public class C9466d {

    /* renamed from: a */
    private static Map<String, C9465c> f18594a;

    /* renamed from: a */
    public static void m2250a() {
        Map<String, C9465c> map = f18594a;
        if (map != null) {
            for (String str : map.keySet()) {
                C9568a.m1959e().unregisterReceiver(f18594a.get(str));
            }
            f18594a = null;
        }
    }

    /* renamed from: a */
    public static void m2249a(String str) {
        Map<String, C9465c> map = f18594a;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        C9568a.m1959e().unregisterReceiver(f18594a.get(str));
        f18594a.remove(str);
    }

    /* renamed from: a */
    public static void m2248a(String str, String str2, String[] strArr) {
        m2249a(str);
        IntentFilter intentFilter = new IntentFilter();
        for (String str3 : strArr) {
            intentFilter.addAction(str3);
        }
        if (str2 != null) {
            intentFilter.addDataScheme(str2);
        }
        if (f18594a == null) {
            f18594a = new HashMap();
        }
        C9465c c9465c = new C9465c(str);
        f18594a.put(str, c9465c);
        C9568a.m1959e().registerReceiver(c9465c, intentFilter);
    }
}
