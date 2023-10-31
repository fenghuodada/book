package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.C9549a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.misc.h */
/* loaded from: classes3.dex */
public class C9562h implements InterfaceC9557c {

    /* renamed from: a */
    private final List<InterfaceC9557c> f18929a;

    public C9562h(List<InterfaceC9557c> list) {
        this.f18929a = list;
    }

    @Override // com.unity3d.services.core.misc.InterfaceC9557c
    public Object get(String str) {
        InterfaceC9557c next;
        Iterator<InterfaceC9557c> it = this.f18929a.iterator();
        Object obj = null;
        while (it.hasNext() && ((next = it.next()) == null || (obj = next.get(str)) == null)) {
        }
        return obj;
    }

    @Override // com.unity3d.services.core.misc.InterfaceC9557c
    public JSONObject getData() {
        JSONObject jSONObject = new JSONObject();
        for (InterfaceC9557c interfaceC9557c : this.f18929a) {
            if (interfaceC9557c != null) {
                try {
                    jSONObject = C9564j.m1986a(jSONObject, interfaceC9557c.getData());
                } catch (JSONException unused) {
                    C9549a.m2017c("Failed to merge storage: " + interfaceC9557c);
                }
            }
        }
        return jSONObject;
    }
}
