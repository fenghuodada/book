package io.reactivex.rxjava3.exceptions;

/* renamed from: io.reactivex.rxjava3.exceptions.e */
/* loaded from: classes3.dex */
public final class C10172e extends IllegalStateException {
    public C10172e(Throwable th) {
        super("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
    }
}
