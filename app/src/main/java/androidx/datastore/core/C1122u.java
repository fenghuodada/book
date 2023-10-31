package androidx.datastore.core;

import androidx.datastore.core.C1107q;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10856u;
import kotlinx.coroutines.flow.C10988e;
import kotlinx.coroutines.flow.C11011o;
import kotlinx.coroutines.flow.InterfaceC10986c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore$data$1", m453f = "SingleProcessDataStore.kt", m452i = {}, m451l = {117}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* renamed from: androidx.datastore.core.u */
/* loaded from: classes.dex */
public final class C1122u extends AbstractC10790f implements InterfaceC10824p<InterfaceC10986c<Object>, InterfaceC10772d<? super C10868p>, Object> {

    /* renamed from: a */
    public int f2889a;

    /* renamed from: b */
    public /* synthetic */ Object f2890b;

    /* renamed from: c */
    public final /* synthetic */ C1107q<Object> f2891c;

    @DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", m453f = "SingleProcessDataStore.kt", m452i = {}, m451l = {}, m450m = "invokeSuspend", m449n = {}, m448s = {})
    /* renamed from: androidx.datastore.core.u$a */
    /* loaded from: classes.dex */
    public static final class C1123a extends AbstractC10790f implements InterfaceC10824p<AbstractC1088b0<Object>, InterfaceC10772d<? super Boolean>, Object> {

        /* renamed from: a */
        public /* synthetic */ Object f2892a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC1088b0<Object> f2893b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1123a(AbstractC1088b0<Object> abstractC1088b0, InterfaceC10772d<? super C1123a> interfaceC10772d) {
            super(2, interfaceC10772d);
            this.f2893b = abstractC1088b0;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @NotNull
        public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
            C1123a c1123a = new C1123a(this.f2893b, interfaceC10772d);
            c1123a.f2892a = obj;
            return c1123a;
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final Object invoke(AbstractC1088b0<Object> abstractC1088b0, InterfaceC10772d<? super Boolean> interfaceC10772d) {
            return ((C1123a) create(abstractC1088b0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C10864l.m418b(obj);
            AbstractC1088b0<Object> abstractC1088b0 = (AbstractC1088b0) this.f2892a;
            AbstractC1088b0<Object> abstractC1088b02 = this.f2893b;
            boolean z = false;
            if (!(abstractC1088b02 instanceof C1089c) && !(abstractC1088b02 instanceof C1100j) && abstractC1088b0 == abstractC1088b02) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122u(C1107q<Object> c1107q, InterfaceC10772d<? super C1122u> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.f2891c = c1107q;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        C1122u c1122u = new C1122u(this.f2891c, interfaceC10772d);
        c1122u.f2890b = obj;
        return c1122u;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Object invoke(InterfaceC10986c<Object> interfaceC10986c, InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((C1122u) create(interfaceC10986c, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
        int i = this.f2889a;
        if (i != 0) {
            if (i == 1) {
                C10864l.m418b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C10864l.m418b(obj);
            InterfaceC10986c interfaceC10986c = (InterfaceC10986c) this.f2890b;
            C1107q<Object> c1107q = this.f2891c;
            AbstractC1088b0 abstractC1088b0 = (AbstractC1088b0) c1107q.f2837h.m303d();
            if (!(abstractC1088b0 instanceof C1089c)) {
                c1107q.f2839j.m11197a(new C1107q.AbstractC1108a.C1109a(abstractC1088b0));
            }
            C1123a c1123a = new C1123a(abstractC1088b0, null);
            this.f2889a = 1;
            if (!(interfaceC10986c instanceof C11011o)) {
                Object mo304a = c1107q.f2837h.mo304a(new C10988e(new C10856u(), new C1124v(interfaceC10986c), c1123a), this);
                if (mo304a != enumC10782a) {
                    mo304a = C10868p.f21418a;
                }
                if (mo304a != enumC10782a) {
                    mo304a = C10868p.f21418a;
                }
                if (mo304a != enumC10782a) {
                    mo304a = C10868p.f21418a;
                }
                if (mo304a == enumC10782a) {
                    return enumC10782a;
                }
            } else {
                ((C11011o) interfaceC10986c).getClass();
                throw null;
            }
        }
        return C10868p.f21418a;
    }
}
