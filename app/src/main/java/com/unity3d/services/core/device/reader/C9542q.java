package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.q */
/* loaded from: classes3.dex */
public class C9542q implements InterfaceC9533p {
    @Override // com.unity3d.services.core.device.reader.InterfaceC9533p
    /* renamed from: a */
    public Map<String, Object> mo2037a() {
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("sdkVersion", Integer.valueOf(C9572d.m1926n()));
        hashMap.put("sdkVersionName", C9572d.m1925o());
        hashMap.put("idfi", C9498b.m2109v());
        hashMap.put("ts", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("gameId", C9568a.m1958f());
        return hashMap;
    }
}
