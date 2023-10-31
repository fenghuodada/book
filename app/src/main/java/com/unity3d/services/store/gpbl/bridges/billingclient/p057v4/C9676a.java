package com.unity3d.services.store.gpbl.bridges.billingclient.p057v4;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.AbstractC9668a;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.AbstractC9671b;
import com.unity3d.services.store.gpbl.proxies.C9694d;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v4.a */
/* loaded from: classes3.dex */
public class C9676a extends AbstractC9668a {

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v4.a$a */
    /* loaded from: classes3.dex */
    public class C9677a extends HashMap<String, Class<?>[]> {
        public C9677a() throws ClassNotFoundException {
            put("queryPurchasesAsync", new Class[]{String.class, C9694d.m1670c()});
        }
    }

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v4.a$b */
    /* loaded from: classes3.dex */
    public static class C9678b extends AbstractC9671b {
        public C9678b(Object obj) throws ClassNotFoundException {
            super(obj);
        }

        @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9667c
        /* renamed from: i */
        public AbstractC9668a mo1697c() throws ClassNotFoundException {
            return new C9676a(m1917a("build", this.f19218e, new Object[0]));
        }
    }

    public C9676a(Object obj) throws ClassNotFoundException {
        super(obj, new C9677a());
    }

    /* renamed from: a */
    public static C9678b m1700a(Context context) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        return new C9678b(AbstractC9668a.m1707a("newBuilder", context));
    }

    /* renamed from: j */
    public static boolean m1698j() {
        try {
            AbstractC9668a.m1704i().getMethod("queryPurchasesAsync", String.class, C9694d.m1670c());
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b
    /* renamed from: a */
    public void mo1699a(String str, C9694d c9694d) throws ClassNotFoundException {
        m1915b("queryPurchasesAsync", this.f19217f, str, c9694d.m1910b());
    }
}
