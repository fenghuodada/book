package com.unity3d.services.core.request.metrics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.unity3d.services.core.request.metrics.d */
/* loaded from: classes3.dex */
public class C9597d {

    /* renamed from: a */
    private final String f19024a;

    /* renamed from: b */
    private final Object f19025b;

    /* renamed from: c */
    private final Map<String, String> f19026c;

    public C9597d(String str, Object obj, Map<String, String> map) {
        this.f19024a = str;
        this.f19025b = obj;
        this.f19026c = map;
    }

    /* renamed from: a */
    public Map<String, Object> m1858a() {
        HashMap hashMap = new HashMap();
        String str = this.f19024a;
        if (str != null) {
            hashMap.put("n", str);
        }
        Object obj = this.f19025b;
        if (obj != null) {
            hashMap.put("v", obj);
        }
        Map<String, String> map = this.f19026c;
        if (map != null) {
            hashMap.put("t", map);
        }
        return hashMap;
    }

    /* renamed from: b */
    public Map<String, String> m1857b() {
        return this.f19026c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9597d.class != obj.getClass()) {
            return false;
        }
        C9597d c9597d = (C9597d) obj;
        return this.f19024a.equals(c9597d.f19024a) && this.f19025b.equals(c9597d.f19025b) && this.f19026c.equals(c9597d.f19026c);
    }

    public int hashCode() {
        return Objects.hash(this.f19024a, this.f19025b, this.f19026c);
    }

    public String toString() {
        return "Metric{name='" + this.f19024a + "', value='" + this.f19025b + "', tags=" + this.f19026c + '}';
    }
}
