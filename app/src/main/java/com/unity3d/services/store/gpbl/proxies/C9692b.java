package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.AbstractC9575b;
import com.unity3d.services.store.gpbl.bridges.C9661a;
import com.unity3d.services.store.gpbl.bridges.C9681d;
import com.unity3d.services.store.listeners.InterfaceC9696a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.proxies.b */
/* loaded from: classes3.dex */
public class C9692b extends AbstractC9575b {

    /* renamed from: a */
    private InterfaceC9696a f19228a;

    /* renamed from: b */
    private int f19229b;

    public C9692b(InterfaceC9696a interfaceC9696a, int i) {
        this.f19228a = interfaceC9696a;
        this.f19229b = i;
    }

    /* renamed from: c */
    public static Class<?> m1674c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchaseHistoryResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b
    /* renamed from: a */
    public Class<?> mo1668a() throws ClassNotFoundException {
        return m1674c();
    }

    /* renamed from: a */
    public void m1675a(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < this.f19229b && i < list.size(); i++) {
                arrayList.add(new C9681d(list.get(i)));
            }
        } else {
            arrayList = null;
        }
        InterfaceC9696a interfaceC9696a = this.f19228a;
        if (interfaceC9696a != null) {
            interfaceC9696a.mo1665a(new C9661a(obj), arrayList);
        }
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("onPurchaseHistoryResponse")) {
            m1675a(objArr[0], (List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }
}
