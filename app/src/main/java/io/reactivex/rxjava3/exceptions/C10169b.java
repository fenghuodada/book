package io.reactivex.rxjava3.exceptions;

import io.reactivex.rxjava3.annotations.NonNull;

/* renamed from: io.reactivex.rxjava3.exceptions.b */
/* loaded from: classes3.dex */
public final class C10169b {
    /* renamed from: a */
    public static void m1213a(@NonNull Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
