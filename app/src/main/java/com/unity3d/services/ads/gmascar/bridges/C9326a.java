package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.reflection.AbstractC9574a;
import java.util.HashMap;

/* renamed from: com.unity3d.services.ads.gmascar.bridges.a */
/* loaded from: classes3.dex */
public class C9326a extends AbstractC9574a {

    /* renamed from: e */
    private Class f18227e;

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.a$a */
    /* loaded from: classes3.dex */
    public class C9327a extends HashMap<String, Class<?>[]> {
        public C9327a() {
            put("getInitializationState", new Class[0]);
        }
    }

    public C9326a() {
        super(new C9327a());
        C9328b c9328b = new C9328b();
        try {
            this.f18227e = Class.forName(c9328b.m2454a());
        } catch (ClassNotFoundException e) {
            C9549a.m2022a("ERROR: Could not find class %s %s", c9328b.m2454a(), e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    public boolean m2456a(Object obj) {
        Object[] m2455i = m2455i();
        if (m2455i != null) {
            return m1917a("getInitializationState", obj, new Object[0]) == m2455i[1];
        }
        C9549a.m2019b("ERROR: Could not get adapter states enum from AdapterStatus.State");
        return false;
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.google.android.gms.ads.initialization.AdapterStatus";
    }

    /* renamed from: i */
    public Object[] m2455i() {
        return this.f18227e.getEnumConstants();
    }
}
