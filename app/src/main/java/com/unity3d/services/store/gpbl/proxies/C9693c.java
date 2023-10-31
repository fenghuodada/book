package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.AbstractC9575b;
import com.unity3d.services.store.gpbl.bridges.C9661a;
import com.unity3d.services.store.gpbl.bridges.C9679c;
import com.unity3d.services.store.listeners.InterfaceC9697b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.proxies.c */
/* loaded from: classes3.dex */
public class C9693c extends AbstractC9575b {

    /* renamed from: a */
    private InterfaceC9697b f19230a;

    public C9693c(InterfaceC9697b interfaceC9697b) {
        this.f19230a = interfaceC9697b;
    }

    /* renamed from: c */
    public static Class<?> m1672c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesUpdatedListener");
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b
    /* renamed from: a */
    public Class<?> mo1668a() throws ClassNotFoundException {
        return m1672c();
    }

    /* renamed from: a */
    public void m1673a(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                arrayList.add(new C9679c(obj2));
            }
        } else {
            arrayList = null;
        }
        InterfaceC9697b interfaceC9697b = this.f19230a;
        if (interfaceC9697b != null) {
            interfaceC9697b.mo1664a(new C9661a(obj), arrayList);
        }
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9575b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("onPurchasesUpdated")) {
            m1673a(objArr[0], (List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }
}
