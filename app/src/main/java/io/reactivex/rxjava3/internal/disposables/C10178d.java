package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.disposables.d */
/* loaded from: classes3.dex */
public final class C10178d extends AtomicReference<InterfaceC10161b> implements InterfaceC10161b {
    public C10178d() {
    }

    public C10178d(C10178d c10178d) {
        lazySet(c10178d);
    }

    /* renamed from: a */
    public final void m1207a(InterfaceC10161b interfaceC10161b) {
        boolean z;
        do {
            InterfaceC10161b interfaceC10161b2 = get();
            if (interfaceC10161b2 != EnumC10175a.f20431a) {
                while (true) {
                    if (!compareAndSet(interfaceC10161b2, interfaceC10161b)) {
                        if (get() != interfaceC10161b2) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else if (interfaceC10161b != null) {
                interfaceC10161b.mo49b();
                return;
            } else {
                return;
            }
        } while (!z);
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        EnumC10175a.m1212a(this);
    }
}
