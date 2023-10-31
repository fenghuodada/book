package retrofit2;

import androidx.datastore.preferences.protobuf.C1223n1;
import kotlin.C10864l;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.C11020i;
import kotlinx.coroutines.InterfaceC11015h;
import org.jetbrains.annotations.NotNull;

/* renamed from: retrofit2.s */
/* loaded from: classes3.dex */
public final class C11277s implements InterfaceC11241d<Object> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC11015h f22047a;

    public C11277s(C11020i c11020i) {
        this.f22047a = c11020i;
    }

    @Override // retrofit2.InterfaceC11241d
    /* renamed from: a */
    public final void mo9a(@NotNull InterfaceC11230b<Object> call, @NotNull Throwable t) {
        C10843j.m429g(call, "call");
        C10843j.m429g(t, "t");
        this.f22047a.resumeWith(C10864l.m419a(t));
    }

    @Override // retrofit2.InterfaceC11241d
    /* renamed from: c */
    public final void mo8c(@NotNull InterfaceC11230b<Object> call, @NotNull C11245e0<Object> response) {
        Object m419a;
        C10843j.m429g(call, "call");
        C10843j.m429g(response, "response");
        if (response.f21996a.isSuccessful()) {
            m419a = response.f21997b;
        } else {
            m419a = C10864l.m419a(new C1223n1(response));
        }
        this.f22047a.resumeWith(m419a);
    }
}
