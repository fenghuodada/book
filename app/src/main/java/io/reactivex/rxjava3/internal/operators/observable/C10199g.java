package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.core.InterfaceC10152e;
import io.reactivex.rxjava3.core.InterfaceC10153f;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.EnumC10175a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.operators.observable.g */
/* loaded from: classes3.dex */
public final class C10199g<T> extends AbstractC10191a<T, T> {

    /* renamed from: b */
    public final AbstractC10154g f20467b;

    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.g$a */
    /* loaded from: classes3.dex */
    public static final class C10200a<T> extends AtomicReference<InterfaceC10161b> implements InterfaceC10153f<T>, InterfaceC10161b {

        /* renamed from: a */
        public final InterfaceC10153f<? super T> f20468a;

        /* renamed from: b */
        public final AtomicReference<InterfaceC10161b> f20469b = new AtomicReference<>();

        public C10200a(InterfaceC10153f<? super T> interfaceC10153f) {
            this.f20468a = interfaceC10153f;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        /* renamed from: a */
        public final void mo47a(InterfaceC10161b interfaceC10161b) {
            EnumC10175a.m1211c(this.f20469b, interfaceC10161b);
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            EnumC10175a.m1212a(this.f20469b);
            EnumC10175a.m1212a(this);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        /* renamed from: c */
        public final void mo46c(T t) {
            this.f20468a.mo46c(t);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        public final void onComplete() {
            this.f20468a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        public final void onError(Throwable th) {
            this.f20468a.onError(th);
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.g$b */
    /* loaded from: classes3.dex */
    public final class RunnableC10201b implements Runnable {

        /* renamed from: a */
        public final C10200a<T> f20470a;

        public RunnableC10201b(C10200a<T> c10200a) {
            this.f20470a = c10200a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((AbstractC10151d) C10199g.this.f20445a).m1221d(this.f20470a);
        }
    }

    public C10199g(InterfaceC10152e<T> interfaceC10152e, AbstractC10154g abstractC10154g) {
        super(interfaceC10152e);
        this.f20467b = abstractC10154g;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10151d
    /* renamed from: e */
    public final void mo48e(InterfaceC10153f<? super T> interfaceC10153f) {
        C10200a c10200a = new C10200a(interfaceC10153f);
        interfaceC10153f.mo47a(c10200a);
        EnumC10175a.m1211c(c10200a, this.f20467b.mo1196b(new RunnableC10201b(c10200a)));
    }
}
