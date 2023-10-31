package kotlinx.coroutines.internal;

import kotlin.C10738b;
import kotlin.coroutines.InterfaceC10775f;
import kotlinx.coroutines.InterfaceC10952c0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.internal.i */
/* loaded from: classes3.dex */
public final class C11039i {
    /* renamed from: a */
    public static final void m262a(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Throwable th) {
        Throwable runtimeException;
        for (InterfaceC10952c0 interfaceC10952c0 : C11037h.f21628a) {
            try {
                interfaceC10952c0.mo347E(interfaceC10775f, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C10738b.m502a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            C10738b.m502a(th, new C11044j(interfaceC10775f));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
