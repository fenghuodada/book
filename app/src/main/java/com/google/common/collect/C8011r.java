package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
/* renamed from: com.google.common.collect.r */
/* loaded from: classes3.dex */
public final class C8011r<K, V> extends AbstractC7971e<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: a */
    public final K f15814a;
    @NullableDecl

    /* renamed from: b */
    public final V f15815b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8011r(@NullableDecl Object obj, @NullableDecl List list) {
        this.f15814a = obj;
        this.f15815b = list;
    }

    @Override // com.google.common.collect.AbstractC7971e, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f15814a;
    }

    @Override // com.google.common.collect.AbstractC7971e, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f15815b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
