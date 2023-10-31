package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.lifecycle.C9545c;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.h */
/* loaded from: classes3.dex */
public class C9524h implements InterfaceC9533p {

    /* renamed from: a */
    private final InterfaceC9533p f18854a;

    /* renamed from: b */
    private final C9545c f18855b;

    public C9524h(InterfaceC9533p interfaceC9533p, C9545c c9545c) {
        this.f18854a = interfaceC9533p;
        this.f18855b = c9545c;
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        Map<String, Object> mo2037a = this.f18854a.mo2037a();
        mo2037a.put("appActive", Boolean.valueOf(this.f18855b.m2033a()));
        return mo2037a;
    }
}
