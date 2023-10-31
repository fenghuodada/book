package com.unity3d.services.store.listeners;

import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import com.unity3d.services.store.EnumC9649b;
import com.unity3d.services.store.gpbl.EnumC9659a;
import com.unity3d.services.store.gpbl.bridges.C9661a;
import com.unity3d.services.store.gpbl.bridges.C9679c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.unity3d.services.store.listeners.e */
/* loaded from: classes3.dex */
public class C9700e implements InterfaceC9698c {

    /* renamed from: a */
    private final Integer f19233a;

    /* renamed from: b */
    private final EnumC9649b f19234b;

    /* renamed from: c */
    private final EnumC9649b f19235c;

    public C9700e(EnumC9649b enumC9649b, EnumC9649b enumC9649b2) {
        this(null, enumC9649b, enumC9649b2);
    }

    public C9700e(Integer num, EnumC9649b enumC9649b, EnumC9649b enumC9649b2) {
        this.f19233a = num;
        this.f19234b = enumC9649b;
        this.f19235c = enumC9649b2;
    }

    @Override // com.unity3d.services.store.listeners.InterfaceC9698c
    /* renamed from: a */
    public void mo1662a(C9661a c9661a, List<C9679c> list) {
        ArrayList arrayList = new ArrayList();
        Integer num = this.f19233a;
        if (num != null) {
            arrayList.add(num);
        }
        if (c9661a.m1715i() != EnumC9659a.OK) {
            arrayList.add(c9661a.m1715i());
            C9620a.m1774c().m1784a(EnumC9627b.STORE, this.f19235c, arrayList.toArray());
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (C9679c c9679c : list) {
                jSONArray.put(c9679c.m1694k());
            }
        }
        arrayList.add(jSONArray);
        C9620a.m1774c().m1784a(EnumC9627b.STORE, this.f19234b, arrayList.toArray());
    }
}
