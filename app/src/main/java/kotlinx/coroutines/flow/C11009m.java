package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.C11000g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m453f = "Share.kt", m452i = {0, 0}, m451l = {419, 423}, m450m = "onSubscription", m449n = {"this", "safeCollector"}, m448s = {"L$0", "L$1"})
/* renamed from: kotlinx.coroutines.flow.m */
/* loaded from: classes3.dex */
public final class C11009m extends AbstractC10786c {

    /* renamed from: a */
    public C11010n f21600a;

    /* renamed from: b */
    public C11000g f21601b;

    /* renamed from: c */
    public /* synthetic */ Object f21602c;

    /* renamed from: d */
    public final /* synthetic */ C11010n<Object> f21603d;

    /* renamed from: e */
    public int f21604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11009m(C11010n<Object> c11010n, InterfaceC10772d<? super C11009m> interfaceC10772d) {
        super(interfaceC10772d);
        this.f21603d = c11010n;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f21602c = obj;
        this.f21604e |= Integer.MIN_VALUE;
        return this.f21603d.m300a(this);
    }
}
