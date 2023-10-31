package p060j$.util.concurrent;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.m */
/* loaded from: classes2.dex */
public class C10351m implements Map.Entry {

    /* renamed from: a */
    final int f20802a;

    /* renamed from: b */
    final Object f20803b;

    /* renamed from: c */
    volatile Object f20804c;

    /* renamed from: d */
    volatile C10351m f20805d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10351m(int i, Object obj, Object obj2, C10351m c10351m) {
        this.f20802a = i;
        this.f20803b = obj;
        this.f20804c = obj2;
        this.f20805d = c10351m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C10351m mo957a(Object obj, int i) {
        Object obj2;
        if (obj != null) {
            C10351m c10351m = this;
            do {
                if (c10351m.f20802a == i && ((obj2 = c10351m.f20803b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c10351m;
                }
                c10351m = c10351m.f20805d;
            } while (c10351m != null);
            return null;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f20803b) || key.equals(obj2)) && (value == (obj3 = this.f20804c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20803b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20804c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f20803b.hashCode() ^ this.f20804c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f20803b + "=" + this.f20804c;
    }
}
