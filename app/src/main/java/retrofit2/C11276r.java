package retrofit2;

import androidx.datastore.preferences.protobuf.C1223n1;
import java.lang.reflect.Method;
import kotlin.C10792e;
import kotlin.C10862k;
import kotlin.C10864l;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.C11020i;
import kotlinx.coroutines.InterfaceC11015h;
import org.jetbrains.annotations.NotNull;

/* renamed from: retrofit2.r */
/* loaded from: classes3.dex */
public final class C11276r implements InterfaceC11241d<Object> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC11015h f22046a;

    public C11276r(C11020i c11020i) {
        this.f22046a = c11020i;
    }

    @Override // retrofit2.InterfaceC11241d
    /* renamed from: a */
    public final void mo9a(@NotNull InterfaceC11230b<Object> call, @NotNull Throwable t) {
        C10843j.m429g(call, "call");
        C10843j.m429g(t, "t");
        this.f22046a.resumeWith(C10864l.m419a(t));
    }

    @Override // retrofit2.InterfaceC11241d
    /* renamed from: c */
    public final void mo8c(@NotNull InterfaceC11230b<Object> call, @NotNull C11245e0<Object> response) {
        C10862k.C10863a m419a;
        C10843j.m429g(call, "call");
        C10843j.m429g(response, "response");
        boolean isSuccessful = response.f21996a.isSuccessful();
        InterfaceC11015h interfaceC11015h = this.f22046a;
        if (isSuccessful) {
            Object obj = response.f21997b;
            if (obj == null) {
                Object tag = call.request().tag(C11273o.class);
                if (tag != null) {
                    StringBuilder sb = new StringBuilder("Response from ");
                    Method method = ((C11273o) tag).f22042a;
                    C10843j.m434b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    C10843j.m434b(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(method.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    m419a = C10864l.m419a(new C10792e(sb.toString()));
                } else {
                    C10792e c10792e = new C10792e();
                    C10843j.m426j(C10843j.class.getName(), c10792e);
                    throw c10792e;
                }
            } else {
                interfaceC11015h.resumeWith(obj);
                return;
            }
        } else {
            m419a = C10864l.m419a(new C1223n1(response));
        }
        interfaceC11015h.resumeWith(m419a);
    }
}
