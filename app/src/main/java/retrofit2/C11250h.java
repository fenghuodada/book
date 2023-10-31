package retrofit2;

import androidx.datastore.preferences.protobuf.C1223n1;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.InterfaceC11234c;

@IgnoreJRERequirement
/* renamed from: retrofit2.h */
/* loaded from: classes3.dex */
public final class C11250h extends InterfaceC11234c.AbstractC11235a {

    /* renamed from: a */
    public static final C11250h f22009a = new C11250h();

    @IgnoreJRERequirement
    /* renamed from: retrofit2.h$a */
    /* loaded from: classes3.dex */
    public static final class C11251a<R> implements InterfaceC11234c<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f22010a;

        @IgnoreJRERequirement
        /* renamed from: retrofit2.h$a$a */
        /* loaded from: classes3.dex */
        public class C11252a implements InterfaceC11241d<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f22011a;

            public C11252a(C11253b c11253b) {
                this.f22011a = c11253b;
            }

            @Override // retrofit2.InterfaceC11241d
            /* renamed from: a */
            public final void mo9a(InterfaceC11230b<R> interfaceC11230b, Throwable th) {
                this.f22011a.completeExceptionally(th);
            }

            @Override // retrofit2.InterfaceC11241d
            /* renamed from: c */
            public final void mo8c(InterfaceC11230b<R> interfaceC11230b, C11245e0<R> c11245e0) {
                boolean isSuccessful = c11245e0.f21996a.isSuccessful();
                CompletableFuture<R> completableFuture = this.f22011a;
                if (isSuccessful) {
                    completableFuture.complete(c11245e0.f21997b);
                } else {
                    completableFuture.completeExceptionally(new C1223n1(c11245e0));
                }
            }
        }

        public C11251a(Type type) {
            this.f22010a = type;
        }

        @Override // retrofit2.InterfaceC11234c
        /* renamed from: a */
        public final Type mo14a() {
            return this.f22010a;
        }

        @Override // retrofit2.InterfaceC11234c
        /* renamed from: b */
        public final Object mo13b(C11283w c11283w) {
            C11253b c11253b = new C11253b(c11283w);
            c11283w.mo3e(new C11252a(c11253b));
            return c11253b;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: retrofit2.h$b */
    /* loaded from: classes3.dex */
    public static final class C11253b<T> extends CompletableFuture<T> {

        /* renamed from: a */
        public final InterfaceC11230b<?> f22012a;

        public C11253b(C11283w c11283w) {
            this.f22012a = c11283w;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.f22012a.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: retrofit2.h$c */
    /* loaded from: classes3.dex */
    public static final class C11254c<R> implements InterfaceC11234c<R, CompletableFuture<C11245e0<R>>> {

        /* renamed from: a */
        public final Type f22013a;

        @IgnoreJRERequirement
        /* renamed from: retrofit2.h$c$a */
        /* loaded from: classes3.dex */
        public class C11255a implements InterfaceC11241d<R> {

            /* renamed from: a */
            public final CompletableFuture<C11245e0<R>> f22014a;

            public C11255a(C11253b c11253b) {
                this.f22014a = c11253b;
            }

            @Override // retrofit2.InterfaceC11241d
            /* renamed from: a */
            public final void mo9a(InterfaceC11230b<R> interfaceC11230b, Throwable th) {
                this.f22014a.completeExceptionally(th);
            }

            @Override // retrofit2.InterfaceC11241d
            /* renamed from: c */
            public final void mo8c(InterfaceC11230b<R> interfaceC11230b, C11245e0<R> c11245e0) {
                this.f22014a.complete(c11245e0);
            }
        }

        public C11254c(Type type) {
            this.f22013a = type;
        }

        @Override // retrofit2.InterfaceC11234c
        /* renamed from: a */
        public final Type mo14a() {
            return this.f22013a;
        }

        @Override // retrofit2.InterfaceC11234c
        /* renamed from: b */
        public final Object mo13b(C11283w c11283w) {
            C11253b c11253b = new C11253b(c11283w);
            c11283w.mo3e(new C11255a(c11253b));
            return c11253b;
        }
    }

    @Override // retrofit2.InterfaceC11234c.AbstractC11235a
    @Nullable
    /* renamed from: a */
    public final InterfaceC11234c mo12a(Type type, Annotation[] annotationArr) {
        if (C11259i0.m24e(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m25d = C11259i0.m25d(0, (ParameterizedType) type);
            if (C11259i0.m24e(m25d) != C11245e0.class) {
                return new C11251a(m25d);
            }
            if (m25d instanceof ParameterizedType) {
                return new C11254c(C11259i0.m25d(0, (ParameterizedType) m25d));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
