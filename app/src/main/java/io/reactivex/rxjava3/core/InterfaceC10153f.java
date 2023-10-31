package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;

/* renamed from: io.reactivex.rxjava3.core.f */
/* loaded from: classes3.dex */
public interface InterfaceC10153f<T> {
    /* renamed from: a */
    void mo47a(@NonNull InterfaceC10161b interfaceC10161b);

    /* renamed from: c */
    void mo46c(@NonNull T t);

    void onComplete();

    void onError(@NonNull Throwable th);
}
