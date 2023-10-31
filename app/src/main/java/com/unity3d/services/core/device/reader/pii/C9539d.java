package com.unity3d.services.core.device.reader.pii;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.pii.d */
/* loaded from: classes3.dex */
public class C9539d {

    /* renamed from: a */
    private final Map<String, Object> f18879a;

    /* renamed from: b */
    private final EnumC9534a f18880b;

    public C9539d(EnumC9534a enumC9534a) {
        this(enumC9534a, new HashMap());
    }

    public C9539d(EnumC9534a enumC9534a, Map<String, Object> map) {
        this.f18880b = enumC9534a;
        this.f18879a = map;
    }

    /* renamed from: a */
    public Map<String, Object> m2047a() {
        return this.f18879a;
    }

    /* renamed from: a */
    public void m2046a(Map<String, Object> map) {
        Map<String, Object> map2 = this.f18879a;
        if (map2 != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: b */
    public EnumC9534a m2045b() {
        return this.f18880b;
    }

    /* renamed from: c */
    public Boolean m2044c() {
        Map<String, Object> map = this.f18879a;
        if (map != null) {
            Object obj = map.get("user.nonBehavioral");
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
        }
        return null;
    }
}
