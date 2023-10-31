package retrofit2.adapter.rxjava3;

import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.core.InterfaceC10153f;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.exceptions.C10164a;
import io.reactivex.rxjava3.exceptions.C10169b;
import io.reactivex.rxjava3.plugins.C10234a;
import retrofit2.C11245e0;
import retrofit2.C11283w;
import retrofit2.InterfaceC11230b;
import retrofit2.InterfaceC11241d;

/* renamed from: retrofit2.adapter.rxjava3.b */
/* loaded from: classes3.dex */
public final class C11220b<T> extends AbstractC10151d<C11245e0<T>> {

    /* renamed from: a */
    public final InterfaceC11230b<T> f21913a;

    /* renamed from: retrofit2.adapter.rxjava3.b$a */
    /* loaded from: classes3.dex */
    public static final class C11221a<T> implements InterfaceC10161b, InterfaceC11241d<T> {

        /* renamed from: a */
        public final InterfaceC11230b<?> f21914a;

        /* renamed from: b */
        public final InterfaceC10153f<? super C11245e0<T>> f21915b;

        /* renamed from: c */
        public volatile boolean f21916c;

        /* renamed from: d */
        public boolean f21917d = false;

        public C11221a(InterfaceC11230b<?> interfaceC11230b, InterfaceC10153f<? super C11245e0<T>> interfaceC10153f) {
            this.f21914a = interfaceC11230b;
            this.f21915b = interfaceC10153f;
        }

        @Override // retrofit2.InterfaceC11241d
        /* renamed from: a */
        public final void mo9a(InterfaceC11230b<T> interfaceC11230b, Throwable th) {
            if (interfaceC11230b.isCanceled()) {
                return;
            }
            try {
                this.f21915b.onError(th);
            } catch (Throwable th2) {
                C10169b.m1213a(th2);
                C10234a.m1188a(new C10164a(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            this.f21916c = true;
            this.f21914a.cancel();
        }

        @Override // retrofit2.InterfaceC11241d
        /* renamed from: c */
        public final void mo8c(InterfaceC11230b<T> interfaceC11230b, C11245e0<T> c11245e0) {
            if (this.f21916c) {
                return;
            }
            try {
                this.f21915b.mo46c(c11245e0);
                if (this.f21916c) {
                    return;
                }
                this.f21917d = true;
                this.f21915b.onComplete();
            } catch (Throwable th) {
                C10169b.m1213a(th);
                if (this.f21917d) {
                    C10234a.m1188a(th);
                } else if (this.f21916c) {
                } else {
                    try {
                        this.f21915b.onError(th);
                    } catch (Throwable th2) {
                        C10169b.m1213a(th2);
                        C10234a.m1188a(new C10164a(th, th2));
                    }
                }
            }
        }
    }

    public C11220b(C11283w c11283w) {
        this.f21913a = c11283w;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10151d
    /* renamed from: e */
    public final void mo48e(InterfaceC10153f<? super C11245e0<T>> interfaceC10153f) {
        InterfaceC11230b<T> mo13249clone = this.f21913a.mo13249clone();
        C11221a c11221a = new C11221a(mo13249clone, interfaceC10153f);
        interfaceC10153f.mo47a(c11221a);
        if (!c11221a.f21916c) {
            mo13249clone.mo3e(c11221a);
        }
    }
}
