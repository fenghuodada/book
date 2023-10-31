package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.fuseable.InterfaceC10184a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.rxjava3.internal.observers.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10186a<T> extends AtomicInteger implements InterfaceC10184a<T> {
    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
