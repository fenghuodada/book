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

/* renamed from: retrofit2.adapter.rxjava3.c */
/* loaded from: classes3.dex */
public final class C11222c<T> extends AbstractC10151d<C11245e0<T>> {

    /* renamed from: a */
    public final InterfaceC11230b<T> f21918a;

    /* renamed from: retrofit2.adapter.rxjava3.c$a */
    /* loaded from: classes3.dex */
    public static final class C11223a implements InterfaceC10161b {

        /* renamed from: a */
        public final InterfaceC11230b<?> f21919a;

        /* renamed from: b */
        public volatile boolean f21920b;

        public C11223a(InterfaceC11230b<?> interfaceC11230b) {
            this.f21919a = interfaceC11230b;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            this.f21920b = true;
            this.f21919a.cancel();
        }
    }

    public C11222c(C11283w c11283w) {
        this.f21918a = c11283w;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10151d
    /* renamed from: e */
    public final void mo48e(InterfaceC10153f<? super C11245e0<T>> interfaceC10153f) {
        boolean z;
        InterfaceC11230b<T> mo13249clone = this.f21918a.mo13249clone();
        C11223a c11223a = new C11223a(mo13249clone);
        interfaceC10153f.mo47a(c11223a);
        if (c11223a.f21920b) {
            return;
        }
        try {
            C11245e0<T> execute = mo13249clone.execute();
            if (!c11223a.f21920b) {
                interfaceC10153f.mo46c(execute);
            }
            if (!c11223a.f21920b) {
                try {
                    interfaceC10153f.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    C10169b.m1213a(th);
                    if (z) {
                        C10234a.m1188a(th);
                    } else if (!c11223a.f21920b) {
                        try {
                            interfaceC10153f.onError(th);
                        } catch (Throwable th2) {
                            C10169b.m1213a(th2);
                            C10234a.m1188a(new C10164a(th, th2));
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
