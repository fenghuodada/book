package retrofit2;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import retrofit2.C11266m;

/* renamed from: retrofit2.j */
/* loaded from: classes3.dex */
public final class C11263j implements InterfaceC11234c<Object, InterfaceC11230b<?>> {

    /* renamed from: a */
    public final /* synthetic */ Type f22022a;

    /* renamed from: b */
    public final /* synthetic */ Executor f22023b;

    public C11263j(Type type, Executor executor) {
        this.f22022a = type;
        this.f22023b = executor;
    }

    @Override // retrofit2.InterfaceC11234c
    /* renamed from: a */
    public final Type mo14a() {
        return this.f22022a;
    }

    @Override // retrofit2.InterfaceC11234c
    /* renamed from: b */
    public final Object mo13b(C11283w c11283w) {
        Executor executor = this.f22023b;
        return executor == null ? c11283w : new C11266m.C11267a(executor, c11283w);
    }
}
