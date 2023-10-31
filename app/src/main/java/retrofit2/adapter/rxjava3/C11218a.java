package retrofit2.adapter.rxjava3;

import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.core.InterfaceC10153f;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.exceptions.C10164a;
import io.reactivex.rxjava3.exceptions.C10169b;
import io.reactivex.rxjava3.plugins.C10234a;
import retrofit2.C11245e0;

/* renamed from: retrofit2.adapter.rxjava3.a */
/* loaded from: classes3.dex */
public final class C11218a<T> extends AbstractC10151d<T> {

    /* renamed from: a */
    public final AbstractC10151d<C11245e0<T>> f21910a;

    /* renamed from: retrofit2.adapter.rxjava3.a$a */
    /* loaded from: classes3.dex */
    public static class C11219a<R> implements InterfaceC10153f<C11245e0<R>> {

        /* renamed from: a */
        public final InterfaceC10153f<? super R> f21911a;

        /* renamed from: b */
        public boolean f21912b;

        public C11219a(InterfaceC10153f<? super R> interfaceC10153f) {
            this.f21911a = interfaceC10153f;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        /* renamed from: a */
        public final void mo47a(InterfaceC10161b interfaceC10161b) {
            this.f21911a.mo47a(interfaceC10161b);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        /* renamed from: b */
        public final void mo46c(C11245e0<R> c11245e0) {
            boolean isSuccessful = c11245e0.f21996a.isSuccessful();
            InterfaceC10153f<? super R> interfaceC10153f = this.f21911a;
            if (isSuccessful) {
                interfaceC10153f.mo46c((R) c11245e0.f21997b);
                return;
            }
            this.f21912b = true;
            C11224d c11224d = new C11224d(c11245e0);
            try {
                interfaceC10153f.onError(c11224d);
            } catch (Throwable th) {
                C10169b.m1213a(th);
                C10234a.m1188a(new C10164a(c11224d, th));
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        public final void onComplete() {
            if (this.f21912b) {
                return;
            }
            this.f21911a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC10153f
        public final void onError(Throwable th) {
            if (!this.f21912b) {
                this.f21911a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C10234a.m1188a(assertionError);
        }
    }

    public C11218a(AbstractC10151d<C11245e0<T>> abstractC10151d) {
        this.f21910a = abstractC10151d;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10151d
    /* renamed from: e */
    public final void mo48e(InterfaceC10153f<? super T> interfaceC10153f) {
        this.f21910a.m1221d(new C11219a(interfaceC10153f));
    }
}
