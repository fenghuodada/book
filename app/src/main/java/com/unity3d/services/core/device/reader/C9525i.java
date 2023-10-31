package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.request.metrics.C9604i;
import com.unity3d.services.core.request.metrics.C9606j;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.i */
/* loaded from: classes3.dex */
public class C9525i implements InterfaceC9533p {

    /* renamed from: a */
    private final InterfaceC9533p f18856a;

    public C9525i(InterfaceC9533p interfaceC9533p) {
        this.f18856a = interfaceC9533p;
    }

    /* renamed from: a */
    private void m2061a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("unifiedconfig.data.gameSessionId");
            if ((obj instanceof Long) && ((Long) obj).longValue() == 0) {
                C9604i.m1839a().sendMetric(C9606j.m1822c());
            }
        }
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        InterfaceC9533p interfaceC9533p = this.f18856a;
        if (interfaceC9533p == null) {
            return null;
        }
        Map<String, Object> mo2037a = interfaceC9533p.mo2037a();
        m2061a(mo2037a);
        return mo2037a;
    }
}
