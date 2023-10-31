package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.AbstractC9574a;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.store.gpbl.bridges.g */
/* loaded from: classes3.dex */
public class C9685g extends AbstractC9574a {

    /* renamed from: e */
    private static final Map<String, Class<?>[]> f19221e = new C9686a();

    /* renamed from: f */
    private final Object f19222f;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.g$a */
    /* loaded from: classes3.dex */
    public static class C9686a extends HashMap<String, Class<?>[]> {
        public C9686a() {
            put("newBuilder", new Class[0]);
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.g$b */
    /* loaded from: classes3.dex */
    public class C9687b extends HashMap<String, Class<?>[]> {
        public C9687b() {
            put("newBuilder", new Class[0]);
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.g$c */
    /* loaded from: classes3.dex */
    public static class C9688c extends AbstractC9574a {

        /* renamed from: e */
        private Object f19223e;

        /* renamed from: com.unity3d.services.store.gpbl.bridges.g$c$a */
        /* loaded from: classes3.dex */
        public class C9689a extends HashMap<String, Class<?>[]> {
            public C9689a() {
                put("build", new Class[0]);
                put("setSkusList", new Class[]{List.class});
                put("setType", new Class[]{String.class});
            }
        }

        public C9688c(Object obj) {
            super(new C9689a());
            this.f19223e = obj;
        }

        /* renamed from: a */
        public C9688c m1687a(List<String> list) {
            this.f19223e = m1917a("setSkusList", this.f19223e, list);
            return this;
        }

        /* renamed from: c */
        public C9688c m1686c(String str) {
            this.f19223e = m1917a("setType", this.f19223e, str);
            return this;
        }

        @Override // com.unity3d.services.core.reflection.AbstractC9574a
        /* renamed from: g */
        public String mo1685g() {
            return "com.android.billingclient.api.SkuDetailsParams$Builder";
        }

        /* renamed from: i */
        public C9685g m1684i() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
            return new C9685g(m1917a("build", this.f19223e, new Object[0]));
        }
    }

    public C9685g(Object obj) {
        super(new C9687b());
        this.f19222f = obj;
    }

    /* renamed from: a */
    public static Object m1691a(String str, Object... objArr) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return m1690i().getMethod(str, f19221e.get(str)).invoke(null, objArr);
    }

    /* renamed from: i */
    public static Class<?> m1690i() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.SkuDetailsParams");
    }

    /* renamed from: k */
    public static C9688c m1688k() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new C9688c(m1691a("newBuilder", new Object[0]));
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.android.billingclient.api.SkuDetailsParams";
    }

    /* renamed from: j */
    public Object m1689j() {
        return this.f19222f;
    }
}
