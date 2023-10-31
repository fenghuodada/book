package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
/* renamed from: com.google.common.collect.q0 */
/* loaded from: classes3.dex */
public final class C8010q0 extends AbstractC7994m0<Comparable> implements Serializable {

    /* renamed from: a */
    public static final C8010q0 f15813a = new C8010q0();

    @Override // com.google.common.collect.AbstractC7994m0
    /* renamed from: a */
    public final <S extends Comparable> AbstractC7994m0<S> mo4248a() {
        return C7985k0.f15757a;
    }

    @Override // com.google.common.collect.AbstractC7994m0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
