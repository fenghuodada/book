package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C10859x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m453f = "Reduce.kt", m452i = {0, 0}, m451l = {183}, m450m = "first", m449n = {"result", "collector$iv"}, m448s = {"L$0", "L$1"})
/* renamed from: kotlinx.coroutines.flow.g */
/* loaded from: classes3.dex */
public final class C10991g<T> extends AbstractC10786c {

    /* renamed from: a */
    public C10859x f21565a;

    /* renamed from: b */
    public C10990f f21566b;

    /* renamed from: c */
    public /* synthetic */ Object f21567c;

    /* renamed from: d */
    public int f21568d;

    public C10991g(InterfaceC10772d<? super C10991g> interfaceC10772d) {
        super(interfaceC10772d);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f21567c = obj;
        this.f21568d |= Integer.MIN_VALUE;
        return C10987d.m307a(null, this);
    }
}
