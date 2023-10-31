package com.vungle.warren.model;

import com.vungle.warren.VungleLogger;
import java.util.Map;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vungle.warren.model.g */
/* loaded from: classes3.dex */
public final class C9867g {

    /* renamed from: a */
    public Map<String, String> f19823a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, Boolean> f19824b = new ConcurrentHashMap();

    /* renamed from: c */
    public Map<String, Integer> f19825c = new ConcurrentHashMap();

    /* renamed from: d */
    public Map<String, Long> f19826d = new ConcurrentHashMap();

    /* renamed from: e */
    public final String f19827e;

    public C9867g(String str) {
        this.f19827e = str;
    }

    /* renamed from: a */
    public final Boolean m1448a(String str) {
        return Boolean.valueOf(this.f19824b.get(str) != null && this.f19824b.get(str).booleanValue());
    }

    /* renamed from: b */
    public final Long m1447b(String str) {
        return Long.valueOf(this.f19826d.get(str) != null ? this.f19826d.get(str).longValue() : 0L);
    }

    /* renamed from: c */
    public final String m1446c(String str) {
        return this.f19823a.get(str);
    }

    /* renamed from: d */
    public final void m1445d(Object obj, String str) {
        Map map;
        Object obj2;
        if (obj == null) {
            VungleLogger.m1605a(C9867g.class.getSimpleName(), "putValue", String.format("Value for key \"%s\" should not be null", str));
            return;
        }
        if (obj instanceof String) {
            map = this.f19823a;
            obj2 = (String) obj;
        } else if (obj instanceof Boolean) {
            map = this.f19824b;
            obj2 = (Boolean) obj;
        } else if (obj instanceof Integer) {
            map = this.f19825c;
            obj2 = (Integer) obj;
        } else if (!(obj instanceof Long)) {
            VungleLogger.m1605a(C9867g.class.getSimpleName(), "putValue", "Value type is not supported!");
            return;
        } else {
            map = this.f19826d;
            obj2 = (Long) obj;
        }
        map.put(str, obj2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9867g.class != obj.getClass()) {
            return false;
        }
        C9867g c9867g = (C9867g) obj;
        Map<String, String> map = this.f19823a;
        if (map == null ? c9867g.f19823a == null : map.equals(c9867g.f19823a)) {
            Map<String, Boolean> map2 = this.f19824b;
            if (map2 == null ? c9867g.f19824b == null : map2.equals(c9867g.f19824b)) {
                Map<String, Integer> map3 = this.f19825c;
                if (map3 == null ? c9867g.f19825c == null : map3.equals(c9867g.f19825c)) {
                    Map<String, Long> map4 = this.f19826d;
                    if (map4 == null ? c9867g.f19826d == null : map4.equals(c9867g.f19826d)) {
                        String str = c9867g.f19827e;
                        String str2 = this.f19827e;
                        return str2 != null ? str2.equals(str) : str == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Map<String, String> map = this.f19823a;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, Boolean> map2 = this.f19824b;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, Integer> map3 = this.f19825c;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, Long> map4 = this.f19826d;
        int hashCode4 = (hashCode3 + (map4 != null ? map4.hashCode() : 0)) * 31;
        String str = this.f19827e;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }
}
