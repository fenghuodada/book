package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.C7937f;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.collect.e */
/* loaded from: classes3.dex */
public abstract class AbstractC7971e<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return C7937f.m4290a(getKey(), entry.getKey()) && C7937f.m4290a(getValue(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
