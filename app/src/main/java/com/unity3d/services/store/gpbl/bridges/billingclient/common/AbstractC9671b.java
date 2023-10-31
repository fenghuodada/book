package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import com.unity3d.services.core.reflection.AbstractC9574a;
import com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9667c;
import com.unity3d.services.store.gpbl.proxies.C9693c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9671b extends AbstractC9574a implements InterfaceC9667c {

    /* renamed from: e */
    protected Object f19218e;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.b$a */
    /* loaded from: classes3.dex */
    public class C9672a extends HashMap<String, Class<?>[]> {
        public C9672a() throws ClassNotFoundException {
            put("setListener", new Class[]{C9693c.m1672c()});
            put("enablePendingPurchases", new Class[0]);
            put("build", new Class[0]);
        }
    }

    public AbstractC9671b(Object obj) throws ClassNotFoundException {
        super(new C9672a());
        this.f19218e = obj;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9667c
    /* renamed from: a */
    public InterfaceC9667c mo1703a() {
        this.f19218e = m1917a("enablePendingPurchases", this.f19218e, new Object[0]);
        return this;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9667c
    /* renamed from: a */
    public InterfaceC9667c mo1702a(C9693c c9693c) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this.f19218e = m1917a("setListener", this.f19218e, c9693c.m1910b());
        return this;
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.android.billingclient.api.BillingClient$Builder";
    }
}
