package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.AbstractC9575b;
import com.unity3d.services.store.gpbl.bridges.C9661a;
import com.unity3d.services.store.gpbl.bridges.C9684f;
import com.unity3d.services.store.listeners.InterfaceC9699d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.proxies.e */
/* loaded from: classes3.dex */
public class C9695e extends AbstractC9575b {

    /* renamed from: a */
    private InterfaceC9699d f19232a;

    public C9695e(InterfaceC9699d interfaceC9699d) {
        this.f19232a = interfaceC9699d;
    }

    /* renamed from: c */
    public static Class<?> m1666c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.SkuDetailsResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b
    /* renamed from: a */
    public Class<?> mo1668a() throws ClassNotFoundException {
        return m1666c();
    }

    /* renamed from: a */
    public void m1667a(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                arrayList.add(new C9684f(obj2));
            }
        } else {
            arrayList = null;
        }
        InterfaceC9699d interfaceC9699d = this.f19232a;
        if (interfaceC9699d != null) {
            interfaceC9699d.mo1663a(new C9661a(obj), arrayList);
        }
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("onSkuDetailsResponse")) {
            m1667a(objArr[0], (List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }
}
