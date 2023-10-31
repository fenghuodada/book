package retrofit2;

import javax.annotation.Nullable;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.C10783b;
import kotlinx.coroutines.C11020i;
import okhttp3.Call;
import okhttp3.ResponseBody;

/* renamed from: retrofit2.n */
/* loaded from: classes3.dex */
public abstract class AbstractC11269n<ResponseT, ReturnT> extends AbstractC11256h0<ReturnT> {

    /* renamed from: a */
    public final C11242d0 f22035a;

    /* renamed from: b */
    public final Call.Factory f22036b;

    /* renamed from: c */
    public final InterfaceC11257i<ResponseBody, ResponseT> f22037c;

    /* renamed from: retrofit2.n$a */
    /* loaded from: classes3.dex */
    public static final class C11270a<ResponseT, ReturnT> extends AbstractC11269n<ResponseT, ReturnT> {

        /* renamed from: d */
        public final InterfaceC11234c<ResponseT, ReturnT> f22038d;

        public C11270a(C11242d0 c11242d0, Call.Factory factory, InterfaceC11257i<ResponseBody, ResponseT> interfaceC11257i, InterfaceC11234c<ResponseT, ReturnT> interfaceC11234c) {
            super(c11242d0, factory, interfaceC11257i);
            this.f22038d = interfaceC11234c;
        }

        @Override // retrofit2.AbstractC11269n
        /* renamed from: c */
        public final Object mo10c(C11283w c11283w, Object[] objArr) {
            return this.f22038d.mo13b(c11283w);
        }
    }

    /* renamed from: retrofit2.n$b */
    /* loaded from: classes3.dex */
    public static final class C11271b<ResponseT> extends AbstractC11269n<ResponseT, Object> {

        /* renamed from: d */
        public final InterfaceC11234c<ResponseT, InterfaceC11230b<ResponseT>> f22039d;

        /* renamed from: e */
        public final boolean f22040e;

        public C11271b(C11242d0 c11242d0, Call.Factory factory, InterfaceC11257i interfaceC11257i, InterfaceC11234c interfaceC11234c) {
            super(c11242d0, factory, interfaceC11257i);
            this.f22039d = interfaceC11234c;
            this.f22040e = false;
        }

        @Override // retrofit2.AbstractC11269n
        /* renamed from: c */
        public final Object mo10c(C11283w c11283w, Object[] objArr) {
            InterfaceC11230b interfaceC11230b = (InterfaceC11230b) this.f22039d.mo13b(c11283w);
            InterfaceC10772d interfaceC10772d = (InterfaceC10772d) objArr[objArr.length - 1];
            try {
                if (this.f22040e) {
                    C11020i c11020i = new C11020i(1, C10783b.m455b(interfaceC10772d));
                    c11020i.m285u(new C11275q(interfaceC11230b));
                    interfaceC11230b.mo3e(new C11277s(c11020i));
                    return c11020i.m288q();
                }
                C11020i c11020i2 = new C11020i(1, C10783b.m455b(interfaceC10772d));
                c11020i2.m285u(new C11274p(interfaceC11230b));
                interfaceC11230b.mo3e(new C11276r(c11020i2));
                return c11020i2.m288q();
            } catch (Exception e) {
                return C11280v.m7a(e, interfaceC10772d);
            }
        }
    }

    /* renamed from: retrofit2.n$c */
    /* loaded from: classes3.dex */
    public static final class C11272c<ResponseT> extends AbstractC11269n<ResponseT, Object> {

        /* renamed from: d */
        public final InterfaceC11234c<ResponseT, InterfaceC11230b<ResponseT>> f22041d;

        public C11272c(C11242d0 c11242d0, Call.Factory factory, InterfaceC11257i<ResponseBody, ResponseT> interfaceC11257i, InterfaceC11234c<ResponseT, InterfaceC11230b<ResponseT>> interfaceC11234c) {
            super(c11242d0, factory, interfaceC11257i);
            this.f22041d = interfaceC11234c;
        }

        @Override // retrofit2.AbstractC11269n
        /* renamed from: c */
        public final Object mo10c(C11283w c11283w, Object[] objArr) {
            InterfaceC11230b interfaceC11230b = (InterfaceC11230b) this.f22041d.mo13b(c11283w);
            InterfaceC10772d interfaceC10772d = (InterfaceC10772d) objArr[objArr.length - 1];
            try {
                C11020i c11020i = new C11020i(1, C10783b.m455b(interfaceC10772d));
                c11020i.m285u(new C11278t(interfaceC11230b));
                interfaceC11230b.mo3e(new C11279u(c11020i));
                return c11020i.m288q();
            } catch (Exception e) {
                return C11280v.m7a(e, interfaceC10772d);
            }
        }
    }

    public AbstractC11269n(C11242d0 c11242d0, Call.Factory factory, InterfaceC11257i<ResponseBody, ResponseT> interfaceC11257i) {
        this.f22035a = c11242d0;
        this.f22036b = factory;
        this.f22037c = interfaceC11257i;
    }

    @Override // retrofit2.AbstractC11256h0
    @Nullable
    /* renamed from: a */
    public final ReturnT mo11a(Object[] objArr) {
        return (ReturnT) mo10c(new C11283w(this.f22035a, objArr, this.f22036b, this.f22037c), objArr);
    }

    @Nullable
    /* renamed from: c */
    public abstract Object mo10c(C11283w c11283w, Object[] objArr);
}
