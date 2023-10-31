package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.InterfaceC9557c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.reader.e */
/* loaded from: classes3.dex */
public class C9521e {

    /* renamed from: a */
    private InterfaceC9557c f18851a;

    public C9521e(InterfaceC9557c interfaceC9557c) {
        this.f18851a = interfaceC9557c;
    }

    /* renamed from: a */
    private List<String> m2064a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(str.trim());
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<String> m2065a() {
        Object opt;
        ArrayList arrayList = new ArrayList();
        InterfaceC9557c interfaceC9557c = this.f18851a;
        if (interfaceC9557c == null || interfaceC9557c.getData() == null || (opt = this.f18851a.getData().opt("unifiedconfig")) == null || !(opt instanceof JSONObject)) {
            return arrayList;
        }
        Object opt2 = ((JSONObject) opt).opt("exclude");
        return opt2 instanceof String ? m2064a(Arrays.asList(((String) opt2).split(","))) : arrayList;
    }
}
