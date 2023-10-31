package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.C11005j;
import kotlinx.coroutines.flow.C11008l;
import kotlinx.coroutines.flow.internal.AbstractC10996c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n28#2,4:144\n20#3:137\n20#3:142\n20#3:148\n1#4:143\n13579#5,2:149\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n30#1:133,4\n45#1:138,4\n76#1:144,4\n30#1:137\n45#1:142\n76#1:148\n95#1:149,2\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.internal.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10995b<S extends AbstractC10996c<?>> {
    @Nullable

    /* renamed from: a */
    public S[] f21571a;

    /* renamed from: b */
    public int f21572b;

    /* renamed from: c */
    public int f21573c;

    /* renamed from: c */
    public final void m306c(@NotNull C11008l c11008l) {
        synchronized (this) {
            int i = this.f21572b - 1;
            this.f21572b = i;
            if (i == 0) {
                this.f21573c = 0;
            }
            C10843j.m432d(c11008l, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            c11008l.m301b((C11005j) this);
        }
    }
}
