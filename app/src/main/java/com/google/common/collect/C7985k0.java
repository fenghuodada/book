package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
/* renamed from: com.google.common.collect.k0 */
/* loaded from: classes3.dex */
public final class C7985k0 extends AbstractC7994m0<Comparable> implements Serializable {

    /* renamed from: a */
    public static final C7985k0 f15757a = new C7985k0();

    @Override // com.google.common.collect.AbstractC7994m0
    /* renamed from: a */
    public final <S extends Comparable> AbstractC7994m0<S> mo4248a() {
        return C8010q0.f15813a;
    }

    @Override // com.google.common.collect.AbstractC7994m0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
