package androidx.datastore.core;

import androidx.datastore.core.C1096h;
import java.util.List;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m453f = "DataMigrationInitializer.kt", m452i = {}, m451l = {33}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* renamed from: androidx.datastore.core.e */
/* loaded from: classes.dex */
public final class C1092e extends AbstractC10790f implements InterfaceC10824p<InterfaceC1101k<Object>, InterfaceC10772d<? super C10868p>, Object> {

    /* renamed from: a */
    public int f2798a;

    /* renamed from: b */
    public /* synthetic */ Object f2799b;

    /* renamed from: c */
    public final /* synthetic */ List<InterfaceC1091d<Object>> f2800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1092e(List<? extends InterfaceC1091d<Object>> list, InterfaceC10772d<? super C1092e> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.f2800c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        C1092e c1092e = new C1092e(this.f2800c, interfaceC10772d);
        c1092e.f2799b = obj;
        return c1092e;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Object invoke(InterfaceC1101k<Object> interfaceC1101k, InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((C1092e) create(interfaceC1101k, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
        int i = this.f2798a;
        if (i == 0) {
            C10864l.m418b(obj);
            C1096h.C1097a c1097a = C1096h.f2815a;
            this.f2798a = 1;
            if (C1096h.C1097a.m11199a(c1097a, this.f2800c, (InterfaceC1101k) this.f2799b, this) == enumC10782a) {
                return enumC10782a;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C10864l.m418b(obj);
        }
        return C10868p.f21418a;
    }
}
