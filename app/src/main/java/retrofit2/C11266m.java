package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;
import retrofit2.C11266m;
import retrofit2.InterfaceC11234c;

/* renamed from: retrofit2.m */
/* loaded from: classes3.dex */
public final class C11266m extends InterfaceC11234c.AbstractC11235a {
    @Nullable

    /* renamed from: a */
    public final Executor f22030a;

    /* renamed from: retrofit2.m$a */
    /* loaded from: classes3.dex */
    public static final class C11267a<T> implements InterfaceC11230b<T> {

        /* renamed from: a */
        public final Executor f22031a;

        /* renamed from: b */
        public final InterfaceC11230b<T> f22032b;

        /* renamed from: retrofit2.m$a$a */
        /* loaded from: classes3.dex */
        public class C11268a implements InterfaceC11241d<T> {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC11241d f22033a;

            public C11268a(InterfaceC11241d interfaceC11241d) {
                this.f22033a = interfaceC11241d;
            }

            @Override // retrofit2.InterfaceC11241d
            /* renamed from: a */
            public final void mo9a(InterfaceC11230b<T> interfaceC11230b, final Throwable th) {
                Executor executor = C11267a.this.f22031a;
                final InterfaceC11241d interfaceC11241d = this.f22033a;
                executor.execute(new Runnable() { // from class: retrofit2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC11241d.mo9a(C11266m.C11267a.this, th);
                    }
                });
            }

            @Override // retrofit2.InterfaceC11241d
            /* renamed from: c */
            public final void mo8c(InterfaceC11230b<T> interfaceC11230b, final C11245e0<T> c11245e0) {
                Executor executor = C11267a.this.f22031a;
                final InterfaceC11241d interfaceC11241d = this.f22033a;
                executor.execute(new Runnable() { // from class: retrofit2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11266m.C11267a c11267a = C11266m.C11267a.this;
                        boolean isCanceled = c11267a.f22032b.isCanceled();
                        InterfaceC11241d interfaceC11241d2 = interfaceC11241d;
                        if (isCanceled) {
                            interfaceC11241d2.mo9a(c11267a, new IOException("Canceled"));
                        } else {
                            interfaceC11241d2.mo8c(c11267a, c11245e0);
                        }
                    }
                });
            }
        }

        public C11267a(Executor executor, InterfaceC11230b<T> interfaceC11230b) {
            this.f22031a = executor;
            this.f22032b = interfaceC11230b;
        }

        @Override // retrofit2.InterfaceC11230b
        public final void cancel() {
            this.f22032b.cancel();
        }

        @Override // retrofit2.InterfaceC11230b
        public final InterfaceC11230b<T> clone() {
            return new C11267a(this.f22031a, this.f22032b.mo13249clone());
        }

        @Override // retrofit2.InterfaceC11230b
        /* renamed from: e */
        public final void mo3e(InterfaceC11241d<T> interfaceC11241d) {
            this.f22032b.mo3e(new C11268a(interfaceC11241d));
        }

        @Override // retrofit2.InterfaceC11230b
        public final C11245e0<T> execute() throws IOException {
            return this.f22032b.execute();
        }

        @Override // retrofit2.InterfaceC11230b
        public final boolean isCanceled() {
            return this.f22032b.isCanceled();
        }

        @Override // retrofit2.InterfaceC11230b
        public final Request request() {
            return this.f22032b.request();
        }
    }

    public C11266m(@Nullable Executor executor) {
        this.f22030a = executor;
    }

    @Override // retrofit2.InterfaceC11234c.AbstractC11235a
    @Nullable
    /* renamed from: a */
    public final InterfaceC11234c mo12a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (C11259i0.m24e(type) != InterfaceC11230b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m25d = C11259i0.m25d(0, (ParameterizedType) type);
            if (!C11259i0.m21h(annotationArr, SkipCallbackExecutor.class)) {
                executor = this.f22030a;
            }
            return new C11263j(m25d, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
