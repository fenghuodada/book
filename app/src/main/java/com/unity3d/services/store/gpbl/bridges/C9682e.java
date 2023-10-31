package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.AbstractC9574a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.unity3d.services.store.gpbl.bridges.e */
/* loaded from: classes3.dex */
public class C9682e extends AbstractC9574a {

    /* renamed from: e */
    private final Object f19220e;

    /* renamed from: com.unity3d.services.store.gpbl.bridges.e$a */
    /* loaded from: classes3.dex */
    public class C9683a extends HashMap<String, Class<?>[]> {
        public C9683a() {
            put("getBillingResult", new Class[0]);
            put("getPurchasesList", new Class[0]);
        }
    }

    public C9682e(Object obj) {
        super(new C9683a());
        this.f19220e = obj;
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.android.billingclient.api.Purchase$PurchasesResult";
    }

    /* renamed from: i */
    public C9661a m1693i() {
        return new C9661a(m1917a("getBillingResult", this.f19220e, new Object[0]));
    }

    /* renamed from: j */
    public List<C9679c> m1692j() {
        List<Object> list = (List) m1917a("getPurchasesList", this.f19220e, new Object[0]);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                arrayList.add(new C9679c(obj));
            }
        }
        return arrayList;
    }
}
