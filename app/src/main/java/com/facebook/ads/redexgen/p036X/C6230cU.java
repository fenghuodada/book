package com.facebook.ads.redexgen.p036X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.cU */
/* loaded from: assets/audience_network.dex */
public final class C6230cU<K, V> extends C40712g<K, V> implements Map<K, V> {
    public AbstractC40682d<K, V> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cU != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    private AbstractC40682d<K, V> A00() {
        if (this.A00 == null) {
            this.A00 = new C6231cV(this);
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cU != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return A00().A0B();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cU != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final Set<K> keySet() {
        return A00().A0C();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cU != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        A0D(super.A00 + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cU != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final Collection<V> values() {
        return A00().A09();
    }
}
