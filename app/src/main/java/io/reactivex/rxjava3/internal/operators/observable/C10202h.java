package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.core.InterfaceC10153f;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.EnumC10175a;
import io.reactivex.rxjava3.internal.disposables.EnumC10176b;
import io.reactivex.rxjava3.internal.schedulers.C10206b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.operators.observable.h */
/* loaded from: classes3.dex */
public final class C10202h extends AbstractC10151d<Long> {

    /* renamed from: a */
    public final AbstractC10154g f20472a;

    /* renamed from: b */
    public final long f20473b;

    /* renamed from: c */
    public final TimeUnit f20474c;

    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.h$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC10203a extends AtomicReference<InterfaceC10161b> implements InterfaceC10161b, Runnable {

        /* renamed from: a */
        public final InterfaceC10153f<? super Long> f20475a;

        public RunnableC10203a(InterfaceC10153f<? super Long> interfaceC10153f) {
            this.f20475a = interfaceC10153f;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            EnumC10175a.m1212a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            if (get() == EnumC10175a.f20431a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                InterfaceC10153f<? super Long> interfaceC10153f = this.f20475a;
                interfaceC10153f.mo46c(0L);
                lazySet(EnumC10176b.INSTANCE);
                interfaceC10153f.onComplete();
            }
        }
    }

    public C10202h(long j, TimeUnit timeUnit, C10206b c10206b) {
        this.f20473b = j;
        this.f20474c = timeUnit;
        this.f20472a = c10206b;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10151d
    /* renamed from: e */
    public final void mo48e(InterfaceC10153f<? super Long> interfaceC10153f) {
        boolean z;
        RunnableC10203a runnableC10203a = new RunnableC10203a(interfaceC10153f);
        interfaceC10153f.mo47a(runnableC10203a);
        InterfaceC10161b mo1195c = this.f20472a.mo1195c(runnableC10203a, this.f20473b, this.f20474c);
        while (true) {
            if (runnableC10203a.compareAndSet(null, mo1195c)) {
                z = true;
                break;
            } else if (runnableC10203a.get() != null) {
                z = false;
                break;
            }
        }
        if (!z && runnableC10203a.get() == EnumC10175a.f20431a) {
            mo1195c.mo49b();
        }
    }
}
