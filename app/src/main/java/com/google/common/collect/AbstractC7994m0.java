package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.collect.m0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7994m0<T> implements Comparator<T> {
    @GwtCompatible(serializable = true)
    /* renamed from: a */
    public <S extends T> AbstractC7994m0<S> mo4248a() {
        return new C8012r0(this);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);
}
