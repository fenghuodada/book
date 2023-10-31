package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.reflection.AbstractC9574a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.ads.gmascar.bridges.c */
/* loaded from: classes3.dex */
public class C9329c extends AbstractC9574a {

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.c$a */
    /* loaded from: classes3.dex */
    public class C9330a extends HashMap<String, Class<?>[]> {
        public C9330a() {
            put("getAdapterStatusMap", new Class[0]);
        }
    }

    public C9329c() {
        super(new C9330a());
    }

    /* renamed from: a */
    public Map<String, Object> m2453a(Object obj) {
        return (Map) m1917a("getAdapterStatusMap", obj, new Object[0]);
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.google.android.gms.ads.initialization.InitializationStatus";
    }
}
