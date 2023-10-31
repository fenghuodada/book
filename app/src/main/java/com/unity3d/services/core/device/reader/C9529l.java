package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.InitRequestType;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.l */
/* loaded from: classes3.dex */
public class C9529l implements InterfaceC9533p {

    /* renamed from: a */
    private final InterfaceC9533p f18865a;

    /* renamed from: b */
    private final InitRequestType f18866b;

    public C9529l(InterfaceC9533p interfaceC9533p, InitRequestType initRequestType) {
        this.f18865a = interfaceC9533p;
        this.f18866b = initRequestType;
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        Map<String, Object> mo2037a = this.f18865a.mo2037a();
        InitRequestType initRequestType = this.f18866b;
        if (initRequestType != null) {
            mo2037a.put("callType", initRequestType.toString().toLowerCase());
        }
        return mo2037a;
    }
}
