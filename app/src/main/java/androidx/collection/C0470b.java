package androidx.collection;

import androidx.annotation.Nullable;
import androidx.collection.AbstractC0476h;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p060j$.util.Map;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Function;

/* renamed from: androidx.collection.b */
/* loaded from: classes.dex */
public class C0470b<K, V> extends C0482i<K, V> implements Map<K, V>, p060j$.util.Map {
    @Nullable

    /* renamed from: h */
    public C0469a f1490h;

    public C0470b() {
    }

    public C0470b(int i) {
        super(i);
    }

    public C0470b(C0470b c0470b) {
        super(c0470b);
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f1490h == null) {
            this.f1490h = new C0469a(this);
        }
        C0469a c0469a = this.f1490h;
        if (c0469a.f1510a == null) {
            c0469a.f1510a = new AbstractC0476h.C0478b();
        }
        return c0469a.f1510a;
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Set<K> keySet() {
        if (this.f1490h == null) {
            this.f1490h = new C0469a(this);
        }
        C0469a c0469a = this.f1490h;
        if (c0469a.f1511b == null) {
            c0469a.f1511b = new AbstractC0476h.C0479c();
        }
        return c0469a.f1511b;
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        m12404b(map.size() + this.f1531c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final Collection<V> values() {
        if (this.f1490h == null) {
            this.f1490h = new C0469a(this);
        }
        C0469a c0469a = this.f1490h;
        if (c0469a.f1512c == null) {
            c0469a.f1512c = new AbstractC0476h.C0481e();
        }
        return c0469a.f1512c;
    }
}
