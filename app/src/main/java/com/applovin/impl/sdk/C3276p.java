package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.applovin.impl.sdk.p */
/* loaded from: classes.dex */
public class C3276p {

    /* renamed from: a */
    private final String f8642a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final String f8643b;

    /* renamed from: c */
    private final Map<String, Object> f8644c;

    /* renamed from: d */
    private final long f8645d;

    public C3276p(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f8643b = str;
        HashMap hashMap = new HashMap();
        this.f8644c = hashMap;
        hashMap.putAll(map);
        hashMap.put("applovin_sdk_super_properties", map2);
        this.f8645d = System.currentTimeMillis();
    }

    /* renamed from: a */
    public String m7111a() {
        return this.f8643b;
    }

    /* renamed from: b */
    public Map<String, Object> m7110b() {
        return this.f8644c;
    }

    /* renamed from: c */
    public long m7109c() {
        return this.f8645d;
    }

    /* renamed from: d */
    public String m7108d() {
        return this.f8642a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3276p c3276p = (C3276p) obj;
        if (this.f8645d != c3276p.f8645d) {
            return false;
        }
        String str = this.f8643b;
        if (str == null ? c3276p.f8643b == null : str.equals(c3276p.f8643b)) {
            Map<String, Object> map = this.f8644c;
            if (map == null ? c3276p.f8644c == null : map.equals(c3276p.f8644c)) {
                String str2 = this.f8642a;
                String str3 = c3276p.f8642a;
                if (str2 != null) {
                    if (str2.equals(str3)) {
                        return true;
                    }
                } else if (str3 == null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8643b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f8644c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.f8645d;
        int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f8642a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f8643b + "', id='" + this.f8642a + "', creationTimestampMillis=" + this.f8645d + ", parameters=" + this.f8644c + '}';
    }
}
