package io.reactivex.rxjava3.plugins;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.exceptions.C10164a;
import io.reactivex.rxjava3.exceptions.C10170c;
import io.reactivex.rxjava3.exceptions.C10172e;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.internal.util.C10231a;

/* renamed from: io.reactivex.rxjava3.plugins.a */
/* loaded from: classes3.dex */
public final class C10234a {
    @Nullable

    /* renamed from: a */
    public static volatile InterfaceC10174b<? super Throwable> f20568a;

    /* renamed from: a */
    public static void m1188a(@NonNull Throwable th) {
        boolean z;
        InterfaceC10174b<? super Throwable> interfaceC10174b = f20568a;
        if (th == null) {
            int i = C10231a.f20563a;
            th = new NullPointerException("onError called with a null Throwable. Null values are generally not allowed in 3.x operators and sources.");
        } else {
            if ((th instanceof C10170c) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof C10164a)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                th = new C10172e(th);
            }
        }
        if (interfaceC10174b != null) {
            try {
                interfaceC10174b.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
