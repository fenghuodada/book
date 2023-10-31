package androidx.datastore.core;

import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlinx.coroutines.InterfaceC10976e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", m453f = "SingleProcessDataStore.kt", m452i = {}, m451l = {402}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* renamed from: androidx.datastore.core.a0 */
/* loaded from: classes.dex */
public final class C1086a0 extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<Object>, Object> {

    /* renamed from: a */
    public int f2792a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10824p<Object, InterfaceC10772d<Object>, Object> f2793b;

    /* renamed from: c */
    public final /* synthetic */ Object f2794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1086a0(Object obj, InterfaceC10772d interfaceC10772d, InterfaceC10824p interfaceC10824p) {
        super(2, interfaceC10772d);
        this.f2793b = interfaceC10824p;
        this.f2794c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        return new C1086a0(this.f2794c, interfaceC10772d, this.f2793b);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Object invoke(InterfaceC10976e0 interfaceC10976e0, InterfaceC10772d<Object> interfaceC10772d) {
        return ((C1086a0) create(interfaceC10976e0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
        int i = this.f2792a;
        if (i == 0) {
            C10864l.m418b(obj);
            this.f2792a = 1;
            obj = this.f2793b.invoke(this.f2794c, this);
            if (obj == enumC10782a) {
                return enumC10782a;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C10864l.m418b(obj);
        }
        return obj;
    }
}
