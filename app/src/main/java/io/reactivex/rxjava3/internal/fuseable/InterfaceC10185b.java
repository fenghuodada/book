package io.reactivex.rxjava3.internal.fuseable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;

/* renamed from: io.reactivex.rxjava3.internal.fuseable.b */
/* loaded from: classes3.dex */
public interface InterfaceC10185b<T> {
    void clear();

    boolean isEmpty();

    boolean offer(@NonNull T t);

    @Nullable
    T poll() throws Throwable;
}
