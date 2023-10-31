package io.reactivex.rxjava3.exceptions;

import io.reactivex.rxjava3.annotations.NonNull;

/* renamed from: io.reactivex.rxjava3.exceptions.c */
/* loaded from: classes3.dex */
public final class C10170c extends RuntimeException {
    public C10170c(@NonNull Throwable th) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th, th == null ? new NullPointerException() : th);
    }
}
