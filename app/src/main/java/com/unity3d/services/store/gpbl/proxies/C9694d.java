package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.AbstractC9575b;
import com.unity3d.services.store.gpbl.bridges.C9661a;
import com.unity3d.services.store.gpbl.bridges.C9679c;
import com.unity3d.services.store.listeners.InterfaceC9698c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.proxies.d */
/* loaded from: classes3.dex */
public class C9694d extends AbstractC9575b {

    /* renamed from: a */
    private InterfaceC9698c f19231a;

    public C9694d(InterfaceC9698c interfaceC9698c) {
        this.f19231a = interfaceC9698c;
    }

    /* renamed from: c */
    public static Class<?> m1670c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b
    /* renamed from: a */
    public Class<?> mo1668a() throws ClassNotFoundException {
        return m1670c();
    }

    /* renamed from: a */
    public void m1671a(Object obj, List<Object> list) {
        ArrayList arrayList;
        C9661a c9661a = new C9661a(obj);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                arrayList.add(new C9679c(obj2));
            }
        } else {
            arrayList = null;
        }
        InterfaceC9698c interfaceC9698c = this.f19231a;
        if (interfaceC9698c != null) {
            interfaceC9698c.mo1662a(c9661a, arrayList);
        }
    }

    /* renamed from: d */
    public InterfaceC9698c m1669d() {
        return this.f19231a;
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("onQueryPurchasesResponse")) {
            m1671a(objArr[0], (List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }
}
