package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.common.collect.a0 */
/* loaded from: classes3.dex */
public final class EnumC7948a0 implements Iterator<Object>, p060j$.util.Iterator {

    /* renamed from: a */
    public static final EnumC7948a0 f15708a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC7948a0[] f15709b;

    static {
        EnumC7948a0 enumC7948a0 = new EnumC7948a0();
        f15708a = enumC7948a0;
        f15709b = new EnumC7948a0[]{enumC7948a0};
    }

    public static EnumC7948a0 valueOf(String str) {
        return (EnumC7948a0) Enum.valueOf(EnumC7948a0.class, str);
    }

    public static EnumC7948a0[] values() {
        return (EnumC7948a0[]) f15709b.clone();
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
