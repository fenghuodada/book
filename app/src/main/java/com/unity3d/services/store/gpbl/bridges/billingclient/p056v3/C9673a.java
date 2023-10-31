package com.unity3d.services.store.gpbl.bridges.billingclient.p056v3;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.C9682e;
import com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.AbstractC9668a;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.AbstractC9671b;
import com.unity3d.services.store.gpbl.proxies.C9694d;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v3.a */
/* loaded from: classes3.dex */
public class C9673a extends AbstractC9668a {

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v3.a$a */
    /* loaded from: classes3.dex */
    public class C9674a extends HashMap<String, Class<?>[]> {
        public C9674a() {
            put("queryPurchases", new Class[]{String.class});
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v3.a$b */
    /* loaded from: classes3.dex */
    public static class C9675b extends AbstractC9671b {
        public C9675b(Object obj) throws ClassNotFoundException {
            super(obj);
        }

        @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9667c
        /* renamed from: c */
        public InterfaceC9666b mo1697c() throws ClassNotFoundException {
            return new C9673a(m1917a("build", this.f19218e, new Object[0]));
        }
    }

    public C9673a(Object obj) throws ClassNotFoundException {
        super(obj, new C9674a());
    }

    /* renamed from: a */
    public static C9675b m1701a(Context context) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new C9675b(AbstractC9668a.m1707a("newBuilder", context));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b
    /* renamed from: a */
    public void mo1699a(String str, C9694d c9694d) {
        C9682e c9682e = new C9682e(m1917a("queryPurchases", this.f19217f, str));
        c9694d.m1669d().mo1662a(c9682e.m1693i(), c9682e.m1692j());
    }
}
