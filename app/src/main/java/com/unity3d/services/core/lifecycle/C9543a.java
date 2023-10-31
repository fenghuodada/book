package com.unity3d.services.core.lifecycle;

import com.unity3d.services.core.properties.C9568a;

/* renamed from: com.unity3d.services.core.lifecycle.a */
/* loaded from: classes3.dex */
public class C9543a {

    /* renamed from: a */
    private static C9545c f18888a;

    /* renamed from: a */
    public static C9545c m2036a() {
        return f18888a;
    }

    /* renamed from: a */
    public static void m2035a(C9545c c9545c) {
        f18888a = c9545c;
    }

    /* renamed from: b */
    public static void m2034b() {
        if (C9568a.m1960d() == null || m2036a() != null) {
            return;
        }
        m2035a(new C9545c());
        C9568a.m1960d().registerActivityLifecycleCallbacks(m2036a());
    }
}
