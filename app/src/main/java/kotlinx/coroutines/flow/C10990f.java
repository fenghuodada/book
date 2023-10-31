package kotlinx.coroutines.flow;

import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.internal.C10859x;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.C10994a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n93#2,2:142\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.f */
/* loaded from: classes3.dex */
public final class C10990f implements InterfaceC10986c<Object> {

    /* renamed from: a */
    public final /* synthetic */ C10859x f21564a;

    public C10990f(C10859x c10859x) {
        this.f21564a = c10859x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC10986c
    @Nullable
    /* renamed from: b */
    public final Object mo299b(Object obj, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        this.f21564a.f21410a = obj;
        throw new C10994a(this);
    }
}
