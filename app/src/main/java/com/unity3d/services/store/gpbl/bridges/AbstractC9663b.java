package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.reflection.AbstractC9574a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.store.gpbl.bridges.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9663b extends AbstractC9574a {

    /* renamed from: e */
    private final Object f19215e;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.b$a */
    /* loaded from: classes3.dex */
    public static class C9664a extends HashMap<String, Class<?>[]> {
        public C9664a() {
            put("getOriginalJson", new Class[0]);
        }
    }

    public AbstractC9663b(Object obj) {
        this(obj, new HashMap());
    }

    public AbstractC9663b(Object obj, Map<String, Class<?>[]> map) {
        super(m1714a(map));
        this.f19215e = obj;
    }

    /* renamed from: a */
    private static Map<String, Class<?>[]> m1714a(Map<String, Class<?>[]> map) {
        map.putAll(new C9664a());
        return map;
    }

    /* renamed from: i */
    public JSONObject m1713i() {
        try {
            return new JSONObject((String) m1917a("getOriginalJson", this.f19215e, new Object[0]));
        } catch (JSONException e) {
            C9549a.m2018b("Couldn't parse BillingResponse JSON : %s", e.getMessage());
            return null;
        }
    }
}
