package com.unity3d.services.core.device.reader;

import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.g */
/* loaded from: classes3.dex */
public class C9523g implements InterfaceC9533p {

    /* renamed from: a */
    InterfaceC9533p f18852a;

    /* renamed from: b */
    List<String> f18853b;

    public C9523g(InterfaceC9533p interfaceC9533p, List<String> list) {
        this.f18852a = interfaceC9533p;
        this.f18853b = list;
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        Map<String, Object> mo2037a = this.f18852a.mo2037a();
        List<String> list = this.f18853b;
        if (list != null) {
            for (String str : list) {
                mo2037a.remove(str);
            }
        }
        return mo2037a;
    }
}
