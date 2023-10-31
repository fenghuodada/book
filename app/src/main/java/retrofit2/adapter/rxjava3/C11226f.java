package retrofit2.adapter.rxjava3;

import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.core.InterfaceC10153f;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.exceptions.C10164a;
import io.reactivex.rxjava3.exceptions.C10169b;
import io.reactivex.rxjava3.plugins.C10234a;
import retrofit2.C11245e0;

/* renamed from: retrofit2.adapter.rxjava3.f */
/* loaded from: classes3.dex */
public final class C11226f<T> extends AbstractC10151d<C11225e<T>> {

    /* renamed from: a */
    public final AbstractC10151d<C11245e0<T>> f21921a;

    /* renamed from: retrofit2.adapter.rxjava3.f$a */
    /* loaded from: classes3.dex */
    public static class C11227a<R> implements InterfaceC10153f<C11245e0<R>> {

        /* renamed from: a */
        public final InterfaceC10153f<? super C11225e<R>> f21922a;

        public C11227a(InterfaceC10153f<? super C11225e<R>> interfaceC10153f) {
            this.f21922a = interfaceC10153f;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        /* renamed from: a */
        public final void mo47a(InterfaceC10161b interfaceC10161b) {
            this.f21922a.mo47a(interfaceC10161b);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        /* renamed from: c */
        public final void mo46c(Object obj) {
            if (((C11245e0) obj) != null) {
                this.f21922a.mo46c(new C11225e());
                return;
            }
            throw new NullPointerException("response == null");
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        public final void onComplete() {
            this.f21922a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        public final void onError(Throwable th) {
            InterfaceC10153f<? super C11225e<R>> interfaceC10153f = this.f21922a;
            try {
                if (th != null) {
                    interfaceC10153f.mo46c(new C11225e());
                    interfaceC10153f.onComplete();
                    return;
                }
                throw new NullPointerException("error == null");
            } catch (Throwable th2) {
                try {
                    interfaceC10153f.onError(th2);
                } catch (Throwable th3) {
                    C10169b.m1213a(th3);
                    C10234a.m1188a(new C10164a(th2, th3));
                }
            }
        }
    }

    public C11226f(AbstractC10151d<C11245e0<T>> abstractC10151d) {
        this.f21921a = abstractC10151d;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10151d
    /* renamed from: e */
    public final void mo48e(InterfaceC10153f<? super C11225e<T>> interfaceC10153f) {
        this.f21921a.m1221d(new C11227a(interfaceC10153f));
    }
}
