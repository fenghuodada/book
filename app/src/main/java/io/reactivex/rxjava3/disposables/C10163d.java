package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.schedulers.C10226m;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.disposables.d */
/* loaded from: classes3.dex */
public final class C10163d extends AtomicReference<Runnable> implements InterfaceC10161b {
    public C10163d(C10226m.C10229c.RunnableC10230a runnableC10230a) {
        super(runnableC10230a);
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        Runnable andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            andSet.run();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        if (get() == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
