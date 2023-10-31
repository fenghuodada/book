package kotlinx.coroutines.flow.internal;

import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.functions.InterfaceC10825q;
import kotlin.jvm.internal.C10833a0;
import kotlin.jvm.internal.C10842i;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.flow.InterfaceC10986c;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.flow.internal.h */
/* loaded from: classes3.dex */
public final class C11002h {
    @NotNull

    /* renamed from: a */
    public static final InterfaceC10825q<InterfaceC10986c<Object>, Object, InterfaceC10772d<? super C10868p>, Object> f21584a;

    /* renamed from: kotlinx.coroutines.flow.internal.h$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C11003a extends C10842i implements InterfaceC10825q<InterfaceC10986c<? super Object>, Object, InterfaceC10772d<? super C10868p>, Object> {

        /* renamed from: a */
        public static final C11003a f21585a = new C11003a();

        public C11003a() {
            super(3, InterfaceC10986c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.InterfaceC10825q
        /* renamed from: a */
        public final Object mo132a(InterfaceC10986c<? super Object> interfaceC10986c, Object obj, InterfaceC10772d<? super C10868p> interfaceC10772d) {
            return interfaceC10986c.mo299b(obj, interfaceC10772d);
        }
    }

    static {
        C11003a c11003a = C11003a.f21585a;
        C10843j.m432d(c11003a, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        C10833a0.m439b(3, c11003a);
        f21584a = c11003a;
    }
}
