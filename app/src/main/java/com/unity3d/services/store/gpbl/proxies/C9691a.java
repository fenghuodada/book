package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.AbstractC9575b;
import com.unity3d.services.store.gpbl.InterfaceC9660b;
import com.unity3d.services.store.gpbl.bridges.C9661a;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.services.store.gpbl.proxies.a */
/* loaded from: classes3.dex */
public class C9691a extends AbstractC9575b {

    /* renamed from: a */
    private static String f19225a = "onBillingServiceDisconnected";

    /* renamed from: b */
    private static String f19226b = "onBillingSetupFinished";

    /* renamed from: c */
    private InterfaceC9660b f19227c;

    public C9691a(InterfaceC9660b interfaceC9660b) {
        this.f19227c = interfaceC9660b;
    }

    /* renamed from: a */
    private void m1678a(Object obj) {
        InterfaceC9660b interfaceC9660b = this.f19227c;
        if (interfaceC9660b != null) {
            interfaceC9660b.mo1716a(new C9661a(obj));
        }
    }

    /* renamed from: c */
    public static Class<?> m1677c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClientStateListener");
    }

    /* renamed from: d */
    private void m1676d() {
        InterfaceC9660b interfaceC9660b = this.f19227c;
        if (interfaceC9660b != null) {
            interfaceC9660b.mo1717a();
        }
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b
    /* renamed from: a */
    public Class<?> mo1668a() throws ClassNotFoundException {
        return m1677c();
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals(f19226b)) {
            m1678a(objArr[0]);
        } else if (!method.getName().equals(f19225a)) {
            return super.invoke(obj, method, objArr);
        } else {
            m1676d();
        }
        return null;
    }
}
