package p060j$.util.concurrent;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.l */
/* loaded from: classes2.dex */
public final class C10350l implements Map.Entry {

    /* renamed from: a */
    final Object f20799a;

    /* renamed from: b */
    Object f20800b;

    /* renamed from: c */
    final ConcurrentHashMap f20801c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10350l(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f20799a = obj;
        this.f20800b = obj2;
        this.f20801c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f20799a) || key.equals(obj2)) && (value == (obj3 = this.f20800b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20799a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20800b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f20799a.hashCode() ^ this.f20800b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f20800b;
        this.f20800b = obj;
        this.f20801c.put(this.f20799a, obj);
        return obj2;
    }

    public final String toString() {
        return this.f20799a + "=" + this.f20800b;
    }
}
