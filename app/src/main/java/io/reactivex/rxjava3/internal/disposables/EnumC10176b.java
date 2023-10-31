package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.fuseable.InterfaceC10184a;

/* renamed from: io.reactivex.rxjava3.internal.disposables.b */
/* loaded from: classes3.dex */
public enum EnumC10176b implements InterfaceC10184a<Object> {
    INSTANCE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER;

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10184a
    /* renamed from: d */
    public final int mo1206d() {
        return 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.InterfaceC10185b
    @Nullable
    public final Object poll() {
        return null;
    }
}
