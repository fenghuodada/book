package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.AbstractC9574a;
import com.unity3d.services.store.gpbl.EnumC9659a;
import java.util.HashMap;

/* renamed from: com.unity3d.services.store.gpbl.bridges.a */
/* loaded from: classes3.dex */
public class C9661a extends AbstractC9574a {

    /* renamed from: e */
    private final Object f19214e;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.a$a */
    /* loaded from: classes3.dex */
    public class C9662a extends HashMap<String, Class<?>[]> {
        public C9662a() {
            put("getResponseCode", new Class[0]);
        }
    }

    public C9661a(Object obj) {
        super(new C9662a());
        this.f19214e = obj;
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.android.billingclient.api.BillingResult";
    }

    /* renamed from: i */
    public EnumC9659a m1715i() {
        return EnumC9659a.m1718a(((Integer) m1917a("getResponseCode", this.f19214e, new Object[0])).intValue());
    }
}
