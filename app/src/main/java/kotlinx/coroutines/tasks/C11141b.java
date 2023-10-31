package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.C10864l;
import kotlinx.coroutines.C11020i;
import kotlinx.coroutines.InterfaceC11015h;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.tasks.b */
/* loaded from: classes3.dex */
public final class C11141b<TResult> implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC11015h<Object> f21802a;

    public C11141b(C11020i c11020i) {
        this.f21802a = c11020i;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NotNull Task<Object> task) {
        Object m419a;
        Exception exception = task.getException();
        InterfaceC11015h<Object> interfaceC11015h = this.f21802a;
        if (exception == null) {
            if (task.isCanceled()) {
                interfaceC11015h.mo134p(null);
                return;
            }
            m419a = task.getResult();
        } else {
            m419a = C10864l.m419a(exception);
        }
        interfaceC11015h.resumeWith(m419a);
    }
}
