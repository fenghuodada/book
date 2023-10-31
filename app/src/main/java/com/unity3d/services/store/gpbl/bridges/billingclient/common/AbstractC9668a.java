package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import android.content.Context;
import com.unity3d.services.core.reflection.AbstractC9574a;
import com.unity3d.services.store.gpbl.EnumC9659a;
import com.unity3d.services.store.gpbl.bridges.C9661a;
import com.unity3d.services.store.gpbl.bridges.C9685g;
import com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b;
import com.unity3d.services.store.gpbl.proxies.C9691a;
import com.unity3d.services.store.gpbl.proxies.C9692b;
import com.unity3d.services.store.gpbl.proxies.C9695e;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9668a extends AbstractC9574a implements InterfaceC9666b {

    /* renamed from: e */
    private static final Map<String, Class<?>[]> f19216e = new C9669a();

    /* renamed from: f */
    protected final Object f19217f;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.a$a */
    /* loaded from: classes3.dex */
    public static class C9669a extends HashMap<String, Class<?>[]> {
        public C9669a() {
            put("newBuilder", new Class[]{Context.class});
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.a$b */
    /* loaded from: classes3.dex */
    public static class C9670b extends HashMap<String, Class<?>[]> {
        public C9670b() throws ClassNotFoundException {
            put("newBuilder", new Class[]{Context.class});
            put("startConnection", new Class[]{C9691a.m1677c()});
            put("endConnection", new Class[0]);
            put("querySkuDetailsAsync", new Class[]{C9685g.m1690i(), C9695e.m1666c()});
            put("queryPurchaseHistoryAsync", new Class[]{String.class, C9692b.m1674c()});
            put("isFeatureSupported", new Class[]{String.class});
            put("isReady", new Class[0]);
        }
    }

    public AbstractC9668a(Object obj, Map<String, Class<?>[]> map) throws ClassNotFoundException {
        super(m1706a(map));
        this.f19217f = obj;
    }

    /* renamed from: a */
    public static Object m1707a(String str, Object... objArr) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return m1704i().getMethod(str, f19216e.get(str)).invoke(null, objArr);
    }

    /* renamed from: a */
    private static Map<String, Class<?>[]> m1706a(Map<String, Class<?>[]> map) throws ClassNotFoundException {
        map.putAll(new C9670b());
        return map;
    }

    /* renamed from: i */
    public static Class<?> m1704i() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClient");
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b
    /* renamed from: a */
    public EnumC9659a mo1709a(String str) {
        return new C9661a(m1917a("isFeatureSupported", this.f19217f, str)).m1715i();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b
    /* renamed from: a */
    public void mo1711a(C9685g c9685g, C9695e c9695e) throws ClassNotFoundException {
        m1915b("querySkuDetailsAsync", this.f19217f, c9685g.m1689j(), c9695e.m1910b());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b
    /* renamed from: a */
    public void mo1710a(C9691a c9691a) throws ClassNotFoundException {
        m1915b("startConnection", this.f19217f, c9691a.m1910b());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b
    /* renamed from: a */
    public void mo1708a(String str, C9692b c9692b) throws ClassNotFoundException {
        m1915b("queryPurchaseHistoryAsync", this.f19217f, str, c9692b.m1910b());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b
    /* renamed from: b */
    public boolean mo1705b() {
        return ((Boolean) m1917a("isReady", this.f19217f, new Object[0])).booleanValue();
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.android.billingclient.api.BillingClient";
    }
}
