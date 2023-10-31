package com.google.common.collect;

import com.google.common.base.InterfaceC7946m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.common.collect.h0 */
/* loaded from: classes3.dex */
public final class C7979h0<V> implements InterfaceC7946m<List<V>>, Serializable {

    /* renamed from: a */
    public final int f15752a;

    public C7979h0(int i) {
        C7978h.m4265b(i, "expectedValuesPerKey");
        this.f15752a = i;
    }

    @Override // com.google.common.base.InterfaceC7946m
    public final Object get() {
        return new ArrayList(this.f15752a);
    }
}
