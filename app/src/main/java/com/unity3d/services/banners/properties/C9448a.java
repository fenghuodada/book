package com.unity3d.services.banners.properties;

import java.util.HashMap;

/* renamed from: com.unity3d.services.banners.properties.a */
/* loaded from: classes3.dex */
public class C9448a {

    /* renamed from: a */
    private static C9448a f18541a;

    /* renamed from: b */
    private HashMap<String, Integer> f18542b = new HashMap<>();

    /* renamed from: a */
    public static C9448a m2276a() {
        if (f18541a == null) {
            f18541a = new C9448a();
        }
        return f18541a;
    }

    /* renamed from: a */
    public synchronized Integer m2275a(String str) {
        return this.f18542b.get(str);
    }

    /* renamed from: a */
    public synchronized void m2274a(String str, Integer num) {
        this.f18542b.put(str, num);
    }
}
